package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fizzbuzz.FizzBuzz;

class FizzBuzzTest {

FizzBuzz fb;
	
	@BeforeEach
	void setUp() throws Exception{
		fb = new FizzBuzz();
	}
	
	@Test
	void premier_test() {
		assertEquals("1",fb.fizzBuzz(1));
	}
	
	@Test
	void test_fb2() {
		assertEquals("2",fb.fizzBuzz(2));
	}
	
	@Test
	void test_fb3() {
		assertEquals("fizz",fb.fizzBuzz(3));
	}
	
	@Test
	void test_fb_nombres() {
		assertEquals("4",fb.fizzBuzz(4));
		assertEquals("13",fb.fizzBuzz(13));
		assertEquals("401",fb.fizzBuzz(401));
	}
	
	@Test
	void test_fb5() {
		assertEquals("buzz",fb.fizzBuzz(5));
	}
	
	@Test
	void test_fb6() {
		assertEquals("fizz",fb.fizzBuzz(6));
		assertEquals("buzz",fb.fizzBuzz(400));
		assertEquals("fizz",fb.fizzBuzz(13*3));
		assertEquals("buzz",fb.fizzBuzz(13*5));
	}
	
	@Test
	void test_fb15() {
		assertEquals("fizzbuzz",fb.fizzBuzz(15));
	}
	
	@Test
	void test_autre() {
		assertEquals("fizzbuzz",fb.fizzBuzz(3*5*1276));
		assertEquals("fizz",fb.fizzBuzz(3*999));
		assertEquals("fizzbuzz",fb.fizzBuzz(555555));
		assertEquals("buzz",fb.fizzBuzz(5555555));
		assertEquals("1001",fb.fizzBuzz(1001));


	}

}
