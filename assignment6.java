import java.util.*;
class ArrayIndexOutOfBoundsclass{  //for ArrayIndexOutOfBoundsException
    Scanner sc= new Scanner(System.in);
    
    public void arrayindexexp(){
   // int[] arr={15,25,48,95,76,35,46}    general way to declare an ArrayIndexOutOfBoundsException
   try{
   int size, index;
   System.out.println("Enter size: ");
   size=sc.nextInt();
   
   int arr[]= new int[size];
   for(int i=0; i<size; i++){
       System.out.println("Enter data: ");
       arr[i]=sc.nextInt();
   }
    System.out.println("Enter the index value: ");
    index=sc.nextInt();
    
    System.out.println("Element at index "+index+" is: "+arr[index]);
    
   }catch(ArrayIndexOutOfBoundsException e){
       System.out.println(e+" Trying to acces the wrong index");
   }
 } 
}
class numberformatandarithmeticexception{
    Scanner sc=new Scanner(System.in);
    public float division(int num1 , int num2){
        float result= num1/ num2;
        return result;
    }
    public void numberformatAndarithmeticExpn(){
        try{
            System.out.println("Enter Num1: ");
            String num1=sc.next();
            System.out.println("Enter Num2: ");
            String num2=sc.next();
            
            System.out.println("Division of "+num1+" & "+num2+" is :"+division(Integer.parseInt(num1), Integer.parseInt(num2)));
            
        }catch(ArithmeticException e){
            System.out.println(e+" Cannot divide an number by zero");
        }
        catch(NumberFormatException e){
            System.out.println(e+" Please enter integer values");
        }
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice=0;
        while(choice!=3){
            System.out.println("1.Arrayindexoutofbound exp");
            System.out.println("2.Arithmetic exp");
            System.out.println("3.exit");
            System.out.print("Enter choice: ");
            choice=sc.nextInt();
             switch(choice){
                 case 1:
                 ArrayIndexOutOfBoundsclass obj1= new ArrayIndexOutOfBoundsclass();
                 obj1.arrayindexexp();
                 break;
                 
                 case 2:
                 numberformatandarithmeticexception obj2= new numberformatandarithmeticexception();
                 obj2.numberformatAndarithmeticExpn();
                 break;
                 
                 case 3:
                 System.out.println("Successfully exited!");
                 break;
                 
                 default:
                 System.out.println("Invalid input!");
             }
        }
    }
}






























