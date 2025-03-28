package com.entity.model;

import com.entity.YonghupingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 用户评价
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-31 08:03:10
 */
public class YonghupingjiaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 农家乐名称
	 */
	
	private String nongjialemingcheng;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 咨询电话
	 */
	
	private String zixundianhua;
		
	/**
	 * 环境评分
	 */
	
	private String huanjingpingfen;
		
	/**
	 * 服务评分
	 */
	
	private String fuwupingfen;
		
	/**
	 * 住宿评分
	 */
	
	private String zhusupingfen;
		
	/**
	 * 美食评分
	 */
	
	private String meishipingfen;
		
	/**
	 * 用户评价
	 */
	
	private String yonghupingjia;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：农家乐名称
	 */
	 
	public void setNongjialemingcheng(String nongjialemingcheng) {
		this.nongjialemingcheng = nongjialemingcheng;
	}
	
	/**
	 * 获取：农家乐名称
	 */
	public String getNongjialemingcheng() {
		return nongjialemingcheng;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：咨询电话
	 */
	 
	public void setZixundianhua(String zixundianhua) {
		this.zixundianhua = zixundianhua;
	}
	
	/**
	 * 获取：咨询电话
	 */
	public String getZixundianhua() {
		return zixundianhua;
	}
				
	
	/**
	 * 设置：环境评分
	 */
	 
	public void setHuanjingpingfen(String huanjingpingfen) {
		this.huanjingpingfen = huanjingpingfen;
	}
	
	/**
	 * 获取：环境评分
	 */
	public String getHuanjingpingfen() {
		return huanjingpingfen;
	}
				
	
	/**
	 * 设置：服务评分
	 */
	 
	public void setFuwupingfen(String fuwupingfen) {
		this.fuwupingfen = fuwupingfen;
	}
	
	/**
	 * 获取：服务评分
	 */
	public String getFuwupingfen() {
		return fuwupingfen;
	}
				
	
	/**
	 * 设置：住宿评分
	 */
	 
	public void setZhusupingfen(String zhusupingfen) {
		this.zhusupingfen = zhusupingfen;
	}
	
	/**
	 * 获取：住宿评分
	 */
	public String getZhusupingfen() {
		return zhusupingfen;
	}
				
	
	/**
	 * 设置：美食评分
	 */
	 
	public void setMeishipingfen(String meishipingfen) {
		this.meishipingfen = meishipingfen;
	}
	
	/**
	 * 获取：美食评分
	 */
	public String getMeishipingfen() {
		return meishipingfen;
	}
				
	
	/**
	 * 设置：用户评价
	 */
	 
	public void setYonghupingjia(String yonghupingjia) {
		this.yonghupingjia = yonghupingjia;
	}
	
	/**
	 * 获取：用户评价
	 */
	public String getYonghupingjia() {
		return yonghupingjia;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
