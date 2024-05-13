import java.util.Scanner;

public class Game {
	private Scanner inp = new Scanner(System.in);

	private Player player;
	private Location location;

	public void start() {
        /*
            INTRO
        */
		System.out.println("Macera oyununa hoşgeldiniz!");
		System.out.print("Lütfen bir isim giriniz: ");
		String playerName = inp.nextLine();
		Player player = new Player(playerName);
		System.out.println("Sayın " + player.getName() + ". Bu karanlık ve sisli adaya hoş geldin!");
		System.out.println("Burda yaşanan her şey gerçek!\n");

        /*
            CHARACTER SELECTION
        */
		player.selectChar();

        /*
        Game loop
         */
		Location location;
		while (true) {
			System.out.println("================================");
			player.printStatus();
			System.out.println("\n1 - Ev");
			System.out.println("2 - Dükkan");
			System.out.println("3 - Mağara");
			System.out.println("4 - Orman");
			System.out.println("5 - Nehir");
			System.out.println("0 - Çıkış");
			System.out.print("Gitmek istediğin yeri seç: ");
			int selectLoc = inp.nextInt();
			switch (selectLoc) {
				case 0:
					location = null;
					break;
				case 1:
					location = new House(player);
					break;
				case 2:
					location = new Market(player);
					break;
				case 3:
					if (!Cave.hasBeenIn) {
						location = new Cave(player);
						Cave.hasBeenIn = true;
					} else {
						System.out.println("Burayı çoktan temizledin.");
						continue;
					}
					break;
				case 4:
					if (!Forest.hasBeenIn) {
						location = new Forest(player);
						Forest.hasBeenIn = true;
					} else {
						System.out.println("Burayı çoktan temizledin.");
						continue;
					}
					break;
				case 5:
					if (!River.hasBeenIn) {
						location = new River(player);
						River.hasBeenIn = true;
					} else {
						System.out.println("Burayı çoktan temizledin.");
						continue;
					}
					break;
				default:
					System.out.println("Hatalı girdi!");
					continue;
			}
			if (location == null) {
				System.out.println("Byee");
				break;
			}
			if (!location.onLocation()) {
				System.out.println("Öldün! İyi denemeydi.");
				break;
			}

		}


	}
}




