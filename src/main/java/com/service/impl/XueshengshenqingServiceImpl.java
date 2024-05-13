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


import com.dao.XueshengshenqingDao;
import com.entity.XueshengshenqingEntity;
import com.service.XueshengshenqingService;
import com.entity.vo.XueshengshenqingVO;
import com.entity.view.XueshengshenqingView;

@Service("xueshengshenqingService")
public class XueshengshenqingServiceImpl extends ServiceImpl<XueshengshenqingDao, XueshengshenqingEntity> implements XueshengshenqingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengshenqingEntity> page = this.selectPage(
                new Query<XueshengshenqingEntity>(params).getPage(),
                new EntityWrapper<XueshengshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengshenqingEntity> wrapper) {
		  Page<XueshengshenqingView> page =new Query<XueshengshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengshenqingVO> selectListVO(Wrapper<XueshengshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengshenqingVO selectVO(Wrapper<XueshengshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengshenqingView> selectListView(Wrapper<XueshengshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengshenqingView selectView(Wrapper<XueshengshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
