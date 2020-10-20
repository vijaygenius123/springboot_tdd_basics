package com.vijaygenius123.learning.tdd_basics.controllers;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = CarController.class)
public class CarControllerTest {


    @Autowired
    MockMvc mockMvc;

   @Test
   public void getCarDetailsTest() throws Exception{
       mockMvc.perform(MockMvcRequestBuilders.get("/cars/Scala"))
               .andExpect(status().isOk());
   }
}
