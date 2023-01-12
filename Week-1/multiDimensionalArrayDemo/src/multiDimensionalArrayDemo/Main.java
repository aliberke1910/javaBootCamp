package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		String[][] citys = new String[3][3];

		citys[0][0] = "İstanbul";
		citys[0][1] = "Bursa";
		citys[0][2] = "Bilecik";
		citys[1][0] = "Ankara";
		citys[1][1] = "Konya";
		citys[1][2] = "Kayseri";
		citys[2][0] = "Diyarbakır";
		citys[2][1] = "Şanlıurfa";
		citys[2][2] = "Gaziantep";

		for (int i = 0; i<=2; i++) {
			System.out.println("-----------------------");
			for (int j = 0; j<=2; j++) {
			System.out.println(citys[i][j]);
			}
		}
	}

}
