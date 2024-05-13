package com.dao;

import com.entity.XiaoyuanrenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyuanrenwuVO;
import com.entity.view.XiaoyuanrenwuView;


/**
 * 校园任务
 * 
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public interface XiaoyuanrenwuDao extends BaseMapper<XiaoyuanrenwuEntity> {
	
	List<XiaoyuanrenwuVO> selectListVO(@Param("ew") Wrapper<XiaoyuanrenwuEntity> wrapper);
	
	XiaoyuanrenwuVO selectVO(@Param("ew") Wrapper<XiaoyuanrenwuEntity> wrapper);
	
	List<XiaoyuanrenwuView> selectListView(@Param("ew") Wrapper<XiaoyuanrenwuEntity> wrapper);

	List<XiaoyuanrenwuView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyuanrenwuEntity> wrapper);
	
	XiaoyuanrenwuView selectView(@Param("ew") Wrapper<XiaoyuanrenwuEntity> wrapper);
	
}
