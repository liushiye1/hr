package com.huarui.hr.entity;

public class Users {
	private Integer u_id;
	private String u_name;
	private String u_true_name;
	private String u_password;
	//private Integer u_roleid;
	private SysRole role;
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_true_name() {
		return u_true_name;
	}
	public void setU_true_name(String u_true_name) {
		this.u_true_name = u_true_name;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public SysRole getRole() {
		return role;
	}
	public void setRole(SysRole role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Users [u_id=" + u_id + ", u_name=" + u_name + ", u_true_name=" + u_true_name + ", u_password="
				+ u_password + ", role=" + role + "]";
	}
	
}
