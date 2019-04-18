/**
 * @(#)Nodes.java
 *
 * @author Mhizta_Mammut
 * @version 1.00 2019/4/18
 */


public class Nodes {
	
	private int data;
	public Nodes next;
	private Nodes currentNode;
	
	//Default constructor
    public Nodes(int data) {
    	this.data = data;
    }
    //______Setters______
    
    /*
     * Setting the new data on the linked list
     * @param int data
     */
    public void setData(int data){
    	this.data = data;
    }
    
    //Set the next accessable data 
    public void setNext(Nodes next){
    	this.next = next;
    }
    
     //Getting the existing data from the linked list
    public int getData(){
    	return data;
    }
    
    //Get the next data 
    public Nodes getNext(){
    	return this.next;
    }
    /*
     * Take the linked list head as input and 
     * count the number of nodes in the giving linked head
     * @param Nodes head
     * @param int Length
     */
     public int LengthOfTheList(Nodes head){
     	int Length = 1;
     	Nodes currnetNode = head;
     	while(currentNode != null){
     		Length += 1;
     		currentNode = currentNode.getNext();
     	}
     	return Length;
     }
    
    
}