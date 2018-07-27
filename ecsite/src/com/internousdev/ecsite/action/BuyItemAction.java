package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class BuyItemAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private String count;

	private String pay;

	public String execute(){
		String payment;

		session.put("count",count);
		int intPrice = Integer.parseInt(session.get("buyItem_price").toString());
		int intCount = Integer.parseInt(session.get("count").toString());
		session.put("buyItem_cost", session.get("buyItem_price").toString());
		session.put("buyItem_price", intPrice*intCount);

		if(pay.equals("1")){
			payment="現金払い";
		}else{
			payment="カード支払い";
		}
		session.put("payment",payment);

		String ret=SUCCESS;
		return ret;
	}
	public String getCount(){
		return count;
	}
	public void setCount(String count){
		this.count = count;
	}
	public String getPay(){
		return pay;
	}
	public void setPay(String pay){
		this.pay = pay;
	}
	public Map<String,Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

}
