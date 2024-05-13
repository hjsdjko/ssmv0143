package com.entity.model;

import com.entity.WangshangxuankeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 网上选课
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-18 16:53:23
 */
public class WangshangxuankeModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 课程名称
	 */
	
	private String kechengmingcheng;
		
	/**
	 * 教职工号
	 */
	
	private String jiaozhigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 科目
	 */
	
	private String kemu;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 教室名称
	 */
	
	private String jiaoshimingcheng;
		
	/**
	 * 上课时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangkeshijian;
		
	/**
	 * 上课时长
	 */
	
	private String shangkeshizhang;
				
	
	/**
	 * 设置：课程名称
	 */
	 
	public void setKechengmingcheng(String kechengmingcheng) {
		this.kechengmingcheng = kechengmingcheng;
	}
	
	/**
	 * 获取：课程名称
	 */
	public String getKechengmingcheng() {
		return kechengmingcheng;
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
	 * 设置：科目
	 */
	 
	public void setKemu(String kemu) {
		this.kemu = kemu;
	}
	
	/**
	 * 获取：科目
	 */
	public String getKemu() {
		return kemu;
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
	 * 设置：上课时间
	 */
	 
	public void setShangkeshijian(Date shangkeshijian) {
		this.shangkeshijian = shangkeshijian;
	}
	
	/**
	 * 获取：上课时间
	 */
	public Date getShangkeshijian() {
		return shangkeshijian;
	}
				
	
	/**
	 * 设置：上课时长
	 */
	 
	public void setShangkeshizhang(String shangkeshizhang) {
		this.shangkeshizhang = shangkeshizhang;
	}
	
	/**
	 * 获取：上课时长
	 */
	public String getShangkeshizhang() {
		return shangkeshizhang;
	}
			
}
