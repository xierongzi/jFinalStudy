package controller;

import java.util.List;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;

import model.User;
import validator.loginValidator;

public class UserController extends Controller{
	public void index() {
//		setAttr("blogPage", Blog.me.paginate(getParaToInt(0, 1), 10));
		render("/jsp/userLogin.jsp");
	}
    //注册
	@Before(loginValidator.class)
	public void userReg() {
		getModel(User.class).save();
		redirect("/user");
	}
	//登录
	@Before(loginValidator.class)
	public void userLogin(){
		 String userName=getPara("user.userName");  
	     String userPassword=getPara("user.userPassword");
	     String sql="select * from user where user.userName=? and user.userPassword=?";
	     
	     User u=User.dao.findFirst(sql, userName,userPassword);
	     System.out.println("测试+"+u.getUserName());
	     if(u.getUserName()!=null&&u.getUserName()!=""){
	    	 setSessionAttr("user1", u);
//	 		setAttr("user", User.dao.findById(getParaToInt()));//setAttr的值只能用getAttr来获取
	    	 render("/jsp/userPer.jsp");
	     }else{
	    	 redirect("/user");
	     }
	}
	//删除某个用户
	public void delete(){
		
		User.dao.deleteById(getParaToInt());
		redirect("/user/showAllUsers");
	}
	     
	

	//更新个人信息	
	@Before(loginValidator.class)
	public void update(){
		getModel(User.class).update();
		User u2=getModel(User.class);
//		String uIdStr=getPara("user.userId");
//		Integer uId=Integer.parseInt(uIdStr);
//		User u2=User.dao.findById(uId);
		setSessionAttr("user1", u2);
		render("/jsp/userPer.jsp");
	}
	
	//显示所有用户
	public void showAllUsers(){
		List<User>list1=User.dao.paginate(1, 10).getList();
		setSessionAttr("allUsersPage", list1);
		render("/index/allUsers.jsp");
	}
	
	
}
