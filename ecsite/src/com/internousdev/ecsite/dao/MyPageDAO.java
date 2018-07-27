package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.MyPageDTO;
import com.internousdev.ecsite.util.DBConnector;

public class MyPageDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();


	public List<MyPageDTO> getMyPageUserInfo(String it_id,String um_id){
		List<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();
		String sql="SELECT "
				+ "ubit.id, iit.item_name, ubit.total_price, ubit.total_count, ubit.pay, ubit.insert_date "
				+ "FROM "
				+ "user_buy_item_transaction ubit "
				+ "LEFT JOIN "
				+ "item_info_transaction iit "
				+ "ON "
				+ "ubit.item_transaction_id = iit.id "
				+ "WHERE "
				+ "ubit.item_transaction_id = ? AND ubit.user_master_id = ? "
				+ "ORDER BY "
				+ "insert_date DESC";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, it_id);
			preparedStatement.setString(2, um_id);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()){
				MyPageDTO dto = new MyPageDTO();
//System.out.println(resultSet.getString("id"));
//System.out.println(resultSet.getString("item_name"));
//System.out.println(resultSet.getString("total_price"));
//System.out.println(resultSet.getString("total_count"));
//System.out.println(resultSet.getString("pay"));
//System.out.println(resultSet.getString("insert_date"));

				dto.setId(resultSet.getString("id"));
				dto.setItemName(resultSet.getString("item_name"));
				dto.setTotalPrice(resultSet.getString("total_price"));
				dto.setTotalCount(resultSet.getString("total_count"));
				dto.setPayment(resultSet.getString("pay"));
				dto.setInsertDate(resultSet.getString("insert_date"));
				myPageList.add(dto);
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return myPageList;
	}
	public int buyItemHistoryDelete(String it_id,String um_id){
		int ret = 0;
		String sql="DELETE FROM user_buy_item_transaction WHERE item_transaction_id = ? AND user_master_id = ?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, it_id);
			preparedStatement.setString(2, um_id);
			ret = preparedStatement.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return ret;
	}

}
