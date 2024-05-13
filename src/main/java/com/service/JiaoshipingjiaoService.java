package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoshipingjiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoshipingjiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoshipingjiaoView;


/**
 * 教师评教
 *
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public interface JiaoshipingjiaoService extends IService<JiaoshipingjiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoshipingjiaoVO> selectListVO(Wrapper<JiaoshipingjiaoEntity> wrapper);
   	
   	JiaoshipingjiaoVO selectVO(@Param("ew") Wrapper<JiaoshipingjiaoEntity> wrapper);
   	
   	List<JiaoshipingjiaoView> selectListView(Wrapper<JiaoshipingjiaoEntity> wrapper);
   	
   	JiaoshipingjiaoView selectView(@Param("ew") Wrapper<JiaoshipingjiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoshipingjiaoEntity> wrapper);
   	
}

