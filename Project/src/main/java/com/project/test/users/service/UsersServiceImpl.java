package com.project.test.users.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.project.test.users.Dao.UsersDao;
import com.project.test.users.Dto.UsersDto;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersDao dao;

	@Override
	public void addUser(UsersDto dto) {
		// 비밀번호 암호화
		String encodePass = new BCryptPasswordEncoder().encode(dto.getUserPass());
		dto.setUserPass(encodePass);
		dao.insert(dto);
	}

	@Override
	public Map<String, Object> isExistId(String inputUserId) {
		boolean isExistId = dao.isExist(inputUserId);
		Map<String, Object> map = new HashMap<>();
		map.put("isExist", isExistId);
		return map;
	}

	@Override
	public boolean validUsers(UsersDto dto, HttpSession session, ModelAndView mView) {
		boolean isValid = false;
		String passHash = dao.getPassHash(dto.getUserId());
		if (passHash != null) {
			isValid = BCrypt.checkpw(dto.getUserPass(), passHash);
		}
		if (isValid) {
			UsersDto usersdto1 = dao.logIn(dto.getUserId());
			session.setAttribute("usersDto", usersdto1);
			return true;
		} else {
			return false;
		}
	}
}