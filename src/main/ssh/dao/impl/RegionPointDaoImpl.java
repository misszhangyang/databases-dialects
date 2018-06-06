package main.ssh.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import main.ssh.dao.RegionPointDao;
import main.ssh.entity.RegionPoint;

@Component 
public class RegionPointDaoImpl implements RegionPointDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addRegionPoint(RegionPoint regionPoint) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource = context.getBean(DataSource.class);
		JdbcTemplate j = new JdbcTemplate(dataSource);
		String sql = "insert into regionpiont(id,voicepoint,grammer,phonology) values (?,?,?,?)";
		j.update(sql, regionPoint.getId(), regionPoint.getVoicepoint(), regionPoint.getGrammar(),
				regionPoint.getPhonology());
	}

	@Override
	public List<RegionPoint> findAllRegion(int id) {
		List<RegionPoint> regionPoint = new ArrayList<RegionPoint>();
		RegionPoint regionPoints = new RegionPoint();
		String sql = "select * from regionPoint";
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		try {
			DataSource dataSource = context.getBean(DataSource.class);
			Connection conn = dataSource.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				int regionPointId = Integer.parseInt(rs.getString("id"));
				regionPoints.setId(regionPointId);
				regionPoints.setVoicepoint(rs.getString("voicepoint"));
				regionPoints.setGrammar(rs.getString("grammar"));
				regionPoints.setPhonology(rs.getString("phonology"));
			}
			regionPoint.add(regionPoints);
			// 关闭
			rs.close();
			statement.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return regionPoint;
	}

}
