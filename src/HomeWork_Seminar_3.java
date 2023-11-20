//import java.util.Arrays;
//import java.util.ArrayList;
//
//class Answer {
//    public static void analyzeNumbers(Integer[] arr) {
//        // Введите свое решение ниже
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Minimum is " + arr[0]);
//        System.out.println("Maximum is " + arr[arr.length-1]);
//        int average = 0;
//        int sum = 0;
//        for (int i = 0; i < arr.length ; i++) {
//
//            sum = sum + arr[i];
//
//        }
//        average = sum / arr.length;
//        System.out.println("Average is = " + average);
//
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//class Printer{
//    public static void main(String[] args) {
//        Integer[] arr = {};
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
//        }
//        else{
//            arr = Arrays.stream(args[0].split(", "))
//                    .map(Integer::parseInt)
//                    .toArray(Integer[]::new);
//        }
//
//        Answer ans = new Answer();
//        ans.analyzeNumbers(arr);
//    }
//}
//
//import java.util.LinkedList;
//
//class LLTasks {
//    public static LinkedList<Object> revert(LinkedList<Object> ll) {
//        // Напишите свое решение ниже
//        LinkedList<Object> ll1 = new LinkedList<>();
//        while (!ll.isEmpty()) {
//            ll1.add(ll.removeLast());
//        }
//        return ll1;
//
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//class Printer {
//    public static void main(String[] args) {
//        LinkedList<Object> ll = new LinkedList<>();
//
//        if (args.length == 0 || args.length != 4) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            ll.add(1);
//            ll.add("One");
//            ll.add(2);
//            ll.add("Two");
//        } else {
//            ll.add(Integer.parseInt(args[0]));
//            ll.add(args[1]);
//            ll.add(Integer.parseInt(args[2]));
//            ll.add(args[3]);
//        }
//
//        LLTasks answer = new LLTasks();
//        System.out.println(ll);
//        LinkedList<Object> reversedList = answer.revert(ll);
//        System.out.println(reversedList);
//    }
//}