package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.ssh.dao.OrmDao;
import main.ssh.dao.RegionPointDao;
import main.ssh.dao.impl.RegionPointDaoImpl;
import main.ssh.entity.RegionPoint;
import main.ssh.entity.VoiceVideo;
import main.ssh.service.OverViewDialectsService;
import main.ssh.service.impl.OverViewDIalectsServiceImpl;
import main.ssh.service.impl.RegionPointServiceImpl;

public class testDataBase {
	public static void main(String[] args) throws Exception {
		/*
		 * ApplicationContext ctx = new
		 * ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		 * RegionPointDaoImpl rpd = (RegionPointDaoImpl)
		 * ctx.getBean("RegionPointDaoImpl");
		 */
		// RegionPoint rp = new RegionPoint();
		// rp.setId(7);
		// rp.setPhonology("2121");
		// rp.setGrammar("dqwdq");
		// rp.setVoicepoint("dfwe");
		// RegionPointServiceImpl rs = new RegionPointServiceImpl();
		// OverViewDialectsService ovd = new OverViewDIalectsServiceImpl();
		// ovd.queryViewDialects();
		// rs.addRegionPiont(rp);
		String sql = "select * from overview";
		String sql1 = "insert into voicevideo(id,essay,clause,vocabulary,phonology) values(?,?,?,?,?)";
		String sql2 = "update voicevideo set essay = 'qwerer' where id = 1";
		String sql3 = "delete from voicevideo where id = 2";
		String sql4 = "select * from voicevideo";
		Object[] params1 = { 3, "dwq", "wdeqwd", "dwq", "wqwdq" };
		Object[] params = { 1 };
		OrmDao ormDao = new OrmDao();
		ormDao.insertUpdateDeleteFromDb(sql1, params1);
		List<Object> list = ormDao.excuteSelectSQL(sql4, null, VoiceVideo.class);
		VoiceVideo vv = null;
		if (list.size() == 1) {
			for (int i = 0; i < list.size(); i++) {
				// vv.setid(list.get(i).getString("id"));
				vv = (VoiceVideo) list.get(i);
			}
		}
		else{
			List<VoiceVideo> list1 = null;
			for (int i = 0; i < list.size(); i++) {
				// vv.setid(list.get(i).getString("id"));
				list1.add((VoiceVideo) list.get(i));
			}
		}
		String str = vv.getId();
	}
}
