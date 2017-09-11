
public class ControlIfAndor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ControlIfAndor control = new ControlIfAndor();
		control.ifAndor();
		control.tripleOrAnd();
	}

	public void ifAndor() {
		int age = 25;
		boolean isMarried = true;

		if (age > 25 && isMarried) {
			System.out.println("Age is over 25 and Married");
		}
		if (age > 25 || isMarried) {
			System.out.println("Age is over 25 or Married");
		}
	}

	public void tripleOrAnd() {
		int age = 25;
		boolean isMarried = true;
		double height = 180;

		if ((age > 25|| isMarried) && height>=180) {
			System.out.println("Age is over 25 or Married and height is over 180");
		}
	
	}
}
