package com.huarui.hr.entity;

public class SysRight {
	private Integer right_code;
	private Integer right_parent_code;
	private String right_type;
	private String right_text;
	private String right_url;
	private String right_tip;

	public Integer getRight_code() {
		return right_code;
	}

	public void setRight_code(Integer right_code) {
		this.right_code = right_code;
	}

	public Integer getRight_parent_code() {
		return right_parent_code;
	}

	public void setRight_parent_code(Integer right_parent_code) {
		this.right_parent_code = right_parent_code;
	}

	public String getRight_type() {
		return right_type;
	}

	public void setRight_type(String right_type) {
		this.right_type = right_type;
	}

	public String getRight_text() {
		return right_text;
	}

	public void setRight_text(String right_text) {
		this.right_text = right_text;
	}

	public String getRight_url() {
		return right_url;
	}

	public void setRight_url(String right_url) {
		this.right_url = right_url;
	}

	public String getRight_tip() {
		return right_tip;
	}

	public void setRight_tip(String right_tip) {
		this.right_tip = right_tip;
	}

	@Override
	public String toString() {
		return "SysRight [right_code=" + right_code + ", right_parent_code=" + right_parent_code + ", right_type="
				+ right_type + ", right_text=" + right_text + ", right_url=" + right_url + ", right_tip=" + right_tip
				+ "]";
	}

}
