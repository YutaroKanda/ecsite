package com.internousdev.ecsite.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateDAO;
import com.opensymphony.xwork2.ActionSupport;
public class UserCreateCompleteAction extends ActionSupport implements SessionAware{
	private UserCreateDAO userCreateDAO = new UserCreateDAO();
	private String loginUserId;
	private String loginPassword;
	private String userName;
	public Map<String,Object> session;

	public String execute(){
		String ret=ERROR;

		int i = userCreateDAO.UserCreate(
				session.get("loginUserId").toString(),
				session.get("loginPassword").toString(),
				session.get("userName").toString()
				);

		if(!(i==0)){
			System.out.println(i+"件登録されました．");
			ret=SUCCESS;
		}
		return ret;
	}

	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public Map<String,Object> getSession(){
		return session;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
