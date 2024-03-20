class Priority 
{ 
    public void getPriority() 
    { 
        for (int i = 100; i < 104; i++) 
        { 
            System.out.println(i); 
            try
            { 
                Thread.sleep(400); 
            }
            catch (Exception e) 
            { 
                System.out.println(e); 
            } 
        } 
        
        System.out.println("\nDone\n");
    } 
} 
  
class ThreadDetails extends Thread 
{ 
    Priority priority; 
  
    ThreadDetails(Priority priority) 
    { 
        this.priority = priority; 
    } 
  
    @Override
    synchronized public void run() 
    { 
        priority.getPriority();
    } 
} 

class Q5 
{ 
    public static void main(String[] args) 
    { 
        Priority obj = new Priority(); 
        ThreadDetails t1 = new ThreadDetails(obj); 
        ThreadDetails t2 = new ThreadDetails(obj); 
        t1.start(); 
        t2.start(); 
    } 
} 


