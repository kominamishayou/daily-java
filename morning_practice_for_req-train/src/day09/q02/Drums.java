package day09.q02;

public class Drums extends Instrument{

//	private String maker;
	private String constitution;// ドラムの構成

	// Instrumentのコンストラクタを呼び出し
	public Drums(String maker) {
		super(maker);
		this.constitution = "バスドラム・スネアドラム・タムタム・シンバルのセットです";
	}

	@Override
	public void playMusic() {
		System.out.println(this.getMaker() + "のドラムを演奏します。");
	}

	@Override
	public String toString() {
		return "Drums [constitution=" + constitution + ", maker=" + this.getMaker() + "]";
	}

}
