import java.util.*;

class Publication{
   Scanner sc= new Scanner(System.in);
   String title;
   double price;
   int copies;
   static double totalsale;
   void getdata(){

       System.out.print("Enter Title : ");
       title=sc.next();
       System.out.print("Enter Price : ");
       price=sc.nextDouble();
       System.out.print("Enter copies : ");
       copies=sc.nextInt();

   }
   void salecopy(){
       System.out.println(" ");
       System.out.println("Total Publication sale : "+ totalsale);
       System.out.println("-------------------------------------------------------");
       System.out.println("");
   }
}
class book extends Publication{
    String author;
    static double totalbooksale;
    void ordercopies(){
        System.out.println("");
        System.out.println("For Books");
        getdata();
        System.out.print("Enter Author name : ");
        author=sc.next();
        System.out.println("-------------------------------------------------------");
        System.out.println("");
    }
    void salecopy(){
        System.out.println("Title of book : "+title);
        System.out.println("Price of book : "+price);
        System.out.println("Ordered Copies : "+copies);
        System.out.println("Author of book: "+author);
        System.out.println(" ");
        totalbooksale=price*copies;
        totalsale+=totalbooksale;
        System.out.println("Total sale for Books : "+totalbooksale);
        System.out.println("Total Publication sale : "+totalsale);
        System.out.println("-------------------------------------------------------");
        System.out.println(" ");
    }

}
class magazine extends Publication{
    String currentissue;
    static double totalmagazinesale;
    void getcurrentissue(){

        System.out.println("For Magazines");
        getdata();
        System.out.print("Enter issue date : ");
        currentissue=sc.next();
        System.out.println("-------------------------------------------------------");
        System.out.println("");
    }
    void salecopy(){
        System.out.println("Title of magazine : "+title);
        System.out.println("Price of magazine : "+price);
        System.out.println("Ordered Copies : "+copies);
        System.out.println("Issue Date : "+currentissue);
        System.out.println(" ");
        totalmagazinesale=price*copies;
        totalsale+=totalmagazinesale;
        System.out.println("Total sale for magazines : "+totalmagazinesale);
        System.out.println("Total Publication sale  : "+totalsale);
        System.out.println("-------------------------------------------------------");
        System.out.println(" ");
    }

}
class main{
    public static int a;
    public static void main(String[] args){
        do{
        Scanner sc= new Scanner(System.in);
        Publication p= new Publication();
        book b= new book();
        magazine m= new magazine();
        
            System.out.println("Enter 1 for Boook");
            System.out.println("Enter 2 for Magazine");
            System.out.println("Enter 3 for Total publication sale");
            System.out.println("Enter 4 for Exit");
            System.out.print("Enter your Choice: ");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    b.ordercopies();
                    b.salecopy();
                    break;

                case 2:
                    m.getcurrentissue();
                    m.salecopy();
                    break;

                case 3:
                    p.salecopy();
                    break;
            }
        }while(a!=4);
    }
}

