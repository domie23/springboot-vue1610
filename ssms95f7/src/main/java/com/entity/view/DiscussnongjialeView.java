package com.entity.view;

import com.entity.DiscussnongjialeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 农家乐评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-31 08:03:10
 */
@TableName("discussnongjiale")
public class DiscussnongjialeView  extends DiscussnongjialeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussnongjialeView(){
	}
 
 	public DiscussnongjialeView(DiscussnongjialeEntity discussnongjialeEntity){
 	try {
			BeanUtils.copyProperties(this, discussnongjialeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
