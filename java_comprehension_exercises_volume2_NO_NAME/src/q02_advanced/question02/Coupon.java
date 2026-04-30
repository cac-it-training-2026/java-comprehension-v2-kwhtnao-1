package q02_advanced.question02;

public class Coupon {

	private int id;
	private double discountRate;
	private String description;

	//デフォルトコンストラクタ

	public Coupon() {
	}

	//通常コンストラクタ
	//クーポン情報を初期化

	public Coupon(int id, double discountRate, String description) {
		this.id = id;
		this.discountRate = discountRate;
		this.description = description;
	}

	/**
	 * ファクトメソッド
	 * クーポン生成
	 */

	public static Coupon getInstance(int id, double discountRate, String description) {
		return new Coupon(id, discountRate, description);
	}

	//getter,setter
	public int getId() {
		return id;

	}

	public double getDiscountRate() {
		return discountRate;
	}

	public String getDiscription() {
		return description;
	}

	/**
	 * クーポン情報の文字列表現
	 */

	@Override
	public String toString() {
		return "Coupon{ id = " + discountRate + ",description = " + description + "]";

	}
}
