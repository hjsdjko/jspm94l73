package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HaocaitongjiEntity;
import com.entity.view.HaocaitongjiView;

import com.service.HaocaitongjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 耗材统计
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-02 15:11:14
 */
@RestController
@RequestMapping("/haocaitongji")
public class HaocaitongjiController {
    @Autowired
    private HaocaitongjiService haocaitongjiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HaocaitongjiEntity haocaitongji, HttpServletRequest request){

        EntityWrapper<HaocaitongjiEntity> ew = new EntityWrapper<HaocaitongjiEntity>();
    	PageUtils page = haocaitongjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, haocaitongji), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HaocaitongjiEntity haocaitongji, HttpServletRequest request){
        EntityWrapper<HaocaitongjiEntity> ew = new EntityWrapper<HaocaitongjiEntity>();
    	PageUtils page = haocaitongjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, haocaitongji), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HaocaitongjiEntity haocaitongji){
       	EntityWrapper<HaocaitongjiEntity> ew = new EntityWrapper<HaocaitongjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( haocaitongji, "haocaitongji")); 
        return R.ok().put("data", haocaitongjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HaocaitongjiEntity haocaitongji){
        EntityWrapper< HaocaitongjiEntity> ew = new EntityWrapper< HaocaitongjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( haocaitongji, "haocaitongji")); 
		HaocaitongjiView haocaitongjiView =  haocaitongjiService.selectView(ew);
		return R.ok("查询耗材统计成功").put("data", haocaitongjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HaocaitongjiEntity haocaitongji = haocaitongjiService.selectById(id);
        return R.ok().put("data", haocaitongji);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HaocaitongjiEntity haocaitongji = haocaitongjiService.selectById(id);
        return R.ok().put("data", haocaitongji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HaocaitongjiEntity haocaitongji, HttpServletRequest request){
    	haocaitongji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(haocaitongji);

        haocaitongjiService.insert(haocaitongji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HaocaitongjiEntity haocaitongji, HttpServletRequest request){
    	haocaitongji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(haocaitongji);

        haocaitongjiService.insert(haocaitongji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HaocaitongjiEntity haocaitongji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(haocaitongji);
        haocaitongjiService.updateById(haocaitongji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        haocaitongjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<HaocaitongjiEntity> wrapper = new EntityWrapper<HaocaitongjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = haocaitongjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
