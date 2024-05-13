package com.entity.view;

import com.entity.XuankexiangqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 选课详情
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
@TableName("xuankexiangqing")
public class XuankexiangqingView  extends XuankexiangqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuankexiangqingView(){
	}
 
 	public XuankexiangqingView(XuankexiangqingEntity xuankexiangqingEntity){
 	try {
			BeanUtils.copyProperties(this, xuankexiangqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
