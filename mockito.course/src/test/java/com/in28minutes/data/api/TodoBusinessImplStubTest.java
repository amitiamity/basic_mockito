package com.in28minutes.data.api;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.in28minutes.business.ToDoBusinessImpl;
import com.in28minutes.mockito.ToDoService;

public class TodoBusinessImplStubTest {

	@Test
	public void test() {
		int count = 0;
		ToDoService todoServiceStub = new TodoServiceStub();
		ToDoBusinessImpl todoBusinessImpl = new ToDoBusinessImpl(todoServiceStub);
		List<String> filteredToDos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
		//check the spring topics.
		for(String springTopics : filteredToDos){
			if(springTopics.contains("Spring")){
				count++;
			}
		}
		assertEquals(2, count);
	}

}
