package com.family.kitchen.user.po;

import com.family.kitchen.base.BaseEntity;

/**
 * 
 * <p>Title: 用户信息数据库映射类</p>
 * <p>Copyright: </p> 
 * @author XBB 
 * @date 2015年7月26日 下午8:15:13 Create
 * @version V1.0 
 * <pre>Histroy:
 *       2015年7月26日 下午8:15:13  XBB  Create
 * </pre>
 *
 */
public class User extends BaseEntity {

	private String userid;  //用户编号
	private String username;//用户昵称
	private String password;//密码
	private String email;//邮箱
	private String phonenumber;//手机号码
	private String code;//激活码
	private Boolean state;//是否激活
	private Boolean show;//保留字段
	private Integer vip;//vip积分
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	public Boolean getShow() {
		return show;
	}
	public void setShow(Boolean show) {
		this.show = show;
	}
	public Integer getVip() {
		return vip;
	}
	public void setVip(Integer vip) {
		this.vip = vip;
	}
	
	
	
}
