package com.oes.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.oes.entity.OnlineOrder;
import com.oes.entity.User;
import com.oes.repository.OnlineOrderRepository;
import com.oes.repository.UserRepository;

class UserServiceImpTest {
	@Mock
	UserRepository  userRepository;
	
	@InjectMocks
	UserServiceImp userService;
	
	@Test
	void testGetAllUsers() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllUsersString() {
		fail("Not yet implemented");
	}

	@Test
	void testGetUserByUserName() {
		fail("Not yet implemented");
	}

	@Test
	void testGetUsersConnections() {
		fail("Not yet implemented");
	}

	@Test
	void testGetUserByUserNameAndRole() {
		fail("Not yet implemented");
	}

	@Test
	void testGetUsersByRole() {
		fail("Not yet implemented");
	}

	@Test
	void testGetUsersBetweenIds() {
		fail("Not yet implemented");
	}

	@Test
	void testGetUserById() {
		fail("Not yet implemented");
	}
	@Test
	@DisplayName("Test - to verify the insert operation")
	//@Disabled
	void testInsertUser() throws Exception {
		// given
				User sampleInput = new User("sachi", "sa@123", "admin");
				User expectedOutput = new User("sachi", "sa@123", "admin");
						//Object obj = new Object();
				
				BDDMockito.given(userService.insertUser(sampleInput)).willReturn(expectedOutput);	
						// when 
				User actualOutput = userService.insertUser(sampleInput);
						
						// verify 
						assertEquals(expectedOutput, actualOutput);
	}

	@Test
	void testAddReview() {
		fail("Not yet implemented");
	}

	@Test
	void testLinkProfile() {
		fail("Not yet implemented");
	}

	@Test
	void testAddProduct() {
		fail("Not yet implemented");
	}

	@Test
	void testAddOrder() {
		fail("Not yet implemented");
	}

	@Test
	void testAddDeliveryAgent() {
		fail("Not yet implemented");
	}

	@Test
	void testAddDeliveryAgents() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateUser() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteUserById() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdateUserById() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllOrders() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllReviews() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllProducts() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteProductById() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteOnlineOrderById() {
		fail("Not yet implemented");
	}

	@Test
	void testGetUserProfile() {
		fail("Not yet implemented");
	}

}
