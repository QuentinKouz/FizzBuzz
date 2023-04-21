package fizzbuzz;

public class FizzBuzz {
	private int[] nombresSpeciaux = { 3 , 5};
	private String[] valeursSpeciales = {"fizz","buzz"};


	public String fizzBuzz(int entree) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < nombresSpeciaux.length;i++ ) {
			if (entree % nombresSpeciaux[i] == 0)
				sb.append(valeursSpeciales[i]);
		}
		if (sb.length() == 0)
			sb.append(Integer.toString(entree)) ;
		return sb.toString();
	}
}
