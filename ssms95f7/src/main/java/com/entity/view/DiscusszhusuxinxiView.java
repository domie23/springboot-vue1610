package com.entity.view;

import com.entity.DiscusszhusuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 住宿信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-31 08:03:10
 */
@TableName("discusszhusuxinxi")
public class DiscusszhusuxinxiView  extends DiscusszhusuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszhusuxinxiView(){
	}
 
 	public DiscusszhusuxinxiView(DiscusszhusuxinxiEntity discusszhusuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusszhusuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
