package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuankexiangqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuankexiangqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuankexiangqingView;


/**
 * 选课详情
 *
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public interface XuankexiangqingService extends IService<XuankexiangqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuankexiangqingVO> selectListVO(Wrapper<XuankexiangqingEntity> wrapper);
   	
   	XuankexiangqingVO selectVO(@Param("ew") Wrapper<XuankexiangqingEntity> wrapper);
   	
   	List<XuankexiangqingView> selectListView(Wrapper<XuankexiangqingEntity> wrapper);
   	
   	XuankexiangqingView selectView(@Param("ew") Wrapper<XuankexiangqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuankexiangqingEntity> wrapper);
   	
}

