package main.ssh.service.impl;

import main.ssh.dao.VoiceVideoDao;
import main.ssh.dao.impl.VoiceVideoDaoImpl;
import main.ssh.entity.VoiceVideo;
import main.ssh.service.VoiceVideoService;

public class VoiceVideoServiceImpl implements VoiceVideoService {

	//查询数据库中的语音视屏的位置
	@Override
	public VoiceVideo queryVoiceVideo(String place) {
      VoiceVideoDao voiceVideoDao = new VoiceVideoDaoImpl();
      VoiceVideo voicevideo = voiceVideoDao.queryVoiceVideo(place);
		return voicevideo;
	}

}
