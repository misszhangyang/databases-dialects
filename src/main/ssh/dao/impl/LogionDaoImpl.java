package main.ssh.dao.impl;

import java.util.List;

import main.ssh.dao.LogionDao;
import main.ssh.dao.OrmDao;
import main.ssh.entity.User;
import main.ssh.entity.VoiceVideo;

public class LogionDaoImpl implements LogionDao {

	OrmDao ormDao = new OrmDao();

	@Override
	public boolean insertIntoUser(String name, String password) {
		String sql = "insert into user(name,password) values(?,?)";
		Object[] params = { name, password };
		return ormDao.insertUpdateDeleteFromDb(sql, params);
	}

	@Override
	public User queryFromUser(String name) {
		String sql = "select * from user where name = " + "'" +name + "'";
		User user = null;
		try {
			List<Object> list = ormDao.excuteSelectSQL(sql, null, User.class);
			if (list.size() == 1) {
				for (int i = 0; i < list.size(); i++) {
					// vv.setid(list.get(i).getString("id"));
					user = (User) list.get(i);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	 }
}
