package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WangshangxuankeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WangshangxuankeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WangshangxuankeView;


/**
 * 网上选课
 *
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public interface WangshangxuankeService extends IService<WangshangxuankeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WangshangxuankeVO> selectListVO(Wrapper<WangshangxuankeEntity> wrapper);
   	
   	WangshangxuankeVO selectVO(@Param("ew") Wrapper<WangshangxuankeEntity> wrapper);
   	
   	List<WangshangxuankeView> selectListView(Wrapper<WangshangxuankeEntity> wrapper);
   	
   	WangshangxuankeView selectView(@Param("ew") Wrapper<WangshangxuankeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WangshangxuankeEntity> wrapper);
   	
}

