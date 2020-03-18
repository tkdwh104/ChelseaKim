package com.project.test.users.Dao;

import com.project.test.users.Dto.UsersDto;

public interface UsersDao {

	void insert(UsersDto dto);

	boolean isExist(String userId);

	String getPassHash(String userId);

	UsersDto logIn(String userId);

}
