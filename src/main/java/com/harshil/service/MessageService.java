package com.harshil.service;

import java.util.List;


import com.harshil.models.Message;
import com.harshil.models.User;

public interface MessageService {
	
	public Message createMessage(User user,Integer chatId,Message req) throws Exception;
	
	public List<Message> findChatMessages(Integer chatId) throws Exception;

}
