package com.test.sleuth.consumer.model;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description="Test description")
public class TestItem {
	
	@ApiModelProperty(value="Id test description")
	private String id;
	
	@ApiModelProperty(value="Name test description")
	private String name;
		
	@ApiModelProperty(value="CreatedDate test description")
	private Date createdDate;
}
