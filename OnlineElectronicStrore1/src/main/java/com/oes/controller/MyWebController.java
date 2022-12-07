package com.oes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oes.dto.MyDTO;
import com.oes.dto.UserDefaultResponseDTO;
import com.oes.entity.DeliveryAgent;
import com.oes.entity.Product;
import com.oes.entity.User;
import com.oes.service.UserService;
import com.oes.util.UserDTOConvertor;


@RestController
@RequestMapping("/ElectronicStore")
public class MyWebController {

	@Autowired
	UserService userService;
	
	
	
	public MyWebController() {
		System.out.println("\n\n\n====>> Inside Constructor "+this);
	}

	//http://localhost:8888/ElectronicStore/user
	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody User user) 
	{
		
		try {
			User savedUser =  userService.insertUser(user);
			String responseMsg = savedUser.getUsername()+" save with Id "+savedUser.getId();
			return new ResponseEntity<String>(responseMsg,HttpStatus.OK);
		} catch (Exception e) {
			String errorMsg =  "Contact to customer care 1800-250-960 or mail us :- care@capg.com";
			return new ResponseEntity<String>(errorMsg,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

	
	
	
	
	@GetMapping("/users")
	public List<User> getAllUsers()
	{

		try {
			List<User>  allExtractedUsers = userService.getAllUsers();
			
			return allExtractedUsers;
			
		} catch (Exception e) {
		
			System.out.println(e);
			
		}
		
		return null;
	}
	
	

	
	@GetMapping("/user/id/{id}")
	public ResponseEntity<MyDTO> getUserByUserId(@PathVariable int id)throws Exception
	{
		
			User user = userService.getUserById(id);
			
			UserDefaultResponseDTO dtoResp = UserDTOConvertor.getUserDefaultDTO(user);
			
			return new ResponseEntity<MyDTO>(dtoResp, HttpStatus.OK);
		
	}
	
	
	
	@PutMapping("/user/allDeliveryAgent")
	public User updateDeliveryAgent(@RequestBody List<DeliveryAgent> allDeliveryAgents,@RequestParam String username)
	{
		
		System.out.println(" \n\n ======= Inside Web Controller add DeliveryAgents =====\n\n");
		System.out.println("1.  allDeliveryAgents :-  "+allDeliveryAgents);
		System.out.println(" username :-  "+username);
		
		User savedUser = null; 
		try {
			 savedUser = userService.getUserByUserName(username);
			if(savedUser != null)
			{
				User updatedUser = userService.addDeliveryAgents(allDeliveryAgents, savedUser);
				return updatedUser;
			}
			else
			{
				throw new Exception("User not found "+savedUser+" for "+username);
			}
			
		} catch (Exception e) {
			System.out.println(savedUser+" is not");
		}
		
		
		return null;
	}
	
	@PutMapping("user/updateUser")
	public User updateRoleById(@RequestBody User u) throws Exception{
		
		User updatedUser = userService.updateUser(u);
		return updatedUser;
		
	}
	
	//http://localhost:8888/ElectronicStore/user/delete/23
	@DeleteMapping("/user/delete/{id}")
	public List<User> deleteUserById(@PathVariable int id) throws Exception{
		

		boolean status = userService.deleteUserById(id);
		
		if(status == true) {
			List<User> users = userService.getAllUsers();
			return users;
		}
		else return null;
	}
	
	
	
}
