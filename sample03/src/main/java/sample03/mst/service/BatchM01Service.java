package sample03.mst.service;

public class BatchM01Service {
	public String exec() {
		String msg1 = "develop B のバッチ処理";
		String msg2 = "2回目のバッチ処理開始";
		System.out.println(msg1);
		System.out.println(msg2);
		return "OK";
	}

}
