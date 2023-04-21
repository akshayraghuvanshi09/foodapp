package com.foodapp.iteam;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
class IteamServiceControllerTest {
	
//	@Autowired
//	private MockMvc mockMvc;
	
//	@Test
//	void testGetAllItem() throws Exception {
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
//	
}
