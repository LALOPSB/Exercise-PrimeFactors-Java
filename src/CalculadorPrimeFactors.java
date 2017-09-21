import java.util.ArrayList;

public class CalculadorPrimeFactors {

	public ArrayList<Integer> calculatePrimeFactors(Integer number) {
		int n = number;
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int i=2; i<=n; i++) {
			while (n % i == 0) {
				factors.add(i);
				n/=i;
			}
		}
		return factors;
	}

}
