package com.test.spring.mvc;

import com.test.spring.mvc.manager.PersonManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@PropertySource("classpath*:config.properties")
public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");

        PersonManager personManager = (PersonManager) context.getBean("personManager");

        System.out.println("Init");

        personManager.listPerson().forEach(item->System.out.println(item.getName()));
    }
}
