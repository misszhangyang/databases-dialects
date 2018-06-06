package main.ssh.service.impl;

import main.ssh.dao.LogionDao;
import main.ssh.dao.impl.LogionDaoImpl;
import main.ssh.entity.User;
import main.ssh.service.LogionService;

public class LogionServiceImpl implements LogionService {

	LogionDao logionDao = new LogionDaoImpl();

	@Override
	public boolean insertIntoUser(String name, String password) {
		return logionDao.insertIntoUser(name, password);
	}

	@Override
	public User queryFromUser(String name) {
		return logionDao.queryFromUser(name);
	}

}
