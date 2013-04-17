public class ProjectEuler40 {
	public static void main(String[] args) {
		Integer i = new Integer(0);
		String st = i.toString();
		while(st.length() < 1000010) {
			i = new Integer(i.intValue()+1);
			st = st.concat(i.toString());
		}
		int product = 1;
		for(int j = 1; j <= 1000000; j *= 10) {
			product *= Integer.parseInt(st.substring(j, j+1));
			// product *= ((int)st.charAt(j)-48);
		}
		System.out.println(product);
	}

}