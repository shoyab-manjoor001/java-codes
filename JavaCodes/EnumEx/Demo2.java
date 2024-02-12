package EnumEx;

public class Demo2 {

    public static void main(String[] args) {

        // use of if else with enum...
        Status s = Status.INPROGRESS;
        if (s == Status.SUCCESS)
            System.out.println("Done...");
        else if (s == Status.DENY) {
            System.out.println("something went wrong...");
        } else if (s == Status.FAILURE) {
            System.out.println("retry...");
        } else {
            System.out.println("please wait...");
        }

        // use of switch wit enum...
        Status s2 = Status.SUCCESS;

        switch (s2) {
            case INPROGRESS:
                System.out.println("Please wait...");
                break;
            case FAILURE:
                System.out.println("try again");
                break;
            case DENY:
                System.out.println("something went wrong..");
                break;
            default:
                System.out.println("Done...");
                break;
        }
    }
}
