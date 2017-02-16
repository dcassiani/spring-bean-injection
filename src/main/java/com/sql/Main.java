package com.sql;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sql.database.DatabaseBean;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"beans.xml"});		
		DatabaseBean databaseBean = (DatabaseBean) context.getBean("databaseBean");
		System.out.println("path: " + databaseBean.getDatabasePath());
		System.out.println("port: " + databaseBean.getPort());
		System.out.println("login: " + databaseBean.getLogin());
		System.out.println("password: " + databaseBean.getPassword().getStr());		
	}

}
