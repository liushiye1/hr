package com.huarui.hr.lsy.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.huarui.hr.entity.SysRight;

@Repository
public interface SysRightMapper {
	public List<SysRight> queryRight();
	public List<SysRight> queryRightByParentId(Integer id);
	public List<SysRight> queryRightAndRoleByRoleId(Integer roleId);
}
