import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String[][] Karty =     {{"\u001b[40m\u001b[38;5;196m+--------+\u001b[0m", "\u001b[40m\u001b[38;5;196m+--------+\u001b[0m", "\u001b[40m\u001b[38;5;232m+--------+\u001b[0m", "\u001b[40m\u001b[38;5;232m+--------+\u001b[0m"},
				            {"\u001b[40m\u001b[38;5;196m|XX      |\u001b[0m", "\u001b[40m\u001b[38;5;196m|XX /|   |\u001b[0m", "\u001b[40m\u001b[38;5;232m|XX      |\u001b[0m", "\u001b[40m\u001b[38;5;232m|XX /|   |\u001b[0m"},
				            {"\u001b[40m\u001b[38;5;196m|  /|/|  |\u001b[0m", "\u001b[40m\u001b[38;5;196m|  /  \\  |\u001b[0m", "\u001b[40m\u001b[38;5;232m|   /|   |\u001b[0m", "\u001b[40m\u001b[38;5;232m|  /  \\  |\u001b[0m"},
				            {"\u001b[40m\u001b[38;5;196m|  \\  /  |\u001b[0m", "\u001b[40m\u001b[38;5;196m| {    } |\u001b[0m", "\u001b[40m\u001b[38;5;232m|  _\\/_  |\u001b[0m", "\u001b[40m\u001b[38;5;232m| (_  _) |\u001b[0m"},
				            {"\u001b[40m\u001b[38;5;196m|   \\/   |\u001b[0m", "\u001b[40m\u001b[38;5;196m|  \\  /  |\u001b[0m", "\u001b[40m\u001b[38;5;232m| (_/|_) |\u001b[0m", "\u001b[40m\u001b[38;5;232m|   /|   |\u001b[0m"},
				            {"\u001b[40m\u001b[38;5;196m|      XX|\u001b[0m", "\u001b[40m\u001b[38;5;196m|   \\/ XX|\u001b[0m", "\u001b[40m\u001b[38;5;232m|   || XX|\u001b[0m", "\u001b[40m\u001b[38;5;232m|      XX|\u001b[0m"},
				            {"\u001b[40m\u001b[38;5;196m+--------+\u001b[0m", "\u001b[40m\u001b[38;5;196m+--------+\u001b[0m", "\u001b[40m\u001b[38;5;232m+--------+\u001b[0m", "\u001b[40m\u001b[38;5;232m+--------+\u001b[0m"}};
	    String[] Talia = new String[52];
		String[] KoloryKart = {"A", "B", "C", "D"};
		String[] WartKart = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "1", "J", "D", "K"};

		// Generujemy talię
		int t = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < WartKart.length; j++) {
				//Talia[i*13+j] = (WartKart[j] + KoloryKart[i]);
				Talia[t] = (WartKart[j] + KoloryKart[i]);
				t++;
			}
		}

		// Tasujemy talię
		for (int i = Talia.length - 1; i > 0; i--) {
			int LosowaKarta = (int) (Math.random() * i);
			String Temp = Talia[LosowaKarta];
			Talia[LosowaKarta] = Talia[i];
			Talia[i] = Temp;
		}

		String[] TablicaPiec = new String[5];
		for (int i = 0; i < 5; i++) {
			TablicaPiec[i] = Talia[i];
		}

		System.out.println();
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 5; j++){

				//TablicaPiec[j] ="DA"
				int Kolor = 0;
				switch (TablicaPiec[j].charAt(1)) {
					case 'A': Kolor = 0;
					break;
					case 'B': Kolor = 1;
					break;
					case 'C': Kolor = 2;
					break;
					case 'D': Kolor = 3;
					break;
				}
				String LiniaDoWys = Karty[i][Kolor];
				String NrDoWys = TablicaPiec[j].substring(0, 1);
				if (NrDoWys.equals("1")){
					NrDoWys = NrDoWys + "0";
				} else {
					NrDoWys = " " + NrDoWys;
				}
				LiniaDoWys = LiniaDoWys.replace("XX",NrDoWys);
				System.out.print(LiniaDoWys + "  ");
			}
			System.out.println();
		}
		System.out.println("Możesz wymienić karty");
		System.out.println("Wpisz tu które: ");
		Scanner r = new Scanner(System.in);
		String KartyDoWym = r.nextLine();
		//for (int i = 0; i<KartyDoWym.length())
	}
}
