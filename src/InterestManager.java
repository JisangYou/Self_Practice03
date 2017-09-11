
public class InterestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterestManager inter = new InterestManager();

		for (int i = 1; i < 366; i++) {
			inter.getInterestRate(i);

			if (i % 10 == 0)
				System.out.println(i+" =  "+inter.calculateAmount(i, 1000000));
		}

	}

	public double getInterestRate(int day) {
		double rate = 0;

		if (day <= 90) {
			rate = 0.005;
		} else if (day <= 180) {
			rate = 0.01;
		} else if (day <= 364) {
			rate = 0.02;
		} else {
			rate = 0.056;
		}

		return rate;
	}

	public double calculateAmount(int day, long amount) {
		double resultAmount = 0;
		resultAmount = amount + amount * getInterestRate(day);

		return resultAmount;
	}
}
