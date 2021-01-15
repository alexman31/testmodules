package com.testmodules;

import com.testmodules.TestmodulesApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = TestmodulesApplication.class)
class TestmodulesApplicationIT {

	@Value("${name:}")
	public String name;

	@Test
	void contextLoads() {
		assertTrue("manu".equals(name));
	}
}
