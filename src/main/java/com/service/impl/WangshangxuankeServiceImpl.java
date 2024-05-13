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


import com.dao.WangshangxuankeDao;
import com.entity.WangshangxuankeEntity;
import com.service.WangshangxuankeService;
import com.entity.vo.WangshangxuankeVO;
import com.entity.view.WangshangxuankeView;

@Service("wangshangxuankeService")
public class WangshangxuankeServiceImpl extends ServiceImpl<WangshangxuankeDao, WangshangxuankeEntity> implements WangshangxuankeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WangshangxuankeEntity> page = this.selectPage(
                new Query<WangshangxuankeEntity>(params).getPage(),
                new EntityWrapper<WangshangxuankeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WangshangxuankeEntity> wrapper) {
		  Page<WangshangxuankeView> page =new Query<WangshangxuankeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WangshangxuankeVO> selectListVO(Wrapper<WangshangxuankeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WangshangxuankeVO selectVO(Wrapper<WangshangxuankeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WangshangxuankeView> selectListView(Wrapper<WangshangxuankeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WangshangxuankeView selectView(Wrapper<WangshangxuankeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
