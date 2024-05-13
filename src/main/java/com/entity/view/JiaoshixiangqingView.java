package com.entity.view;

import com.entity.JiaoshixiangqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教室详情
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
@TableName("jiaoshixiangqing")
public class JiaoshixiangqingView  extends JiaoshixiangqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshixiangqingView(){
	}
 
 	public JiaoshixiangqingView(JiaoshixiangqingEntity jiaoshixiangqingEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshixiangqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}