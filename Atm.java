import java.util.Scanner;
class Atm {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the PIN");
        int pin=scan.nextInt();
        System.out.println("Press the Button");
        int button= scan.nextInt();
            if(pin==1234)
            {
                switch (button)
                {
                    case 1:
                        System.out.println("Statement");
                        break;
                    case 2:
                        System.out.println("Balance Enquiry");
                        break;
                    case 3:
                        System.out.println("Mobile Number Change");
                        break;
                    case 4:
                        System.out.println("Deposit");
                        break;
                    case 5:
                        System.out.println("Withdraw");
                        break;
                    case 6:
                        System.out.println("Cancel");
                }
            }
            else
            {
                System.out.println("Wrong Pin");
            }
    }
}
