package com.example.Gitdemo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitdemoApplicationTests {
	private PaymentAppContoller context;

	@Test
	void contextLoads() {
		assertThat(context).isNotNull();
	}

}
