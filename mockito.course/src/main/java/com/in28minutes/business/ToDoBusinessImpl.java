package com.in28minutes.business;

import java.util.ArrayList;
import java.util.List;

import com.in28minutes.mockito.ToDoService;
//SUT - System under test. > ToDoBusinessImpl.java
//TodoService : Dependency(developed by some other team or could be external libraries)

public class ToDoBusinessImpl {
	
	private ToDoService todoService;
	
	public ToDoBusinessImpl(ToDoService todoService){
		
		this.todoService = todoService;
	}
	//test to be written for this specific method.
	public List<String> retrieveTodosRelatedToSpring(String user){
		
		List<String> filteredTodos = new ArrayList<String>();
		//retrieve todos and filter them.
		List<String> todos = todoService.retrieveTodos(user);
		for(String todo : todos){
		if(todo.contains("Spring")){
			
			filteredTodos.add(todo);
		}
	}
	return filteredTodos;
}

}
