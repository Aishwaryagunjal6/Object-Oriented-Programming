import java.util.*;
class Employee{
   Scanner s=new Scanner(System.in);
    int empid,size;
    String mobile;
    String name, address, mailid;
    public void getdata() {

        System.out.print("Enter employee id : ");
        empid= s.nextInt();
        System.out.print("Enter mobile no.  : ");
        mobile= s.next();
        while(mobile.length()<10 || mobile.length()>10){
                System.out.println("Invalid number!!");
                System.out.print("Enter correct Mobileno. : ");
                mobile=s.next();
        }
        
        System.out.print("Enter name        : ");
        name= s.next();
        System.out.print("Enter address     : ");
        address=s.next();
        System.out.print("Enter mail id     : ");
        mailid= s.next();
    }
    void display(String des) {

        System.out.println("  ");
        System.out.println("Role        : "+des);
        System.out.println("__________________________________________________");
        System.out.println("  ");
        System.out.println("Employee id : "+ empid);
        System.out.println("Mobile no.  : "+ mobile);
        System.out.println("name        : "+ name);
        System.out.println("address     : "+ address);
        System.out.println("mail id     : "+ mailid);
    }
/*}
class Salary{*/

    double bp,da,hra,pf,club,net,gross;
    void getasst() {

        System.out.print("Enter Basic pay : ");
        bp= s.nextDouble();
        da= 0.97*bp;
        hra= 0.1*bp;
        pf= 0.12*bp;
        club= 0.001*bp;
        net= bp+da+hra-pf-club;
        gross= bp+da+hra;
    }
    void calculateasst() {
        System.out.println("__________________________________________________");
        System.out.println(" ");
        System.out.println("Basic pay    :"+bp);
        System.out.println("DA           :"+da);
        System.out.println("HRA          :"+hra);
        System.out.println("club fund    :"+club);
        System.out.println("PF           :"+pf);
        System.out.println("__________________________________________________");
        System.out.println("Gross salary :"+gross);
        System.out.println("Net salary   :"+net);
    }
}
class Programmer extends Employee {
void print(){
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("______________SALARY SLIP FOR PROGRAMMER___________");
    display("Programmer");
    calculateasst();
}

}
class TeamLead extends Employee {

    void print(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("______________SALARY SLIP FOR TEAM LEAD___________");
        display("TeamLead");
        calculateasst();
    }    
}
class AssistantProjectManager extends Employee {
    void print(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("______________SALARY SLIP FOR ASST. PROJECT MANAGER___________");
        display("AssistantProjectManager");
        calculateasst();
    }
}
class ProjectManager extends Employee {
    void print(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("______________SALARY SLIP FOR PROJECT MANAGER___________");
        display("ProjectManager");
        calculateasst();
    }
}

class Main{
    public static int ch;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        do {

            System.out.println("Enter 1 for Programmer");
            System.out.println("enter 2 for TeamLead");
            System.out.println("enter 3 for AssistantProjectManager");
            System.out.println("enter 4 for ProjectManager");
            System.out.println("enter 5 for Exit");

            ch = s.nextInt();


                switch (ch) {
                    case 1:
                        Programmer e = new Programmer();
                        e.getdata();
                        e.getasst();
                        e.print();
                        break;
                    case 2:
                        TeamLead t = new TeamLead();
                        t.getdata();
                        t.getasst();
                        t.print();
                        break;
                    case 3:
                        AssistantProjectManager a = new AssistantProjectManager();
                        a.getdata();
                        a.getasst();
                        a.print();
                        break;
                    case 4:
                        ProjectManager p = new ProjectManager();
                        p.getdata();
                        p.getasst();
                        p.print();
                        break;
                    case 5:
                        System.out.println("Exit..");
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            System.out.println(" ");

        } while (ch!=5);
    }
}
