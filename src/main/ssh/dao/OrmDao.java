package main.ssh.dao;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrmDao {

	// 封装增删改的操作
	public boolean insertUpdateDeleteFromDb(String sql, Object[] params) {
		return insertUpdateDeleteInDb(sql, params);
	}

	private boolean insertUpdateDeleteInDb(String sql, Object[] params) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource = context.getBean(DataSource.class);
		// resultCode执行sql返回的结果值
		int resultCode = -1;
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = null;
			resultCode = -1;
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			if (params != null && !params.equals("")) {
				for (int i = 1; i < params.length + 1; i++) {
					// 赋值的时候，索引是从1开始的
					preparedStatement.setObject(i, params[i - 1]);
				}
			}
			resultCode = preparedStatement.executeUpdate();
			// 关闭连接
			connection.close();
			preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultCode == 1 ? true : false;
	}

	// 封装查询的操作,返回一个list
	public List<Object> excuteSelectSQL(String sql, Object[] params, Class clazz) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource = context.getBean(DataSource.class);
		List<Object> all = new ArrayList<Object>();
		// resultCode执行sql返回的结果值
		int resultCode = -1;
		try {
			Connection connection = dataSource.getConnection();
			PreparedStatement preparedStatement = null;
			resultCode = -1;
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			if (params != null && !params.equals("")) {
				for (int i = 1; i < params.length + 1; i++) {
					// 赋值的时候，索引是从1开始的
					preparedStatement.setObject(i, params[i - 1]);
				}
			}
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Object o = clazz.newInstance();
				List<String> allMethods = getAllMehtods(clazz);
				int index = 1;
				for (String s : allMethods) {
					String str = rs.getString(index);
					// Object object = (Object)str;
					// ((List<T>) o).add((T) object);
					clazz.getDeclaredMethod(s, String.class).invoke(o, rs.getString(index));
					index++;
				}
				all.add(o);
			}
			// 关闭连接
			connection.close();
			preparedStatement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return all;
	}

	private List<String> getAllMehtods(Class clazz) {
		List<String> allMendth = new ArrayList<String>();
		Field[] f = clazz.getDeclaredFields();
		for (int i = 0; i < f.length; i++) {
			String m = "set";
			m += f[i].getName();
			allMendth.add(m);
		}
		return allMendth;
	}
}
