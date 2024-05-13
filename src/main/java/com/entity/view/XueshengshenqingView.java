package com.entity.view;

import com.entity.XueshengshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 15:11:14
 */
@TableName("xueshengshenqing")
public class XueshengshenqingView  extends XueshengshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengshenqingView(){
	}
 
 	public XueshengshenqingView(XueshengshenqingEntity xueshengshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
