package com.entity.view;

import com.entity.LaoshishenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 老师申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 15:11:14
 */
@TableName("laoshishenqing")
public class LaoshishenqingView  extends LaoshishenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LaoshishenqingView(){
	}
 
 	public LaoshishenqingView(LaoshishenqingEntity laoshishenqingEntity){
 	try {
			BeanUtils.copyProperties(this, laoshishenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
