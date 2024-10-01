package com.mysite.sbbmybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/messages")
public class MessageController {
	//스프링bean에 올라가있는 해당된 message라는 인스턴스를 가져와서 부여해준다.
	//spring bean이 모든 것을 다룬다.
	@Autowired
	private MessageService messageService;
	 
	@GetMapping("/{id}") //동적처리
	@ResponseBody
	public Message getMessage(@PathVariable("id") Integer id) {
		// Integer id = 1;
		return messageService.getMessage(id);
	}
	
	@GetMapping("/create") // create 경로이면 create 메서드 실행.
    public String create() {
    	return "create-message";
    }
	 
	@PostMapping
	@ResponseBody
	public void createMessage(@RequestBody Message message) {
	    messageService.createMessage(message);
    }
	
	
	//Get방식으로 메세지 목록 불러오기
	@GetMapping
	public String getMessages() {
		return "messages";
	}
	
	//Get방식으로 api 불러오기.
	@GetMapping("/api")
	@ResponseBody
	public List<Message> getMessageLimit10() {
		return messageService.getMessageLimit10();
	}

	
}
