package com.mx.hack.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "twitter_user")
public class TwitterUser {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
    private long twitterUserId;
    private String screenName;
    private String accessToken;
    private String accessTokenSecret;
    
    
    public TwitterUser() {
		// TODO Auto-generated constructor stub
	}
    
	/**
	 * @param userId
	 * @param twitterUserId
	 * @param screenName
	 * @param accessToken
	 * @param accessTokenSecret
	 */
	public TwitterUser(long userId, long twitterUserId, String screenName, String accessToken,
			String accessTokenSecret) {
		super();
		this.userId = userId;
		this.twitterUserId = twitterUserId;
		this.screenName = screenName;
		this.accessToken = accessToken;
		this.accessTokenSecret = accessTokenSecret;
	}
	
	/**
	 * @return the userId
	 */
	public long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}

	/**
	 * @return the twitterUserId
	 */
	public long getTwitterUserId() {
		return twitterUserId;
	}

	/**
	 * @param twitterUserId the twitterUserId to set
	 */
	public void setTwitterUserId(long twitterUserId) {
		this.twitterUserId = twitterUserId;
	}

	/**
	 * @return the screenName
	 */
	public String getScreenName() {
		return screenName;
	}

	/**
	 * @param screenName the screenName to set
	 */
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	/**
	 * @return the accessToken
	 */
	public String getAccessToken() {
		return accessToken;
	}

	/**
	 * @param accessToken the accessToken to set
	 */
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	/**
	 * @return the accessTokenSecret
	 */
	public String getAccessTokenSecret() {
		return accessTokenSecret;
	}

	/**
	 * @param accessTokenSecret the accessTokenSecret to set
	 */
	public void setAccessTokenSecret(String accessTokenSecret) {
		this.accessTokenSecret = accessTokenSecret;
	}

	@Override
	public String toString() {
		return "TwitterUser [userId=" + userId + ", twitterUserId=" + twitterUserId + ", screenName=" + screenName
				+ ", accessToken=" + accessToken + ", accessTokenSecret=" + accessTokenSecret + "]";
	}

}
