import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a,b,c;
		Scanner inp = new Scanner(System.in);
		System.out.println("a sayisini giriniz: ");
		a = inp.nextInt();
		
		System.out.println("b sayisini giriniz: ");
		b = inp.nextInt();
		
		System.out.println("c sayisini giriniz: ");
		c = inp.nextInt();
		
		if((a<b) && (a<c)) {
			if(b<c) {
				System.out.println("a<b<c");
			}
			else {
				System.out.println("a<c<b");
			}
		}
		else if((b<a) && (b<c)) {
			if(a<c) {
				System.out.println("b<a<c");
			}
			else {
				System.out.println("b<c<a");
			}
		}
		else if((c<a) && (c<b)) {
			if (a<c) {
				System.out.println("c<a<b");
			}
			else {
				System.out.println("c<b<c");
			}
		}

	}

}
