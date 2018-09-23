package com.maintenance.dbservice.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.maintenance.dbservice.model.CorPersonFlat;
import com.maintenance.dbservice.model.Corperson;
@Repository
@Transactional
public class UserInfoDAO implements IUserInfoDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@PersistenceContext	
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Corperson> getAllUserArticles() {
		String hql = "FROM corcustomer";
		return (List<Corperson>) entityManager.createQuery(hql).getResultList();
	}
	@Override
	public List<CorPersonFlat> getCustomerDetail(String blocknumber){		
		String sql="SELECT c.firstname,c.middlename,c.lastname,b.flatnumber,a.blocknumber FROM corperson c, corflatdetails b , corblockdetails a where c.flat_id=b.id and a.blocknumber='"+blocknumber+"'";
		RowMapper<CorPersonFlat> perfonFlat = new BeanPropertyRowMapper<CorPersonFlat>(CorPersonFlat.class);
		return this.jdbcTemplate.query(sql, perfonFlat);		
	}
	@Override
	public List<CorPersonFlat> getOwnerDetails(String username){		
		String sql="select a.flatnumber,b.firstname,b.middlename,b.lastname from corperson b, corflatdetails a where a.id=b.flat_id and  b.user_id in(select id from user where username ='"+username+"')";
		RowMapper<CorPersonFlat> perfonFlat = new BeanPropertyRowMapper<CorPersonFlat>(CorPersonFlat.class);
		return this.jdbcTemplate.query(sql, perfonFlat);		
	}
} 
