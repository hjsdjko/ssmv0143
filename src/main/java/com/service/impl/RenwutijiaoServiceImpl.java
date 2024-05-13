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


import com.dao.RenwutijiaoDao;
import com.entity.RenwutijiaoEntity;
import com.service.RenwutijiaoService;
import com.entity.vo.RenwutijiaoVO;
import com.entity.view.RenwutijiaoView;

@Service("renwutijiaoService")
public class RenwutijiaoServiceImpl extends ServiceImpl<RenwutijiaoDao, RenwutijiaoEntity> implements RenwutijiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenwutijiaoEntity> page = this.selectPage(
                new Query<RenwutijiaoEntity>(params).getPage(),
                new EntityWrapper<RenwutijiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenwutijiaoEntity> wrapper) {
		  Page<RenwutijiaoView> page =new Query<RenwutijiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenwutijiaoVO> selectListVO(Wrapper<RenwutijiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenwutijiaoVO selectVO(Wrapper<RenwutijiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenwutijiaoView> selectListView(Wrapper<RenwutijiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenwutijiaoView selectView(Wrapper<RenwutijiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
