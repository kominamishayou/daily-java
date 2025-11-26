package day08.q01;

import day08.q02.Monster;

public class Sorcerer extends Magic{

	public Sorcerer(String name) {
		super(name);
	}
	
	@Override
	public void attack(int mp,Monster monster) {
		super.attack(mp, monster);
		int addDamege = (int)(mp * 0.5);
		int afterMonsterHP = monster.getHp() - addDamege;
		System.out.println("追加で" + addDamege + "のダメージを与えた。");
		monster.setHp(afterMonsterHP);
	}
	
}
