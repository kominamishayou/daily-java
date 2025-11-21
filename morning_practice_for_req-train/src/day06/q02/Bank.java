package day06.q02;

public class Bank {
	public Depsitor getDepositor() {
		return depositor;
	}

	public void setDepositor(Depsitor depositor) {
		this.depositor = depositor;
	}

	private String bankCode = "000111";
	private String bankName = "シェアード銀行";
	private Depsitor depositor;
	
	public void showData() {
		System.out.println("bankCode:" +bankCode);
		System.out.println("bankName:" + bankName);
		
		depositor.showData();
	}
}
