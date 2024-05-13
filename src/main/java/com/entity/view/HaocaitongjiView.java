package com.entity.view;

import com.entity.HaocaitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 耗材统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 15:11:14
 */
@TableName("haocaitongji")
public class HaocaitongjiView  extends HaocaitongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HaocaitongjiView(){
	}
 
 	public HaocaitongjiView(HaocaitongjiEntity haocaitongjiEntity){
 	try {
			BeanUtils.copyProperties(this, haocaitongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
