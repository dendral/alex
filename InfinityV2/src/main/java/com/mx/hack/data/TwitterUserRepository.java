package com.mx.hack.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TwitterUserRepository extends CrudRepository<TwitterUser, Long>{
	
	List<TwitterUser> findByScreenName(String screenName);
	
	TwitterUser findByTwitterUserId(Long twitterUserId);

}
