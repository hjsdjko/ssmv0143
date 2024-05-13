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


import com.dao.XiaoyuanrenwuDao;
import com.entity.XiaoyuanrenwuEntity;
import com.service.XiaoyuanrenwuService;
import com.entity.vo.XiaoyuanrenwuVO;
import com.entity.view.XiaoyuanrenwuView;

@Service("xiaoyuanrenwuService")
public class XiaoyuanrenwuServiceImpl extends ServiceImpl<XiaoyuanrenwuDao, XiaoyuanrenwuEntity> implements XiaoyuanrenwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyuanrenwuEntity> page = this.selectPage(
                new Query<XiaoyuanrenwuEntity>(params).getPage(),
                new EntityWrapper<XiaoyuanrenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyuanrenwuEntity> wrapper) {
		  Page<XiaoyuanrenwuView> page =new Query<XiaoyuanrenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyuanrenwuVO> selectListVO(Wrapper<XiaoyuanrenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyuanrenwuVO selectVO(Wrapper<XiaoyuanrenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyuanrenwuView> selectListView(Wrapper<XiaoyuanrenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyuanrenwuView selectView(Wrapper<XiaoyuanrenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
