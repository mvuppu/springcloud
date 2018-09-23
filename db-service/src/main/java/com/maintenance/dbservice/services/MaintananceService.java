package com.maintenance.dbservice.services;

import java.util.List;

import com.maintenance.dbservice.model.CorPersonFlat;
import com.maintenance.dbservice.model.Corperson;

public interface MaintananceService {
	//public List<Corperson> getAllCustomer();
	public List<CorPersonFlat> getCustomerDetail(String blocknumber);
}
