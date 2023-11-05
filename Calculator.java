import java.util.Scanner;
class Calculator {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the operation you want to perform");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int a= scan.nextInt();
        System.out.println("Enter the first number");
        int num1= scan.nextInt();
        System.out.println("Enter the second number");
        int num2= scan.nextInt();
        if(a==1){
            System.out.println(num1+num2);
        }
        else if(a==2){
            System.out.println(num1-num2);
        }
        else if(a==3){
            System.out.println(num1*num2);
        }
        else if(a==4){
            System.out.println(num1/num2);
        }
    }
}
