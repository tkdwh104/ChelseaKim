package com.project.test.users.Dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.test.users.Dto.UsersDto;

@Repository
public class UsersDaoImpl implements UsersDao {
	@Autowired
	private SqlSession session;
	
	@Override
	public void insert(UsersDto dto) {
		session.insert("users.insert", dto);
	}
	
	@Override
	public boolean isExist(String userId) {
		String id = session.selectOne("users.isExist", userId);
		
		if(id == null) {
			return false;			
		} else {
			return true;
		}
	}
	
	@Override
	public String getPassHash(String userId) {
		String savePwd = session.selectOne("users.getPassHash", userId);
		return savePwd;
	}
	
	@Override
	public UsersDto logIn(String userId) {
		return session.selectOne("users.login", userId);
	}
	
	
}
