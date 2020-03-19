package com.huarui.hr.lsy.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MyMapper {
	public Integer getTableCount(@Param("tabName")String tableName);
}
