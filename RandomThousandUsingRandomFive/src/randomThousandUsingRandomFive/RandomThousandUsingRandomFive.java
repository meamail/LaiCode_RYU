package randomThousandUsingRandomFive;

// Given a random generator random5(), the return value of random5() is 0 - 4 
// with equal probability. Use random5() to implement random1000().

public class RandomThousandUsingRandomFive {

	static class RandomFive {
		static int random5() {
			return (int) (Math.random() * 5);
		}
	}

	public int random1000() {
		while (true) {
			int random = 0;
			for (int i = 0; i < 5; i++) {
				// where does 5 come from?
				// 44444 in quinary = 3124 in decimal
				random = random * 5 + RandomFive.random5();
			}
			if (random < 3000) {
				return random % 1000;
			}
		}
	}
	
}
