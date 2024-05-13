package com.entity.vo;

import com.entity.HaocaitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 耗材统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-02 15:11:14
 */
public class HaocaitongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 材料编号
	 */
	
	private String cailiaobianhao;
		
	/**
	 * 耗材名称
	 */
	
	private String haocaimingcheng;
		
	/**
	 * 学年
	 */
	
	private String xuenian;
		
	/**
	 * 学期
	 */
	
	private String xueqi;
		
	/**
	 * 使用总数
	 */
	
	private Integer shiyongzongshu;
		
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
				
	
	/**
	 * 设置：材料编号
	 */
	 
	public void setCailiaobianhao(String cailiaobianhao) {
		this.cailiaobianhao = cailiaobianhao;
	}
	
	/**
	 * 获取：材料编号
	 */
	public String getCailiaobianhao() {
		return cailiaobianhao;
	}
				
	
	/**
	 * 设置：耗材名称
	 */
	 
	public void setHaocaimingcheng(String haocaimingcheng) {
		this.haocaimingcheng = haocaimingcheng;
	}
	
	/**
	 * 获取：耗材名称
	 */
	public String getHaocaimingcheng() {
		return haocaimingcheng;
	}
				
	
	/**
	 * 设置：学年
	 */
	 
	public void setXuenian(String xuenian) {
		this.xuenian = xuenian;
	}
	
	/**
	 * 获取：学年
	 */
	public String getXuenian() {
		return xuenian;
	}
				
	
	/**
	 * 设置：学期
	 */
	 
	public void setXueqi(String xueqi) {
		this.xueqi = xueqi;
	}
	
	/**
	 * 获取：学期
	 */
	public String getXueqi() {
		return xueqi;
	}
				
	
	/**
	 * 设置：使用总数
	 */
	 
	public void setShiyongzongshu(Integer shiyongzongshu) {
		this.shiyongzongshu = shiyongzongshu;
	}
	
	/**
	 * 获取：使用总数
	 */
	public Integer getShiyongzongshu() {
		return shiyongzongshu;
	}
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
			
}
