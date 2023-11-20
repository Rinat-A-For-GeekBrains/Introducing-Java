/*
//import java.util.ArrayDeque;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public static void main(String[]args){
//
//
//public class HomeWork_Seminar_4 {
//
//   class LLTasks {
//        public static LinkedList<Object> revert(LinkedList<Object> ll) {
//            // Напишите свое решение ниже
//            LinkedList<Object> ll1 = new LinkedList<>();
//            while (!ll.isEmpty()) {
//                ll1.add(ll.removeLast());
//            }
//            return ll1;
//        }
//
//    }
//
//    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//    public class Printer{
//        public static void main(String[] args) {
//            LinkedList<Object> ll = new LinkedList<>();
//
//            if (args.length == 0 || args.length != 4) {
//                // При отправке кода на Выполнение, вы можете варьировать эти параметры
//                ll.add(1);
//                ll.add("One");
//                ll.add(2);
//                ll.add("Two");
//            } else {
//                ll.add(Integer.parseInt(args[0]));
//                ll.add(args[1]);
//                ll.add(Integer.parseInt(args[2]));
//                ll.add(args[3]);
//            }
//
//            LLTasks answer = new LLTasks();
//            System.out.println(ll);
//            LinkedList<Object> reversedList = answer.revert(ll);
//            System.out.println(reversedList);
//        }
//    }
//}
//
//
//class MyQueue<T> {
//    // Напишите свое решение ниже
//    LinkedList<T> list = new LinkedList<>()
//    public void enqueue(T element){
//        // Напишите свое решение ниже
//        list.addLast(element);
//    }
//
//    public T dequeue(){
//        // Напишите свое решение ниже
//      return list.removeFirst();
//    }
//
//    public T first(){
//        // Напишите свое решение ниже
//
//    }
//
//    public LinkedList<T> getElements() {
//        // Напишите свое решение ниже
//
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer {
//    public static void main(String[] args) {
//        MyQueue<Integer> queue;
//        queue = new MyQueue<>();
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            queue.enqueue(1);
//            queue.enqueue(10);
//            queue.enqueue(15);
//            queue.enqueue(5);
//        } else {
//            queue.enqueue(Integer.parseInt(args[0]));
//            queue.enqueue(Integer.parseInt(args[1]));
//            queue.enqueue(Integer.parseInt(args[2]));
//            queue.enqueue(Integer.parseInt(args[3]));
//        }
//
//        System.out.println(queue.getElements());
//
//        queue.dequeue();
//        queue.dequeue();
//        System.out.println(queue.getElements());
//
//        System.out.println(queue.first());
//    }
//}

import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {
    ArrayDeque<Integer> buffer = new ArrayDeque<>();
    Integer previousOperation;

    public int calculate(char op, int a, int b) {
        // Напишите свое решение ниже

        int res = 0;

        switch (op) {
            case '+':
                res = a + b;
                if (previousOperation != null) {
                    buffer.add(previousOperation);
                }

                break;
            case '-':
                res = a - b;
                if (previousOperation != null) {
                    buffer.add(previousOperation);
                }
                break;
            case '*':
                res = a * b;
                if (previousOperation != null) {
                    buffer.add(previousOperation);
                }
                break;
            case '/':
                res = a / b;
                if (previousOperation != null) {
                    buffer.add(previousOperation);
                }
                break;
            case '<':
                if (previousOperation != null) {
                    res = buffer.pollLast();
                }
                break;
            default:
                System.out.println("Некорректный оператор:" + op + "'");
        }
        previousOperation = res;
        return res;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Printer {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);
        int result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        int prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}
*/
