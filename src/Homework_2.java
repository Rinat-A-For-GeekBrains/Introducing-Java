import java.io.StringReader;

import javax.lang.model.element.Element;

class Answer {

    // JSON =
    // "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
    // "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
    // "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
    // ELEMENT1 = "Студент ";
    // ELEMENT2 = " получил ";
    // ELEMENT3 = " по предмету ";

    // Студент Иванов получил 5 по предмету Математика
    // Студент Петрова получил 4 по предмету Информатика
    // Студент Краснов получил 5 по предмету Физика

    public static void answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3) {
        // Напишите свое решение ниже

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ELEMENT1);
        JSON = JSON.replaceAll("\\{", "").replaceAll("}", "").replaceAll("\\[", "").replaceAll("\\]", "");
        String[] temp1 = JSON.split("+");
        for (String s : temp1) {
            String[] temp2 = s.split(",");
            for (String d : temp2) {
                String[] temp3 = d.split(":");
                // temp3[0] = temp3[0].substring(1, temp3.length-1);
                temp3[1] = temp3[1].substring(1, temp3.length - 1);
                stringBuilder.append(temp3[1]);
            }

        }


    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Printer {
        public static void main(String[] args) {
            String JSON = "";
            String ELEMENT1 = "";
            String ELEMENT2 = "";
            String ELEMENT3 = "";

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                        "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                        "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
                ELEMENT1 = "Студент ";
                ELEMENT2 = " получил ";
                ELEMENT3 = " по предмету ";
            } else {
                JSON = args[0];
                ELEMENT1 = args[1];
                ELEMENT2 = args[2];
                ELEMENT3 = args[3];
            }

            Answer ans = new Answer();
            ans.answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3);
        }
    }
}