import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class testPrimeFactors {

	private CalculadorPrimeFactors calculadorPrimeFactors;
	private ArrayList<Integer> primesOf510510;

	@Before
	public void setUp() {
		calculadorPrimeFactors = new CalculadorPrimeFactors();
		primesOf510510 = calculadorPrimeFactors.calculatePrimeFactors(510510);
		
	}
	
	@Test
	public void test_prime_factors_of_one_returns_an_empty_list() {
		assertEquals(0, calculadorPrimeFactors.calculatePrimeFactors(1).size());
	}
	
	@Test
	public void test_prime_factors_of_numbers_higher_than_one_return_a_list_of_its_prime_numbers() {
		assertEquals(7, calculadorPrimeFactors.calculatePrimeFactors(510510).size());
	}
	
	@Test
	public void test_primes_are_listed_in_ascending_order() {
		assertEquals(primesOf510510, primesOf510510.stream().sorted().collect(Collectors.toList()));
	}

}
