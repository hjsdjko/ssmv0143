package com.entity.view;

import com.entity.JiaoshipingjiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教师评教
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
@TableName("jiaoshipingjiao")
public class JiaoshipingjiaoView  extends JiaoshipingjiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshipingjiaoView(){
	}
 
 	public JiaoshipingjiaoView(JiaoshipingjiaoEntity jiaoshipingjiaoEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshipingjiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
