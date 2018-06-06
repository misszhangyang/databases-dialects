package main.ssh.entity;

/*
 * 说唱视屏
 */
public class SingtalkVideo {
	private Integer id;
	private byte[] Song;// 歌曲
	private byte[] flowerdrum;// 花鼓
	private byte[] chorus;// 相声
	private byte[] sketch;// 小品

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public byte[] getSong() {
		return Song;
	}

	public void setSong(byte[] song) {
		Song = song;
	}

	public byte[] getFlowerdrum() {
		return flowerdrum;
	}

	public void setFlowerdrum(byte[] flowerdrum) {
		this.flowerdrum = flowerdrum;
	}

	public byte[] getChorus() {
		return chorus;
	}

	public void setChorus(byte[] chorus) {
		this.chorus = chorus;
	}

	public byte[] getSketch() {
		return sketch;
	}

	public void setSketch(byte[] essay) {
		this.sketch = essay;
	}

}
