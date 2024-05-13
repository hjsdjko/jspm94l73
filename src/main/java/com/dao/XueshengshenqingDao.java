package com.dao;

import com.entity.XueshengshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengshenqingVO;
import com.entity.view.XueshengshenqingView;


/**
 * 学生申请
 * 
 * @author 
 * @email 
 * @date 2021-03-02 15:11:14
 */
public interface XueshengshenqingDao extends BaseMapper<XueshengshenqingEntity> {
	
	List<XueshengshenqingVO> selectListVO(@Param("ew") Wrapper<XueshengshenqingEntity> wrapper);
	
	XueshengshenqingVO selectVO(@Param("ew") Wrapper<XueshengshenqingEntity> wrapper);
	
	List<XueshengshenqingView> selectListView(@Param("ew") Wrapper<XueshengshenqingEntity> wrapper);

	List<XueshengshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengshenqingEntity> wrapper);
	
	XueshengshenqingView selectView(@Param("ew") Wrapper<XueshengshenqingEntity> wrapper);
	
}
