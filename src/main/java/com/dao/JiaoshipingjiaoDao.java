package com.dao;

import com.entity.JiaoshipingjiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoshipingjiaoVO;
import com.entity.view.JiaoshipingjiaoView;


/**
 * 教师评教
 * 
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public interface JiaoshipingjiaoDao extends BaseMapper<JiaoshipingjiaoEntity> {
	
	List<JiaoshipingjiaoVO> selectListVO(@Param("ew") Wrapper<JiaoshipingjiaoEntity> wrapper);
	
	JiaoshipingjiaoVO selectVO(@Param("ew") Wrapper<JiaoshipingjiaoEntity> wrapper);
	
	List<JiaoshipingjiaoView> selectListView(@Param("ew") Wrapper<JiaoshipingjiaoEntity> wrapper);

	List<JiaoshipingjiaoView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoshipingjiaoEntity> wrapper);
	
	JiaoshipingjiaoView selectView(@Param("ew") Wrapper<JiaoshipingjiaoEntity> wrapper);
	
}
