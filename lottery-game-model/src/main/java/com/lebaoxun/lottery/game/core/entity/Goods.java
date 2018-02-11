package com.lebaoxun.lottery.game.core.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author DELL
 *
 */
public class Goods implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7844940021486434457L;
	private Integer id;
	private String lottery;
	private Integer nums;
	private Integer status;
	private Long price;
	private Integer userId;
	private Integer buyUserId;
	private String descr;
	private Date createTime;
	private Date buyTime;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLottery() {
		return lottery;
	}
	public void setLottery(String lottery) {
		this.lottery = lottery;
	}
	public Integer getNums() {
		return nums;
	}
	public void setNums(Integer nums) {
		this.nums = nums;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getBuyUserId() {
		return buyUserId;
	}
	public void setBuyUserId(Integer buyUserId) {
		this.buyUserId = buyUserId;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getBuyTime() {
		return buyTime;
	}
	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}
	
}
