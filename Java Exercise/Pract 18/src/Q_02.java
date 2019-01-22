import java.util.Random;

public class Q_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		String[] suits = { "Clubs", "Hearts", "Spades", "Diamonds" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		String card = values[rand.nextInt(values.length)] + " " + suits[rand.nextInt(suits.length)];

		System.out.println(card);

	}

}
