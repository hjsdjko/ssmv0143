package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PingjiaoxiangqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PingjiaoxiangqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PingjiaoxiangqingView;


/**
 * 评教详情
 *
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public interface PingjiaoxiangqingService extends IService<PingjiaoxiangqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PingjiaoxiangqingVO> selectListVO(Wrapper<PingjiaoxiangqingEntity> wrapper);
   	
   	PingjiaoxiangqingVO selectVO(@Param("ew") Wrapper<PingjiaoxiangqingEntity> wrapper);
   	
   	List<PingjiaoxiangqingView> selectListView(Wrapper<PingjiaoxiangqingEntity> wrapper);
   	
   	PingjiaoxiangqingView selectView(@Param("ew") Wrapper<PingjiaoxiangqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PingjiaoxiangqingEntity> wrapper);
   	
}

