package kr.co.kosta.contact.view;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import kr.co.kosta.contact.data.ContactInsert;
import kr.co.kosta.contact.data.ContactSelect;

public class ContactView {
	public void run() throws IOException {
		String choice = "";
		ContactInsert contactInsert = new ContactInsert();
		ContactSelect contactSelect = new ContactSelect();

		do {
			printMainMenu();

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			choice = br.readLine();

			if (choice.startsWith("1")) {
				contactInsert.insert();
			} else if (choice.startsWith("2")) {
				contactSelect.select();
			} else if (choice.trim().toUpperCase().startsWith("Q")) {
				System.out.println("종료되었습니다..");
				break;
			} else {
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
			}
		} while (true);

	}

	private void printMainMenu() {
		System.out.println("=======================");
		System.out.println("1. 연락처 등록");
		System.out.println("2. 연락처 전체보기");
		System.out.println("Q. 종료");
		System.out.println("=======================");
		System.out.println("선택 >");
	}
}
