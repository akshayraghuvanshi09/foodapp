package com.foodapp.iteam;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import com.foodapp.iteam.controller.ItemServiceController;

@WebMvcTest(ItemServiceController.class)
public class ItemControllerTest {
	
//	@MockBean
//	ItemService itemService;
//	
//	@Autowired
//	private MockMvc mockMvc;
	
	
//
//	@Autowired
//	private WebApplicationContext context;
//
//	
//	private MockMvc mockMvc;
//	
//	ObjectWriter objectWriter= new ObjectMapper().writer();
//	
//	@Mock
//	private ItemService itemService;
//	
//	@Autowired
//	ModelMapper mapper;
//
//	@InjectMocks
//	private ItemServiceController itemServiceController;
//	
//	Item item_1 = new Item(1,"Dosha",1,70.0,"Sounth Food");
//	Item item_2 = new Item(2,"Pizza",1,170.0,"Fast Food");
//	Item item_3 = new Item(3,"Burger",1,65.0,"Fast Food");
//	Item item_4 = new Item(4,"Teco",1,100.0,"Fast Food");
//	
//	
//	@BeforeEach
//	public void setUp() {
//		MockitoAnnotations.initMocks(this);
//		this.mockMvc = MockMvcBuilders.standaloneSetup(ItemServiceController.class).build();
//	}
//	
//	@Test
//	@Disabled
//	public void getAllItem_success()throws Exception {
//		List<Item> items = new ArrayList<Item>();
//		items.add(item_1);
//		items.add(item_2);
//		items.add(item_3);
//		items.add(item_4);
//		
//		when(itemService.viewAllItems()).thenReturn(items);
//		
//		mockMvc.perform(MockMvcRequestBuilders
//				.get("/item/viewall")
//				.contentType(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect( MockMvcResultMatchers.jsonPath("$", hasItem(3)))
//				.andExpect(jsonPath("$[2].iteamName", is("Pizza")));
//		
//	}
//	
//	@Test
//	public void saveIteam() {
//		ItemRequestDto dto =new ItemRequestDto("Dosha",1,70.0,"Sounth Food");
//		ItemResponseDto responseDto = mapper.map(dto, ItemResponseDto.class);
//		when(itemService.addItem(dto)).thenReturn(responseDto);
//		try {
//			mockMvc.perform(post("/item/add")
//					.contentType(MediaType.APPLICATION_JSON)
//					.content(new ObjectMapper().writeValueAsString(dto)))
//					.andExpect(status().isOk());
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
	
}
