package com.test.sleuth.consumer.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.sleuth.consumer.controller.impl.TestControllerImpl;
import com.test.sleuth.consumer.model.TestItem;
import com.test.sleuth.consumer.service.TestService;




@ExtendWith(SpringExtension.class)
@WebMvcTest(TestControllerImpl.class)
public class TestControllerTest {
	

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private TestService testService;
	
	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testFeign() throws Exception{

		List<TestItem> items = getItems();
		
		when(testService.testFeign()).thenReturn(items);

		MvcResult result = mockMvc.perform(get("/sleuth/feign"))
				.andExpect(status().isOk())
				.andReturn();

		ObjectMapper mapper = new ObjectMapper();
		List<TestItem> p = mapper.readValue(result.getResponse().getContentAsString(), new TypeReference<List<TestItem>>(){});
		assertEquals(items.size(), p.size());

	}
	
	
	private List<TestItem> getItems () {
		List<TestItem> list = new ArrayList<>();
		
		TestItem testItem1 = new TestItem();
		testItem1.setId("1");
		testItem1.setName("name1");
		testItem1.setCreatedDate(Calendar.getInstance().getTime());       
        
		TestItem testItem2 = new TestItem();
		testItem2.setId("2");
		testItem2.setName("name2");
		testItem2.setCreatedDate(Calendar.getInstance().getTime());        
        
        list.add(testItem1);
        list.add(testItem2);
        
        return list;
	}
}
