package com.oes.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.oes.entity.DeliveryAgent;
import com.oes.entity.OnlineOrder;
import com.oes.repository.DeliveryAgentRepository;
import com.oes.repository.OnlineOrderRepository;

class DeliveryAgentServiceImpTest {
	@Mock
	DeliveryAgentRepository  deliveryAgentRepository;
	
	@InjectMocks
	DeliveryAgentServiceImp deliveryAgentService;
	
	@Test
	@DisplayName("Test - to verify the insert operation")
	//@Disabled
	void testAddDeliveryAgent() {
		// given
		DeliveryAgent sampleInput = new DeliveryAgent("pending", "400", "sachi");
		DeliveryAgent expectedOutput = new DeliveryAgent("pending", "400", "sachi");
						//Object obj = new Object();
				
				BDDMockito.given(deliveryAgentService.addDeliveryAgent(sampleInput)).willReturn(expectedOutput);	
						// when 
				DeliveryAgent actualOutput = deliveryAgentService.addDeliveryAgent(sampleInput);
						
						// verify 
						assertEquals(expectedOutput, actualOutput);
					}

			


	@Test
	@Disabled
	void testGetAllDeliveryAgentbyUser() {
		fail("Not yet implemented");
	}

}
