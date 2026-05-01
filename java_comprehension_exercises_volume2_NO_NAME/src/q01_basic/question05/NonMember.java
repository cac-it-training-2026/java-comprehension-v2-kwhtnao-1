package q01_basic.question05;

class NonMember extends AbstMember {

	public NonMember(String name) {
		this.name = name;
	}

	@Override

	public void buyItem() {
		System.out.println(name + " purchased the item at a fixed price");

	}

	@Override
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println(name + " is a non-member");
		System.out.println("*****************");
	}

}
