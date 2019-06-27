package com.jt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jt.entity.User;
import com.jt.pojo.Dog;
import com.jt.pojo.Shiro;

@RunWith(SpringRunner.class)
@SpringBootTest//springboot启动加载对象
public class SpringbootApplicationTests {

	@Autowired
	private User user;
	@Autowired
	private Dog dog;
	@Autowired
	private Shiro shiro;
	@Test
	public void testUser() {
		System.out.println(user);
	}
	@Test
	public void testDog() {
		System.out.println(dog);
	}
	@Test
	public void testShiro() {
		shiro.pri();
	}
	
	
	
	
	
	
	
	/*@Test
	public void contextLoads() {
		//要求:获取user对象从容器中获取
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("/xxx/xxx.xml");
		User user = context.getBean("user");
		user.setId(111);
		
	}*/
	
	
	
	
	

}
