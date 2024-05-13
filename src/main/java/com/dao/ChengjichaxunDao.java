package com.dao;

import com.entity.ChengjichaxunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengjichaxunVO;
import com.entity.view.ChengjichaxunView;


/**
 * 成绩查询
 * 
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public interface ChengjichaxunDao extends BaseMapper<ChengjichaxunEntity> {
	
	List<ChengjichaxunVO> selectListVO(@Param("ew") Wrapper<ChengjichaxunEntity> wrapper);
	
	ChengjichaxunVO selectVO(@Param("ew") Wrapper<ChengjichaxunEntity> wrapper);
	
	List<ChengjichaxunView> selectListView(@Param("ew") Wrapper<ChengjichaxunEntity> wrapper);

	List<ChengjichaxunView> selectListView(Pagination page,@Param("ew") Wrapper<ChengjichaxunEntity> wrapper);
	
	ChengjichaxunView selectView(@Param("ew") Wrapper<ChengjichaxunEntity> wrapper);
	
}
