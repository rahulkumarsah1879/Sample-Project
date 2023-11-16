import java.util.Scanner;
class Traffic {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Press the button");
        int button=scan.nextInt();
        if(button==1)
        {
            switch(button)
            {
                case 1:
                System.out.println("Stop!The light is red");
                break;
            }
        }
        else if(button==2)
        {
            switch(button)
            {
                case 2:
                    System.out.println("Move ahead,The light is green");
                    break;
            }
        }
        else if(button==3)
        {
            switch(button) {
                case 3:
                    System.out.println("Ready to stop.The light is Yellow");
                    break;
            }
        }
        else
        {
            System.out.println("invalid button");
        }
    }
}
