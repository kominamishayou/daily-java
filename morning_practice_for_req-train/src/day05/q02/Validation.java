package day05.q02;

/**
 * バリデーションクラス
 */
public class Validation {
	/**
	 * 
	 * @param id
	 * @return boolean ログイン可否
	 */
	public boolean chekId(int id) {
		if (id == 1111 || id == 2222) {
			return true;
		} else {
			return false;
		}
	}
}
