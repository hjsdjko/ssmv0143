package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KebiaochaxunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KebiaochaxunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KebiaochaxunView;


/**
 * 课表查询
 *
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public interface KebiaochaxunService extends IService<KebiaochaxunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KebiaochaxunVO> selectListVO(Wrapper<KebiaochaxunEntity> wrapper);
   	
   	KebiaochaxunVO selectVO(@Param("ew") Wrapper<KebiaochaxunEntity> wrapper);
   	
   	List<KebiaochaxunView> selectListView(Wrapper<KebiaochaxunEntity> wrapper);
   	
   	KebiaochaxunView selectView(@Param("ew") Wrapper<KebiaochaxunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KebiaochaxunEntity> wrapper);
   	
}

