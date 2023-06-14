import java.util.Scanner;

public class AtmProjesi {

	public static void main(String[] args) {

		String userName, password;
		int balance = 1500;
		int select, price;

		Scanner inp = new Scanner(System.in);

		int right = 3;
		while (right > 0) {

			System.out.print("Kullanıcı Adınızı Giriniz :");
			userName = inp.nextLine();

			System.out.print("Kullanıcı Şifrenizi Giriniz :");
			password = inp.nextLine();

			if (userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz");

				do {
					System.out.println("1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgulama\n" + "4-Çıkış Yap");
					System.out.print("Yapmak İstediğiniz İşlemi Seçiniz :");

					select = inp.nextInt();

					switch (select) {
					case 1:
						System.out.print("Para Miktarı :");

						price = inp.nextInt();
						balance += price;
						break;

					case 2:
						System.out.print("Para Miktarı :");

						price = inp.nextInt();

						if (price > balance) {
							System.out.println("Yetersiz Bakiye");

						} else {
							balance -= price;
						}
						break;

					case 3:
						System.out.println("Bakiyeniz :" + balance);
						break;
					}

				} while (select != 4);
				System.out.println("Tekrar Görüşmek Üzere...");
				break;

			} else {
				right--;
				System.out.println("Hatalı Kullanıcı Adı veya Şifre Girdiniz. Lütfen Tekrar Deneyiniz!");

				if (right == 0) {
					System.out.println("Hesabınız Bloke Olmuştur! Lütfen Banka ile İletişime Geçiniz!");
				} else {
					System.out.println("Kalan Hakkınız :" + right);

				}

			}

		}
	}
}
