package com.huarui.hr.lsy.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huarui.hr.entity.SysRight;
import com.huarui.hr.lsy.mapper.SysRightMapper;
import com.huarui.hr.lsy.service.SysRightService;
@Service
public class SysRightServiceImp implements SysRightService {

	@Autowired
	private SysRightMapper srm;
	@Override
	public List<SysRight> queryRight() {
		System.out.println("SysRightServiceImp");
		return srm.queryRight();
	}
	@Override
	public List<SysRight> queryRightByParentId(Integer id) {
		System.out.println("queryRightByParentId");	
		return srm.queryRightByParentId(id);
	}

}
