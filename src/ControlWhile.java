
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
		ControlOfFlow control = new ControlOfFlow(); // ControlSwitchŬ���� �ҷ��ͼ�,
														// ��ü ������ ��
		int loop = 0; // �������� �ʱ�ȭ ���ְ�,
		while (loop < 12) { // while ���� true�� �ɶ����� ����,
			loop++; // loop�� 12���� ���� ������ŭ ����
			control.switchCalendar(loop);// switchStatement�޼��尡 ȣ��ǰ� �׾ȿ� ���ڰ���
											// 1~12���� ����.
		}
	}

	public void whileLoop2() {
		ControlOfFlow control = new ControlOfFlow();
		int loop = 0;
		while (loop < 12) {
			loop++;
			control.switchCalendar(loop);
			if (loop == 6) // loop������ 6�϶�
			{
				loop = 100; // break;
			} // �͹��� ���� ���� �־� �������´�. ���� break�� �־ ��.
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
