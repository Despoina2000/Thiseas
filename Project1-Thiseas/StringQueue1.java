import java.io.PrintStream;
import java.util.NoSuchElementException; 


public interface StringQueue{
	
	private class Node { 
        String data; 
        Node next; 
  
        Node(String d) { data = d; next = null; } 
    }
	 Node head= new Node(null);
	public StringQueue(){
		head=null;
		tail=null;
	}
	
	
	public boolean isEmpty(){
		return (head==null); 
		}
		
		
	public void put(String item){
		Node e=tail; 
		tail=new Node(item);
		if (isEmpty())
			head=tail;
		else 
			e.next=tail;}
	public String get() throws NoSuchElementException{
		if (!isEmpty()){
			String value=head.item; 
			Node t= head.next; 
			head=t; 
			return value;}
		else{
			throws NoSuchElementException;}}
	public String peek() throws NoSuchElementException{
		if(!isEmpty()){ 
				return head.item;}
		else{
			throws NoSuchElementException;}}
	public int size(){
		int count=0;
		while(head.next!=null)
			{ (count++);} 
		return count;}
}