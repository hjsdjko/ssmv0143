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


import com.dao.JiaoshipingjiaoDao;
import com.entity.JiaoshipingjiaoEntity;
import com.service.JiaoshipingjiaoService;
import com.entity.vo.JiaoshipingjiaoVO;
import com.entity.view.JiaoshipingjiaoView;

@Service("jiaoshipingjiaoService")
public class JiaoshipingjiaoServiceImpl extends ServiceImpl<JiaoshipingjiaoDao, JiaoshipingjiaoEntity> implements JiaoshipingjiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshipingjiaoEntity> page = this.selectPage(
                new Query<JiaoshipingjiaoEntity>(params).getPage(),
                new EntityWrapper<JiaoshipingjiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshipingjiaoEntity> wrapper) {
		  Page<JiaoshipingjiaoView> page =new Query<JiaoshipingjiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshipingjiaoVO> selectListVO(Wrapper<JiaoshipingjiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshipingjiaoVO selectVO(Wrapper<JiaoshipingjiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshipingjiaoView> selectListView(Wrapper<JiaoshipingjiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshipingjiaoView selectView(Wrapper<JiaoshipingjiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
