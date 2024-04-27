package com.example.Gitdemo;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public int add(int a, int b) {
        return a + b;
    }
    public String msg()
    {
    	return "hello";
    }
}
