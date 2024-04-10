//Part of Collections
//Queues

import java.util.Iterator;
import java.util.LinkedList;

public class Queues {
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(5);
        ll.add(1);
        ll.add(10);
        ll.add(50);
        ll.add(100);
        System.out.println("The Linked List is "+ll+ " of size "+ll.size());
        System.out.println("The front element of the linked list is "+ll.peek());
        System.out.println("Removing the peek element "+ll.remove());
        System.out.println("Updated Linked List is "+ll+ " of size "+ll.size());
        //Traversing
        System.out.println("Traversal using for loop");
        for(int i=0;i<ll.size();i++)
            System.out.print(ll.get(i)+" ");
        System.out.println();
        //Iterators
        System.out.println("Traversal using Iterators");
        Iterator<Integer> it=ll.iterator();
        while (it.hasNext())
            System.out.print(it.next()+" ");
    }
}