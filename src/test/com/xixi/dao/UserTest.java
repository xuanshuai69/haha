package com.xixi.dao;

import com.xixi.domain.User;
import com.xixi.domain.User1;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void create(){
        ClassPathXmlApplicationContext ca = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*User user = (User) ca.getBean("user");
        System.out.println("user = " + user);
*/

        User user1 = (User) ca.getBean("user1");
        System.out.println("user1 = " + user1);

        User user2 = (User) ca.getBean("user2");
        System.out.println("user2 = " + user2);

        User user3 = (User) ca.getBean("user3");
        System.out.println("user3 = " + user3);

        User1 user4 = (User1) ca.getBean("user4");
        System.out.println("user4 = " + user4);

        User user5 = (User) ca.getBean("user5");
        System.out.println("user5 = " + user5);
        ca.close();



    }
}
