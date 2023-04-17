import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class program_01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            } else if (input.equals("print")) {
                Collections.reverse(list);
                System.out.println(list);
                Collections.reverse(list);
            } else if (input.equals("revert")) {
                if (!list.isEmpty()) {
                    list.remove(list.size() - 1);
                } else {
                    System.out.println("Список пуст.");
                }
            } else {
                list.add(input);
            }
        }

        scanner.close();
    }
}