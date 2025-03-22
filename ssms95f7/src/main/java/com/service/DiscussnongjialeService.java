package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussnongjialeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussnongjialeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussnongjialeView;


/**
 * 农家乐评论表
 *
 * @author 
 * @email 
 * @date 2021-01-31 08:03:10
 */
public interface DiscussnongjialeService extends IService<DiscussnongjialeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussnongjialeVO> selectListVO(Wrapper<DiscussnongjialeEntity> wrapper);
   	
   	DiscussnongjialeVO selectVO(@Param("ew") Wrapper<DiscussnongjialeEntity> wrapper);
   	
   	List<DiscussnongjialeView> selectListView(Wrapper<DiscussnongjialeEntity> wrapper);
   	
   	DiscussnongjialeView selectView(@Param("ew") Wrapper<DiscussnongjialeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussnongjialeEntity> wrapper);
   	
}

