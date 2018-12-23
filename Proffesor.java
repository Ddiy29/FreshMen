package Freshmen;

import java.util.Random;

public class Proffesor {
    private Proffesor proffesors;
    Random r = new Random();

    String allKurators() {
        String result = "";
        int howKurators = 1;
        String[] kurators = new String[]{"Тямченко Светлана Владимировна", "Петрушенко Владимир Иванович", "Станиславский Петр Сергеевич"};
        String[] b = new String[howKurators];
        for (int i = 0; i < howKurators; i++) {
            b[i] = kurators[r.nextInt(kurators.length)];
            result = b[i];
        }
        return result;
    }

    String allTeacher() {
        String resultAllTeachers = "";
        int howTeacher = 1;
        String[] teacher = new String[]{"Ряденко Юрий Григорьевич", "Кузнецкий Виктор Иванович", "Метриенко Елена Викторовна", "Кулич Анна Олеговна"};
        String[] a = new String[howTeacher];
        for (int i = 0; i < howTeacher; i++) {
            a[i] = teacher[r.nextInt(teacher.length)];
            resultAllTeachers = a[i];
        }
        return resultAllTeachers;
    }

    public Proffesor getProffesors() {
        return proffesors;
    }

    public void setProffesors(Proffesor proffesors) {
        this.proffesors = proffesors;
    }
}
