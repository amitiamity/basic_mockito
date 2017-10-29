package com.in28minutes.mockito;

import java.util.List;
//implementation of todo service is not with us.
//all we have is interface.
public interface ToDoService {

	public List<String> retrieveTodos(String user);
} 
