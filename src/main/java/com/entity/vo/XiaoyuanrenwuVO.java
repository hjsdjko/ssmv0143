package com.entity.vo;

import com.entity.XiaoyuanrenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 校园任务
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public class XiaoyuanrenwuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 任务类型
	 */
	
	private String renwuleixing;
		
	/**
	 * 教职工号
	 */
	
	private String jiaozhigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 任务详情
	 */
	
	private String renwuxiangqing;
		
	/**
	 * 任务附件
	 */
	
	private String renwufujian;
				
	
	/**
	 * 设置：任务类型
	 */
	 
	public void setRenwuleixing(String renwuleixing) {
		this.renwuleixing = renwuleixing;
	}
	
	/**
	 * 获取：任务类型
	 */
	public String getRenwuleixing() {
		return renwuleixing;
	}
				
	
	/**
	 * 设置：教职工号
	 */
	 
	public void setJiaozhigonghao(String jiaozhigonghao) {
		this.jiaozhigonghao = jiaozhigonghao;
	}
	
	/**
	 * 获取：教职工号
	 */
	public String getJiaozhigonghao() {
		return jiaozhigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：任务详情
	 */
	 
	public void setRenwuxiangqing(String renwuxiangqing) {
		this.renwuxiangqing = renwuxiangqing;
	}
	
	/**
	 * 获取：任务详情
	 */
	public String getRenwuxiangqing() {
		return renwuxiangqing;
	}
				
	
	/**
	 * 设置：任务附件
	 */
	 
	public void setRenwufujian(String renwufujian) {
		this.renwufujian = renwufujian;
	}
	
	/**
	 * 获取：任务附件
	 */
	public String getRenwufujian() {
		return renwufujian;
	}
			
}
