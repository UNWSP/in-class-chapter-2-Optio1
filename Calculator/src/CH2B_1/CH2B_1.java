package CH2B_1;

public class CH2B_1 {
	final static String constant = "variable";
	static String variable = "static";
	public String publicvar = "public";
	public static void main(String[] args) {
		String constant = "mutable?";
		System.out.println(constant);
		System.out.println(variable);
		String publicvar = "mutable?";
		System.out.println(publicvar);
		//Commented out because it causes runtime errors
		//public String innerpublic = "test";
		//System.out.println(innerpublic);
	}
}
