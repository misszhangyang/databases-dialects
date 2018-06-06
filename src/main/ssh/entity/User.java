package main.ssh.entity;

public class User {
	
	//用户登录
	public String name;
	public String password;
	public String getName() {
		return name;
	}
	public String setname(String name){
		this.name = name;
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public String setpassword(String password){
		this.password = password;
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
