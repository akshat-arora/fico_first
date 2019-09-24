package com.Hello.HelloTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTestApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired 
	public HelloWorld helloworld;
	@Test
	public void test() {
		String str=helloworld.home();
		assertEquals(str,"Hello World!");
	}

}
