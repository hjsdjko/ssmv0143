package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengjichaxunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengjichaxunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengjichaxunView;


/**
 * 成绩查询
 *
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public interface ChengjichaxunService extends IService<ChengjichaxunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengjichaxunVO> selectListVO(Wrapper<ChengjichaxunEntity> wrapper);
   	
   	ChengjichaxunVO selectVO(@Param("ew") Wrapper<ChengjichaxunEntity> wrapper);
   	
   	List<ChengjichaxunView> selectListView(Wrapper<ChengjichaxunEntity> wrapper);
   	
   	ChengjichaxunView selectView(@Param("ew") Wrapper<ChengjichaxunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengjichaxunEntity> wrapper);
   	
}

