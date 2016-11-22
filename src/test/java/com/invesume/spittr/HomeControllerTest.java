package com.invesume.spittr;

import static  org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static  org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static  org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

public class HomeControllerTest {
	
	@Test
	public void testHomepage() throws Exception{
		HomeController controller = new HomeController();
		MockMvc mockMvc = standaloneSetup(controller).build();
		
		mockMvc.perform(get("/home"))
			.andExpect(view().name("home")); //홈뷰를 보여줌

	}
}
