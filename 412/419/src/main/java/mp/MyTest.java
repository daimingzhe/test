package mp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import junit.*;
public class MyTest {
private IUser dao;
@Before
public void b(){
	dao=new UserImp();
}
@Test
public void t1(){
	Map<String,Object> maps=new HashMap<String, Object>();
	maps.put("id", 10);
	maps.put("username", "Ã÷");
	List<User> list=dao.findUsers(maps);
	System.out.println(list);
}
@Test
public void t2(){
	Map<String,Object> maps=new HashMap<String, Object>();
	users=dao.findAll();
	for (String key:users.keySet()){
		System.out.println(key+",value="+);
	}
}
}
