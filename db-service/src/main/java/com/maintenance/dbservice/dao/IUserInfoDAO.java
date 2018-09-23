package com.maintenance.dbservice.dao;

import java.util.List;

import com.maintenance.dbservice.model.CorPersonFlat;
import com.maintenance.dbservice.model.Corperson;
public interface IUserInfoDAO {
	//UserInfo getActiveUser(String userName);
	List<Corperson> getAllUserArticles();
	public List<CorPersonFlat> getCustomerDetail(String blocknumber);
	List<CorPersonFlat> getOwnerDetails(String username);
} 
