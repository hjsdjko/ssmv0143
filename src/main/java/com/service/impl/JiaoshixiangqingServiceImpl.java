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


import com.dao.JiaoshixiangqingDao;
import com.entity.JiaoshixiangqingEntity;
import com.service.JiaoshixiangqingService;
import com.entity.vo.JiaoshixiangqingVO;
import com.entity.view.JiaoshixiangqingView;

@Service("jiaoshixiangqingService")
public class JiaoshixiangqingServiceImpl extends ServiceImpl<JiaoshixiangqingDao, JiaoshixiangqingEntity> implements JiaoshixiangqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshixiangqingEntity> page = this.selectPage(
                new Query<JiaoshixiangqingEntity>(params).getPage(),
                new EntityWrapper<JiaoshixiangqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshixiangqingEntity> wrapper) {
		  Page<JiaoshixiangqingView> page =new Query<JiaoshixiangqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshixiangqingVO> selectListVO(Wrapper<JiaoshixiangqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshixiangqingVO selectVO(Wrapper<JiaoshixiangqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshixiangqingView> selectListView(Wrapper<JiaoshixiangqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshixiangqingView selectView(Wrapper<JiaoshixiangqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
