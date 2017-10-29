package com.in28minutes.data.api;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.in28minutes.business.ToDoBusinessImpl;
import com.in28minutes.mockito.ToDoService;

public class TodoBusinessImplStubTest {

	@Test
	public void test() {
		ToDoService todoServiceStub = new TodoServiceStub();
		ToDoBusinessImpl todoBusinessImpl = new ToDoBusinessImpl(todoServiceStub);
		List<String> filteredToDos = todoBusinessImpl.retrieveTodosRelatedToSpring("dummy");
		assertEquals(2, filteredToDos.size());
	}

}
