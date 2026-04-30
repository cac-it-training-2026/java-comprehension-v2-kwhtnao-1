package q02_advanced.question03;

import java.util.ArrayList;
import java.util.List;

public class Member {

	// 会員ID
	private int id;

	// パスワード
	private String password;

	// 名前
	private String name;

	// 年齢
	private int age;

	// 会員ランク
	private int rank;

	// クーポンリスト（複数保持）
	private List<Coupon> coupons;

	/**
	 * デフォルトコンストラクタ
	 * → テスト用・初期状態生成
	 */
	public Member() {
		// ★重要：null禁止 → 空リストで初期化
		this.coupons = new ArrayList<>();
	}

	/**
	 * 引数付きコンストラクタ
	 * → 会員情報をまとめて初期化
	 */
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;

		// ★重要：null防止（必ず空リスト）
		this.coupons = new ArrayList<>();
	}

	// ---------------- getter / setter ----------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		// 会員IDの更新
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		// ログインパスワード変更用
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// 会員名更新
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// 年齢更新
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		// 会員ランク更新
		this.rank = rank;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	/**
	 * ファクトリメソッド
	 * → Member + Couponをまとめて生成する設計
	 */
	public static Member getInstance(int id, String password, String name, int age, int rank) {

		// 会員生成
		Member m = new Member(id, password, name, age, rank);

		// クーポン生成（固定データ）
		Coupon c1 = Coupon.getInstance(1, 0.5, "最初の特典");
		Coupon c2 = Coupon.getInstance(2, 0.25, "今月の特典");

		// リストに追加
		m.coupons.add(c1);
		m.coupons.add(c2);

		// 完成した会員を返す
		return m;
	}

	/**
	 * 表示用
	 */
	@Override
	public String toString() {
		return "Member [id=" + id
				+ ", password=" + password
				+ ", name=" + name
				+ ", age=" + age
				+ ", rank=" + rank
				+ ", coupons=" + coupons + "]";
	}

	/**
	 * 会員情報表示
	 */
	public void showMember() {
		System.out.println(toString());
	}
}
