package com.test.sleuth.server.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.sleuth.server.controller.TestController;
import com.test.sleuth.server.model.TestItem;
import com.test.sleuth.server.service.TestService;

import lombok.extern.slf4j.Slf4j;

@RestController	
@RequestMapping("/sleuth")
@Slf4j
public class TestControllerImpl implements TestController {
	
	@Autowired
	private TestService testService;
	
	
	@GetMapping("/")
    public ResponseEntity<List<TestItem>> findAll() {
		log.info("findAll starts");		
        return ResponseEntity.ok(testService.findAll());
    }
}
