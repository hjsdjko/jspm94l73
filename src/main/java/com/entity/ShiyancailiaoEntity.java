package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 实验材料
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-02 15:11:14
 */
@TableName("shiyancailiao")
public class ShiyancailiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShiyancailiaoEntity() {
		
	}
	
	public ShiyancailiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 材料编号
	 */
					
	private String cailiaobianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
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
