package day22;

// 동시에 여러작업을 해야하는 경우 스레드를 사용함
public class ThreadEx02 {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("현재 쓰레드명 :" + t.getName());

		//Thread t2 = new Thread(new Thread02());
		Thread t2 = new Thread(() -> {
				for (int i = 0; i < 10000; i++)
					System.out.print("-");
		});
		t2.run();
		for (int i = 0; i < 10000; i++)
			System.out.print("|");
	}

}

class Thread02 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++)
			System.out.print("-");
	}

}
