package com.dao;

import com.entity.DiscussnongjialeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussnongjialeVO;
import com.entity.view.DiscussnongjialeView;


/**
 * 农家乐评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-31 08:03:10
 */
public interface DiscussnongjialeDao extends BaseMapper<DiscussnongjialeEntity> {
	
	List<DiscussnongjialeVO> selectListVO(@Param("ew") Wrapper<DiscussnongjialeEntity> wrapper);
	
	DiscussnongjialeVO selectVO(@Param("ew") Wrapper<DiscussnongjialeEntity> wrapper);
	
	List<DiscussnongjialeView> selectListView(@Param("ew") Wrapper<DiscussnongjialeEntity> wrapper);

	List<DiscussnongjialeView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussnongjialeEntity> wrapper);
	
	DiscussnongjialeView selectView(@Param("ew") Wrapper<DiscussnongjialeEntity> wrapper);
	
}
