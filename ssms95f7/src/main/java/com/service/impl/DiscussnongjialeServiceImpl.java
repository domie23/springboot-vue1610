package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussnongjialeDao;
import com.entity.DiscussnongjialeEntity;
import com.service.DiscussnongjialeService;
import com.entity.vo.DiscussnongjialeVO;
import com.entity.view.DiscussnongjialeView;

@Service("discussnongjialeService")
public class DiscussnongjialeServiceImpl extends ServiceImpl<DiscussnongjialeDao, DiscussnongjialeEntity> implements DiscussnongjialeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussnongjialeEntity> page = this.selectPage(
                new Query<DiscussnongjialeEntity>(params).getPage(),
                new EntityWrapper<DiscussnongjialeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussnongjialeEntity> wrapper) {
		  Page<DiscussnongjialeView> page =new Query<DiscussnongjialeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussnongjialeVO> selectListVO(Wrapper<DiscussnongjialeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussnongjialeVO selectVO(Wrapper<DiscussnongjialeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussnongjialeView> selectListView(Wrapper<DiscussnongjialeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussnongjialeView selectView(Wrapper<DiscussnongjialeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
