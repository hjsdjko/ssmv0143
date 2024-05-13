package com.entity.view;

import com.entity.KebiaochaxunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课表查询
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
@TableName("kebiaochaxun")
public class KebiaochaxunView  extends KebiaochaxunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KebiaochaxunView(){
	}
 
 	public KebiaochaxunView(KebiaochaxunEntity kebiaochaxunEntity){
 	try {
			BeanUtils.copyProperties(this, kebiaochaxunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
