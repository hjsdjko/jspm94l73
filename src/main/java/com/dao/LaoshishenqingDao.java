package com.dao;

import com.entity.LaoshishenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LaoshishenqingVO;
import com.entity.view.LaoshishenqingView;


/**
 * 老师申请
 * 
 * @author 
 * @email 
 * @date 2021-03-02 15:11:14
 */
public interface LaoshishenqingDao extends BaseMapper<LaoshishenqingEntity> {
	
	List<LaoshishenqingVO> selectListVO(@Param("ew") Wrapper<LaoshishenqingEntity> wrapper);
	
	LaoshishenqingVO selectVO(@Param("ew") Wrapper<LaoshishenqingEntity> wrapper);
	
	List<LaoshishenqingView> selectListView(@Param("ew") Wrapper<LaoshishenqingEntity> wrapper);

	List<LaoshishenqingView> selectListView(Pagination page,@Param("ew") Wrapper<LaoshishenqingEntity> wrapper);
	
	LaoshishenqingView selectView(@Param("ew") Wrapper<LaoshishenqingEntity> wrapper);
	
}
