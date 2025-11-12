package Ejercicio1;

	public class DivisoresContar {
		public static void main(String[] args) {
			if(args.length<1) {
				System.exit(-1);
			}
			int aux = Integer.parseInt(args[0]);
			int c=0;
			for(int i= 1;i<aux;i++) {
				if(aux%i==0)
				c++;
			}
			System.out.println(c);
		}
	}