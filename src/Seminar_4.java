import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Seminar_4 {

    public static void main(String[] args) {
        task1();
    }

    static void task0() {

        //📔 **Текст задачи:**
//        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//        2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.


        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list1.add(i);
        }
        long midlle = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list2.add(i);
        }
        long finish = System.currentTimeMillis();

        System.out.println(midlle - start);
        System.out.println(finish - midlle);
    }
    static void task01() {

        //📔 **Текст задачи:**
//        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//        2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
        //        Заполнение идет сначала списка, на нулевую позицию

        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list1.add(0,i);
        }
        long midlle = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list2.add(0,i);
        }
        long finish = System.currentTimeMillis();

        System.out.println(midlle - start);
        System.out.println(finish - midlle);
    }

    static void task1() {

        //        <aside>
        //📔 **Текст задачи:**
        //        Реализовать консольное приложение, которое:
        //
        //        1. Принимает от пользователя строку вида
        //        text~num
        //
        //        1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
        //        2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
        //</aside>

        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Input string: ");
            String line = scanner.nextLine();
            if (line.equals("exit")) {
                System.out.println("Bye!");
                return;
            }
            String[] arr = line.split("~");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];
            switch (text) {
                case "print":
                    System.out.println(list.remove(num));
                    break;
                case "exit":
                    System.out.println("Bye!");
                    work = false;
                    break;
                default:
                    list.add(num, text);
                    System.out.println("String added");
            }

        }

    }
    static void task2() {
// **Текст задачи:**
//        Реализовать консольное приложение, которое:
//
//        1. Принимает от пользователя и “запоминает” строки.
//        2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        3. Если введено revert, удаляет предыдущую введенную строку из памяти.
//
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Input string: ");
            String line = scanner.nextLine();
            if (line.equals("exit")) {
                System.out.println("Bye!");
                return;
            }
            switch (line) {
                case "print":
                    ListIterator iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;
                case "revert":
                    list.removeLast();
                    System.out.println("Element has been deleted");
                    break;
                default:
                    list.add(line);
                    System.out.println("String added");
            }

        }
    }

//Текст задачи:
// Реализовать консольное приложение, которое:
//
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая
// - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.


        static void Task_3() {
            LinkedList<String> list = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);
            boolean work = true;
            while (work) {
                System.out.println("Введите команду : ");
                String line = scanner.nextLine();

                switch (line) {
                    case "print":
                        for (int i = list.size() - 1; i >= 0; i--) {
                            System.out.println(list.get(i));
                        }
                        break;
                    case "revert":
                        list.removeLast();
                        break;
                    case "exit":
                        System.out.println("Пока! ");
                        work = false;
                        break;
                    default:
                        list.add(line);
                }
            }
        }
    }
// Текст задачи:

// 1) Написать метод, который принимает массив элементов,
// помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов,
// помещает их в очередь и выводит на консоль содержимое очереди.


//    public class Task_4 {
//        public static void main(String[] args) {
//            int[] arr = {2, 3, 5, 8, 9, 12, 14, 16, 22, 23};
//            Stack<Integer> stack = new Stack<>();
//            Queue<Integer> queue = new LinkedList<Integer>();
//            for (int i = 0; i < arr.length; i++) {
//                stack.push(arr[i]);
//                queue.add(arr[i]);
//            }
//            while (!stack.isEmpty()) {
//                System.out.print(stack.pop());
//                System.out.print("\t");
//                System.out.println(queue.poll());
//
//            }
//
//        }
//    }
////
//    public class MyStack {
//        //    <aside>
//        //📔 **Текст задачи:**
//        //    Реализовать стэк с помощью массива. Нужно реализовать методы:
//        //
//        //    size(), empty(), push(), peek(), pop().
//        //
//        //</aside>
//        private Integer[] arr = new Integer[16];
//        private int size = 0;
//
//        int size() {
//            return size;
//        }
//
//        boolean empty() {
//            return size == 0;
//        }
//
//        void push(int item) {
//            if (size == arr.length) {
//                Integer[] tempArr = new Integer[arr.length * 2];
//                System.arraycopy(arr, 0, tempArr, 0, arr.length);
//                arr = tempArr;
//            }
//            arr[size++] = item;
//        }
//
//        int peek() {
//            return arr[size - 1];
//        }
//
//        // 1 11 3 4 7
//        int pop() {
//            return arr[--size];
//        }
//
//
//    }
//
//            if(a.length>1)
//
//    {
//        int pivot = a.length / 2;
//        int[] left = Arrays.copyOfRange(a, 0, pivot);
//        int[] right = Arrays.copyOfRange(a, pivot, a.length);
//        mergeSort(left);
//        mergeSort(right);
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while (i < left.length && j < right.length) {
//            if (left[i] < right[j]) {
//                a[k++] = left[i++];
//            } else {
//                a[k++] = right[j++];
//            }
//        }
//        while (i < left.length) {
//            a[k++] = left[i++];
//        }
//        while (j < right.length) {
//            a[k++] = right[j++];
//        }
//
//
//    }
//        return a;

//public class MyStack {
    // <aside>
//📔 **Текст задачи:**
// Реализовать стэк с помощью массива. Нужно реализовать методы:
//
// size(), empty(), push(), peek(), pop().
//
////</aside>
//    private Integer[] arr = new Integer[16];
//    private int size = 0;
//
//    int size(){
//        return size;
//    }
//
//    boolean empty(){
//        return size == 0;
//    }
//
//    void push(int item){
//        if (size == arr.length){
//            Integer[] tempArr = new Integer[arr.length * 2];
//            System.arraycopy(arr, 0, tempArr, 0, arr.length);
//            arr = tempArr;
//        }
//        arr[size++] = item;
//    }
//
//    int peek(){
//        return arr[size-1];
//    }
//    // 1 11 3 4 7
//    int pop(){
//        return arr[--size];
//    }
//
//
//}
//if (a.length > 1) {
//        int pivot = a.length / 2;
//        int[] left = Arrays.copyOfRange(a, 0, pivot);
//        int[] right = Arrays.copyOfRange(a, pivot, a.length);
//        mergeSort(left);
//        mergeSort(right);
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while (i < left.length && j < right.length) {
//        if (left[i] < right[j]) {
//        a[k++] = left[i++];
//        } else {
//        a[k++] = right[j++];
//        } }
//        while (i < left.length) {
//        a[k++] = left[i++];
//        }
//        while (j < right.length) {
//        a[k++] = right[j++];
//        }
//
//
//        }
//        return a;
                    