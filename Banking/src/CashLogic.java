class Node {
	int data;
	Node link;

	public Node() {
		link = null;
		data = 0;
	}

	public Node(int d, Node n) {
		data = d;
		link = n;
	}

	// fn to set data to current node
	public void setData(int d) {
		data = d;
	}

	// fn to set data to curnt node
	public Node getLink() {
		// TODO Auto-generated method stub

		return link;
	}

	// fn to get data from curnt node
	public int getData(int d) {
		return data;
	}

	// fn to set link to next node
	public void setLink(Node node) {
		// TODO Auto-generated method stub
		link = node;
	}

}

public class CashLogic {
	public Node rear, front;
	public int size = 0;

	public CashLogic() {
		rear = null;
		front = null;
		size = 0;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public int getSize() {
		return size;
	}

	public void insert(int data) {
		Node node = new Node();
		if (rear == null) {
			front = node;
			rear = node;
		} else {
			rear.setLink(node);
			rear = rear.getLink();
		}
		size++;
	}
	//remove front element from the queue
	public int remove(){
		if(isEmpty())
			Node ptr=front;
		front=ptr.getLink();
		if(front==null){
			rear=null;
			size--;
		}
		return ptr.getData();
	}
	
	public void display() {
		// TODO Auto-generated method stub
		int ptr1=0;
		System.out.println("Avlbl blnc:");
		if(size==0){
			System.out.print("Empty");
			return;
		}
		Node ptr=front;
		while(ptr!=rear.getLink()){
			ptr1=ptr1+ptr.getData();
			System.out.println(ptr1);
			ptr=ptr.getLink();
		}
		System.out.println();
	}
}
