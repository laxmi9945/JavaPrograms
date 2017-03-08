package bridgeittest;

public class Deque {
	public int front,rear,length;
	Object[] element;
	int maxSize;
	public Deque(int size) {
		maxSize=size;
		element=new Object[maxSize];
		front=-1;
		rear=-1;
		length=0;
	}
	
		//inserting from the rear side
	boolean addRear(Object ele){
		
		if(rear==-1){
			front=maxSize/2;
			rear=maxSize/2;
			element[rear]=ele;
			length++;
			return true;
		}
		else if(rear+1<=maxSize){
			element[++rear]=ele;
			length++;
			return true;
		}
		
		throw new StackOverflowError();
	}
	
		//inserting from the front side
	boolean addFront(Object ele){
		
		if(front==-1){
			front=maxSize/2;
			rear=maxSize/2;
			
			element[front]=ele;
			length++;
			return true;
		}
		else if(front-1>0){
			element[--front]=ele;
			length++;
			return true;
		}
		
		throw new StackOverflowError( );
	}
	
		//remove from front and return the value
	Object removeFront(){
		if(front<=rear){
		length--;
		return element[front++];
		}
		return null;
	}
	
		//remove from rear and return the value
	Object removeRear(){
		if(rear>=front){
		length--;
		return element[rear--];
		}
		return front;
	}
}
