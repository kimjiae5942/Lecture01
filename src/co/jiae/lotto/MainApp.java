package co.jiae.lotto;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하세요: ");
		int money = scanner.nextInt();
		LottoGame game = new LottoGame(money);
		game.run();
		scanner.close();
	}
}
