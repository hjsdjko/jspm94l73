package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LaoshishenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LaoshishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LaoshishenqingView;


/**
 * 老师申请
 *
 * @author 
 * @email 
 * @date 2021-03-02 15:11:14
 */
public interface LaoshishenqingService extends IService<LaoshishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LaoshishenqingVO> selectListVO(Wrapper<LaoshishenqingEntity> wrapper);
   	
   	LaoshishenqingVO selectVO(@Param("ew") Wrapper<LaoshishenqingEntity> wrapper);
   	
   	List<LaoshishenqingView> selectListView(Wrapper<LaoshishenqingEntity> wrapper);
   	
   	LaoshishenqingView selectView(@Param("ew") Wrapper<LaoshishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LaoshishenqingEntity> wrapper);
   	
}

