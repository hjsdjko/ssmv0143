package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 教室信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
@TableName("jiaoshixinxi")
public class JiaoshixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoshixinxiEntity() {
		
	}
	
	public JiaoshixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 教室名称
	 */
					
	private String jiaoshimingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：教室名称
	 */
	public void setJiaoshimingcheng(String jiaoshimingcheng) {
		this.jiaoshimingcheng = jiaoshimingcheng;
	}
	/**
	 * 获取：教室名称
	 */
	public String getJiaoshimingcheng() {
		return jiaoshimingcheng;
	}
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
