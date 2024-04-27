package com.example.Gitdemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MyServiceTest {

    @Autowired
    private MyService myService;
    private PaymentAppContoller pcontoller;

    @Test
    public void testAdd() {
        int result = myService.add(2, 3);
        assertThat(result).isEqualTo(5);
    }
    @Test
    public void testMsg()
    {
    	String result1 = myService.msg();
    	assertThat(result1).contains("hello");
    	
    }
    public void testMsg1()
    {
    	
    	assertThat(myService).isNotNull();
    	
    }

    
    
    
    
    
}
