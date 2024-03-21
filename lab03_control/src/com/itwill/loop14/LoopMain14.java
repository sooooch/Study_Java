package com.itwill.loop14;

import java.util.Scanner;

public class LoopMain14 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 |3.잔고 |4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");

			int ch = scanner.nextInt();

			switch (ch) {

			case 1:
				System.out.print("예금액>>");
				int deposit = scanner.nextInt();
				balance += deposit;
				System.out.print("입금: %d , 잔고: %d\n");
				System.out.println();
				break;

			case 2:
				System.out.print("출금액>>");
				int withdrawAmount = scanner.nextInt();
				if (withdrawAmount > balance) { // if문을 넣어서 마이너스 불가능한 통장 만들기
					System.out.println("잔고가 부족합니다.");
				} else {
					balance -= withdrawAmount;
					System.out.println();
				}
				break;

			case 3:
				System.out.println("잔고>" + balance);
				System.out.println();
				break;

			case 4:
				System.out.println();
				run = false; // while 문을 종료하기 위한 조건 변경.
				System.out.println("감사합니다");
				break;

			default:
				System.out.println("잘못된 선택입니다. 1부터 4 사이의 숫자를 입력하세요.");
				System.out.println();
				break;

			}

		}
		System.out.println("프로그램 종료");

	}

}
