package bms.com;

public class SimpleTimer {
	private static int count;
	public static void main(String[] args) {
		System.out.println(args.length);
		
		count = args.length >= 1 ? Integer.valueOf(args[0]):60;
		int remaining ;
		
		//循环开始
		while(true) {
			remaining = countDown();
			if(remaining ==0) {
				break;
			} else {
				System.out.println(count);
			}
			
			//睡1000之后，再下一位数
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
		
			// 循环结束 
		System.out.println("Time was done\n");
	}
	
	private static int countDown() {
		return count--;
	}

}
