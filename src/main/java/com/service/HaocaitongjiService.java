package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HaocaitongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HaocaitongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HaocaitongjiView;


/**
 * 耗材统计
 *
 * @author 
 * @email 
 * @date 2021-03-02 15:11:14
 */
public interface HaocaitongjiService extends IService<HaocaitongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HaocaitongjiVO> selectListVO(Wrapper<HaocaitongjiEntity> wrapper);
   	
   	HaocaitongjiVO selectVO(@Param("ew") Wrapper<HaocaitongjiEntity> wrapper);
   	
   	List<HaocaitongjiView> selectListView(Wrapper<HaocaitongjiEntity> wrapper);
   	
   	HaocaitongjiView selectView(@Param("ew") Wrapper<HaocaitongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HaocaitongjiEntity> wrapper);
   	
}

