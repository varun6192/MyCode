public class PrimeNumbers{
public static void main (String args[]){
	System.out.println("The prime numbers between 1 and 100 numbers are :");
for(int i = 1;i<=100;i++){
int count=0;
for(int j=1;j<=i;j++){
if(i%j == 0){
count++;
}
}
if (count==2){
System.out.print(i);
System.out.print(" ");

}
}

}
}