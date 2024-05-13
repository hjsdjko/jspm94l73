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


import com.dao.ShiyancailiaoDao;
import com.entity.ShiyancailiaoEntity;
import com.service.ShiyancailiaoService;
import com.entity.vo.ShiyancailiaoVO;
import com.entity.view.ShiyancailiaoView;

@Service("shiyancailiaoService")
public class ShiyancailiaoServiceImpl extends ServiceImpl<ShiyancailiaoDao, ShiyancailiaoEntity> implements ShiyancailiaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiyancailiaoEntity> page = this.selectPage(
                new Query<ShiyancailiaoEntity>(params).getPage(),
                new EntityWrapper<ShiyancailiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiyancailiaoEntity> wrapper) {
		  Page<ShiyancailiaoView> page =new Query<ShiyancailiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiyancailiaoVO> selectListVO(Wrapper<ShiyancailiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiyancailiaoVO selectVO(Wrapper<ShiyancailiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiyancailiaoView> selectListView(Wrapper<ShiyancailiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiyancailiaoView selectView(Wrapper<ShiyancailiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
