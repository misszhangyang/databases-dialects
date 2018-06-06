package main.ssh.dao;

import main.ssh.entity.User;

public interface LogionDao {

	public boolean insertIntoUser(String name,String password);
	
	public User queryFromUser(String name);
}
