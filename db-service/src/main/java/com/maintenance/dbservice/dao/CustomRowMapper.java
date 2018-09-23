package com.maintenance.dbservice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.maintenance.dbservice.model.CorPersonFlat;

public class CustomRowMapper implements RowMapper<CorPersonFlat>{

	@Override
	public CorPersonFlat mapRow(ResultSet arg0, int arg1) throws SQLException {
		
		return null;
	}

}
