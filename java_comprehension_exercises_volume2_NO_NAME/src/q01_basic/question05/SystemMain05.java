package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		System.out.println("---SHOW MEMBERS--- ");

		AbstMember[] members = new AbstMember[2];

		members[0] = new NonMember("Sato Kensuke");
		members[1] = new Member(1, "Password", "Miura Manabu", 28, 2);

		MemberManager.showAllMembers(members);

		System.out.println("---BUY ITEM---");

		for (AbstMember m : members) {
			m.buyItem();
		}

	}

}
