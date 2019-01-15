package com.haut.dao;
import org.apache.ibatis.annotations.Param;

import com.haut.entity.LoginUser;

public interface UserDao {
	LoginUser selUser(@Param("uid")int uid,@Param("upass")String upass);
	//注册用户
	boolean addUser(LoginUser u);
	//修改密码
	boolean updateUser(LoginUser u);
/*	int banUser(LoginUser u);
	int delUser(LoginUser u);*/
	
}
