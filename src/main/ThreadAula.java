package main;

public class ThreadAula {
	public static void main(String[] args) {
		new Thread(new Runnable() {
	
			
			@Override
			public void run() {
				for(int x = 0; x <= 10; x++) {
					System.out.println(x);
				}
				System.out.println("Finish");	
			}
		}).start();
	}
}
