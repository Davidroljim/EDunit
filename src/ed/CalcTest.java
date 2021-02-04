package ed;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class CalcTest {

	@BeforeClass
	public static void beforecls () {
		System.out.println("Before class solo se ejecuta una vez");
	}
	@Before
	public void before () {
		int result;
	}
	@Test
	public void testSuma() {
		int result = (int) Calculadora.oaBasicas1(4, 2);
		assertEquals(6, result);
		
	}
	@After
	public void after () {
		int result=0;
	}
	
	@Test (timeout = 10)
	public void testTime () {
		Calculadora.oaBasicas3(3, 2);
	}
	
	@Test
	public void testDiv() {
		int result =  Calculadora.oaBasicas4(4, 2);
		assertEquals(2, result);
		
	}
	@Test (expected = ArithmeticException.class)
	public void testDivCero () {
		Calculadora.oaBasicas4(5, 0);
	}
	
	@AfterClass
	public static void aftercls () {
		System.out.println("Ejecutamos After para cerrar el scanner");
		Calculadora.scanner.close();
	}

}
