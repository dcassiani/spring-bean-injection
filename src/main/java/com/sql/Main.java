package com.sql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sql.database.DatabaseBean;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = 
            new ClassPathXmlApplicationContext(new String[] { "beans.xml" });
        DatabaseBean databaseBean = (DatabaseBean) context.getBean("databaseBean");
        
        String credentials = databaseBean.getLogin()
            .concat(":")
            .concat(databaseBean.getPassword().getStr())
            .concat("@")
            .concat(databaseBean.getDatabasePath())
            .concat(":")
            .concat(Integer.toString(databaseBean.getPort()));
        System.out.println(credentials);
    }

}
