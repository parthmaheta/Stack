package myCollection;
public class Stack{
    Node Top=null;
	
	public void push(int N)
	{
	   if(Top==null)
	    Top=new Node(N);
	  else
	    Top=new Node(N,Top);
	}
	
	public void pop()
	{
	  if(Top==null)
	    System.out.println("Stack Is Empty");
	  else
       Top=Top.Previous;	  
	}
	
	public void peek()
	{
	  if(Top==null)
	   System.out.println("Stack is Empty");
	  else
	   System.out.println("Peek Is:"+Top.Data);
	}
	
	public void printStack()
	{
		Node Obj=Top;
		
	   if(Top==null)
	   System.out.println("Stack is empty");
	   else
	    while(Obj!=null)
		 {
		   System.out.println("\t"+Obj.Data);
		   Obj=Obj.Previous;
		 }
	}
}