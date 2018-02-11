package com.lebaoxun.lottery.game.core.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 彩票期号表
DROP TABLE IF EXISTS `lottery_issue`;
CREATE TABLE `lottery_issue` (
	`id` varchar(36) CHARACTER SET utf8mb4 NOT NULL COMMENT '主键',
  	`expect` varchar(200) NOT NULL COMMENT '期号ID',
  	`startTime` datetime DEFAULT NULL COMMENT '开始时间',
  	`endTime` datetime DEFAULT NULL COMMENT '结束时间',
	`createTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `expect` (`expect`),
  KEY `startTime` (`startTime`),
  KEY `endTime` (`endTime`),
  KEY `createTime` (`createTime`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='彩票期号表';
 * @author Caiqianyi 
 *
 */
public class LotteryIssue implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5051599304772041205L;
	private String id;
	private String expect;
	private Date startTime;
	private Date endTime;
	private Date createTime;
	
	private Integer timeRemaining;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getExpect() {
		return expect;
	}
	public void setExpect(String expect) {
		this.expect = expect;
	}
	public Integer getTimeRemaining() {
		if(endTime != null){
			timeRemaining = ((int)((endTime.getTime() - System.currentTimeMillis()) / 1000));
		}
		return timeRemaining;
	}
}
