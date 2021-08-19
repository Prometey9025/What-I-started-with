import java.util.*;

import java.util.stream.Collectors;

// Две очереди, преобразовать в стек

public class andr {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите элементы первой очереди через пробелы:");

        String elements = sc.nextLine();

        List<String> items = Arrays.stream(elements.split(" "))

                .collect(Collectors.toList());

        LinkedList<Integer> queue1 = new LinkedList<>();

        for(int i = 0; i < items.size(); i++){

            queue1.add(Integer.parseInt(items.get(i)));

        }

        System.out.println("Введите элементы второй очереди через пробелы:");

        elements = sc.nextLine();

        items = Arrays.stream(elements.split(" "))

                .collect(Collectors.toList());

        LinkedList<Integer> queue2 = new LinkedList<>();

        for(int i = 0; i < items.size(); i++){

            queue2.add(Integer.parseInt(items.get(i)));

        }

        System.out.println("Введите команду:\n" +

                "1 - Вставка элемента;\n" +

                "2 - Удаление элемента;\n" +

                "3 - Просмотр элемента;\n" +

                "4 - Вывести массив;\n" +

                "5 - Преобразовать в стек;\n" +

                "6 - Выход.");

        int command;

        while(true) {

            System.out.println("Выберите команду:");

            command = sc.nextInt();

            if(command == 6) {

                break;

            }

            switch(command){

                case(1):

                    while (true) {

                        System.out.println("Выберите очередь: 1 или 2");

                        command = sc.nextInt();

                        System.out.println("Введите элемент:");

                        int element = sc.nextInt();

                        if (command == 1) {

                            queue1.addFirst(element);

                            break;

                        } else if (command == 2) {

                            queue2.addFirst(element);

                            break;

                        } else {

                            System.out.println("Некорректный ввод!");

                        }

                    }

                    break;

                case(2):

                    while (true) {

                        System.out.println("Выберите очередь: 1 или 2");

                        command = sc.nextInt();

                        if (command == 1) {

                            queue1.removeLast();

                            break;

                        } else if (command == 2) {

                            queue2.removeLast();

                            break;

                        } else {

                            System.out.println("Некорректный ввод!");

                        }

                    }

                    break;

                case(3):

                    while (true) {

                        System.out.println("Выберите очередь: 1 или 2");

                        command = sc.nextInt();

                        System.out.println("Введите номер элемента элемента:");

                        int number = sc.nextInt();

                        if (command == 1) {

                            System.out.println(queue1.get(number - 1));

                            break;

                        } else if (command == 2) {

                            System.out.println(queue2.get(number - 1));

                            break;

                        } else {

                            System.out.println("Некорректный ввод!");

                        }

                    }

                    break;

                case(4):

                    while (true) {

                        System.out.println("Выберите очередь: 1 или 2");

                        command = sc.nextInt();

                        if (command == 1) {

                            System.out.print("Первая очередь: ");

                            for(int i: queue1)

                                System.out.print(i + " ");

                            System.out.print("\n");

                            break;

                        } else if (command == 2) {

                            System.out.print("Вторая очередь: ");

                            for(int i: queue1)

                                System.out.print(i + " ");

                            System.out.print("\n");

                            break;

                        } else {

                            System.out.println("Некорректный ввод!");

                        }

                    }

                    break;

                case(5):

                    ArrayList<Integer> stack = new ArrayList<>();

                    stack.addAll(queue1);

                    stack.addAll(queue2);

                    System.out.println("Введите команду:\n" +

                            "1 - Вставка элемента;\n" +

                            "2 - Удаление элемента;\n" +

                            "3 - Вывести стек;\n" +

                            "4 - Вернуться обратно.");

                    while (true){

                        command = sc.nextInt();

                        if(command == 1){

                            System.out.println("Введите элемент:");

                            int element = sc.nextInt();

                            stack.add(element);

                        }else if(command == 2){

                            stack.remove(stack.size() - 1);

                        }else if(command == 3){

                            System.out.print("Стек: ");

                            for(int i = stack.size() - 1; i >= 0; i--){

                                System.out.print(stack.get(i) + " ");

                            }

                            System.out.print("\n");

                        }else if(command == 4){

                            break;

                        }

                    }

                    break;

                default:

                    System.out.println("Введите правильную команду!");

            }

        }

    }

}