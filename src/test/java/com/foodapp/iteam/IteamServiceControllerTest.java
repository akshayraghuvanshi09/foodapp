package com.foodapp.iteam;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class IteamServiceControllerTest {
	
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@Test
//	public void testGetAllItem() throws Exception {
//		//1.creating the request
//		MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/item/viewall");
//		//2.Execute Request
//		MvcResult result = mockMvc.perform(mockHttpServletRequestBuilder).andReturn();
//		//3.Get the response or result
//		MockHttpServletResponse response = result.getResponse();
//
//		//4.Assert result
//		assertEquals(HttpStatus.OK.value(), response.getStatus());
//		assertNotNull(response.getContentAsString());
//	}
//	
	
}
