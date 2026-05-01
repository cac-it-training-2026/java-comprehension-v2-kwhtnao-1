package q02_advanced.question03;

public class SystemMain03 {

	public static void main(String[] args) {

		// LoginServiceクラスのインスタンスを生成
		// → コンストラクタにMemberStorageを渡して、会員情報を扱えるようにする
		LoginService loginService = new LoginService(new MemberStorage());

		// コンソール（標準出力）にメッセージを表示
		System.out.println("ログイン情報を入力してください");

		// ログイン状態を管理するフラグ（今回は未使用だが、状態管理用の変数）
		boolean isLogin = false;

		// ===== ここから追加 =====

		// コンソール入力を行うためのクラス（ConsoleReader）のインスタンス生成
		ConsoleReader console = new ConsoleReader();

		// ログインしたユーザ情報を保持する変数
		// 初期値はnull（まだログインしていない状態）
		Member loginUser = null;

		// ログイン成功するまで繰り返すループ（while文）
		// loginUserがnullの間はログイン失敗状態
		while (loginUser == null) {

			try {
				// 会員IDをコンソールから数値として入力する
				// inputNumberメソッド（数値入力用メソッド）を呼び出す
				int id = console.inputNumber();

				// パスワードをコンソールから文字列として入力する
				// inputStringメソッドを使い、入力メッセージも表示する
				String password = console.inputString("input password>>");

				// ログイン処理を実行（LoginServiceクラスのdoLoginメソッド）
				// IDとパスワードを渡して、認証を行う
				loginUser = loginService.doLogin(id, password);

				// ログイン結果の判定
				if (loginUser == null) {
					// nullの場合 → ログイン失敗
					System.out.println("ID またはパスワードが違っています。再度入力してください。");
				} else {
					// nullでない場合 → ログイン成功
					System.out.println("ログインに成功しました");
				}

			} catch (NumberFormatException e) {
				// 数値変換に失敗した場合の例外処理
				// 例：数字以外を入力したとき
				System.out.println("不正な入力です。再度入力してください");

			} catch (Exception e) {
				// その他の例外が発生した場合の処理
				// エラー内容をコンソールに出力（デバッグ用）
				e.printStackTrace();
			}
		}

		// ログイン成功後の処理
		System.out.println("ログインユーザ情報を表示します。");

		// ログインしたユーザ情報を表示する
		// MemberクラスのshowMemberメソッドを呼び出す
		loginUser.showMember();

	}

}