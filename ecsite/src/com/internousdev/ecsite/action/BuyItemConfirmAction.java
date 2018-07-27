package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;

	public String execute(){
		String ret=SUCCESS;
		BuyItemDAO buyItemDAO = new BuyItemDAO();

		try {
			int i=buyItemDAO.setUserBuyItem(
					session.get("id").toString(),
					session.get("buyItem_price").toString(),
					session.get("count").toString(),
					session.get("login_user_id").toString(),
					session.get("payment").toString()
					);

			if(i!=0){
				ret = SUCCESS;
			}else{
				ret=ERROR;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ret;
	}

	public Map<String,Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
