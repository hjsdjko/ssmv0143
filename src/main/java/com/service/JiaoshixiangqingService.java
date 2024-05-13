package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshixiangqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshixiangqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshixiangqingView;


/**
 * 教室详情
 *
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public interface JiaoshixiangqingService extends IService<JiaoshixiangqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshixiangqingVO> selectListVO(Wrapper<JiaoshixiangqingEntity> wrapper);
   	
   	JiaoshixiangqingVO selectVO(@Param("ew") Wrapper<JiaoshixiangqingEntity> wrapper);
   	
   	List<JiaoshixiangqingView> selectListView(Wrapper<JiaoshixiangqingEntity> wrapper);
   	
   	JiaoshixiangqingView selectView(@Param("ew") Wrapper<JiaoshixiangqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshixiangqingEntity> wrapper);
   	
}

