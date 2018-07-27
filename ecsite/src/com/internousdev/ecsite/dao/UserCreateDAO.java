package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class UserCreateDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private DateUtil dateUtil= new DateUtil();
	private String sql = "insert into login_user_transaction (login_id,login_pass,user_name,insert_date)values(?,?,?,?)";
	public int UserCreate(String loginUserId,String loginPassword,String userName){
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginPassword);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, dateUtil.getDate());

			int ret=preparedStatement.executeUpdate();
			return ret;
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return 0;
	}

}
