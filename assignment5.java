import java.util.Scanner;
interface vehicle{
    public void startvehicle();
    public void increasespeed();
    public void decreasespeed();
    public void changegear();
    public void applybreaks();
}
class Bicycle implements vehicle{
    Scanner sc=new Scanner(System.in);
    public static int speed;
    public static int ch=1;
    @Override
    public void startvehicle(){
        System.out.println("Enter your current speed: ");
        speed= sc.nextInt();
        System.out.println("Started vehicle!! ");
    }
    public void increasespeed() {
        System.out.println("-------------------------------------------");
        System.out.println("Your current speed is: "+speed);
        System.out.println("Increase your speed by: ");
        int i= sc.nextInt();
        speed+=i;
        System.out.println("New Speed is: "+speed);
        System.out.println("-------------------------------------------");
        System.out.println("");

    }
    public void decreasespeed(){
        System.out.println("-------------------------------------------");
        System.out.println("Your current speed is: "+speed);
        System.out.println("Decrease your speed by: ");
        int j= sc.nextInt();
        speed-=j;
        System.out.println("-------------------------------------------");
        System.out.println("New Speed is: "+speed);
        System.out.println("-------------------------------------------");
        System.out.println("");

    }
    @Override
    public void applybreaks() {
        System.out.println("-------------------------------------------");
        System.out.println("Applying the breaks... ");
        System.out.println("Now the vehicle is stopped & speed is: 0");
        speed=0;
        System.out.println("-------------------------------------------");
        System.out.println("");
    }
    
    @Override
    public void changegear() {

        if(speed==0){
            System.out.println("-------------------------------------------");
            System.out.println("Vehicle is stopped now. First increase the speed");
            System.out.println("Current spped is: "+speed);
            System.out.println("Starting the vehicle..");
            startvehicle();
        }
        System.out.println("Currently you are in gear "+ch);
        System.out.println("Enter the number of gear you want to apply: ");
        ch=sc.nextInt();
        while(ch==2){
            if(speed>=30){
                System.out.println("-------------------------------------------");
                System.out.println("Gear applied successfully");
                System.out.println("-------------------------------------------");
                System.out.println("");
                break;
            }
            else {
                System.out.println("-------------------------------------------");
                System.out.println("increase speed above 30 kmph");
                increasespeed();
            }
        }
        while(ch==3){
            if(speed>=50){
                System.out.println("-------------------------------------------");
                System.out.println("Gear applied successfully");
                System.out.println("-------------------------------------------");
                break;
            }
            else {
                System.out.println("-------------------------------------------");
                System.out.println("increase speed above 50 kmph");
                increasespeed();
            }
        }
        while(ch==4){
            if(speed>=70){
                System.out.println("-------------------------------------------");
                System.out.println("Gear applied successfully");
                System.out.println("-------------------------------------------");
                break;
            }
            else {
                System.out.println("-------------------------------------------");
                System.out.println("increase speed above 70 kmph");
                increasespeed();
            }
        }
        if(ch>4 || ch<1) {
            System.out.println("-------------------------------------------");
            System.out.println("Wrong gear!!" + "Try again..");
            System.out.println("-------------------------------------------");
            System.out.println("");
        }
    }
    void checkcurrentspeed(){
        System.out.println("-------------------------------------------");
        System.out.println("Current speed is: "+speed);
        System.out.println("-------------------------------------------");
        System.out.println("");
    }
    void checkcurrentgear(){
        System.out.println("-------------------------------------------");
        System.out.println("Current gear is: "+ch);
        System.out.println("-------------------------------------------");
        System.out.println("");
    }
}
class Bike implements vehicle{
       Scanner sc=new Scanner(System.in);
    public static int speed;
    public static int ch=1;
    @Override
    public void startvehicle(){
        System.out.println("Enter your current speed: ");
        speed= sc.nextInt();
        System.out.println("Started vehicle!! ");
    }
    public void increasespeed() {
        System.out.println("-------------------------------------------");
        System.out.println("Your current speed is: "+speed);
        System.out.println("Increase your speed by: ");
        int i= sc.nextInt();
        speed+=i;
        System.out.println("New Speed is: "+speed);
        System.out.println("-------------------------------------------");
        System.out.println("");

    }
    public void decreasespeed(){
        System.out.println("-------------------------------------------");
        System.out.println("Your current speed is: "+speed);
        System.out.println("Decrease your speed by: ");
        int j= sc.nextInt();
        speed-=j;
        System.out.println("-------------------------------------------");
        System.out.println("New Speed is: "+speed);
        System.out.println("-------------------------------------------");
        System.out.println("");

    }
    @Override
    public void applybreaks() {
        System.out.println("-------------------------------------------");
        System.out.println("Applying the breaks... ");
        System.out.println("Now the vehicle is stopped & speed is: 0");
        speed=0;
        System.out.println("-------------------------------------------");
        System.out.println("");
    }
    
    @Override
    public void changegear() {

        if(speed==0){
            System.out.println("-------------------------------------------");
            System.out.println("Vehicle is stopped now. First increase the speed");
            System.out.println("Current spped is: "+speed);
            System.out.println("Starting the vehicle..");
            startvehicle();
        }
        System.out.println("Currently you are in gear "+ch);
        System.out.println("Enter the number of gear you want to apply: ");
        ch=sc.nextInt();
        while(ch==2){
            if(speed>=30){
                System.out.println("-------------------------------------------");
                System.out.println("Gear applied successfully");
                System.out.println("-------------------------------------------");
                System.out.println("");
                break;
            }
            else {
                System.out.println("-------------------------------------------");
                System.out.println("increase speed above 30 kmph");
                increasespeed();
            }
        }
        while(ch==3){
            if(speed>=50){
                System.out.println("-------------------------------------------");
                System.out.println("Gear applied successfully");
                System.out.println("-------------------------------------------");
                break;
            }
            else {
                System.out.println("-------------------------------------------");
                System.out.println("increase speed above 50 kmph");
                increasespeed();
            }
        }
        while(ch==4){
            if(speed>=70){
                System.out.println("-------------------------------------------");
                System.out.println("Gear applied successfully");
                System.out.println("-------------------------------------------");
                break;
            }
            else {
                System.out.println("-------------------------------------------");
                System.out.println("increase speed above 70 kmph");
                increasespeed();
            }
        }
        if(ch>4 || ch<1) {
            System.out.println("-------------------------------------------");
            System.out.println("Wrong gear!!" + "Try again..");
            System.out.println("-------------------------------------------");
            System.out.println("");
        }
    }
    void checkcurrentspeed(){
        System.out.println("-------------------------------------------");
        System.out.println("Current speed is: "+speed);
        System.out.println("-------------------------------------------");
        System.out.println("");
    }
    void checkcurrentgear(){
        System.out.println("-------------------------------------------");
        System.out.println("Current gear is: "+ch);
        System.out.println("-------------------------------------------");
        System.out.println("");
    }
    
}
class Main{
    public static int ch;
    public static int a;
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Bicycle bi= new Bicycle();
        Bike b= new Bike();
        while(a!=3){
        System.out.println("Enter 1 for Bicycle");
        System.out.println("Enter 2 for Bike");
        System.out.println("Enter 3 for Exit");
        System.out.println("Enter your choice:");
        a=sc.nextInt();
        switch(a){
            case 1:
                while(ch!=8) {
                    System.out.println("Enter 1 tostart vehicle");
                    System.out.println("Enter 2 for increase speed");
                    System.out.println("Enter 3 for decrease speed");
                    System.out.println("Enter 4 for apply breaks");
                    System.out.println("Enter 5 for change gear");
                    System.out.println("Enter 6 for checking current speed");
                    System.out.println("Enter 7 for checking current gear");
                    System.out.println("Enter 8 for Exit");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            bi.startvehicle();
                            break;

                        case 2:
                            bi.increasespeed();
                            break;

                        case 3:
                            bi.decreasespeed();
                            break;

                        case 4:
                            bi.applybreaks();
                            break;

                        case 5:
                            bi.changegear();
                            break;

                        case 6:
                            bi.checkcurrentspeed();
                            break;

                        case 7:
                            bi.checkcurrentgear();
                            break;
                            
                        case 8:
                            System.out.println("Exiting Bicycle..");
                    }
                }

            case 2:
                while(ch!=7) {
                    System.out.println("Enter 1 tostart vehicle");
                    System.out.println("Enter 2 for increase speed");
                    System.out.println("Enter 3 for decrease speed");
                    System.out.println("Enter 4 for apply breaks");
                    System.out.println("Enter 5 for change gear");
                    System.out.println("Enter 6 for checking current speed");
                    System.out.println("Enter 7 for checking current gear");
                    System.out.println("Enter 8 for Exit");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            b.startvehicle();
                            break;

                        case 2:
                            b.increasespeed();
                            break;

                        case 3:
                            b.decreasespeed();
                            break;

                        case 4:
                            b.applybreaks();
                            break;

                        case 5:
                            b.changegear();
                            break;

                        case 6:
                            b.checkcurrentspeed();
                            break;

                        case 7:
                            b.checkcurrentgear();
                            break;

                        case 8:
                            System.out.println("Exiting Bike..");
                    }
                }

            
        }
    } 
    }
}