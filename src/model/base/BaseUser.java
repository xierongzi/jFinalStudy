package model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public void setUserId(java.lang.Integer userId) {
		set("userId", userId);
	}

	public java.lang.Integer getUserId() {
		return get("userId");
	}

	public void setUserName(java.lang.String userName) {
		set("userName", userName);
	}

	public java.lang.String getUserName() {
		return get("userName");
	}

	public void setUserSex(java.lang.Integer userSex) {
		set("userSex", userSex);
	}

	public java.lang.Integer getUserSex() {
		return get("userSex");
	}

	public void setLevel(java.lang.String level) {
		set("level", level);
	}

	public java.lang.String getLevel() {
		return get("level");
	}

	public void setUserPassword(java.lang.String userPassword) {
		set("userPassword", userPassword);
	}

	public java.lang.String getUserPassword() {
		return get("userPassword");
	}

}