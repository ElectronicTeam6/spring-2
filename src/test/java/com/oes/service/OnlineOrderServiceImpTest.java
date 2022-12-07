package com.oes.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.oes.entity.OnlineOrder;
import com.oes.repository.OnlineOrderRepository;
@SpringBootTest
class OnlineOrderServiceImpTest {

	@Mock
	OnlineOrderRepository  onlineOrderRepository;
	
	@InjectMocks
	OnlineOrderServiceImp onlineOrderService;
	
	@Test
	@DisplayName("Test - to verify the insert operation")
	//@Disabled
	void testAddOrder() {
		// given
		OnlineOrder sampleInput = new OnlineOrder(600, "11-12-2022", "pending", "ram", "tv");
		OnlineOrder expectedOutput = new OnlineOrder(500, "11-12-2022", "pending", "ram", "tv");
				//Object obj = new Object();
		
		BDDMockito.given(onlineOrderService.addOrder(sampleInput)).willReturn(expectedOutput);	
				// when 
				OnlineOrder actualOutput = onlineOrderService.addOrder(sampleInput);
				
				// verify 
				assertEquals(expectedOutput, actualOutput);
			}

	
			@Test
			@Disabled
			void testGetAllPosts() {
				fail("Not yet implemented");
	
	}

	@Test
	//@DisplayName("Test to verify all order return")
	@Disabled
	void testGetAllOrderbyUser() throws Exception {
		
	OnlineOrder order1 = new OnlineOrder(500, "01-01-2022","delivered","ram","mobile");
	order1.setOnId(0);
	order1.setOrderDate(null);
	order1.setProductName(null);
	order1.setStatus(null);
	order1.setTotalOrderCost(0);
	order1.setUsername(null);
	
	OnlineOrder order2 = new OnlineOrder(500, "01-01-2022","delivered","ram","mobile");
	order1.setOnId(0);
	order1.setOrderDate(null);
	order1.setProductName(null);
	order1.setStatus(null);
	order1.setTotalOrderCost(0);
	order1.setUsername(null);
	
	List<OnlineOrder> sampleOutput = new ArrayList<>();
	sampleOutput.add(order1);
	sampleOutput.add(order2);
	
	BDDMockito.given(onlineOrderService.getAllOrderbyUser(null)).willReturn(sampleOutput);
	
	// ----------------------------------------------------------------------
	
	// when :- readyto test the funcationality (service)
	List<OnlineOrder> actualOutput = onlineOrderService.getAllOrderbyUser(null);
	
	
	// then : verify the sampleOutput with actual output
	// assertThat(actualOutput).isNotNull();  // or
	assertNotNull(actualOutput);
	assertThat(actualOutput.size()).isGreaterThan(0);
	assertIterableEquals(sampleOutput, actualOutput);
	
	
	}

	@Test
	@Disabled
	void testSortOnlineOrderbyOrderDate() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testDeleteOnlineOrderById() {
		fail("Not yet implemented");
	}

}
