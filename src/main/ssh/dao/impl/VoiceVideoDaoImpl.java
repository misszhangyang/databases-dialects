package main.ssh.dao.impl;

import java.util.List;

import main.ssh.dao.OrmDao;
import main.ssh.dao.VoiceVideoDao;
import main.ssh.entity.VoiceVideo;

public class VoiceVideoDaoImpl implements VoiceVideoDao {

	@Override
	public VoiceVideo queryVoiceVideo(String place) {

		String sql = "select * from voicevideo where place = " + "'" + place + "'";
		OrmDao ormDao = new OrmDao();
		VoiceVideo vv = null;
		try {
			List<Object> list = ormDao.excuteSelectSQL(sql, null, VoiceVideo.class);
			if (list.size() == 1) {
				for (int i = 0; i < list.size(); i++) {
					// vv.setid(list.get(i).getString("id"));
					vv = (VoiceVideo) list.get(i);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vv;
	}

}
