package q02_advanced.question02;

import java.util.List;

public class MemberManager {

	// インスタンス化禁止
	private MemberManager() {
	}

	/**
	 * 全会員情報表示
	 */
	public static void showAllMembers(List<Member> members) {

		System.out.println("===会員情報を表示します===");

		for (Member m : members) {
			m.showMember();
		}
	}

	/**
	 * パスワード変更処理
	 */
	public static void updatePassword(List<Member> members, int targetId, String newPassword) {

		boolean found = false;

		// 対象ID検索
		for (Member m : members) {
			if (m.getId() == targetId) {
				m.setPassword(newPassword);
				found = true;
				break;
			}
		}

		// 該当なし
		if (!found) {
			System.out.println("該当者はいませんでした。");
		}

	}

}
