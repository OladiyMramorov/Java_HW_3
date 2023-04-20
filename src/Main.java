import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задания [1, 3] : ");
        int task = scanner.nextInt();
        switch (task)
        {
            case 1 :
                FirstTask.firstTask();
                break;
            case 2 :
                SecondTask.secondTask();
                break;
            case 3 :
                ThirdTask.thirdTask();
                break;
            default :
                System.out.println("Нет такого номера задания :)");
        }
        scanner.close();
    }
}