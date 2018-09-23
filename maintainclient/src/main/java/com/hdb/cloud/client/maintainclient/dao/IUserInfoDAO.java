package com.hdb.cloud.client.maintainclient.dao;

import java.util.List;

import com.hdb.cloud.client.maintainclient.model.CorPersonFlat;
import com.hdb.cloud.client.maintainclient.model.Corperson;
public interface IUserInfoDAO {
	//UserInfo getActiveUser(String userName);
	List<Corperson> getAllUserArticles();
	public List<CorPersonFlat> getCustomerDetail(String blocknumber);
} 
