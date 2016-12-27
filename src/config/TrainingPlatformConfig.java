package config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;

import controller.UserController;
import index.IndexController;
import model._MappingKit;

//import model._MappingKit;

public class TrainingPlatformConfig extends JFinalConfig{

	@Override
	public void configConstant(Constants me) {
		// TODO Auto-generated method stub
		PropKit.use("a_little_config.txt");
		me.setDevMode(PropKit.getBoolean("devMode",false));
		me.setViewType(ViewType.JSP);
	}

	@Override
	public void configRoute(Routes me) {
		// TODO Auto-generated method stub
		me.add("/", IndexController.class,"/index");
		me.add("user", UserController.class);
	}
	public static C3p0Plugin createC3p0Plugin() {
		return new C3p0Plugin(PropKit.get("jdbcUrl"), PropKit.get("user"), PropKit.get("password").trim());
	}
	//插件
	@Override
	public void configPlugin(Plugins me) {
		// TODO Auto-generated method stub
		//配置C3P0数据库连接池插件
		C3p0Plugin C3p0Plugin = createC3p0Plugin();
		me.add(C3p0Plugin);
		// 配置ActiveRecord插件
		ActiveRecordPlugin arp = new ActiveRecordPlugin(C3p0Plugin);
		me.add(arp);
				
		// 所有配置在 MappingKit 中搞定
		_MappingKit.mapping(arp);
	}
    //全局拦截器
	@Override
	public void configInterceptor(Interceptors me) {
		// TODO Auto-generated method stub
		
	}
    //处理器
	@Override
	public void configHandler(Handlers me) {
		// TODO Auto-generated method stub
		
	}

	

}
