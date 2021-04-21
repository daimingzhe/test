package mp;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class UserImp implements IUser {
private SqlSession session;
	public List<User> findUsers(Map<String, Object> maps) {
		// TODO Auto-generated method stub
		session=MybatisUtil.getSqlsession();
		List<User> list=session.selectList("test.findUsers", maps);
		return list;
	}
public Map<String ,Object> finAll(){ 
	session
	userMap=session.selectMap("test.findAll", null);
return userMap;}
}
