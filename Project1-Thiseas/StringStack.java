import java.io.PrintStream;
import java.util.NoSuchElementException;


Class StringStack{
	 private class Node { 
        String data; 
        Node next; 
  
        Node(String d) { data = d; next = null; } 
    } 
	private Node head;

	public interface StringStack (string maxN){
		head=null;}
	public boolean isEmpty(){
		return(head==null);}
	public void push(String item){
		head= new Node (item, head);}
	public String pop() throws NoSuchElementException{
		string s1=head.item;
		Node s2= head.next;
		head=s2;}
	public String peek() throws NoSuchElementException{
		if(!isEmpty){
			return head.item;}
		else{
			throws NoSuchElementException;}}
	public void printStack(PrintStream stream){
		if (!isEmpty){
			while(head.next!=null){
				System.outprintln(head.item);
			}
		else{
			throws NoSuchElementException;}}}
	public int size(){
		int count=0;
		while(head.next!=null)
			{ count++;} return count;
		else{throws NoSuchElementException;}}
}
