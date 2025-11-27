package day09.q02;

public class Piano extends Instrument{

	private double weight;

	public Piano(String maker) {
		super(maker);
		weight = 80.5;
	}

	@Override
	public String toString() {
		return "Piano [weight=" + weight + ", maker=" + this.getMaker() + "]";
	}

	@Override
	public void playMusic() {
		System.out.println(this.getMaker() + "のピアノを弾きます。");

	}

}
