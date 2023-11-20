//public class Seminar_5 {
//    📔 **Текст задачи:**
//    Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
//
//1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
//            2. буква может не меняться, а остаться такой же. (Например, note - code)
//
//    Пример 1:
//
//    Input: s = "foo", t = "bar"
//
//    Output: false
//
//    Пример 2:
//
//    Input: s = "paper", t = "title"
//
//    Output: true
//
//</aside>
//    Александра Александрова пришлите пожалуйста коды :)
//    DALER DADADZHANOV +
//    Архип Чижанов static boolean task1(String str1, String str2){
// <aside>
//📔 **Текст задачи:**
// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
// Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
//
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
// (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)
//
// Пример 1:
//
// Input: s = "foo", t = "bar"
//
// Output: false
//
// Пример 2:
//
// Input: s = "paper", t = "title"
//p=t
// a=i
// Output: true
//
// </aside>
//        if (str1.length() != str2.length()) return false;
//        Map<Character, Character> map = new HashMap<>();
//        char[] c1 = str1.toCharArray();
//        char[] c2 = str2.toCharArray();
//        for (int i = 0; i < c1.length; i++) {
//            map.putIfAbsent(c1[i],c2[i]);
//            if(map.containsKey(c1[i])){
//                if(c2[i] != map.get(c1[i])) return false;
//            }
//        }
//        return true;
//    }
//    Архип Чижанов private Map<String, String> map = new HashMap<>();
//
//    void add(String lastName, String passNum){
//        map.put(passNum, lastName);
//    }
//
//    String getByLastName(String lastName){
//        StringBuilder sb = new StringBuilder();
//        for (Map.Entry entry:
//                map.entrySet()) {
//            if(entry.getValue().equals(lastName))
//            {
//                sb.append(entry.getKey())
//                        .append(" : ")
//                        .append(lastName)
//                        .append("\n");
//            }
//        }
//        return sb.toString();
//    }
//
//    String getByPassNum(String passNum){
//        return new StringBuilder().append(passNum)
//                .append(" : ")
//                .append(map.get(passNum)).toString();
//    }
//
//    String getAllShort(){
//        return map.toString();
//    }
//    static boolean task2(String str) {
//// <aside>
////📔 **Текст задачи:**
//// Написать программу, определяющую правильность расстановки скобок в выражении.
////
//// Пример 1: a+(d*3) - истина
////
//// Пример 2: [a+(1*3) - ложь
////
//// Пример 3: [6+(3*3)] - истина
////
//// Пример 4: {a}[+]{(d*3)} - истина
////
//// Пример 5: <{a}+{(d*3)}> - истина
////
//// Пример 6: {a+]}{(d*3)} - ложь
//// (12+2(13*5))
//// </aside>
//
//        Stack<Character> stack = new Stack();
//        Map<Character, Character> hashmap = new HashMap<>();
//        hashmap.put('(', ')');
//        hashmap.put('[', ']');
//        hashmap.put('{', '}');
//        hashmap.put('<', '>');
//        char[] c = str.toCharArray();
//        for (int i = 0; i < c.length; i++) {
//            if (hashmap.containsKey(c[i])) stack.push(c[i]);
//            if (hashmap.containsValue(c[i])) {
//                if (stack.isEmpty() || c[i] != hashmap.get(stack.pop()))
//                    return false;
//            }
//        }
//        if (!(stack.empty())) return false;
//        return true;
//    }
//
//    static void task3(String str){
//// <aside>
////📔 **Текст задачи:**
//// Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
////
//// Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
////
////</aside>
//        str = str.replace(".", " ");
//        String[] arr = str.split(" ");
//        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
//        for (String word:
//                arr) {
//            int len = word.length();
//            if(map.containsKey(len)){
//                List<String> list = map.get(len);
//                list.add(word);
//            } else {
//                List<String> list = new ArrayList<>();
//                list.add(word);
//                map.put(len,list);
//            }
//        }
//        System.out.println(map);
//    }
//}
