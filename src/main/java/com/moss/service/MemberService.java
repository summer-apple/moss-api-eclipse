package com.moss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moss.dao.BaseDao;
import com.moss.entity.Member;

@Service
public class MemberService {

	@Autowired
	private BaseDao<Member> dao;
	@Autowired
	private UtilService us;
	
	
	/**
	 * login
	 * @param username
	 * @param password
	 * @return
	 */
	public Member login(String username,String password) {
		Member member = dao.get(Member.class, "username", username);
		if (member!=null) {
			if (member.getPassword() == us.getPasswordMD5(username, password)) {
				return member;
			}
		}
		
		return null;
	}
	
	/**
	 * register
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean register(String username,String password) {
		Member member = new Member();
		member.setUsername(username);
		member.setPassword(us.getPasswordMD5(username, password));
		
		try {
			dao.save(member);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
