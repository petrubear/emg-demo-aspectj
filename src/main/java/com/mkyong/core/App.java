/**
 * Sample from https://www.mkyong.com/spring3/spring-aop-aspectj-annotation-example/
 */

package com.mkyong.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.customer.bo.CustomerBo;

public class App {

	public static void main(String[] args) throws Exception {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

		CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
		customer.addCustomer();

		customer.addCustomerReturnValue();

		try {
			customer.addCustomerThrowException();
		} catch (Exception ex) {
			System.err.println("[ERROR] >>>> GOT addCustomerThrowException ");
		}

		customer.addCustomerAround("mkyong");

	}

}
