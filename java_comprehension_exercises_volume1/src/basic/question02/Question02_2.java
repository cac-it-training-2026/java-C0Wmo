package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第5章 入出力
 */

public class Question02_2 {

	public static void main(String[] args) throws IOException {

		System.out.println("商品の名前と値段を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("商品名:");
		String itemName = reader.readLine();
		//ここで処理は起きてるけど、空白になってる。
		//		String itemPrice = reader.readLine();

		System.out.println("値段:");
		String itemPrice = reader.readLine();
		int itemPriceInt = Integer.parseInt(itemPrice);

		System.out.println("商品の名前は" + itemName + "です。");
		System.out.println("初品の値段は" + itemPriceInt + "円です。");

	}
}
