package com.test.sleuth.consumer.controller;

import java.util.List;

import com.test.sleuth.consumer.model.TestItem;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@Api(tags = {"Resource Public Test"})
@SwaggerDefinition(tags = {
    @Tag(name = "Resource Public Test", description = "Public: rest controller")
})
public interface TestController {
	
	@ApiOperation(value = "Public: Get all test items with feign")
	List<TestItem>  testFeign ();
	
}
