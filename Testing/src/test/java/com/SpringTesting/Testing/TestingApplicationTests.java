package com.SpringTesting.Testing;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.AbstractIntegerAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
@Slf4j
class TestingApplicationTests {

	@Test
	@DisplayName("TEST1")
	void contextLoads() {
		log.info("TEST1");
	}

	@BeforeAll
	static void test2(){
		log.info("Initiated started");
	}

	@BeforeEach
	void test(){
		log.info("Method started");
	}

	@Test
	void test3(){
		log.info("hello avipsha ");
	}

	@Test
	void test4(){
		log.info("hello rudhi");
	}

	@AfterEach
	void test5(){
		log.info("method stopping");
	}


	@AfterEach
    void test6(){
		log.info("method stopping final count down");
	}

	int add(int a,int b){
		return a+b;
	}

	@Test
	void test1330(){
		int a=10;
		int b=10;


		log.info(String.valueOf(Assertions.assertThat(add(a,b)).isEqualTo(20).toString()));
	}

}
