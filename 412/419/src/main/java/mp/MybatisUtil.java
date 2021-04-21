package mp;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
private static SqlSessionFactory factory;
public static SqlSession getSqlsession(){
	try {
		InputStream inputStream=Resources.getResourceAsStream("mybatis.xml");
		if(factory==null){
			factory=new SqlSessionFactoryBuilder().build(inputStream);
		}
		return factory.openSession();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
	return null;
}
}
