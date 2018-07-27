package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;

	public String execute(){
		String ret="login";
		if(session.containsKey("id")){
			BuyItemDAO dao=new BuyItemDAO();
			BuyItemDTO dto=dao.getBuyItemInfo();
			session.put("id", dto.getId());
			session.put("buyItem_name", dto.getItemName());
			session.put("buyItem_price", dto.getItemPrice());
			ret=SUCCESS;
		}


		return ret;
	}

	public Map<String,Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
