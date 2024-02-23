package com.harshil.service;

import java.util.List;

import com.harshil.models.Chat;
import com.harshil.models.User;

public interface ChatService {

	public Chat createChat(User reqUser,User user2);
	
	public Chat findChatById(Integer chatId) throws Exception;
	
	public List<Chat> findUsersChat(Integer userId);
}
