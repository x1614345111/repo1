package com.itheima;

import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new  ClassPathXmlApplicationContext("bean.xml");
        AccountDaoImpl accountDaoImpl = ac.getBean("AccountDaoImpl", AccountDaoImpl.class);
//        accountDaoImpl.save();
        System.out.println(accountDaoImpl);

        /*AccountServiceImpl accountServiceImpl = (AccountServiceImpl) ac.getBean("AccountServiceImpl");
        accountServiceImpl.saveService();
        System.out.println(accountServiceImpl);*/
    }
}
