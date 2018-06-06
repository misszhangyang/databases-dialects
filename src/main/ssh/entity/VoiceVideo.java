package main.ssh.entity;

public class VoiceVideo {
	private String id;
	public String essay;// 短文
	public String clause;// 短句
	public String vocabulary;// 词汇
	public String phonology;// 声韵调
	public String place;//对应的地区

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	public String setplace(String place){
		this.place = place;
		return place;
	}

	public String setid(String id) {
		this.id = id;
		return id;
	}

	public String setessay(String essay) {
		this.essay = essay;
		return essay;
	}

	public String setclause(String clause) {
		this.clause = clause;
		return clause;
	}

	public String setvocabulary(String vocabulary) {
		this.vocabulary = vocabulary;
		return vocabulary;
	}

	public String setphonology(String phonology) {
		this.phonology = phonology;
		return phonology;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEssay() {
		return essay;
	}

	public void setEssay(String essay) {
		this.essay = essay;
	}

	public String getClause() {
		return clause;
	}

	public void setClause(String clause) {
		this.clause = clause;
	}

	public String getVocabulary() {
		return vocabulary;
	}

	public void setVocabulary(String vocabulary) {
		this.vocabulary = vocabulary;
	}

	public String getPhonology() {
		return phonology;
	}

	public void setPhonology(String phonology) {
		this.phonology = phonology;
	}

}
