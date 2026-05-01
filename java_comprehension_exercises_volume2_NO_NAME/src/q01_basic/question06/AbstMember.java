package q01_basic.question06;

/**
 * 会員、非会員の基盤クラス
 * Memberクラス、NonMemberクラスに継承する
 * 
 */
public abstract class AbstMember {

	/**
	 * name protected access
	 */
	protected String Name;

	/**
	 * 商品を購入する（メッセージ出力）
	 * 抽象メソッド
	 */
	public abstract void buyItem();

	{
		System.out.println("商品を購入しました。");
	}

	/**
	 * メンバー情報を表示する（メッセージ出力）
	 * 抽象メソッド
	 * 
	 */
	public abstract void showMember();

	{
		System.out.println("***MEMBER DATA***");
		System.out.println("name:" + Name);
		System.out.println("*****************");
	}

	/**
	 * @return name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.Name = name;
	}

}
