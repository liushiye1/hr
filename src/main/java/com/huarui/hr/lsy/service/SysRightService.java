package com.huarui.hr.lsy.service;

import java.util.List;

import com.huarui.hr.entity.SysRight;


public interface SysRightService {
	public List<SysRight> queryRight();
	public List<SysRight> queryRightByParentId(Integer id);
}
