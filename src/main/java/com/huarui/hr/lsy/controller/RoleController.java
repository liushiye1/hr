package com.huarui.hr.lsy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huarui.hr.entity.SysRole;
import com.huarui.hr.entity.Users;
import com.huarui.hr.lsy.mapper.MyMapper;
import com.huarui.hr.lsy.service.SysRoleService;
import com.huarui.hr.lsy.service.UsersService;
import com.huarui.hr.lsy.util.MyPage;

@Controller
@RequestMapping("role")
public class RoleController {
	@Autowired
	private SysRoleService roleService;
	@RequestMapping("/queryRoleJson")
	@ResponseBody
	public List queryRoleJson() {
		System.out.println("查询全部的角色");
		List<SysRole> list=roleService.queryRole();
		return list;
	}
}
