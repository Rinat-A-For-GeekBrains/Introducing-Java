//public class Seminar_3 {


//public static void main(String[] args) {




//    List<List<String>> list = new ArrayList<>();
//        addBook( "Pushkin","Classic" ,list);
//        addBook("Pushkin", "Roman", list);
//        addBook("EO", "Roman",list);
//        addBook("M&M","Classic", list);
//        addBook( "Sherlock","Detective", list);
//
//        System.out.println(list);
//    }



   // static void task0(){

/*<aside>
// **Текст задачи:**
Даны следующие строки, cравнить их с помощью == и метода equals() класса Object

String s1 = "hello";

String s2 = "hello";

String s3 = s1;

String s4 = "h" + "e" + "l" + "l" + "o";

String s5 = new String("hello");

String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

</aside>*//*

    //     String s1 = "hello";

    //     String s2 = "hello";

    //     String s3 = s1;

    //     String s4 = "h" + "e" + "l" + "l" + "o";

    //     String s5 = new String("hello");

    //     String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

    //     System.out.println(s1.equals(s2));
    //     System.out.println(s2.equals(s3));
    //     System.out.println(s3.equals(s4));
    //     System.out.println(s4.equals(s5));
    //     System.out.println(s5.equals(s6));

    // }



    static void task1() {
// Текст задачи:
// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.
    
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(100, 200));
        }
        Collections.sort(array);
        System.out.println(array);
    }





//    Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку,
//    найти и удалить целые числа.
    public static void task2() {
        List list = new ArrayList(List.of("afdfa", 34, "sfdgfg", "sfg", 25, 100));
        System.out.println(list);
        list.removeIf(i -> i.getClass().getSimpleName().equals("Integer"));
// for (int i = 0; i < list.size(); i++) {
// if (list.get(i).getClass().getSimpleName().equals("Integer")) {
// list.remove(i);
// i--;
// }
// }
        System.out.println(list);
    }
// Второй вариант решения
//    ArrayList arrayList = new ArrayList<>();
//
//arrayList.add(34);
//arrayList.add("fdsg");
//arrayList.add(674);
//arrayList.add("dshgsehd");
//arrayList.add(0);
//arrayList.add(844);
//
//arrayList.removeIf(i -> i.getClass().getSimpleName().equals("Integer"));

// for (int i = 0; i < arrayList.size(); i++) {
// if(arrayList.get(i) instanceof Integer){
// arrayList.remove(i);
// i--;
// }
// }
//System.out.println(arrayList.toString());
 
//Третий вариант
//    public static void task2() {
//        List list = new ArrayList(List.of("afdfa", 34, "sfdgfg", "sfg", 25, 100));
//        System.out.println(list);
////list.removeIf(i -> i.getClass().getSimpleName().equals("Integer"));
//// for (int i = 0; i < list.size(); i++) {
//// if (list.get(i) instanceof Integer) {
//// list.remove(i);
//// i--;
//// }
//// }
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next() instanceof Integer) {
//                iterator.remove();
//            }
//        }
//        System.out.println(list);
//    }


// static void task1(List<Integer> list){
// //        Текст задачи:
// //        Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
//         Collections.sort(list, Comparator.reverseOrder());
//         System.out.println(list);
//     }

//     static List<Integer> createList(int size, int min, int max){
//         ArrayList<Integer> list = new ArrayList<>(size);//0.99 * 91 = 0       //Random random = new Random();
//         for (int i = 0; i < size; i++) {
//             list.add((int) (Math.random() * (max - min + 1) + min));
//         }
//         return list;
//     }


// Текст задачи:
// Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.
    static void task2(){
//        Текст задачи:
//        Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
//        Пройти по списку, найти и удалить целые числа.

        ArrayList<Object> list = new ArrayList<>();
        list.add("sfdas");
        list.add(1213);
        list.add("sdfas");
        list.add(12);
        list.add(11.11);
        list.add("sdasfffafafs");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            if(o instanceof Double){
                iterator.remove();
            }
        }

        System.out.println(list);
    }


static void task2(){
*/
/*Текст задачи:
Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что на 0й позиции
каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
Напишите метод для заполнения данной структуры.*//*

//фантастика, лдароыфдвла
//роман, выоалдоыь
//детектив, фьлждалф, ывьтадоща
        List<List<String>> bookShop = new ArrayList<>();
        addBook("Роман", "Евгений Онегин", bookShop);
        addBook("Роман", "Мастер и Маргарита", bookShop);
        addBook("Детектив", "Шерлок Холмс", bookShop);
        addBook("Фантастика", "Война миров", bookShop);
        addBook("Комедия", "Горе от ума", bookShop);

        System.out.println(bookShop);
    }

    static void addBook(String ganre, String name, List<List<String>> bookShop){
        for (int i = 0; i < bookShop.size(); i++) {
            if(bookShop.get(i).get(0).equals(ganre)){
                bookShop.get(i).add(name);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(ganre);
        list.add(name);
        bookShop.add(list);
    }

}
*/



// static void addBook(String name, String ganre, List<List<String>> bookShop){
    //     for (int i = 0; i < bookShop.size(); i++) {
    //         if(bookShop.get(i).get(0).equals(ganre)){
    //             bookShop.get(i).add(name);
    //             return;
    //         }
    //     }
    //     List<String> list = new ArrayList<>();
    //     list.add(ganre);
    //     list.add(name);
    //     bookShop.add(list);
    // }