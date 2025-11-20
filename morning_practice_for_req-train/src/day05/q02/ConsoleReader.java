package day05.q02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	public int inputid () throws IOException {
		System.out.println("4ケタのログインIDを入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num1 = Integer.parseInt(str);
		int num2 = (int)num1;
		
		return num2;
		
	}
}
