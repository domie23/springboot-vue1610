package com.dao;

import com.entity.NongjialeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongjialeVO;
import com.entity.view.NongjialeView;


/**
 * 农家乐
 * 
 * @author 
 * @email 
 * @date 2021-01-31 08:03:10
 */
public interface NongjialeDao extends BaseMapper<NongjialeEntity> {
	
	List<NongjialeVO> selectListVO(@Param("ew") Wrapper<NongjialeEntity> wrapper);
	
	NongjialeVO selectVO(@Param("ew") Wrapper<NongjialeEntity> wrapper);
	
	List<NongjialeView> selectListView(@Param("ew") Wrapper<NongjialeEntity> wrapper);

	List<NongjialeView> selectListView(Pagination page,@Param("ew") Wrapper<NongjialeEntity> wrapper);
	
	NongjialeView selectView(@Param("ew") Wrapper<NongjialeEntity> wrapper);
	
}
