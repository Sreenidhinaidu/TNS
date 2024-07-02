package com.tns.day14;

/*collection-utility of classes
-->arraylist
>in arraylist retrive/searching is best one.
>in arraylist the deletion and insertion is worst if we do the operation one index value after all the index needs to move forward  or backward)
>it makes performance issues
>index based
>asynchronize
>it is not a thread safe

-->linkedlist
>in arraylist retrive/searching is worst one
>in arraylist the deletion and insertion is best
>it doesnot makes performance issue

--->vector
>synchronize
>it is a thread s safe*
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;
public class ListDemo {

	public static void main(String[] args) {
		List list1 = new ArrayList();  //created empty raw arraylist
		
		System.out.println("Size:"+list1.size()); //printing size of our list
		System.out.println("is list is empty?"+list1.isEmpty()); // false or true
		list1.add(10);//0
		list1.add(20);//1
		list1.add(true); //2
		list1.add(false); //3
		list1.add(20); //4
		list1.add("Hello");//5
		list1.add(50.78);//6
		list1.add(20);//7
		list1.add('A');//8
		list1.add(5,"Hii");//9
		list1.add(10);
		System.out.println("List is:"+list1); //printing list1
		
		System.out.println("is list contain 15:"+list1.contains(15));
		list1.remove(false);
		
		//need to give the index value for integer to remove it from list
		
		System.out.println("List is:"+list1);
		
		System.out.println("Element at 5th loaction is:"+list1.get(5));
		System.out.println("Element removed:"+list1.remove(list1.lastIndexOf(10)));//last occurance of list
		System.out.println("Element removed:"+list1.remove(list1.indexOf(10)));//particular occurance 
		System.out.println("List is:"+list1);
		
		
		//Generic : store and let us write the code which can able to access any type of data. Define class with the type parameters and It is a method to operate on various objects
		
				List<String> names = new ArrayList<>();
				names.add("Amit");
				names.add("Manusri");
				names.add("Ashi");
				names.add("Muskan");
				names.add("Rishab");
				
				System.out.println("Reversed Name List is: "+names);
				
				//Traverse a list
				//Iterator used to loop through the collection
				//hasnext() : will allow us to check if there are more elements to iterate over (false / true)
				Iterator<String> i = names.iterator();
				while(i.hasNext()) {
					String nm = i.next();
					System.out.println(nm);
					
					if(nm.equals("Ashi"))
						i.remove();
				}
				System.out.println("Name List is: "+names);
				
				//Traverse in reverse
				ListIterator<String> li = names.listIterator(names.size());
				while(li.hasPrevious())
				{
					String nm = li.previous();
					System.out.println(nm);
				}
				
				
				
				

	}
}
