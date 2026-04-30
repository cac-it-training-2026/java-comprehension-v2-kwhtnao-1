package q02_advanced.question03;

public class Coupon {

	private int id;
	private double discountRate;
	private String description;

	public Coupon() {

	}

	public Coupon(int id, double discountRate, String description) {
		this.id = id;
		this.discountRate = discountRate;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public String getDescription() {
		return description;
	}

	/**
	 * ファクトリメソッド
	 * → クーポン生成を統一する設計
	 */
	public static Coupon getInstance(int id, double discountRate, String description) {
		return new Coupon(id, discountRate, description);
	}

	/**
	 * 表示用文字列
	 * → デバッグ・ログ出力用
	 */
	@Override
	public String toString() {
		return "Coupon [id=" + id
				+ ", discountRate=" + discountRate
				+ ", description=" + description + "]";
	}

}
