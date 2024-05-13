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


import com.dao.ChengjichaxunDao;
import com.entity.ChengjichaxunEntity;
import com.service.ChengjichaxunService;
import com.entity.vo.ChengjichaxunVO;
import com.entity.view.ChengjichaxunView;

@Service("chengjichaxunService")
public class ChengjichaxunServiceImpl extends ServiceImpl<ChengjichaxunDao, ChengjichaxunEntity> implements ChengjichaxunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengjichaxunEntity> page = this.selectPage(
                new Query<ChengjichaxunEntity>(params).getPage(),
                new EntityWrapper<ChengjichaxunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengjichaxunEntity> wrapper) {
		  Page<ChengjichaxunView> page =new Query<ChengjichaxunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChengjichaxunVO> selectListVO(Wrapper<ChengjichaxunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengjichaxunVO selectVO(Wrapper<ChengjichaxunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengjichaxunView> selectListView(Wrapper<ChengjichaxunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengjichaxunView selectView(Wrapper<ChengjichaxunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
