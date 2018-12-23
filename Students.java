package Freshmen;

import java.util.Scanner;

public class Students {
    private Group group;

    private String name;

    void otbor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Приветствуем Вас в нашей академии. Представтесь пожалуйста");
        String myName = sc.nextLine();
        System.out.println("Очень приятно " + myName);
        System.out.println("У нас сейчас можно поступить на факультеты: Программирование; Экономика;");
        System.out.println("На какой факультет вы хотите поступить?");
        while (true) {
            String faculty = sc.nextLine();
            if (faculty.equals("Программирование") || faculty.equals("Экономика")) {
                System.out.println(myName + " Пожалуйста предоставьте ваш бал сдачи ЗНО (от 120 до 200)");
                while (true) {
                    int ball = sc.nextInt();
                    if (ball > 119 && ball <= 200) {
                        System.out.println("Поздравляем! Вы приняты на факультет " + faculty);
                        System.out.println("Ваша группа: " + group.getGroupName());
                        break;
                    } else {
                            System.out.println("Извините, но по проходному баллу ЗНО мы не можем Вас взять на учебу в наш ВУЗ");
                        }
                    }
                break;
            } else {
                System.out.println("К сожалению у нас нет такого факультета");
                System.out.println("На какой факультет вы хотите поступить?");
            }
        }
    }

    public Group getGroup() {
        return group;
    }

    void setGroup(Group group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
