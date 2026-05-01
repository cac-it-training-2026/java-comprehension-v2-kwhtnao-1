package q02_advanced.question02;

import java.util.ArrayList;
import java.util.List;

public class Member {

	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;

	// クーポン情報（複数保持）
	private List<Coupon> coupons;

	/**
	 * デフォルトコンストラクタ
	 * → テスト用・初期状態生成
	 */
	public Member() {
	}

	/**
	 * 会員情報を初期化するコンストラクタ
	 */
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;

		this.coupons = new ArrayList<>();
	}

	/**
	 * ファクトリメソッド
	 * → Member + Couponをまとめて生成する
	 */
	public static Member getInstance(int id, String password, String name, int age, int rank) {

		// 会員生成
		Member m = new Member(id, password, name, age, rank);

		// クーポンリスト生成
		List<Coupon> list = new ArrayList<>();

		// クーポン1件目生成（ファクトリメソッド使用）
		Coupon c1 = Coupon.getInstance(1, 0.5, "最初の特典");

		// クーポン2件目生成
		Coupon c2 = Coupon.getInstance(2, 0.25, "今月の特典");

		// リストに追加
		list.add(c1);
		list.add(c2);

		// 会員にクーポンを設定
		m.setCoupons(list);

		return m;
	}

	// getter / setter
	public int getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getRank() {
		return rank;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * 会員情報を文字列化
	 */
	@Override
	public String toString() {
		return "Member [id=" + id +
				", password=" + password +
				", name=" + name +
				", age=" + age +
				", rank=" + rank +
				", coupons=" + coupons + "]";
	}

	/**
	 * 会員情報表示メソッド
	 */
	public void showMember() {
		System.out.println(toString());
		System.out.println("******************");
	}

}
