package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

//	@Autowired
//	DemoOne demoOne;

	@Value("${Lloyd:LloydLions}")
	private String newName;

	@Test
	void contextLoads() {
//		demoOne.setName("Lloyd");
//		String name = demoOne.getName();
//		System.out.println(name);

		System.out.println(this.newName);
	}

}
