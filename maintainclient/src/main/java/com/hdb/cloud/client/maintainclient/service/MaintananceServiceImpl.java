package com.hdb.cloud.client.maintainclient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdb.cloud.client.maintainclient.dao.IUserInfoDAO;
import com.hdb.cloud.client.maintainclient.model.CorPersonFlat;
import com.hdb.cloud.client.maintainclient.model.Corperson;
import com.hdb.cloud.client.maintainclient.repository.CustomerRepository;

@Service
public class MaintananceServiceImpl  implements MaintananceService{
	@Autowired
	private CustomerRepository customerRepository;
		
	@Autowired
	private IUserInfoDAO userInfo;
	
	@Override
	public List<Corperson> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public List<CorPersonFlat> getCustomerDetail(String blocknumber) {		
		return userInfo.getCustomerDetail(blocknumber);
	}
}
