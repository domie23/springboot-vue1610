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


import com.dao.NongjialeDao;
import com.entity.NongjialeEntity;
import com.service.NongjialeService;
import com.entity.vo.NongjialeVO;
import com.entity.view.NongjialeView;

@Service("nongjialeService")
public class NongjialeServiceImpl extends ServiceImpl<NongjialeDao, NongjialeEntity> implements NongjialeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongjialeEntity> page = this.selectPage(
                new Query<NongjialeEntity>(params).getPage(),
                new EntityWrapper<NongjialeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongjialeEntity> wrapper) {
		  Page<NongjialeView> page =new Query<NongjialeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongjialeVO> selectListVO(Wrapper<NongjialeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongjialeVO selectVO(Wrapper<NongjialeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongjialeView> selectListView(Wrapper<NongjialeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongjialeView selectView(Wrapper<NongjialeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
