package com.entity.view;

import com.entity.XiaoyuanrenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校园任务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
@TableName("xiaoyuanrenwu")
public class XiaoyuanrenwuView  extends XiaoyuanrenwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoyuanrenwuView(){
	}
 
 	public XiaoyuanrenwuView(XiaoyuanrenwuEntity xiaoyuanrenwuEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoyuanrenwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
