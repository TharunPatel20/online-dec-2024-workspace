package com.demo.spring_boot_rest_jpa_demo_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.spring_boot_rest_jpa_demo_1.dao.ActorRepository;
import com.demo.spring_boot_rest_jpa_demo_1.dao.entity.ActorEntity;
import com.demo.spring_boot_rest_jpa_demo_1.service.ActorService;

@SpringBootTest
public class ActorServiceTest {

//	@Autowired 
//	ActorService actorService;
//	
//	@DisplayName("JUnit test for getAllActors without mockito")
//	@Test
//	public void testGetAllActors() {
//		int expectedOutput = 2;
//		int actualOutput = actorService.fetchAllActors().size();
//		assertEquals(expectedOutput, actualOutput);
//		
//	}
	
	
	@Mock
	private ActorRepository actorRepo;
	
	@InjectMocks
	private ActorService actorService;
	
	@DisplayName("JUnit test for getAllActors with mockito")
	@Test
	public void testGetAllActorsWithMockito() {
		List<ActorEntity> dummyActorList = Arrays
											.asList(
												new ActorEntity(1001, "aaa", "bbb"),
												new ActorEntity(1002, "ggg", "hhh"),
												new ActorEntity(1003, "sss", "fff"));
		// write the mockito rule
		when(actorRepo.findAll()).thenReturn(dummyActorList);
		
		int expectedOutput = 3;
		int actualOutput = actorService.fetchAllActors().size();
		assertEquals(expectedOutput, actualOutput);
	}
}
