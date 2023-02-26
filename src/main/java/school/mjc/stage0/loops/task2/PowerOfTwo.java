package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power"); // print error message for negative input
            return;
        }

        int i = 0;
        int value = 1;

        while (i <= power) {
            System.out.println(value);
            i++;
            value *= 2;
        }

    }
}
