package main.ssh.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import main.ssh.dao.OrmDao;
import main.ssh.dao.OverViewDialectsDao;
import main.ssh.entity.OverviewDialects;
import main.ssh.entity.RegionPoint;
import main.ssh.entity.RegionSpread;
import main.ssh.entity.VoiceVideo;

public class OverViewDialectsImpl implements OverViewDialectsDao {
	public void addViewDialects(OverviewDialects overviewdialects) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource = context.getBean(DataSource.class);
		JdbcTemplate j = new JdbcTemplate(dataSource);
		String sql = "insert into overviewdialects values (?)";
		j.update(sql, overviewdialects.getOverview());
	}

	@Override
	public OverviewDialects queryViewDialects() {
		OverviewDialects overviewdialects = new OverviewDialects();
		String sql = "select * FROM overviewdialects";
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		try {
			DataSource dataSource = context.getBean(DataSource.class);
			Connection conn = dataSource.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				overviewdialects.setOverview(rs.getString("overview"));
				System.out.println("name >> " + rs.getString("overview"));
			}
			// 关闭
			rs.close();
			statement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return overviewdialects;
	}

	@Override
	public RegionSpread queryRegionSpread() {
		String sql = "select * from RegionSpread where id = 1";
		OrmDao ormDao = new OrmDao();
		RegionSpread vv = null;
		try {
			List<Object> list = ormDao.excuteSelectSQL(sql, null, RegionSpread.class);
			if (list.size() == 1) {
				for (int i = 0; i < list.size(); i++) {
					// vv.setid(list.get(i).getString("id"));
					vv = (RegionSpread) list.get(i);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vv;
	}
}
