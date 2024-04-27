package com.example.Gitdemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class FactorialTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testFactorialOfPositiveNumber() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/factorial/5")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("120"));
    }

    @Test
    public void testFactorialOfZero() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/factorial/0")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string("1"));
    }

    @Test
    public void testFactorialOfNegativeNumber() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/factorial/-5")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
    }
}
