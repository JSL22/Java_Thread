package bms.com;

public class SimpleTimer {
	private static int count;
	public static void main(String[] args) {
		System.out.println(args.length);
		
		count = args.length >= 1 ? Integer.valueOf(args[0]):60;
		int remaining ;
		
		//ѭ����ʼ
		while(true) {
			remaining = countDown();
			if(remaining ==0) {
				break;
			} else {
				System.out.println(count);
			}
			
			//˯1000֮������һλ��
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
		
			// ѭ������ 
		System.out.println("Time was done\n");
	}
	
	private static int countDown() {
		return count--;
	}

}
