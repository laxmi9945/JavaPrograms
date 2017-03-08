package bridgeittest;

/*  Class Node  */
class Node1
{
	String data;
	Node1 link;
 
    public Node1(String string, Object object) {
		// TODO Auto-generated constructor stub
	}

	public void Node(String string, Object object) {
		// TODO Auto-generated constructor stub
	}

	/*  Constructor  */
    public void Node()
    {
        link = null;
        data = "";
    }  
    
    /* Parameterized Constructor  */
    public void Node(String string,Node1 n)
    {
        data = string;
        link = n;
    }  
    
    /*  Function to set data to current Node  */
   	public void setData(String d)
    {
        data = d;
    }   
    
   	/*  Function to get link to next node  */
   	public Node1 getLink()
    {
     	return link;
    }  
    
	/*  Function to set link to next Node  */
    public void setLink(Node1 n)
    {
        link = n;
    }  

    /*  Function to get data from current Node  */
    public String getData()
    {
        return data;
    }
}
 
/*  Class linkedQueue  */
public class UnorderedTest2logic
{
	public Node1 front, rear;
    public int size;
    /*  Function to check if queue is empty */
    public boolean isEmpty()
    {
        return front == null;
    }   
    
    /*  Function to get the size of the queue */
    public int getSize()
    {
        return size;
    }    
    /*  Function to insert an element to the queue */
    public void insert(String string)
    {
        Node1 node = new Node1(string, null);
        if (rear == null)
        {
            front = node;
            rear = node;
        }
        else
        {
            rear.setLink(node);
            rear = rear.getLink();
        }
        size++ ;
    }   
    
    /*  Function to remove front element from the queue */
   	public String remove()
    {
        
        Node1 ptr = front;
        front = ptr.getLink();        
        if (front == null)
		{
            rear =null;
			size-- ; 
		}       
        return ptr.getData();
    }

	public String remove(String inputString) {
		// TODO Auto-generated method stub
		Node1 ptr = front;
        front = ptr.getLink();        
        if (front == null)
		{
            rear =null;
			size-- ; 
		}       
        return ptr.getData();
	}  
	 public void display()
	    {  
			String ptr1="";
	        System.out.print("String is = "+array);
	        if (size == 0)
	        {
	            System.out.print("Empty");
	            return ;
	        }
	        Node1 ptr = front;
	        while (ptr != rear.getLink() )
	        { 
	        	ptr1=ptr1+ptr.getData();
	        	System.out.println(ptr1);
	            ptr = ptr.getLink();
	        }
	        System.out.println();        
	    }
	}

     
    