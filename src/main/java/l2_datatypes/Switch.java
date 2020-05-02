package l2_datatypes;

public class Switch {
    public static void main(String[] args) {

        int dayOrdinalNumber = 1;
//        double dayOrdinalNumber = 1;
//        String dayOrdinalNumber = "1";
        switch (dayOrdinalNumber) {

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Other day");
        }
    }
}
