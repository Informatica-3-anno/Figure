import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {

	    Scanner in=new Scanner(System.in);
	    
		String figura;
		
		System.out.println("Scegli una figura tra quadrato, triangolo e cerchio");
		figura=in.nextLine();
		
		switch(figura) {
			case "cerchio": 
				int raggio;
				System.out.println("inserisci il raggio");
				raggio=in.nextInt();		
				for (int r=1;r<=2*raggio;r++) {
					if (r<=raggio) {
						for (int c=0;c<=2*raggio;c++) {
							if (c<(raggio-r) || c>=(raggio+r)) System.out.print(" ");
							else System.out.print("x");
						}
					} else {
						for (int c=0;c<=2*raggio;c++) {
							if (c<(r-raggio) || c>=(raggio+(2*raggio-r))) System.out.print(" ");
							else System.out.print("x");
						}
					}
					System.out.println();
				}
				break;
			case "quadrato":
				int lato;
				System.out.println("inserisci il lato"); 
				lato=in.nextInt();
				for (int r=1;r<=lato;r++) {
					for (int c=1;c<=lato;c++) {
						System.out.print("x ");
					}
					System.out.println();
				}
				break;
			case "triangolo":
				int base;
				System.out.println("inserisci la base (dispari)"); 
				base=in.nextInt();
				if (base%2!=0) base--;
				// else System.out.println("base pari, uso "+(base+1));
				for (int r=0;r<=(base/2);r++) {
					for (int c=0;c<=base;c++) {
						if (c<(base/2-r) || c>base-(base/2-r)) System.out.print(" ");
						else System.out.print("x");
					}
					System.out.println();
				}
				break;
			 default: 
				 System.out.println("Non conosco questa figura");
		}
	}   		   
}
