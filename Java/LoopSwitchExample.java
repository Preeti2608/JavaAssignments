public class LoopSwitchExample {
    public static void main(String[] args) {
        int count = 1;

        // WHILE LOOP: prints numbers from 1 to 5
        System.out.println("\nWhile Loop:");
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }

        // DO-WHILE LOOP: runs at least once
        int num = 6;
        System.out.println("\nDo-While Loop:");
        do {
            System.out.println("Number is: " + num);
            num++;
        } while (num <= 5); // condition is false, but loop runs once

        // SWITCH STATEMENT
        int day = 3;
        System.out.println("\nSwitch Statement:");
        switch (day) {
            case 1:
                System.out.println("It's Monday\n");
                break;
            case 2:
                System.out.println("It's Tuesday\n");
                break;
            case 3:
                System.out.println("It's Wednesday\n");
                break;
            default:
                System.out.println("Other day\n");
        }
    }
}
