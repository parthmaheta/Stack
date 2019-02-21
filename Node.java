package myCollection;

class Node
{
   int Data;
   Node Previous;
   Node()
   { 
     Previous=null;
   }
   Node(int N)
   {
     Data=N;
	 Previous=null;
   }
   
   Node(int N,Node Obj)
   {
      Data=N;
	  Previous=Obj;
   }
}