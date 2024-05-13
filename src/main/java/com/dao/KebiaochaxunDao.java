package com.dao;

import com.entity.KebiaochaxunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KebiaochaxunVO;
import com.entity.view.KebiaochaxunView;


/**
 * 课表查询
 * 
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public interface KebiaochaxunDao extends BaseMapper<KebiaochaxunEntity> {
	
	List<KebiaochaxunVO> selectListVO(@Param("ew") Wrapper<KebiaochaxunEntity> wrapper);
	
	KebiaochaxunVO selectVO(@Param("ew") Wrapper<KebiaochaxunEntity> wrapper);
	
	List<KebiaochaxunView> selectListView(@Param("ew") Wrapper<KebiaochaxunEntity> wrapper);

	List<KebiaochaxunView> selectListView(Pagination page,@Param("ew") Wrapper<KebiaochaxunEntity> wrapper);
	
	KebiaochaxunView selectView(@Param("ew") Wrapper<KebiaochaxunEntity> wrapper);
	
}
