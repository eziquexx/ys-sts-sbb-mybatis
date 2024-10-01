package com.mysite.sbbmybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
	@Autowired
	private MessageMapper messageMapper;
	// 데이터베이스에서 값을 가져오는 것
	
	//해당 값 가져오기.
	public Message getMessage(Integer id) {
		return messageMapper.getMessageById(id);
		//return "Hello World";
	}
	
	//메세지 생성
	public void createMessage(Message message) {
        messageMapper.insertMessage(message);
    }
	
	//메세지 목록 가져오기 메서드 만들기
	public List<Message> getMessageLimit10() {
		return messageMapper.getMessageLimit10();
	}
}