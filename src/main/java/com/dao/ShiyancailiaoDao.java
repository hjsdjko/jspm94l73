package com.dao;

import com.entity.ShiyancailiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiyancailiaoVO;
import com.entity.view.ShiyancailiaoView;


/**
 * 实验材料
 * 
 * @author 
 * @email 
 * @date 2021-03-02 15:11:14
 */
public interface ShiyancailiaoDao extends BaseMapper<ShiyancailiaoEntity> {
	
	List<ShiyancailiaoVO> selectListVO(@Param("ew") Wrapper<ShiyancailiaoEntity> wrapper);
	
	ShiyancailiaoVO selectVO(@Param("ew") Wrapper<ShiyancailiaoEntity> wrapper);
	
	List<ShiyancailiaoView> selectListView(@Param("ew") Wrapper<ShiyancailiaoEntity> wrapper);

	List<ShiyancailiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyancailiaoEntity> wrapper);
	
	ShiyancailiaoView selectView(@Param("ew") Wrapper<ShiyancailiaoEntity> wrapper);
	
}
