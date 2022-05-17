package com.collections.arraylist;
import java.util.*;
public class TryArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		System.out.println(list.size());
list.add("java expert");
list.add("Underneath Java");
list.add("Java object oriented");
list.add("Java pool");
list.add("Coding in  Java");
System.out.println(list);

System.out.println(list.get(0));
System.out.println(list.get(1));
System.out.println(list.get(2));
System.out.println(list.get(3));
System.out.println(list.get(4));

System.out.println("tostring "+list.toString());
System.out.println(list.get(0));

System.out.println(list.size());

ArrayList booklist1=new ArrayList();
booklist1.add("java expert");
booklist1.add("Underneath Java");
booklist1.add("Java object oriented");
booklist1.add("Java pool");
booklist1.add("Coding in  Java");
System.out.println(list.equals(booklist1));
System.out.println(list.iterator());
//System.out.println(list.equals(list1));
System.out.println(list.contains("Java pool"));
System.out.println(booklist1);
//l is list type  and list1 is arraylist type
List l=booklist1;
System.out.println(l);
//c is collection type and l is list type
Collection c=l;
System.out.println(c);
Iterator iter =c.iterator();
System.out.println();
while(iter.hasNext())
{
	System.out.println(iter.next());
}
System.out.println();

Iterator iter1 =l.iterator();
while(iter.hasNext())
{
	System.out.println(iter1.next());
}

//enhanced for loop ,no need to maintain index
System.out.println();

for(Object book:booklist1)
{
	System.out.println(book);
}

System.out.println();
for(int i=0;i<booklist1.size();i++)
{
	System.out.println(booklist1.get(i));
}

Collections.sort(booklist1);
System.out.println(booklist1);
int found =Collections.binarySearch(booklist1,"Java pool");
System.out.println(found);

Object books[]=c.toArray();
System.out.println(books.length);

List listofbooks=Arrays.asList(books);
System.out.println(listofbooks);







	}

}
