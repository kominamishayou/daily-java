package day09.q02;

/**
 * 楽器クラス
 */

public abstract class Instrument {
	private String maker;
	
	protected Instrument(String maker) {
		this.maker = maker;
	}
	
	protected String getMaker() {
		return maker;
	}
	
	public abstract void playMusic();
}
