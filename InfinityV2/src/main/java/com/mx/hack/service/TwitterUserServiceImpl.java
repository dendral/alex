package com.mx.hack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.hack.data.TwitterUser;
import com.mx.hack.data.TwitterUserRepository;

@Service
public class TwitterUserServiceImpl implements TwitterUserService {
	@Autowired
	private TwitterUserRepository repository;
	
	@Override
	public TwitterUser saveUser(TwitterUser tu) throws Exception {
		System.out.println("antes");
		System.out.println(tu);
		repository.save(tu);
		System.out.println("despues");
		System.out.println(tu);
		return tu;
	}

	@Override
	public TwitterUser getUser(Long twitterUserId) throws Exception {
		return repository.findByTwitterUserId(twitterUserId);
	}
	
	@Override
	public TwitterUser updateUser(TwitterUser tu) throws Exception {
		return repository.save(tu);
	}
}
