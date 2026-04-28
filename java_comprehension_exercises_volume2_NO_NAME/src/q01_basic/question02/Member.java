package q01_basic.question02;

class Member {

	private String name;
	private int age;
	private int rank;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getRank() {
		return rank;
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

	public void rankUp() {
		rank++;
		System.out.println(">>>RANK UP>>>");
	}

	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("name: " + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");
	}
}
