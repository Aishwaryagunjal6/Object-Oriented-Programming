 import java.util.*;
class generic<T extends Number>{
    void oddeven(ArrayList<T> list){     //ArrayList<Integer> list1= new ArrayList<Integer>();
        ArrayList<T> even= new ArrayList<>();
        ArrayList<T> odd= new ArrayList<>();
        
        for(int i=0; i<list.size(); i++){
            T n=list.get(i);
            if(n.intValue() % 2 == 0){
                even.add(list.get(i));
            }
            else{
                odd.add(list.get(i));
            }
        }
        
        System.out.println("Evenlist: "+ even+ " size: "+even.size());
        System.out.println("Oddlist: "+ odd+ " size: "+odd.size());
    }
    
    void prime(ArrayList<T> list) {
        ArrayList<T> primel = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            T n = list.get(i);
            boolean isPrime = true;

            for (int j = 2; j <n.intValue(); j++) {
                if (n.intValue() % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primel.add(n);
            }
        }

        System.out.println("Primelist: " + primel + " size: " + primel.size());
    }

   
    boolean palindrome(String s){
        String s1 = "";
        int i;
        for (i = s.length()-1; i >= 0; i--){
           s1 += s.charAt(i);
        }
        if (s.equals(s1)){
          return true;
        }
        else return false;
        
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        generic<Integer> g= new generic<Integer>();
        int ch=0;
        while(ch!=3){
            System.out.println("1.list");
            System.out.println("2.string");
            System.out.println("3.exit ");
            System.out.println("Enter choice: ");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                   System.out.println("Enter size: ");
                   int size;
                    size=sc.nextInt();
                    ArrayList<Integer> list= new ArrayList<Integer>();
                    System.out.println("Enter data: ");
                    for(int i=0; i<size; i++){
                     int n;
                     n=sc.nextInt();
                     list.add(n);
                    }
                    g.oddeven(list);
                    g.prime(list);
                break;

                case 2:
                    String s;
                    System.out.println("Enter String: ");
                    s=sc.next();
                    System.out.println("Is palindrome:: "+ g.palindrome(s));
                break;
            }
        }
    }
}