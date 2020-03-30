package com.test.sleuth.server.service;

import java.util.List;

import com.test.sleuth.server.model.TestItem;

public interface TestService {
	
	List<TestItem> findAll();

}
