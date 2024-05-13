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


import com.dao.XuankexiangqingDao;
import com.entity.XuankexiangqingEntity;
import com.service.XuankexiangqingService;
import com.entity.vo.XuankexiangqingVO;
import com.entity.view.XuankexiangqingView;

@Service("xuankexiangqingService")
public class XuankexiangqingServiceImpl extends ServiceImpl<XuankexiangqingDao, XuankexiangqingEntity> implements XuankexiangqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuankexiangqingEntity> page = this.selectPage(
                new Query<XuankexiangqingEntity>(params).getPage(),
                new EntityWrapper<XuankexiangqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuankexiangqingEntity> wrapper) {
		  Page<XuankexiangqingView> page =new Query<XuankexiangqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuankexiangqingVO> selectListVO(Wrapper<XuankexiangqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuankexiangqingVO selectVO(Wrapper<XuankexiangqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuankexiangqingView> selectListView(Wrapper<XuankexiangqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuankexiangqingView selectView(Wrapper<XuankexiangqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
