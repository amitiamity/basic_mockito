package com.in28minutes.data.api;

import java.util.Arrays;
import java.util.List;

import com.in28minutes.mockito.ToDoService;
//provides dummy implementation of the ToDoService interface.
public class TodoServiceStub implements ToDoService{

	@Override
	public List<String> retrieveTodos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Spring MVC ","Learn Spring Boot" , "Learn Hibernate ORM");
	}

}
