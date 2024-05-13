package com.dao;

import com.entity.XuankexiangqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuankexiangqingVO;
import com.entity.view.XuankexiangqingView;


/**
 * 选课详情
 * 
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public interface XuankexiangqingDao extends BaseMapper<XuankexiangqingEntity> {
	
	List<XuankexiangqingVO> selectListVO(@Param("ew") Wrapper<XuankexiangqingEntity> wrapper);
	
	XuankexiangqingVO selectVO(@Param("ew") Wrapper<XuankexiangqingEntity> wrapper);
	
	List<XuankexiangqingView> selectListView(@Param("ew") Wrapper<XuankexiangqingEntity> wrapper);

	List<XuankexiangqingView> selectListView(Pagination page,@Param("ew") Wrapper<XuankexiangqingEntity> wrapper);
	
	XuankexiangqingView selectView(@Param("ew") Wrapper<XuankexiangqingEntity> wrapper);
	
}
