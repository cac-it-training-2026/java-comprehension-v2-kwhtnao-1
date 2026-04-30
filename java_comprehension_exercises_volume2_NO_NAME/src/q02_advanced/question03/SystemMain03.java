package q02_advanced.question03;

public class SystemMain03 {

	public static void main(String[] args) {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;

		// ===== ここから追加 =====

		ConsoleReader console = new ConsoleReader();
		Member loginUser = null;

		while (loginUser == null) {

			try {
				// 会員ID入力
				int id = console.inputNumber();

				// パスワード入力
				String password = console.inputString("input password>>");

				// ログイン処理
				loginUser = loginService.doLogin(id, password);

				if (loginUser == null) {
					System.out.println("ID またはパスワードが違っています。再度入力してください。");
				} else {
					System.out.println("ログインに成功しました");
				}

			} catch (NumberFormatException e) {
				System.out.println("不正な入力です。再度入力してください");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("ログインユーザ情報を表示します。");
		loginUser.showMember();

	}

}