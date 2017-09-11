# 반복문 연습문제
## 은행에서 사용할 이율을 구하는 프로그램
- ※매달 내는 적립식이 아닌 한번에 묵돈을 입금해 놓는 거치식 이율계산 문제

```java

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

```

- 예치기간이 1~90일이면, 0.5% 이율
- 예치기간이 91~180일이면, 1% 이율
- 예치기간이 181~364일이면, 2% 이율
- 예치기간이 365일이면 5.6% 이율
- 1~365일까지 하루씩 증가하면서, 100만원을 예금했을 때 이자를 얼마나 받을 수 있는 지 10일간격으로 결과 출력하기 문제

### 풀이

- getInterestRate메소드를 만들어 특정 날을 입력받으면, 그 결과에 따라 if문 으로 나눈 결과값으로 이동
- if문의 결과로 출력되는 이율들을 getInterestRate메소드에서 호출
- 출력시 for문을 활용해, 어느 부문에 이율이 속하는지 범위를 정해준후,
%연산자를 사용하여 10일간격으로 출력함.  
