package com.infosys.customer;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public String createCustomer() {
		System.out.print("CUSTOMER CREATED\n");
		return "COCO LOCO";
	}

}
