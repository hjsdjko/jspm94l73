package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengshenqingView;


/**
 * 学生申请
 *
 * @author 
 * @email 
 * @date 2021-03-02 15:11:14
 */
public interface XueshengshenqingService extends IService<XueshengshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengshenqingVO> selectListVO(Wrapper<XueshengshenqingEntity> wrapper);
   	
   	XueshengshenqingVO selectVO(@Param("ew") Wrapper<XueshengshenqingEntity> wrapper);
   	
   	List<XueshengshenqingView> selectListView(Wrapper<XueshengshenqingEntity> wrapper);
   	
   	XueshengshenqingView selectView(@Param("ew") Wrapper<XueshengshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengshenqingEntity> wrapper);
   	
}

