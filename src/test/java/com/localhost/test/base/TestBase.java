package com.localhost.test.base;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.localhost.model.User;
import com.localhost.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestBase {

	// @Test
	// public void testSampleService() {
	// assertEquals("class
	// com.areyes1.jgc.junit.spring.service.SampleServiceImpl",
	// this.sampleService.getClass().toString());
	// }
	//
	// @Test
	// public void testSampleServiceGetAccountDescription() {
	// // Check if the return description has a Description: string.
	// assertTrue(sampleService.getOrderDescription().contains("Description:"));
	// }

}
