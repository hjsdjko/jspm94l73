package com.entity.model;

import com.entity.ShiyancailiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 实验材料
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-02 15:11:14
 */
public class ShiyancailiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 耗材名称
	 */
	
	private String haocaimingcheng;
		
	/**
	 * 耗材规格
	 */
	
	private String haocaiguige;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 所属专业
	 */
	
	private String suoshuzhuanye;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 登记员
	 */
	
	private String dengjiyuan;
				
	
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
	 * 设置：耗材规格
	 */
	 
	public void setHaocaiguige(String haocaiguige) {
		this.haocaiguige = haocaiguige;
	}
	
	/**
	 * 获取：耗材规格
	 */
	public String getHaocaiguige() {
		return haocaiguige;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：所属专业
	 */
	 
	public void setSuoshuzhuanye(String suoshuzhuanye) {
		this.suoshuzhuanye = suoshuzhuanye;
	}
	
	/**
	 * 获取：所属专业
	 */
	public String getSuoshuzhuanye() {
		return suoshuzhuanye;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：登记员
	 */
	 
	public void setDengjiyuan(String dengjiyuan) {
		this.dengjiyuan = dengjiyuan;
	}
	
	/**
	 * 获取：登记员
	 */
	public String getDengjiyuan() {
		return dengjiyuan;
	}
			
}
