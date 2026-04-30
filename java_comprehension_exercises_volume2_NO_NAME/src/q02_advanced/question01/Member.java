package q02_advanced.question01;

import java.util.ArrayList;
import java.util.List;

public class Member {

	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;
	private List<Coupon> coupons;

	public Member() {

	}

	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;

		this.coupons = new ArrayList<>();

		Coupon c1 = new Coupon(1, 0.5, "最初の特典");
		Coupon c2 = new Coupon(2, 0.25, "今月の特典");

		coupons.add(c1);
		coupons.add(c2);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	// toString
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name
				+ ", age=" + age + ", rank=" + rank + ", coupons=" + coupons + "]";
	}

	// 表示用メソッド
	public void showMember() {
		System.out.println(toString());
		System.out.println("******************");
	}

}
