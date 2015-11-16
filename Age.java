import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Age{
public static void main (String args[]){
int age = 0;

 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Please enter your age:");
        
        try {
            age = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } 
System.out.println("Your age is "+age);
if(age>=18){
System.out.println("You are eligible to vote");
}else{
System.out.println("Not eligible for voting");
}
}
}