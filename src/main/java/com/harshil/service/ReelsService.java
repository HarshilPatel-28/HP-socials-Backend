package com.harshil.service;

import java.util.List;

import com.harshil.models.Reels;
import com.harshil.models.User;

public interface ReelsService {
	
	public Reels createReel(Reels reel,User user); 
	
	public List<Reels> findAllReels();
	
	public List<Reels> findUsersReel(Integer userId) throws Exception;

}
