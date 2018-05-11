package com.mkyong.customer.bo.impl;

import com.mkyong.customer.bo.CustomerBo;

public class CustomerBoImpl implements CustomerBo {
	public void addCustomer() {
		System.out.println("[INFO] >>>> addCustomer() is running ");
	}

	public String addCustomerReturnValue() {
		System.out.println("[INFO] >>>> addCustomerReturnValue() is running ");
		return "abc";
	}

	public void addCustomerThrowException() throws Exception {
		System.out.println("[INFO] >>>> addCustomerThrowException() is running ");
		throw new Exception("Generic Error");
	}

	public void addCustomerAround(String name) {
		System.out.println("[INFO] >>>> addCustomerAround() is running, args : " + name);
	}
}
