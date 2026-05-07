package divide;

public class monkey {

	    public static void main(String[] args) {

	        // Sample inputs (replace these values when testing)
	        int n = 20;  // total monkeys
	        int k = 2;   // bananas per monkey
	        int j = 3;   // peanuts per monkey
	        int m = 12;  // total bananas
	        int p = 12;  // total peanuts

	        // basic validation
	        if (n < 0 || k <= 0 || j <= 0 || m < 0 || p < 0) {
	            System.out.println("INVALID INPUT");
	            return;
	        }

	        // monkeys eating bananas and peanuts
	        int monkeysFromBananas = m / k;
	        int monkeysFromPeanuts = p / j;

	        // total monkeys that can come down
	        int totalEaten = monkeysFromBananas + monkeysFromPeanuts;

	        // cannot exceed total monkeys
	        if (totalEaten > n) {
	            totalEaten = n;
	        }

	        int remainingMonkeys = n - totalEaten;

	        System.out.println("Number of Monkeys left on the Tree:" + remainingMonkeys);
	    }
	}

