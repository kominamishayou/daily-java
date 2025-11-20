package day05.q01;

/**
 * キャッシュレジスタークラス
 */

public class CashRegister {
	/**
	 * calcPriceメソッド
	 * 税抜き価格から税込み価格を計算する
	 * 
	 * @param price 税抜き価格
	 * @return 税込み価格
	 */
	public int calcPrice(int price) {
		return (int) (price * 1.1);
	}
}
