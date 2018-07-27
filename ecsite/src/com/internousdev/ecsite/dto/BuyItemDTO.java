package com.internousdev.ecsite.dto;

import java.util.Date;

public class BuyItemDTO {
	private int id;
	private String itemName;
	private String itemPrice;
	private Date insertDate;
	private Date updateDate;

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	public String getItemPrice(){
		return itemPrice;
	}
	public void setItemPrice(String itemPrice){
		this.itemPrice = itemPrice;
	}
	public Date getInsertDate(){
		return insertDate;
	}
	public void setInsertDate(Date insertDate){
		this.insertDate = insertDate;
	}
	public Date getUpdateDate(){
		return updateDate;
	}
	public void setUpdateDate(Date updateDate){
		this.updateDate = updateDate;
	}

}
