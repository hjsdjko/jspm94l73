package com.dao;

import com.entity.HaocaitongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HaocaitongjiVO;
import com.entity.view.HaocaitongjiView;


/**
 * 耗材统计
 * 
 * @author 
 * @email 
 * @date 2021-03-02 15:11:14
 */
public interface HaocaitongjiDao extends BaseMapper<HaocaitongjiEntity> {
	
	List<HaocaitongjiVO> selectListVO(@Param("ew") Wrapper<HaocaitongjiEntity> wrapper);
	
	HaocaitongjiVO selectVO(@Param("ew") Wrapper<HaocaitongjiEntity> wrapper);
	
	List<HaocaitongjiView> selectListView(@Param("ew") Wrapper<HaocaitongjiEntity> wrapper);

	List<HaocaitongjiView> selectListView(Pagination page,@Param("ew") Wrapper<HaocaitongjiEntity> wrapper);
	
	HaocaitongjiView selectView(@Param("ew") Wrapper<HaocaitongjiEntity> wrapper);
	
}
