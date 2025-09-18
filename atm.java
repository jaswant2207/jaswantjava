import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int choice=obj.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Balance Enquiry");
                break;
            case 2:
                System.out.println("Withdraw");
                break;
            case 3:
                System.out.println("Deposit");
                break;
            case 4:
                System.out.println("pin Change");
                break;
                default:
                    System.out.println("Enter 1-4");
        } 
    }
}
