package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwutijiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenwutijiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenwutijiaoView;


/**
 * 任务提交
 *
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public interface RenwutijiaoService extends IService<RenwutijiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwutijiaoVO> selectListVO(Wrapper<RenwutijiaoEntity> wrapper);
   	
   	RenwutijiaoVO selectVO(@Param("ew") Wrapper<RenwutijiaoEntity> wrapper);
   	
   	List<RenwutijiaoView> selectListView(Wrapper<RenwutijiaoEntity> wrapper);
   	
   	RenwutijiaoView selectView(@Param("ew") Wrapper<RenwutijiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenwutijiaoEntity> wrapper);
   	
}

