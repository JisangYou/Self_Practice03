
public class ControlFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ControlFor control = new ControlFor();
		control.forLoop(10);
	}

	public void forLoop(int until) {// until�̶�� ���� forLoop�� �Ű������� �޾Ҵ�.
		int sum = 0; // 1������ ���� �����ϴ� sum�̶�� int�� �����Ͽ���.

		for (int loop = 1; loop <= until; loop++) { // for ���������� loop��� ���� 1���� until���� 1�� �����ϵ��� �ߴ�.
			sum += loop; // for ������ �ݺ��Ǹ鼭 �����Ǵ� loop�� ���� sum�� ���Ѵ�. for������ loop ���� 10�� ������ for������ ����ȴ�.
		}
		System.out.println("1 to " + until + "=" + sum); // sum�� ����Ѵ�.
	}

}
