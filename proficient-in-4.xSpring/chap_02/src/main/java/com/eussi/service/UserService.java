package com.eussi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eussi.dao.LoginLogDao;
import com.eussi.dao.UserDao;
import com.eussi.domain.LoginLog;
import com.eussi.domain.User;
import org.springframework.transaction.annotation.Transactional;

@Service   //将UserService标注为一个服务层的Bean
public class UserService {
	private UserDao userDao;
	private LoginLogDao loginLogDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Autowired
	public void setLoginLogDao(LoginLogDao loginLogDao) {
		this.loginLogDao = loginLogDao;
	}


	public boolean hasMatchUser(String userName, String password) {
		int matchCount =userDao.getMatchCount(userName, password);
		return matchCount > 0;
	}
	
	public User findUserByUserName(String userName) {
		return userDao.findUserByUserName(userName);
	}

	@Transactional  //让该方法运行在事务环境中
    public void loginSuccess(User user) {
		user.setCredits( 5 + user.getCredits());
		LoginLog loginLog = new LoginLog();
		loginLog.setUserId(user.getUserId());
		loginLog.setIp(user.getLastIp());
		loginLog.setLoginDate(user.getLastVisit());
        userDao.updateLoginInfo(user);
//        if(true)       //测试事务
//        	throw new RuntimeException("mock");
        loginLogDao.insertLoginLog(loginLog);
	}


}
