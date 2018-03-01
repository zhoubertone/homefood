/*package org.zsl.testmybatis;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.lcc.pojo.User;
import com.lcc.service.IUserService;


@RunWith(SpringJUnit4ClassRunner.class)
//file:src/main/resources/spring-mybatis.xml
@ContextConfiguration(locations={"classpath:/spring-mybatis.xml"})
//@ContextConfiguration(locations={"classpath*:/src/main/resources/spring-mybatis.xml"})//未测试的
public class TestMyBatis {
 
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	@Resource  
	private IUserService userService = null; 

	@Test
	public void Test() {
	
		   User user = userService.getUserById(1);  
		            System.out.println(user.getUsername());  
		            logger.info("值："+user.getUsername());  
		          logger.info(JSON.toJSONString(user));  
                  System.out.println("1111");
	}

}
*/