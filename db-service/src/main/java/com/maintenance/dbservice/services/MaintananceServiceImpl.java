package com.maintenance.dbservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maintenance.dbservice.dao.IUserInfoDAO;
import com.maintenance.dbservice.model.CorPersonFlat;

@Service
public class MaintananceServiceImpl  implements MaintananceService{
	/*@Autowired
	private CustomerRepository customerRepository*/;
		
	@Autowired
	private IUserInfoDAO userInfo;
	
	/*@Override
	public List<Corperson> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}*/

	@Override
	public List<CorPersonFlat> getCustomerDetail(String blocknumber) {		
		return userInfo.getOwnerDetails(blocknumber);
	}
}
