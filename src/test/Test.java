package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.UserMapper;
import entity.User;
import entity.UserExample;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserMapper userDao=(UserMapper) ac.getBean("userDao");
		
//		UserMapper userDao=(UserMapper) ac.getBean("userMapper");
		
		
//		User user=new User();
//		user.setUsername("ccc");
//		user.setPassword("333");
//		
//		userDao.insert(user);
		
		UserExample userExample=new UserExample();
		
		userExample.createCriteria()
				   .andUsernameEqualTo("abc")
				   .andPasswordEqualTo("123");
		
		List<User> users=userDao.selectByExample(userExample);
		
		for (User user : users) {
			System.out.println(user.getId()+" "+user.getUsername()+" "+user.getPassword());
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
