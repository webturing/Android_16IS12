package lec04;


public class ThreadDemo {
	static class Runner extends Thread{
		String name;
		
		public Runner(String name) {
			super();
			this.name = name;
		}

		@Override
		public void run() {
			for(int i=0;i<10;i++){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(name+" "+i);
			}
			
		}
		
	}
public static void main(String[] args) {
	Thread a=new Runner("Tom");
	Thread b=new Runner("Jerry");
	a.start();
	b.start();
}
}
