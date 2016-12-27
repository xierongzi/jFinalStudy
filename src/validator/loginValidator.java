package validator;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

import model.User;

public class loginValidator extends Validator{

	@Override
	protected void validate(Controller c) {
		// TODO Auto-generated method stub
		System.out.println("0");
		validateRequiredString("user.userName","loginErr1","请输入用户名");
	    System.out.println("2");
		validateRequiredString("user.userPassword","loginErr2","请输入密码");
	}

	@Override
	protected void handleError(Controller c) {
		// TODO Auto-generated method stub
		c.keepModel(User.class);
		String actionKey=getActionKey();
		if(actionKey.equals("/user/userReg")){
			System.out.println("1");
			c.render("/jsp/userReg.jsp");
		}
		
	}
	

}
