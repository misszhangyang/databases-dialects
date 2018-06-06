package main.ssh.entity;

/*
 * 地区特点
 */
public class RegionPoint {

	private Integer id;
	private String voicepoint;// 语音特点
	private String grammar; // 语法特点
	private String phonology; // 音韵特点
	private String place; //特点

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String setplace(String place) {
		this.place = place;
		return place;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer regionPointId) {
		this.id = regionPointId;
	}

	public Integer setid(Integer id) {
		this.id = id;
		return id;
	}

	public String getVoicepoint() {
		return voicepoint;
	}

	public void setVoicepoint(String voicepoint) {
		voicepoint = voicepoint;
	}

	public String setvoicevideo(String voicevideo) {
		this.voicepoint = voicevideo;
		return voicepoint;
	}

	public String getGrammar() {
		return grammar;
	}

	public void setGrammar(String grammar) {
		grammar = grammar;
	}

	public String setgrammar(String grammar) {
		this.grammar = grammar;
		return grammar;
	}

	public String getPhonology() {
		return phonology;
	}

	public void setPhonology(String phonology) {
		phonology = phonology;
	}

	public String setphonology(String phonology) {
		this.phonology = phonology;
		return phonology;
	}
}
