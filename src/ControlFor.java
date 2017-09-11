
public class ControlFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ControlFor control = new ControlFor();
		control.forLoop(10);
	}

	public void forLoop(int until) {// until이라는 값을 forLoop의 매개변수로 받았다.
		int sum = 0; // 1부터의 합을 저장하는 sum이라는 int를 정의하였다.

		for (int loop = 1; loop <= until; loop++) { // for 루프에서는 loop라는 값을 1부터 until까지 1씩 증가하도록 했다.
			sum += loop; // for 루프가 반복되면서 증가되는 loop의 값을 sum에 더한다. for루프의 loop 값이 10을 넘으면 for루프는 종료된다.
		}
		System.out.println("1 to " + until + "=" + sum); // sum을 출력한다.
	}

}
