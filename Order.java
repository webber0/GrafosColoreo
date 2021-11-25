package coloreo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
	private List<Integer> order;
	
	public Order() {
		this.order=new ArrayList<Integer>();
	}
	
	public void add(Integer nodo) {
		this.order.add(nodo);
	}

	public void RandomOrder() {
		Collections.shuffle(order);
	}
	
	public List<Integer> getOrder(){
		return this.order;
	}
}