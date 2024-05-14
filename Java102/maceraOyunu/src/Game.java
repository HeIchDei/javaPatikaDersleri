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
		this.player = new Player(playerName);
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
			if(this.player.isWin()){
				break;
			}

			System.out.println("================================");
			player.printStatus();
			System.out.println("\n1 - Ev");
			System.out.println("2 - Dükkan");
			System.out.println("3 - Mağara");
			System.out.println("4 - Orman");
			System.out.println("5 - Nehir");
			System.out.println("6 - Maden");
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
					if (!this.player.getInventory().isFood()) {
						location = new Cave(player);
					} else {
						System.out.println("Burayı çoktan temizledin.");
						continue;
					}
					break;

				case 4:
					if (!this.player.getInventory().isFirewood()) {
						location = new Forest(player);
					} else {
						System.out.println("Burayı çoktan temizledin.");
						continue;
					}
					break;
				case 5:
					if (!this.player.getInventory().isWater()) {
						location = new River(player);
					} else {
						System.out.println("Burayı çoktan temizledin.");
						continue;
					}
					break;
				case 6:
					location = new Mine(player);
					break;
				default:
					System.out.println("Hatalı girdi!");
					continue;
			}
			if (location == null) {
				System.out.println("Korkusuz bir maceracı olduğunu düşünmüştüm, yazık oldu.");
				break;
			}

			if (!location.onLocation()) {
				System.out.println("Öldün! İyi denemeydi.");
				break;
			}

		}


	}
}




