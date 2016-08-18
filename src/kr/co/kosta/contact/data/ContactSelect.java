package kr.co.kosta.contact.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactSelect {
	public void select() {
		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kosta10", "root", "1234");
			System.out.println("connection ok...");

			String sql = "select name, email, age, addr from contacts";

			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			System.out.print("[" + "name" + "\t" + "email" + "\t" + "age" + "\t" + "address" + "]" + "\n");

			while (rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				int age = rs.getInt("age");
				String address = rs.getString("addr");

				System.out.println("[" + name + " " + email + " " + age + " " + address + "]");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("connection fail...");
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
			}
			System.out.println("connection closed...");
		}
	}
}
