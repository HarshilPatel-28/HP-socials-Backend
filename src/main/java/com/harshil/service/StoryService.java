package com.harshil.service;

import java.util.List;

import com.harshil.models.Story;
import com.harshil.models.User;

public interface StoryService {
	public Story createStory(Story story,User user);

	
	public List<Story> findStoryByUserId(Integer userId) throws Exception;

}
