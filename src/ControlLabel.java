
public class ControlLabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ControlLabel control = new ControlLabel();
		// control.printTimesTable();
		// control.printTimesTable2();
//		control.printTimesTableSkipAfter4Case1();
		control.printTimesTableSkipAfter4Case2();
	}

	public void printTimesTable() {

		for (int level = 2; level < 10; level++) {
			for (int unit = 1; unit < 10; unit++) {

				if (level == 4 || unit == 4) {
					continue;
				}
				System.out.print(level + "*" + unit + "=" + level * unit + " ");
			}
			System.out.println();
		}
	}

	public void printTimesTable2() {

		for (int level = 2; level < 10; level++) {
			if (level == 4)
				continue;

			for (int unit = 1; unit < 10; unit++) {
				if (unit == 4)
					continue;
				System.out.print(level + "*" + unit + "=" + level * unit + " ");
			}
			System.out.println();
		}

	}

	public void printTimesTableSkipAfter4Case1() {
		for (int level = 2; level < 10; level++) {
			for (int unit = 1; unit < 10; unit++) {
				if (unit == 4)
					break;
				System.out.print(level + "*" + unit + "=" + level * unit + " ");
			}
			System.out.println();
		}

	}

	public void printTimesTableSkipAfter4Case2() {
		startLabel: for (int level = 2; level < 10; level++) {
			for (int unit = 1; unit < 10; unit++) {
				if (unit == 4)
					continue startLabel;
				System.out.println(level + "*" + unit + "=" + level * unit + " ");
			}
			System.out.println();
		}
	}

}