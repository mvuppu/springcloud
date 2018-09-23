package com.hdb.cloud.client.maintainclient.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hdb.cloud.client.maintainclient.model.CorPersonFlat;

public class CustomRowMapper implements RowMapper<CorPersonFlat>{

	@Override
	public CorPersonFlat mapRow(ResultSet arg0, int arg1) throws SQLException {
		
		return null;
	}

}
