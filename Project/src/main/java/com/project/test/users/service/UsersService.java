package com.project.test.users.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.project.test.users.Dto.UsersDto;

public interface UsersService {

	void addUser(UsersDto dto);

	boolean validUsers(UsersDto dto, HttpSession session, ModelAndView mView);

	Map<String, Object> isExistId(String inputUserId);

}
