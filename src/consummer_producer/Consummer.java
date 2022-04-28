package consumer_producer;

import java.util.List;

public class Producer extends Thread{
	
	List<Integer> queue;	
	int number;
	
	public Producer(List<Integer> queue ,  int number){
		this.queue=queue; 
		this.number=number;
	}
	


	public void run() {
		queue.add(number);
	  System.out.println(number+ " added by "+ Thread.currentThread().getName() );
	}
	

}