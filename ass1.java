import java.util.Scanner;
public class Complex {
    double real, img;

    Complex() {
        real = 0;
        img = 0;
    }
    Complex(double r, double i) {
        real = r;
        img = i;
    }
    Complex Add(Complex c1, Complex c2){
        Complex temp= new Complex();
        temp.real= c1.real +c2.real;
        temp.img= c1.img+ c2.img;
        return temp;
    }
    Complex Sub(Complex c1, Complex c2){
        Complex temp= new Complex();
        temp.real= c1.real -c2.real;
        temp.img= c1.img- c2.img;
        return temp;
    }
    Complex Multiply(Complex c1, Complex c2){
        Complex temp= new Complex();
        temp.real= (c1.real*c2.real)-(c1.img*c2.img);
        temp.img= (c1.real*c2.img)+(c1.img*c2.real);
        return temp;
    }
    Complex Divide(Complex c1, Complex c2){
        Complex temp= new Complex();
        temp.real= ((c1.real*c2.real)+(c1.img*c2.img))/((c2.real*c2.real)+(c2.img*c2.img));
        temp.img= ((c1.img*c2.real)-(c1.real*c2.img))/((c2.real*c2.real)+(c2.img*c2.img));
        return temp;
    }
}
class main{
    public static void main(String[] args) {
        double r, i;
        int ch;
        String s;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of first number : ");
        r = sc.nextDouble();
        System.out.print("Enter imaginary part of first number : ");
        i = sc.nextDouble();
        Complex c1 = new Complex(r, i);

        System.out.print("Enter real part of second number : ");
        r = sc.nextDouble();
        System.out.print("Enter imaginary part of second number : ");
        i = sc.nextDouble();
        Complex c2 = new Complex(r, i);

        System.out.println("c1= " + c1.real + "+" + c1.img + "i");
        System.out.println("c2= " + c2.real + "+" + c2.img + "i");

        do {
            ch=0;
            System.out.println("Enter 1 for Addition ");
            System.out.println("Enter 2 for Subtraction ");
            System.out.println("Enter 3 for Multiplication ");
            System.out.println("Enter 4 for Division ");
            System.out.println("Enter 5 for Exit ");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            Complex res = new Complex();
            while(ch!=5) {
            switch (ch) {
                case 1:
                    res = c1.Add(c1, c2);
                    System.out.println("Addition is: " + res.real + "+" + res.img + "i");
                    break;

                case 2:
                    res = c1.Sub(c1, c2);
                    System.out.println("Subtraction is: " + res.real + "+" + res.img + "i");
                    break;

                case 3:
                    res = c1.Multiply(c1, c2);
                    System.out.println("Multiplication is: " + res.real + "+" + res.img + "i");
                    break;

                case 4:
                    res = c1.Divide(c1, c2);
                    System.out.println("Division is: " + res.real + "+" + res.img + "i");
                    break;
                case 5:
                    ch = 5;
                    System.out.println("Exit..");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            break;
        }
            System.out.println("Do you want to continue? (y/n)");
            s=sc.next();

        }while (s.equals("y"));
    }
}
