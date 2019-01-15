package com.haut.Factory;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import com.haut.dao.UserDao;
import com.haut.entity.LoginUser;


public class MybatiesTest {
	
	//创建SqlSessionFactory工厂类,为查询数据库开启一次会话
	public static SqlSessionFactory sqlSession() throws IOException{
		Reader resourceAsReader =Resources.getResourceAsReader("mybaties-config.xml");
		SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(resourceAsReader);
		return sqlSessionFactory;
	}
	
	//接口式编程  查看
	public LoginUser selUsers() throws IOException{
			SqlSessionFactory sqlSession = sqlSession();
			//获取SqlSession实例
			SqlSession openSession = sqlSession.openSession();
			//使用getMapper(接口名.class) 创建一个代理对象
			UserDao mapper = openSession.getMapper(UserDao.class);
			//代理对象.mapper sql映射文件XXXMapper.xml文件的id
			LoginUser selUser = mapper.selUser(111,"111");
			openSession.close();
			return selUser;
	}
	
	//增加
	public boolean addUser(LoginUser u) throws IOException{
		
		SqlSessionFactory sqlSession = sqlSession();
		SqlSession openSession = sqlSession.openSession(true); //自动提交 无参的需要手动调用commit()方法
		UserDao mapper = openSession.getMapper(UserDao.class);
		boolean addUser = mapper.addUser(u);
		openSession.close();
		return addUser;
		
	}
	
	public static void main(String[] args) {
		try {
			//查
			 /*
			  * LoginUser rs= new MybatiesTest().selUsers();
			 System.out.println(rs.toString());*/
			
			//增加
			
			/*LoginUser loginUser = new LoginUser();
			loginUser.setUpass("233");
			System.out.println(new MybatiesTest().addUser(loginUser));*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
