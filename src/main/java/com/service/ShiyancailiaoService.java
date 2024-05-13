package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiyancailiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiyancailiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiyancailiaoView;


/**
 * 实验材料
 *
 * @author 
 * @email 
 * @date 2021-03-02 15:11:14
 */
public interface ShiyancailiaoService extends IService<ShiyancailiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyancailiaoVO> selectListVO(Wrapper<ShiyancailiaoEntity> wrapper);
   	
   	ShiyancailiaoVO selectVO(@Param("ew") Wrapper<ShiyancailiaoEntity> wrapper);
   	
   	List<ShiyancailiaoView> selectListView(Wrapper<ShiyancailiaoEntity> wrapper);
   	
   	ShiyancailiaoView selectView(@Param("ew") Wrapper<ShiyancailiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyancailiaoEntity> wrapper);
   	
}

