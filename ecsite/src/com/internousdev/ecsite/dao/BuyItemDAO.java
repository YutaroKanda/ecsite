package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class BuyItemDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private BuyItemDTO buyItemDTO = new BuyItemDTO();

	public BuyItemDTO getBuyItemInfo(){
		String sql = "select id,item_name,item_price from item_info_transaction";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				buyItemDTO.setId(resultSet.getInt("id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemPrice(resultSet.getString("item_price"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}

		return buyItemDTO;
	}

	public int setUserBuyItem(String itemTransactionId,String totalPrice,String totalCount,String userMasterId,String payment)
	throws SQLException{
		int ret=0;
		String sql="INSERT INTO user_buy_item_transaction(item_transaction_id,total_price,total_count,user_master_id,pay,insert_date)VALUES(?,?,?,?,?,?)";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,itemTransactionId);
			preparedStatement.setString(2,totalPrice);
			preparedStatement.setString(3, totalCount);
			preparedStatement.setString(4, userMasterId);
			preparedStatement.setString(5, payment);
			DateUtil dateUtil = new DateUtil();
			preparedStatement.setString(6, dateUtil.getDate());

			int i=preparedStatement.executeUpdate();

			if(i!=0){
				System.out.println(i +"件登録されました．");
				ret = i;
			}
		}catch(Exception e){
			e.printStackTrace();
		}

		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

		return ret;
	}

	public BuyItemDTO getBuyItemDTO(){
		return buyItemDTO;
	}
	public void setBuyItemDTO(BuyItemDTO buyItemDTO){
		this.buyItemDTO = buyItemDTO;
	}
}
