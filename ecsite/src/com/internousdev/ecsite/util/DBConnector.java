package com.internousdev.ecsite.util;

/**
 * @author ykand
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	/*
	 * データベース接続ドライバー名
	 */
	private static String driverName = "com.mysql.jdbc.Driver";
	/*
	 * データベース接続URL名
	 */
	private static String url="jdbc:mysql://localhost/ecsite";
	/*
	 * データベース接続ユーザー名
	 */
	private static String user="root";
	/*
	 * データベース接続パスワード
	 */
	private static String password="mysql";

	public Connection getConnection(){
		Connection con=null;
		try{
			Class.forName(driverName);
			con = (Connection) DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}
}
