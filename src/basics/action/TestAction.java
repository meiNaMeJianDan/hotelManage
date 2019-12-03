package basics.action;

import java.util.Map;

import basics.entity.Test;
import basics.service.TestService;
import core.base.BaseAction;
import core.web.Page;

public class TestAction extends BaseAction<Test,TestService>{
	
	public Map<String,String> test(Map<String,String> parMap){
		return parMap;
	}
	
	public Page toIndex(String user){
		
		return new Page("/WEB-INF/test/index.jsp");
	}
}