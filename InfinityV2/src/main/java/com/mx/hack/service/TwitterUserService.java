package com.mx.hack.service;

import com.mx.hack.data.TwitterUser;

public interface TwitterUserService {
	
	public TwitterUser saveUser (TwitterUser tu) throws Exception;
	
	public TwitterUser getUser(Long twitterUserId ) throws Exception;
	
	public TwitterUser updateUser (TwitterUser tu) throws Exception;

}
