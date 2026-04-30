package q02_advanced.question02;

import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		ConsoleReader reader = new ConsoleReader();

		// 会員リスト作成
		List<Member> members = new ArrayList<>();

		// 会員生成（Factoryメソッド）
		members.add(Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2));
		members.add(Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1));

		// 現在の会員表示
		MemberManager.showAllMembers(members);

		System.out.println("===パスワードを変更します===");

		try {
			// 会員ID入力
			System.out.print("input target id>>");
			int id = reader.inputNumber();

			// 新パスワード入力
			System.out.print("input new password>>");
			String pass = reader.inputString();

			// パスワード更新
			MemberManager.updatePassword(members, id, pass);

		} catch (Exception e) {
			e.printStackTrace();
			return; // 異常時は処理終了
		}

		System.out.println("---SHOW DATA---");

		// 更新後の一覧表示
		MemberManager.showAllMembers(members);
	}

}
