package day07.q02;

public class MemberManager {
	private MemberManager() {
		
	}
	
	public static void show(Member[] list) {
		System.out.println("メンバー一覧を表示します");
		for(Member i: list) {
			i.show();
		}
	}
	
	public static void update(Member[] list, int id, String name) {
		
		System.out.println("ID :" + id + "のメンバー名を" + name + "に更新します" );
		for(Member i: list) {
			if(i.getId() == id) {
				i.setName(name);
			}
		}
	}
}
