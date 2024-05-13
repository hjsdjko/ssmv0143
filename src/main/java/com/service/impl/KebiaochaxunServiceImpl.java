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


import com.dao.KebiaochaxunDao;
import com.entity.KebiaochaxunEntity;
import com.service.KebiaochaxunService;
import com.entity.vo.KebiaochaxunVO;
import com.entity.view.KebiaochaxunView;

@Service("kebiaochaxunService")
public class KebiaochaxunServiceImpl extends ServiceImpl<KebiaochaxunDao, KebiaochaxunEntity> implements KebiaochaxunService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KebiaochaxunEntity> page = this.selectPage(
                new Query<KebiaochaxunEntity>(params).getPage(),
                new EntityWrapper<KebiaochaxunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KebiaochaxunEntity> wrapper) {
		  Page<KebiaochaxunView> page =new Query<KebiaochaxunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KebiaochaxunVO> selectListVO(Wrapper<KebiaochaxunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KebiaochaxunVO selectVO(Wrapper<KebiaochaxunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KebiaochaxunView> selectListView(Wrapper<KebiaochaxunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KebiaochaxunView selectView(Wrapper<KebiaochaxunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
