package co.jiae.lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoGame {
	private int money;
	private int[] gameNum;

	public LottoGame(int money) {
		this.money = money;
	}

	private void createGame() {
		Random random = new Random();
		int n = gameCount(money); // 게임 수 구하기
		for (int i = 0; i < n; i++) {
			gameNum = new int[6];
			for (int j = 0; j < gameNum.length; j++) {
				gameNum[j] = random.nextInt(45) + 1;
				for (int k = 0; k < j; k++) {
					if (gameNum[j] == gameNum[k]) j--;
				}
			}
			Arrays.sort(gameNum);   //오름차순 정렬
			if (i % 5 == 0) {
				upTitle();
			}
			toPrint(gameNum);
		}
	}

	private void upTitle() {
		System.out.println("========================");

	}

	private int gameCount(int money) {
		return money / 1000;
	}

	private void toPrint(int[] game) {
		for (int num : game) {
			System.out.print(" " + num + " ");
		}
		System.out.println();
	}

	public void run() {
		createGame();
	}

}