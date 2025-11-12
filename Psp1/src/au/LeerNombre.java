package au;


public class LeerNombre {
	public static void main(String[] args) {
		if(args.length<1) {
			System.exit(-1);
		} else {
			System.out.println("Tu nombre es" + args[0] + "Si");
			System.exit(0);
		}
	}
}
