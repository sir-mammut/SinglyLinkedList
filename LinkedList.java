/**
 * @(#)LinkedList.java
 *
 * @author Mhizta_Mammut
 * @version 1.00 2019/4/18
 */

public class LinkedList {
        
    /**
     * Creates a new instance of <code>LinkedList</code>.
     */
    public LinkedList() {
    	length = 0;
    }
    Nodes head;   //Holding the head of the list
    private int length = 0;
    
    //Return the first (head) node of the list
    public synchronized Nodes getHead(){
    	return head;
    }
    
    //insert new node at the beginning of the list
    public synchronized void insertAtBegin(Nodes node){
    	node.setNext(head);
    	head = node;
    	length++;
    }
    
    //Insert the node at the end of the linked list
    public synchronized void insertAtEnd(Nodes node){
    	if(head == null)  //Checking if the list is Empty
    		head = node;
    	else{
    		Nodes p,q;
    		for(p = head;(q = p.getNext()) != null; p = q);
    			p.setNext(node);
    	}
    	length++;
    }
    
    //Adding the new value of the list at the given position.
    //All the Values at that position to the end move over to make a room.
    
    public void insertNodeToGivenPosition(int data, int position){
    	//Fix the position first to make a room.
    	if(position < 0){
    		 //if negative number is given (as position number) make it to be 0.
    		position = 0;
    	}	
    	if(position > length){
    		//if given position number is greater than the existing length of
    		//the list, makes the position to be equal to the length of the linked list
    		position = length;
    	}
    	//if the list is EMPTY make the giving node as head (starting node)
    	if(head == null){
    		head = new Nodes(data);
    	}
    	else if(position == 0){ //if adding at the front of the list
    		Nodes temp = new Nodes(data);
    		temp.next = head;
    		head = temp;
    	}
    	//Else find the correct position and insert
    	else{	
    		Nodes temp = head;
    		//Looping through the linked list
    		for(int i = 1; i < position; i+=1){
    			temp = temp.getNext();
    		}
    		Nodes newNode = new Nodes(data);
    		newNode.next = temp.next;
    		temp.setNext(newNode);
    	}
    	//The linked list is now one value longer.
    	length+=1;
    }
    
    //Remove and return the node at the head of the list
    public synchronized Nodes removeFromBegin(){
    	Nodes node = head;
    	if(node != null){
    		head = node.getNext();
    		node.setNext(null);
    	}
    	return node;
    }
    
    //Remove and return the node at the end of the linked list
    public synchronized Nodes removeFromEnd(){
    	if(head == null){
    		return null;
    	}
    	Nodes p = head, q = null, next = head.getNext();
    	if(next == null){
    		head = null;
    		return p;
    	}
    	while((next = p.getNext()) != null){
    		q = p;
    		p = next;
    	}
    	q.setNext(null);
    	return p;
    }
    
    //Remove node Matching the specified node from the list.
    //Using equals() method instead of == to test for a match node.
    public synchronized void removeMatched(Nodes node){
    	if(head  == null){
    		return;
    	}
    	if(node.equals(head)){
    		head = head.getNext();
    		return;
    	}
    	Nodes p = head, q = null;
    	while((q = p.getNext()) != null){
    		if(node.equals(q)){
    			p.setNext(q.getNext());
    			return;
    		}
    		p = q;
    	}
    }
    
    //Removing the value at the given postion.
    //if the position is less than 0, just remove the value at position 0.
    // if the position is graeter than the length of the linked list,
    // just remove the value at the last position of the list
    public void removeAt(int position){
    	//Fix the position
    	if(position < 0){
    		position = 0;
    	}
    	if(position > length)
    		position = length;
    	if(head == null) //if nothing in the list, just do nothing
    		return;
    	//if removing the head element...
    	if(position == 0){
    		head = head.getNext();
    	}
    	// Else move to the correct position and remove.
    	else{
    		Nodes temp = head;
    		for(int i=1; i<position; i+=1){
    			temp = temp.getNext();
    		}
    		temp.setNext(temp.getNext().getNext());
    	}
    	//Reduce the length of the list;
    	length-=1;
    }
    //Return the String representation oof the collection in the form of ["str1","str2",...,"strN"].
    public String toString(){
    	String result = "[";
    	if(head == null){
    		return result+"]";
    	}
    	result = result +head.getData();
    	Nodes temp = head.getNext();
    	while(temp != null){
    		result = result+","+temp.getData();
    		temp = temp.getNext();
    	}
    	return result +"]";
    }
    // Return the current length of the list
    public int Length(){
    	return length;
    }
    //Find the posiotion of the first value that is equal to the given value.
    //The equals() method is used to determine the equality.
    public int getPosition(int data){
    	//Go and find the data
    	Nodes temp = head;
    	int pos = 0;
    	while(temp != null){
    		if(temp.getData() == data){
    			//Return the position if found 
    			return pos;
    		}
    		pos+=1;
    		temp = temp.getNext();
    	}
    	//Else return some large value.
    	return Integer.MIN_VALUE;
    }
    
    //Remove everything from the list
    public void clearList(){
    	head = null;
    	length = 0;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodes head = new Nodes(4);
        Nodes a = new Nodes(5);
        Nodes b = new Nodes(4);
        Nodes c = new Nodes(8);
        Nodes d = new Nodes(1);
        Nodes e = new Nodes(6);
        Nodes f = new Nodes(7);
        Nodes g = new Nodes(3);
        //head.setData(8);
        System.out.println(head.getData());
    }
}
