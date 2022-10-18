package Collections;

public class Info {/*

Collection Framework:----->
          Why it is called as framework because it contain the collection of
classes and interface that work together.


Need of collection......?

1.	Array are fixed in size, once it is created we cannot change its size
 based on requirements.
2.	Array can hold homogenous data elements.
3.	There is no readymade method support available in array.


To overcome this problem, we should go for collection.....

1.	Collection are growable in nature, based on our requirement we can 
increase or decrease the size.
2.	Collection can hold homogenous and heterogeneous elements.
3.	Every collection class is implemented based on some data structure.
4.	Hence readymade method support is available.
5.	We do not have to write code to implement these data structures and 
algorithms manually.


Difference between Array and Collection.....->>

Array	                                                Collection

Fixed in size                                  	Growable in nature
Performance is good                         	Performance is not good

It hold homogenous data only.               	It hold homogenous and 
                                                heterogeneous type of data.
                                                
Readymade method support 	                    Readymade method support is
is not available                                available.

Array can hold both primitives	                It hold only objects
 data types and objects                           not primitives data type.
 
 
 
 
 
 Collection (I):------>
           If we want to represent the group of objects as single entity then 
we should go for collection.  



Collection Framework:------> 
            It defines several classes and interface which can be used as 
objects as single entity.There are 9 key interfaces of collection framework.

1.	Collection
2.	List
3.	Set
4.	SortedSet
5.	NavigableSet
6.	Queue
7.	Map
8.	SortedMap
9.	NavigableMap

1.	Collection:----->

1.	If we want to represent group of individual objects as single entity then
    we should go for collection.
2.	Collection interface defines the most common method which are applicable
    for any collection objects.
3.	In general, Collection interface is considered as root interface of 
    collection framework.

Note- There is no concreate class which implements collection interface 
      directly.





2.	List:---------->
1.	It is child interface of collection.
2.	It is present in Java.util.Package.
3.	If we want to represent group of individual objects as single entity 
    where duplicates are allowed and insertion order is preserved then we 
    should go for list.
4.	We can differentiates by using index.
5.	We can preserve insertion order by using index. Hence index plays
    important role. It will get the same sequence of element while
    retrieving the elements.
6.	It has three subclasses in java such as- ArrayList LinkedList Vector etc.



3.	ArrayList:------->


1.	The ArrayList extends the AbstractList and implements the List interface.
2.	Duplicates are allowed.
3.	Insertion order is preserved.
4.	Heterogenous objects are allowed.
5.	Null insertion is possible.(we can add n number of null values in 
    arraylist).

<-------Constructor:------>
          There are four types of constructor as below.

1.	ArrayList al= new ArrayList();
              Create the empty array list with default initial capacity 10. Once array list reaches its max capacity then new array list will be created with its new capacity.

Formula

Current capacity * 3/2 +1;

So current size is 10 then it will calculate like 
10*3/2+1,  
30/2+1
15+1
16

New size will be created 16.
Next time it will become 25

2.	ArrayList al= new ArrayList(int initial_capacity);
          Here we are passing the int type value.

3.	ArrayList al= new ArrayList( Collection c);
             Here we are passing the objects.
             
Note:----->
 
1.	ArrayList is the best choice if our frequent operation is 
retrival operation.It implements the random access interface.
2.	ArrayList is the worst choice if our frequent operation is insertion or
deletion (because several shift operation are required for this).


How to get the synchronized version of ArrayList.......?
             By default, all the methods in array list are non-synchronized 
but we can get the synchronized version of arraylist by using collection 
class synchronized list method.

Example – ArrayList al= new ArrayList();  //this is non-synchronized
List list=Collections.synchronizedList(al); // this is synchronized



 

*/
}
