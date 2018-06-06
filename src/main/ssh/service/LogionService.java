package main.ssh.service;

import main.ssh.entity.User;

public interface LogionService {

	//用户注册时保存数据
	public boolean insertIntoUser(String name,String password);
	
	//用户登录时验证数据
	public User queryFromUser(String name);
}
