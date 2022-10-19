package Linked_List;
import java.util.Iterator;
import java.util.LinkedList;
public class Linked_List2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(40);
		linkedList.add(30);
		linkedList.add(20);
		linkedList.addFirst(70);
		//linkedList.addLast(80);
		
		//System.out.println("first way="+linkedList);
		int a=linkedList.get(3);
		System.out.println("4th index is="+a);
		
		
		//Second Way
		Iterator<Integer> itr= linkedList.iterator();
        while(itr.hasNext()) { 
	    System.out.println(""+itr.next());
		}
        
        
        //Third Way
		for(Integer t : linkedList) {
			System.out.println("using for each loop="+t);
}}}

