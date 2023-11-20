//import java.util.Arrays;
//
//class HeapSort {
//    public static void buildTree(int[] tree, int sortLength) {
//        // Введите свое решение ниже
//        for (int i = sortLength / 2 - 1; i >= 0; i--) {
//            heapify(tree, sortLength, i);
//        }
//    }
//
//    // To heapify a subtree rooted with node i which is
//    // an index in arr[]. n is size of heap
//    static void heapify(int arr[], int n, int i) {
//        int largest = i; // Initialize largest as root
//        int l = 2 * i + 1; // left = 2*i + 1
//        int r = 2 * i + 2; // right = 2*i + 2
//
//        // If left child is larger than root
//        if (l < n && arr[l] > arr[largest])
//            largest = l;
//
//
//
//
//        // If right child is larger than largest so far
//        if (r < n && arr[r] > arr[largest])
//            largest = r;
//
//        // If largest is not root
//        if (largest != i) {
//            int swap = arr[i];
//            arr[i] = arr[largest];
//            arr[largest] = swap;
//
//            // Recursively heapify the affected sub-tree
//            heapify(arr, n, largest);
//        }
//    }
//            public static void heapSort ( int[] sortArray, int sortLength)
//            {
//
//                // Введите свое решение ниже
//                //Построение кучи
//                buildTree(sortArray, sortLength);
//
//                // Извлечение по одному элементу из кучи
//                for (int i = sortLength - 1; i >= 0; i--) {
//
//                    // перемещаем текущий корень в конец
//                    int temp = sortArray[0];
//                    sortArray[0] = sortArray[i];
//                    sortArray[i] = temp;
//                    // перестраиваем кучу в уменьшенном размере
//                    heapify(sortArray, i, 0);
//
//                }
//            }
//
//
//        }
//
//
//    // Не удаляйте и не меняйте метод Main!
//    class Printer {
//        public static void main(String[] args) {
//            int[] initArray;
//
//            if (args.length == 0) {
//                initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
//            } else {
//                initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
//            }
//
//            System.out.println("Initial array:");
//            System.out.println(Arrays.toString(initArray));
//            HeapSort.heapSort(initArray, initArray.length);
//            System.out.println("Sorted array:");
//            System.out.println(Arrays.toString(initArray));
//        }
//    }
//import java.util.Arrays;
//
//class HeapSort {
//    public static void buildTree(int[] tree, int sortLength) {
//        // Для всех вершин дерева начиная с середины сортируемой части массива
//        // (движемся влево до нулевого индекса)
//        for (int i = sortLength / 2 - 1; i >= 0; i--) {
//            int maxIndex;
//            // Если у вершины два листа, выбираем больший
//            if (i * 2 + 2 <= sortLength - 1) {
//                if (tree[i * 2 + 2] > tree[i * 2 + 1]) maxIndex = i * 2 + 2;
//                else maxIndex = i * 2 + 1;
//                // Иначе один лист
//            } else maxIndex = i * 2 + 1;
//            // Сравниваем лист с максимальным значением с вершиной, при большем значении
//            // дочернего элемента меняем его местами с вершиной
//            if (tree[i] < tree[maxIndex]) {
//                int temp = tree[i];
//                tree[i] = tree[maxIndex];
//                tree[maxIndex] = temp;
//            }
//        }
//    }
//
//    public static void heapSort(int[] sortArray, int sortLength) {
//        // Выход из рекурсии: длина сортируемой части равна 0
//        if (sortLength == 0) return;
//        // Выстраивание элементов части массива в виде сортирующего дерева
//        buildTree(sortArray, sortLength);
//        // Замена местами первого и последнего элемента в сортируемой части
//        int temp = sortArray[0];
//        sortArray[0] = sortArray[sortLength - 1];
//        sortArray[sortLength - 1] = temp;
//        // Рекурсивно построение дерева и замена элементов для n - 1 элементов массива
//        heapSort(sortArray, sortLength - 1);
//    }
//}
//
//public class Printer {
//    public static void main(String[] args) {
//        int[] initArray;
//
//        if (args.length == 0) {
//            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
//        } else {
//            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
//        }
//
//        System.out.println("Initial array:");
//        System.out.println(Arrays.toString(initArray));
//        HeapSort.heapSort(initArray, initArray.length);
//        System.out.println("Sorted array:");
//        System.out.println(Arrays.toString(initArray));
//    }
//}