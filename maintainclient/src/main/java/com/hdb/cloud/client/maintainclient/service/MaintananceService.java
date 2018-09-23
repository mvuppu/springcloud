package com.hdb.cloud.client.maintainclient.service;

import java.util.List;

import com.hdb.cloud.client.maintainclient.model.CorPersonFlat;
import com.hdb.cloud.client.maintainclient.model.Corperson;

public interface MaintananceService {
	public List<Corperson> getAllCustomer();
	public List<CorPersonFlat> getCustomerDetail(String blocknumber);
}
