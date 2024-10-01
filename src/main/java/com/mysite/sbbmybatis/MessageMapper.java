package com.mysite.sbbmybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {

	Message getMessageById(Integer id);	
	void insertMessage(Message message);
	//List 제너릭? 사용해서 메서드 생성 list임.
	List<Message> getMessageLimit10();
}
