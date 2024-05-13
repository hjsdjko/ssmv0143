package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyuanrenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyuanrenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyuanrenwuView;


/**
 * 校园任务
 *
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public interface XiaoyuanrenwuService extends IService<XiaoyuanrenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyuanrenwuVO> selectListVO(Wrapper<XiaoyuanrenwuEntity> wrapper);
   	
   	XiaoyuanrenwuVO selectVO(@Param("ew") Wrapper<XiaoyuanrenwuEntity> wrapper);
   	
   	List<XiaoyuanrenwuView> selectListView(Wrapper<XiaoyuanrenwuEntity> wrapper);
   	
   	XiaoyuanrenwuView selectView(@Param("ew") Wrapper<XiaoyuanrenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyuanrenwuEntity> wrapper);
   	
}

