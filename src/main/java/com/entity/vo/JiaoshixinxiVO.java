package com.entity.vo;

import com.entity.JiaoshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 教室信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public class JiaoshixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 所处地点
	 */
	
	private String suochudidian;
		
	/**
	 * 可容人数
	 */
	
	private Integer kerongrenshu;
		
	/**
	 * 有无空调
	 */
	
	private String youwukongdiao;
		
	/**
	 * 有无投影
	 */
	
	private String youwutouying;
				
	
	/**
	 * 设置：所处地点
	 */
	 
	public void setSuochudidian(String suochudidian) {
		this.suochudidian = suochudidian;
	}
	
	/**
	 * 获取：所处地点
	 */
	public String getSuochudidian() {
		return suochudidian;
	}
				
	
	/**
	 * 设置：可容人数
	 */
	 
	public void setKerongrenshu(Integer kerongrenshu) {
		this.kerongrenshu = kerongrenshu;
	}
	
	/**
	 * 获取：可容人数
	 */
	public Integer getKerongrenshu() {
		return kerongrenshu;
	}
				
	
	/**
	 * 设置：有无空调
	 */
	 
	public void setYouwukongdiao(String youwukongdiao) {
		this.youwukongdiao = youwukongdiao;
	}
	
	/**
	 * 获取：有无空调
	 */
	public String getYouwukongdiao() {
		return youwukongdiao;
	}
				
	
	/**
	 * 设置：有无投影
	 */
	 
	public void setYouwutouying(String youwutouying) {
		this.youwutouying = youwutouying;
	}
	
	/**
	 * 获取：有无投影
	 */
	public String getYouwutouying() {
		return youwutouying;
	}
			
}
