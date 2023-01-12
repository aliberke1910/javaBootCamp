package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		for (int i=0; i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println("Döngümüz bitti");
		
		System.out.println("**************************************************");
		
		int i=-10;
		while (i<=0) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While döngümüz bitti");
		
		int j=100;
		do {
			System.out.println("Loglandı");
			System.out.println(j);
			j+=2;
		} while (j<10);
		System.out.println("Do-While döngümüz bitti");
		
	}
}