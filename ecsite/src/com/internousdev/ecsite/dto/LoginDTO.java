package com.internousdev.ecsite.dto;
import java.util.Date;
import java.util.Map;
public class LoginDTO {
	private String loginId;
	private String userName;
	private String loginPassword;
	private Date insertDate;
	private Date updateDate;
	private boolean loginFlg=false;
	private Map<String,Object> session;
	public String getLoginId(){
		return loginId;
	}
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
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
	public boolean getLoginFlg(){
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg){
		this.loginFlg = loginFlg;
	}
	public Map<String,Object> getSession(){
		return session;
	}
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
