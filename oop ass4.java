import java.util.Scanner;
abstract class shape{
    double val1;
    double val2;
    
    void input(){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter value 1 : " );
        val1= sc.nextDouble();
        System.out.println("Enter value 2 : " );
        val2= sc.nextDouble();
    }
    
    abstract void computearea();
}

class traingle extends shape{
    void computearea(){
        double area;
        area=0.5*val1*val2;
        System.out.println("area of triangle is :" + area);
        
    }
}

class rectangle extends shape{
    void computearea(){
        double area;
        area=val1*val2;
        System.out.println("area of rectangle is :" + area);
        
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
             System.out.println("choose the shape : ");
             System.out.println("1. Triangle \n2.Reactangle \n3.exit ");
             System.out.println("enter choice ");
             ch= sc.nextInt();
             
             switch(ch){
                 case 1:
                     shape s=new traingle();
                     s.input();
                     s.computearea();
                     break;
                     
                case 2:
                     shape r=new rectangle();
                     r.input();
                     r.computearea();
                     break;
                     
                case 3:
                    System.out.println("exit ");
                    break;
                
                default:
                System.out.println("invalid choice ");
             }
             }while(ch!=3);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    










