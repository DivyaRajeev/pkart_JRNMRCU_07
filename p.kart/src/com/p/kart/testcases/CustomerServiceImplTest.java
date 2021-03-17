package com.p.kart.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.p.kart.model.Customer;
import com.p.kart.service.CustomerServiceImpl;

class CustomerServiceImplTest {
        private CustomerServiceImpl customerServiceImpl;
	@BeforeEach
	void setUp() throws Exception {
		customerServiceImpl=new CustomerServiceImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		customerServiceImpl=null;
	}

	@Test
	void testAddCustomer() {
      Customer customer = new Customer(1, "abc","abc@gmail.com","123654789", "Chandigarh" );
	  boolean result = customerServiceImpl.addCustomer(customer);
	  assertEquals(true, result);
		
	}

}
