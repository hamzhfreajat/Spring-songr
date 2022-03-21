package com.example.songr;

import com.example.songr.domain.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void testContructor(){
		Album album = new Album("Music" ,"hamzh" , 15 , 30 , "/hamzh.com");

	}

}
