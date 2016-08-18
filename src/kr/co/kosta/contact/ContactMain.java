package kr.co.kosta.contact;
import java.io.IOException;

import kr.co.kosta.contact.view.ContactView;

public class ContactMain {
	public static void main(String[] args) {
		ContactView view = new ContactView();
		try {
			view.run();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
