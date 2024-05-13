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


import com.dao.HaocaitongjiDao;
import com.entity.HaocaitongjiEntity;
import com.service.HaocaitongjiService;
import com.entity.vo.HaocaitongjiVO;
import com.entity.view.HaocaitongjiView;

@Service("haocaitongjiService")
public class HaocaitongjiServiceImpl extends ServiceImpl<HaocaitongjiDao, HaocaitongjiEntity> implements HaocaitongjiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HaocaitongjiEntity> page = this.selectPage(
                new Query<HaocaitongjiEntity>(params).getPage(),
                new EntityWrapper<HaocaitongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HaocaitongjiEntity> wrapper) {
		  Page<HaocaitongjiView> page =new Query<HaocaitongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HaocaitongjiVO> selectListVO(Wrapper<HaocaitongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HaocaitongjiVO selectVO(Wrapper<HaocaitongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HaocaitongjiView> selectListView(Wrapper<HaocaitongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HaocaitongjiView selectView(Wrapper<HaocaitongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
