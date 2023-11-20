import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Seminar_2 {
        /*
public class Seminar_2 {
//    Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
//    которая состоит из чередующихся символов c1 и c2, начиная с c1
    static void task_1() {
        System.out.println("Input number N: ");
        Scanner scanner_n = new Scanner(System.in);
        int n = scanner_n.nextInt();

        StringBuilder stringBuilder = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 0; i < n/2; i++) {
                stringBuilder.append("c1").append("c2");
            }
        }
        else{
            System.out.println("Error! Input even number");
        }

        System.out.println(stringBuilder);
    }

// екст задачи:
//  Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.

// 22:17
// static void task0(int n, char c1, char c2){
// //        Текст задачи:
// //        Дано четное число N (>0) и символы c1 и c2.
// //                Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
//         StringBuilder stringBuilder = new StringBuilder();
//         for (int i = 0; i < n/2; i++) {
//             stringBuilder.append(c1).append(c2);
//         }
//         System.out.println(stringBuilder.toString());
//     }

    
// Текст задачи:
//  Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.



static void task_2(String txt) {
        StringBuilder res = new StringBuilder();
        int count = 1;
        char [] txt1 = txt.toCharArray(); //new char[txt.length()];
        for (int i = 1; i < txt1.length; i++) {
            if (txt1[i-1] == txt1[i]) {
                count++;
            }
            else {
                res.append(txt1[i-1]).append(count);
                count = 1;
            }
        }
        res.append(txt1[txt1.length - 1]).append(count);
        System.out.println(res);

    }
    static void task_1_1(){
        String text = "aaabbbbcddeeef";
        int count = 1;
        StringBuilder compressor = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (i < text.length() - 1 && text.charAt(i) == text.charAt(i + 1)){
                count ++;
            } else {
                compressor.append(text.charAt(i)).append(count);
                count = 1;
            }
        }
        System.out.println(compressor);
    }
    public static void main(String[] args) {
        System.out.println(task0("а роза упала на лапу азора"));
    }

    static boolean task0(String str){
        String str1 = str.replace(" ", "");
        System.out.println(str1);
        StringBuilder stringBuilder = new StringBuilder(str1);
        String str2 = stringBuilder.reverse().toString();
        return str1.equals(str2);
    }

    static String myRepeat(int n, String str){
        return str.repeat(n);
    }

    static void taskLog(String str) {

        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt", true);
        } catch (Exception e){
            e.printStackTrace();
        }

        logger.addHandler(fileHandler);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);

        try (FileWriter fileWriter = new FileWriter("t/t/t/t/text.txt")){
            fileWriter.write(str);
            fileWriter.flush();
        } catch (Exception e){
            logger.log(Level.INFO, e.getMessage());
            e.printStackTrace();
        }

    }*/
//         static void task2Log(String str){
// //        Текст задачи:
// //        Напишите метод, который составит строку,
// //        состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл,
// //                обработайте исключения.
//         String path = "/g/g/g/g/g/gtext.txt";
//         Logger logger = Logger.getAnonymousLogger();
//         FileHandler fileHandler = null;
//         try {
//             fileHandler = new FileHandler("log.txt", true);
//             logger.addHandler(fileHandler);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         SimpleFormatter simpleFormatter = new SimpleFormatter();
//         fileHandler.setFormatter(simpleFormatter);

//         try (FileWriter fileWriter = new FileWriter(path, true)){
//             fileWriter.write(str);
//             fileWriter.flush();
//         } catch (Exception e) {
//             e.printStackTrace();
//             logger.log(Level.WARNING, e.getMessage());
//         }



}
