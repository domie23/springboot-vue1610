package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.NongjialeEntity;
import com.entity.view.NongjialeView;

import com.service.NongjialeService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 农家乐
 * 后端接口
 * @author 
 * @email 
 * @date 2021-01-31 08:03:10
 */
@RestController
@RequestMapping("/nongjiale")
public class NongjialeController {
    @Autowired
    private NongjialeService nongjialeService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,NongjialeEntity nongjiale, HttpServletRequest request){

        EntityWrapper<NongjialeEntity> ew = new EntityWrapper<NongjialeEntity>();
		PageUtils page = nongjialeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongjiale), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,NongjialeEntity nongjiale, HttpServletRequest request){
        EntityWrapper<NongjialeEntity> ew = new EntityWrapper<NongjialeEntity>();
		PageUtils page = nongjialeService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, nongjiale), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( NongjialeEntity nongjiale){
       	EntityWrapper<NongjialeEntity> ew = new EntityWrapper<NongjialeEntity>();
      	ew.allEq(MPUtil.allEQMapPre( nongjiale, "nongjiale")); 
        return R.ok().put("data", nongjialeService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(NongjialeEntity nongjiale){
        EntityWrapper< NongjialeEntity> ew = new EntityWrapper< NongjialeEntity>();
 		ew.allEq(MPUtil.allEQMapPre( nongjiale, "nongjiale")); 
		NongjialeView nongjialeView =  nongjialeService.selectView(ew);
		return R.ok("查询农家乐成功").put("data", nongjialeView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        NongjialeEntity nongjiale = nongjialeService.selectById(id);
        return R.ok().put("data", nongjiale);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        NongjialeEntity nongjiale = nongjialeService.selectById(id);
        return R.ok().put("data", nongjiale);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody NongjialeEntity nongjiale, HttpServletRequest request){
    	nongjiale.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nongjiale);

        nongjialeService.insert(nongjiale);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody NongjialeEntity nongjiale, HttpServletRequest request){
    	nongjiale.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(nongjiale);

        nongjialeService.insert(nongjiale);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody NongjialeEntity nongjiale, HttpServletRequest request){
        //ValidatorUtils.validateEntity(nongjiale);
        nongjialeService.updateById(nongjiale);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        nongjialeService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<NongjialeEntity> wrapper = new EntityWrapper<NongjialeEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = nongjialeService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
