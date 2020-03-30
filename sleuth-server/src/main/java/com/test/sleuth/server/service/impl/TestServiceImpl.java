package com.test.sleuth.server.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.stereotype.Service;

import com.test.sleuth.server.model.TestItem;
import com.test.sleuth.server.service.TestService;

@Service
public class TestServiceImpl implements TestService{

	@Override
	public List<TestItem> findAll() {
		//TODO: create a repository
		
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
