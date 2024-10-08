package com.mysite.sbbmybatis;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	User getUserByUsername(String username);
}
