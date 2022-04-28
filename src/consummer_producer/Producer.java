package consumer_producer;

import java.util.List;

public class Consummer  implements Runnable {
	private List<Integer> queue;
	
	public Consummer (List <Integer> queue) {
		this.queue=queue;
	}
	
	public void run() {		
		int x=queue.remove(0);
		System.out.println(x +" d'indice 0 dans queue removed by the thread   " + Thread.currentThread().getName());
	}

	

}