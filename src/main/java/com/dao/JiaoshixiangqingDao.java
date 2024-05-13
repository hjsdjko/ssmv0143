package com.dao;

import com.entity.JiaoshixiangqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshixiangqingVO;
import com.entity.view.JiaoshixiangqingView;


/**
 * 教室详情
 * 
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public interface JiaoshixiangqingDao extends BaseMapper<JiaoshixiangqingEntity> {
	
	List<JiaoshixiangqingVO> selectListVO(@Param("ew") Wrapper<JiaoshixiangqingEntity> wrapper);
	
	JiaoshixiangqingVO selectVO(@Param("ew") Wrapper<JiaoshixiangqingEntity> wrapper);
	
	List<JiaoshixiangqingView> selectListView(@Param("ew") Wrapper<JiaoshixiangqingEntity> wrapper);

	List<JiaoshixiangqingView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshixiangqingEntity> wrapper);
	
	JiaoshixiangqingView selectView(@Param("ew") Wrapper<JiaoshixiangqingEntity> wrapper);
	
}
