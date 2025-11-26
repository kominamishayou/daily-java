package day08.q02;

public class Monster {
	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		return "Name:"+ this.name + "\n" + "HP:" + this.hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	private String name;
	private int hp;
	
	public Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
		
		System.out.println(name + "が現れた！！");
		System.out.println(this.toString());
	}
}
