package com.dao;

import com.entity.WangshangxuankeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WangshangxuankeVO;
import com.entity.view.WangshangxuankeView;


/**
 * 网上选课
 * 
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public interface WangshangxuankeDao extends BaseMapper<WangshangxuankeEntity> {
	
	List<WangshangxuankeVO> selectListVO(@Param("ew") Wrapper<WangshangxuankeEntity> wrapper);
	
	WangshangxuankeVO selectVO(@Param("ew") Wrapper<WangshangxuankeEntity> wrapper);
	
	List<WangshangxuankeView> selectListView(@Param("ew") Wrapper<WangshangxuankeEntity> wrapper);

	List<WangshangxuankeView> selectListView(Pagination page,@Param("ew") Wrapper<WangshangxuankeEntity> wrapper);
	
	WangshangxuankeView selectView(@Param("ew") Wrapper<WangshangxuankeEntity> wrapper);
	
}
