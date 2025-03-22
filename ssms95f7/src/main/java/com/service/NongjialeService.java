package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongjialeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongjialeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongjialeView;


/**
 * 农家乐
 *
 * @author 
 * @email 
 * @date 2021-01-31 08:03:10
 */
public interface NongjialeService extends IService<NongjialeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongjialeVO> selectListVO(Wrapper<NongjialeEntity> wrapper);
   	
   	NongjialeVO selectVO(@Param("ew") Wrapper<NongjialeEntity> wrapper);
   	
   	List<NongjialeView> selectListView(Wrapper<NongjialeEntity> wrapper);
   	
   	NongjialeView selectView(@Param("ew") Wrapper<NongjialeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongjialeEntity> wrapper);
   	
}

