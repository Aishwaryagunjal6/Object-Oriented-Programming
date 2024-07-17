/* 
Assignment No.8
Title:- File Handling.

Problem Statement:- Implement a program for maintaining a database of student records using Files. 
Student has Student_id, name, Roll_no, Class, marks and address. Display the data for few students. 
1. Create Database 
2. Display Database 
3. Delete Records 
4. Update Record 
5. Search Record 

*/

//CODE

// FILE NAME: Assignment_8.java

import java.util.*;
import java.io.*;

public class Assignment_8
{
   public static void main(String [] args)
    {
        int op;
        Scanner sc = new Scanner(System.in);
        StudentRecords sr = new StudentRecords();
    
        while(true)
        {
            System.out.println("1 - Add Record\n2 - Update Record\n3 - Display Record\n4 - Search Record\n5 - Delete Record\n6 - Clear All Records\n7 - Exit");
            System.out.println();
            op = sc.nextInt();
            System.out.println();
            switch(op)
            {
                case 1: sr.addRecord();
                break;
                
                case 2: sr.updateRecord();
                break;
                
                case 3: sr.displayRecords();
                break;
                
                case 4: sr.searchRecords();
                break;
                
                case 5: sr.deleteRecord();
                break;
                
                case 6: sr.clearRecords();
                break;
                
                case 7: sr.exit();
                break;
                
                default: System.out.println("Invalid input.");
            }
            
        }  
    }  
}


// FILE NAME: StudentRecords.java
import java.util.*;
import java.io.*;

public class StudentRecords
{
    static void addRecord()
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("st.txt")));
            String stdName, address;
            
            int stdId, rollNo, std;
            float marks;
            String s;
            boolean addMore = false;
            
            do
            {
                System.out.print("\nEnter student's name: ");
                stdName = br.readLine();
                
                System.out.print("\nEnter student's id: ");
                stdId = Integer.parseInt(br.readLine());
                
                System.out.print("\nEnter student's roll number: ");
                rollNo = Integer.parseInt(br.readLine());
                
                System.out.print("\nEnter address: ");
                address = br.readLine();
                
                System.out.print("\nEnter student's class: ");
                std = Integer.parseInt(br.readLine());
                
                System.out.print("\nEnter marks: ");
                marks = Float.parseFloat(br.readLine());
                
                pw.println(stdName + " " + stdId + " " + rollNo + " " + address + " " + std + " " + marks);
                System.out.print("\nRecord added successfully.\nDo you want to add more?(Y/N): ");
                
                s = br.readLine();
                if(s.equalsIgnoreCase("Y"))
                {
                    addMore = true;
                }
                else
                {
                    addMore = false;
                }
                
            }
            while(addMore);
            
            pw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    static void deleteRecord()
    {
        try
        {
            BufferedReader file1 = new BufferedReader(new FileReader("st.txt"));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("st1.txt", true)));
            String name;
            int flag = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the name of the student you want to delete: ");
            String searchName = sc.nextLine();
            
            while((name = file1.readLine())!=null)
            {
                String[]line = name.split(" ");
                if(!searchName.equalsIgnoreCase(line[0]))
                {
                    pw.println(name);
                    flag = 0;
                }
                else
                {
                    line[0] = "-";
                    line[1] = "-";
                    line[2] = "-";
                    line[3] = "-";
                    line[4] = "-";
                    pw.println(line[0] + " "+ line[1] + " " + line[2] + " " + line[3] + " " +line[4]); 
                    flag = 1;
                    while((name = file1.readLine())!=null)
                    {
                        pw.println(name);
                    }
                    break;
                }
            }

            file1.close();
            pw.close();
            if(flag == 1)
            {
                File delName = new File("st.txt");
                File oldName = new File("st1.txt");
                File newName = new File("st.txt");
                
                if(delName.delete())
                {
                    System.out.println("Record deleted successfully.");
                }
                
                else
                {
                    System.out.println("Error.");
                }
                
                if(oldName.renameTo(newName))
                {
                pw.close();
                    if(flag == 1)
                    {
                        File del_Name = new File("st.txt");
                        File old_Name = new File("st1.txt");
                        File new_Name = new File("st.txt");
                        
                        if(del_Name.delete())
                        {
                            System.out.println("Record deleted successfully.");
                        }
                        
                        else
                        {
                            System.out.println("Error.");
                        }
                        
                        if(old_Name.renameTo(newName))
                        {
                            System.out.println("Renamed successfully.");
                        }
                        
                        else
                        {
                            System.out.println("Error.");
                        }
                    }
                    
                    else
                    {
                        System.out.println("Record not found.");
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    static void updateRecord()
    {
        try
        {
            BufferedReader file1 = new BufferedReader(new FileReader("st.txt"));
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("st1.txt")));
            
            String name;
            int flag = 0;
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter the name of the student you want to update: ");
            String searchName = sc.nextLine();
            
            while((name = file1.readLine())!=null)
            {
                String[]line = name.split(" ");
                if(!searchName.equalsIgnoreCase(line[0]))
                {
                    pw.println(name);
                    flag = 0;
                }
                
                else
                {
                    System.out.println("Record found.");
                    System.out.println("Enter updated marks: ");
                    
                    float up_mark = sc.nextFloat();
                    pw.println(line[0]+" "+line[1]+" "+line[2]+" "+line[3]+" "+line[4]+" "+up_mark);
                    flag = 1;
                    
                    while((name = file1.readLine())!=null)
                    {
                        pw.println(name);
                    }
                break;
                }
            }
            
            file1.close();
            pw.close();
            if(flag == 1)
            {
                File delName = new File("st.txt");
                File oldName = new File("st1.txt");
                File newName = new File("st.txt");
                
                if(delName.delete())
                {
                    System.out.println("Record updated successfully.");
                }
                
                else
                {
                    System.out.println("Error.");
                }
                
                if(oldName.renameTo(newName))
                {
                    System.out.println("Renamed successfully.");
                }
                else
                {
                    System.out.println("Error.");
                }
            }
           
            else
            {
                System.out.println("Record not found.");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    static void searchRecords()
    {
        try
        {
            BufferedReader file = new BufferedReader(new FileReader("st.txt"));
            String name;
            int flag = 0;
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter the id of the student you want to search: ");
            String searchName = sc.nextLine();
            
            while((name = file.readLine())!= null)
            {
                String[]line = name.split(" ");
                if(searchName.equalsIgnoreCase(line[1]))
                {
                    System.out.println("Record found.");
                    System.out.println(name);
                    System.out.println();
                    
                    flag = 1;
                    break;
                }
            }
            
            if(flag == 0)
            {
                System.out.println("Record not found.");
            }
            
            file.close();      
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    static void displayRecords()
    {
        try
        {
            BufferedReader file = new BufferedReader(new FileReader("st.txt"));
            String name;
            int i = 1;
            
            while((name = file.readLine())!= null)
            {
                System.out.println(name);
                System.out.println("\n");
            }
            
            file.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    static void clearRecords()
    {
        try
        {
            File delName = new File("st.txt");
            if(delName.delete())
            {
                System.out.println("Cleared records.");
            }
            
            else
            {
                System.out.println("Error.");
            }
            
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("st.txt")));
            pw.close();
            System.out.println("All records are cleared successfully.");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    static void exit()  
    {
        System.exit(0);
    }
}


// Output:
/*

1 - Add Record
2 - Update Record
3 - Display Record
4 - Search Record
5 - Delete Record
6 - Clear All Records
7 - Exit

1


Enter student's name: Yogesh

Enter student's id: 9

Enter student's roll number: 27009

Enter address: Moshi

Enter student's class: 12

Enter marks: 88

Record added successfully.
Do you want to add more?(Y/N): Y

Enter student's name: Gaurav

Enter student's id: 10

Enter student's roll number: 27010

Enter address: Bhosari

Enter student's class: 12

Enter marks: 85

Record added successfully.
Do you want to add more?(Y/N): Y

Enter student's name: Abhay

Enter student's id: 15

Enter student's roll number: 27015

Enter address: Pune

Enter student's class: 12

Enter marks: 80

Record added successfully.
Do you want to add more?(Y/N): N
1 - Add Record
2 - Update Record
3 - Display Record
4 - Search Record
5 - Delete Record
6 - Clear All Records
7 - Exit

2

Enter the name of the student you want to update: Abhay
Record found.
Enter updated marks: 
84
Record updated successfully.
Renamed successfully.
1 - Add Record
2 - Update Record
3 - Display Record
4 - Search Record
5 - Delete Record
6 - Clear All Records
7 - Exit

3

Yogesh 9 27009 Moshi 12 88.0


Gaurav 10 27010 Bhosari 12 85.0


Abhay 15 27015 Pune 12 84.0


1 - Add Record
2 - Update Record
3 - Display Record
4 - Search Record
5 - Delete Record
6 - Clear All Records
7 - Exit

4

Enter the id of the student you want to search: 15
Record found.
Abhay 15 27015 Pune 12 84.0

1 - Add Record
2 - Update Record
3 - Display Record
4 - Search Record
5 - Delete Record
6 - Clear All Records
7 - Exit

5

Enter the name of the student you want to delete: Abhay
Record deleted successfully.
Record deleted successfully.

1 - Add Record
2 - Update Record
3 - Display Record
4 - Search Record
5 - Delete Record
6 - Clear All Records
7 - Exit

6

All records are cleared successfully.

1 - Add Record
2 - Update Record
3 - Display Record
4 - Search Record
5 - Delete Record
6 - Clear All Records
7 - Exit

7


*/