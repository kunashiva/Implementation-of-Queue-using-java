import java.util.Scanner;
class Queue
{


 void Enqueue(int arr[],int arrlen)
 {
  System.out.println("################################################");
  int newarr[]=new int[arrlen+1];
  System.out.println("Enter the element you want to enter into Queue");
  Scanner c=new Scanner(System.in);
  int new_element=c.nextInt();
  for(int i=0;i<arr.length;i++)
  {
   newarr[i]=arr[i];
  }
  int len=newarr.length;
  newarr[len-1]=new_element;
  System.out.println("Updated QUEUE is");
  for(int i=0;i<newarr.length;i++)  
  {
   System.out.print(newarr[i]+"| ");
  }
  System.out.println(" ");
  System.out.println("##############################################");
  System.out.println(" ");
  System.out.println("If you want to Enter Element into Queue Press:  ENQUEUE");
  System.out.println("If you want to delete Element in a Queue Press:  DEQUEUE");
  System.out.println("If you want to Exit Press Done ");
  Scanner scan=new Scanner(System.in);
  String press=scan.nextLine();
  press=press.toLowerCase();
  if(press.equals("enqueue"))
  {
   Enqueue(newarr,len);
  }
  else if(press.equals("dequeue"))
  {
   Dequeue(newarr,len);
  }
  else if(press.equals("done"))
  {
   System.out.println("****************************Thank You****************************");
  }
  else
  {
   System.out.println("****************************EXIT*********************************");
   System.out.println(" ");
   System.out.println("****************************Thank You***************************");
  }  
 }



 void Dequeue(int arr[],int t)
 {
  int newarr[]=new int[t-1];
  System.out.println("Updated QUEUE after Dequeue is");
  int j=0;
  for(int i=1;i<arr.length;i++)
  {
   newarr[j]=arr[i];
   j++;
  }
  int Queue_Empty=0;
  for(int i=0;i<newarr.length;i++)
  {
   System.out.print(newarr[i]+"| ");
   Queue_Empty++;
  }
  if(Queue_Empty!=0)
  {
   int len=newarr.length;
   System.out.println(" ");
   System.out.println("##############################################");
   System.out.println(" ");
   System.out.println("If you want to Enter Element into Queue Press:  ENQUEUE");
   System.out.println("If you want to delete Element in a Queue Press:  DEQUEUE");
   System.out.println("If you want to Exit Press Done ");
   Scanner scan=new Scanner(System.in);
   String press=scan.nextLine();
   press=press.toLowerCase();
   if(press.equals("enqueue"))
   {
    Enqueue(newarr,len);
   }
   else if(press.equals("dequeue"))
   {
    Dequeue(newarr,len);
   }
   else if(press.equals("done"))
   {
    System.out.println("****************************Thank You****************************");
   }
   else
   {
    System.out.println("****************************EXIT*********************************");
    System.out.println(" ");
    System.out.println("****************************Thank You***************************");
   } 
  }
  else
  {
   System.out.println("###############################Queue Is Empty###########################");
   System.out.println("####################################Exit##################################");
   System.out.println("#################################Thank^^you#################################");
  }   
 }



 public static void main(String ar[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no of elements in the queue");
  int n=s.nextInt();
  int a[]=new int[n];
  System.out.println("Enter the Elements in the Queue");
  for(int i=0;i<n;i++)
  {
   a[i]=s.nextInt();
  }
  System.out.println("****************");
  System.out.println("Elements in the Queue are ");
  System.out.println("****************");
  for(int i=0;i<n;i++)
  {
   System.out.print(" "+a[i]+"|");
   
  }
  System.out.println(" ");
  System.out.println("****************");
  System.out.println("If you want to Enter Element into Queue Press:  ENQUEUE");
  System.out.println("If you want to delete Element in a Queue Press:  DEQUEUE");
  System.out.println("If you want to Exit Press Done ");
  Scanner scan=new Scanner(System.in);
  String press=scan.nextLine();
  press=press.toLowerCase();
  //
  Queue q=new Queue();
  if(press.equals("enqueue"))
  {
   q.Enqueue(a,n);
  }
  else if(press.equals("dequeue"))
  {
   q.Dequeue(a,n);
  }
  else if(press.equals("done"))
  {
   System.out.println("****************************Thank You****************************");
  }
  else
  {
   System.out.println("EXIT");
   System.out.println(" ");
   System.out.println("****************************Thank You***************************");
  }  
 }
}