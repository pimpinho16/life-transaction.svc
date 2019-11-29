package com.life;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LifeTransactionSvcApplicationTests {
	static {
		com.loyalty.Initialize.initializeVariables();
    }

	@Test
	public void contextLoads() {
	}

}
