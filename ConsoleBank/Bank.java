package ConsoleBank;

public class Bank {
    
    public static void main(String[] args) {
        Banking ob[] = new Banking[50];
        int acc;
        int ch;
        int i=0;
        int j;
        double b;

        do
        {
            System.out.println("Enter 1 to Open Account");
            System.out.println("Enter 2 to Withdrawl");
            System.out.println("Enter 3 to deposit");
            System.out.println("Enter 4 to Exit");

            ch = Banking.sc.nextInt();

            switch (ch) {
                case 1:
                    ob[i] = new Banking();
                    ob[i].open();
                    i++;
                    break;

                case 2:
                    System.out.println("Enter account number to Withdraw: ");
                    acc = Banking.sc.nextInt();
                    for(j=0;j<i;j++)
                    {
                        if (acc == ob[j].getAccount()) {
                            break;
                        }
                    }
                    if(i==j)
                    {
                        System.out.println("No account found.");
                    }
                    else
                    {
                        System.out.println("Enter Balance");
                        b = Banking.sc.nextDouble();
                        ob[j].withdrawl(b);
                    }
                    break;

                case 3:
                    System.out.println("Enter Account Number to Deposit:");
                    acc = Banking.sc.nextInt();
                    for(j=0;j<i;j++)
                    {
                        if (acc == ob[j].getAccount()) {
                            break;
                            
                        }
                    }

                    if(j==i)
                    {
                        System.out.println("Sorry ...No account found");
                    }
                    else
                    {
                        System.out.println("Enter Amount:");
                        b=Banking.sc.nextDouble();
                        ob[j].deposits(b);
                    }
                break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid Input!!!!");
                    break;
            }
        } while(ch!=4);
    }
}
