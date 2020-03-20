package com.project.test.users.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.project.test.users.Dto.UsersDto;

public interface UsersService {

	public Map<String, Object> isExistId(String inputUserId);
	public void addUser(UsersDto dto);
	public boolean validUsers(UsersDto dto, HttpSession session,
			ModelAndView mView);
	public void showInfo(String id, ModelAndView mView);
	public void deleteUser(String id);
	
	
	public void updatePass(UsersDto dto, ModelAndView mView);
	public void userUpdate(UsersDto dto);
}
