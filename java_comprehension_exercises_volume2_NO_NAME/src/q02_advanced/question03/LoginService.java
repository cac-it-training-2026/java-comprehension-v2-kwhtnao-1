package q02_advanced.question03;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
public class LoginService {

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */
	private MemberStorage memberStorage;

	/**
	 * コンストラクタ
	 * → 外部から会員リストを受け取る
	 */
	public LoginService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage;
	}

	/**
	 * ログイン処理
	 * → ID + password が一致するユーザーを探す
	 */
	public Member doLogin(int id, String password) {

		for (Member m : memberStorage.getMembers()) {

			// IDとパスワード両方一致した場合
			if (m.getId() == id && m.getPassword().equals(password)) {
				return m;
			}
		}

		// 見つからない場合
		return null;
	}

}
