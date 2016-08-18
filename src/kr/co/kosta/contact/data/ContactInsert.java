package kr.co.kosta.contact.data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.co.kosta.contact.model.Contact;

public class ContactInsert {
	public void insert() throws IOException {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "1234");

			String sql = "INSERT INTO contact (name, email, age, address) VALUES (?,?,?,?);";

			String[] read = InsertWrite();

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, read[0]);
			pstmt.setString(2, read[1]);
			pstmt.setInt(3, Integer.parseInt(read[2]));
			pstmt.setString(4, read[3]);
			pstmt.executeUpdate();

			System.out.println("insert ok...");

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("insert fail...");
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("insert close...");
		}

	}

	private String[] InsertWrite() throws IOException {
		Contact contact = new Contact();
		String insertWrite;

		System.out.println("이름, 이메일, 나이, 주소를 각각 입력해주세요. (구분자는 스페이스(' ')입니다.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		insertWrite = br.readLine();
		String[] spliitedData = insertWrite.split(" ", 4);
		// contact.setName(spliitedData[0]);
		// contact.setEmail(spliitedData[1]);
		// contact.setAge(Integer.parseInt(spliitedData[2]));
		// contact.setAddress(spliitedData[3]);

		// String name = contact.getName();
		// String email = contact.getEmail();
		// int age = contact.getAge();
		// String addr = contact.getAddress();

		return spliitedData;
	}
}
