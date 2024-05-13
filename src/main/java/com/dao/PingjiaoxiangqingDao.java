package com.dao;

import com.entity.PingjiaoxiangqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PingjiaoxiangqingVO;
import com.entity.view.PingjiaoxiangqingView;


/**
 * 评教详情
 * 
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public interface PingjiaoxiangqingDao extends BaseMapper<PingjiaoxiangqingEntity> {
	
	List<PingjiaoxiangqingVO> selectListVO(@Param("ew") Wrapper<PingjiaoxiangqingEntity> wrapper);
	
	PingjiaoxiangqingVO selectVO(@Param("ew") Wrapper<PingjiaoxiangqingEntity> wrapper);
	
	List<PingjiaoxiangqingView> selectListView(@Param("ew") Wrapper<PingjiaoxiangqingEntity> wrapper);

	List<PingjiaoxiangqingView> selectListView(Pagination page,@Param("ew") Wrapper<PingjiaoxiangqingEntity> wrapper);
	
	PingjiaoxiangqingView selectView(@Param("ew") Wrapper<PingjiaoxiangqingEntity> wrapper);
	
}
