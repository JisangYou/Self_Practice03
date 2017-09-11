
public class ControlWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ControlWhile control = new ControlWhile();
		control.whileLoop1();
		control.whileLoop2();
		control.whileBreak();
		control.whileContinue();

	}

	public void whileLoop1() {
		ControlOfFlow control = new ControlOfFlow(); // ControlSwitch클래스 불러와서,
														// 객체 생성한 후
		int loop = 0; // 지역변수 초기화 해주고,
		while (loop < 12) { // while 문이 true가 될때까지 돌고,
			loop++; // loop는 12보다 작은 정수만큼 돌면
			control.switchCalendar(loop);// switchStatement메서드가 호출되고 그안에 인자값이
											// 1~12까지 돈다.
		}
	}

	public void whileLoop2() {
		ControlOfFlow control = new ControlOfFlow();
		int loop = 0;
		while (loop < 12) {
			loop++;
			control.switchCalendar(loop);
			if (loop == 6) // loop문에서 6일때
			{
				loop = 100; // break;
			} // 터무니 없는 값을 넣어 빠져나온다. 물론 break을 넣어도 됨.
		}
	}

	public void whileBreak() {
		ControlOfFlow control = new ControlOfFlow();
		int loop = 0;
		while (loop < 12) {
			loop++;
			control.switchCalendar(loop);
			if (loop == 6) {
				break;
			}
		}
	}

	public void whileContinue() {
		ControlOfFlow control = new ControlOfFlow();
		int loop = 0;
		while (loop < 12) {
			loop++;
			if (loop == 6)
				continue;
			control.switchCalendar(loop);
		}
	}
}
