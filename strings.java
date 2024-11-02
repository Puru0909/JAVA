 import java.util.*;
 
  /*public class strings {
    public static void main(String args[]) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

Scanner sc = new Scanner(System.in);
String name;
// name = sc.next();
 name = sc.nextLine();
System.out.println(name);


    }
 }*/


 // string lenght
 import java.util.*;
 
 public class strings {
    public static void printletters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    
       /* char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

Scanner sc = new Scanner(System.in);
String name;
// name = sc.next();
 name = sc.nextLine();
System.out.println(name); */


//String fullName = "tony stark";
//System.out.println(fullName.length());

//concatenantion
public static void main(String args[]){
String firstname = "sharda";
String lastname = "khapra";
String fullname = firstname + " " +lastname;

printletters(fullname);
 }
 }