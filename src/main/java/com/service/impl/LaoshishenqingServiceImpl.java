package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LaoshishenqingDao;
import com.entity.LaoshishenqingEntity;
import com.service.LaoshishenqingService;
import com.entity.vo.LaoshishenqingVO;
import com.entity.view.LaoshishenqingView;

@Service("laoshishenqingService")
public class LaoshishenqingServiceImpl extends ServiceImpl<LaoshishenqingDao, LaoshishenqingEntity> implements LaoshishenqingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LaoshishenqingEntity> page = this.selectPage(
                new Query<LaoshishenqingEntity>(params).getPage(),
                new EntityWrapper<LaoshishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LaoshishenqingEntity> wrapper) {
		  Page<LaoshishenqingView> page =new Query<LaoshishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LaoshishenqingVO> selectListVO(Wrapper<LaoshishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LaoshishenqingVO selectVO(Wrapper<LaoshishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LaoshishenqingView> selectListView(Wrapper<LaoshishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LaoshishenqingView selectView(Wrapper<LaoshishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
