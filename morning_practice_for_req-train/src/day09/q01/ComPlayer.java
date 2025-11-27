package day09.q01;

import java.io.IOException;

public class ComPlayer implements Playable{
	@Override
	public int doJanken() throws IOException {
		int num = (int)(Math.random() * 2);
		String choise = "";
		switch(num) {
		case 0:choise = "グー"; break;
		case 1:choise = "チョキ"; break;
		case 2:choise = "パー"; break;
		}
		System.out.println("コンピュータは" + choise + "を選んだ。");
		
		return num;
	}
}
