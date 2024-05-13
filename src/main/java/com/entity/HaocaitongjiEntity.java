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
 * 耗材统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-02 15:11:14
 */
@TableName("haocaitongji")
public class HaocaitongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HaocaitongjiEntity() {
		
	}
	
	public HaocaitongjiEntity(T t) {
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
	 * 名称
	 */
					
	private String mingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	
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
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
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
