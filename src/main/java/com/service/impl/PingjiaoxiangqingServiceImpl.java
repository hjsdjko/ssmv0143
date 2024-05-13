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


import com.dao.PingjiaoxiangqingDao;
import com.entity.PingjiaoxiangqingEntity;
import com.service.PingjiaoxiangqingService;
import com.entity.vo.PingjiaoxiangqingVO;
import com.entity.view.PingjiaoxiangqingView;

@Service("pingjiaoxiangqingService")
public class PingjiaoxiangqingServiceImpl extends ServiceImpl<PingjiaoxiangqingDao, PingjiaoxiangqingEntity> implements PingjiaoxiangqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PingjiaoxiangqingEntity> page = this.selectPage(
                new Query<PingjiaoxiangqingEntity>(params).getPage(),
                new EntityWrapper<PingjiaoxiangqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PingjiaoxiangqingEntity> wrapper) {
		  Page<PingjiaoxiangqingView> page =new Query<PingjiaoxiangqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PingjiaoxiangqingVO> selectListVO(Wrapper<PingjiaoxiangqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PingjiaoxiangqingVO selectVO(Wrapper<PingjiaoxiangqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PingjiaoxiangqingView> selectListView(Wrapper<PingjiaoxiangqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PingjiaoxiangqingView selectView(Wrapper<PingjiaoxiangqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
