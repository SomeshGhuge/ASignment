package MultiThreading2;

public class Info {/*

Life Cycle of Thread:---->

     There are different types of thread state are as follows as-

1.	New or Born State-
       The thread is in new state if you create an instance of Thread class
        but before the invocation of start () method.

2.	Runnable state-
     The thread is in runnable state after invocation of start () method,
      but the thread scheduler has not selected it to be the running thread.

3.	Running state-
      The thread is in running state if the thread scheduler has selected it.

4.	Dead state-
       A thread is in terminated or dead state when its run () method exits.
       
5.	Waiting state- 
            When a thread is temporarily inactive, then it’s in one of the 
following states: Blocked and Waiting state. Or Running thread calls join 
method then it will enter into waiting state (Blocking  for joining).

6.	Sleep state-
           If running thread calls sleep method then it will enter into sleep
state. If sleeping thread got interrupted or time expire then it will enter
into ready state.

7.	Waiting state-
           If running thread calls wait method then it will enter into waiting
state. If waiting state got notification then it will enter into another 
wating state.

8.	Suspended state-
           If running state called suspend method then thread will enter into
suspended state.

9.	Resume state-
           If we call thread from resume () method then it will enter into
ready state.




Synchronization in Java:------->
             We can apply synchronization on method and block only.
We cannot apply it on variables and class.Synchronization means multiple 
threads is accessing the one resource at the same time but we are allowing
only one thread to access. The main purpose of this is we need to ensure 
that resource will be used by only one thread at a time. The process by 
which this is achieved is called synchronization.



Synchronized method:-------> 
             If you declare any method as synchronized, it is known as 
synchronized method.Synchronized method is used to lock an object for any 
shared resource.When a thread invokes a synchronized method, it automatically 
acquires the lock for that object and releases it when the thread completes 
its task.

Example- synchronized void test (){
// write code here
}




Synchronized Block------->
             Synchronized block can be used to perform synchronization on any 
specific resource of the method.Suppose you have 50 lines of code in your 
method, but you want to synchronize only 5 lines, you can use synchronized 
block.If you put all the codes of the method in the synchronized block, 
it will work same as the synchronized method.

Note-
o	Synchronized block is used to lock an object for any shared resource.
o	Scope of synchronized block is smaller than the method.

Syntax-
synchronized (object reference) {   
  //code block   
}  

*/
}
