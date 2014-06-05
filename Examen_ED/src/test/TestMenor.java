package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import codigo.Menor;

public class TestMenor {
	
	Menor menor= new Menor();

	@Before
	public void setUp() throws Exception {
		menor.setA(6);
		menor.setB(20);
	}

	@Test
	public void test() {
		assertEquals(6,menor.menor());
	}

}
