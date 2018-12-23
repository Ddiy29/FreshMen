package Freshmen;

import java.util.Random;
import java.util.Scanner;

public class Group {
    Scanner sc = new Scanner(System.in);
    Proffesor proffesor;
    private Students[] allStudents;
    private String groupName;

    void group() {
        Random random = new Random();
        allStudents = new Students[5 + random.nextInt(20)];
        System.out.println("В группе: " + getGroupName() + " " + allStudents.length + " студента(ов)");
        System.out.println("Куратор группы: " + getGroupName() + " - " + proffesor.allKurators());
    }

    void schedule() {
        while (true) {
            System.out.println("Узнать расписание (введите слово расписание)");
            String ras = sc.nextLine();
            if (ras.equals("расписание")) {
                System.out.println("Расписание занятий группы: " + getGroupName());
                String[] days = new String[5];
                for (int i = 0; i < days.length; i++) {
                    days[0] = "Понедельник";
                    days[1] = "Вторник";
                    days[2] = "Среда";
                    days[3] = "Четверг";
                    days[4] = "Пятница";
                    if (i % 2 == 0) {
                        System.out.println(days[i] + " c 9:00 до 13:00" + ". Преподователь: " + proffesor.allTeacher());
                    } else {
                        System.out.println(days[i] + " c 13:00 до 17:00" + ". Преподователь: " + proffesor.allTeacher());
                    }

                }
                break;
            } else {
                System.out.println("Введите расписание");
            }
        }
    }

    void studentsOnLessons() {
        while (true) {
            System.out.println("Теперь мы предлагаем группе пройти в класс и сделать перекличку (введите перекличка)");
            String p = sc.nextLine();
            if (p.equals("перекличка")) {
                for (int i = 0; i < allStudents.length; i++) {
                    allStudents[i] = new Students();
                }
                for (int i = 1; i <= allStudents.length; i++) {
                    System.out.println("Студент" + i + " - я на месте");
                    if (i == allStudents.length) {
                        System.out.println("Все студенты на месте");
                    }
                }
                break;
            } else {
                System.out.println("Введите перекличка");

            }

        }

    }

    void headMan() {
        while (true) {
            System.out.println("Теперь всем присутствующим в группе предлагаем выбрать старосту (введите выбрать старосту)");
            String headsMan = sc.nextLine();
            if (headsMan.equals("выбрать старосту")) {
                System.out.println("Выбираем старосту по личным качествам лидера");
                System.out.println("Нажмите 1: Оптимизм");
                System.out.println("Нажмите 2: Позитивность");
                System.out.println("Нажмите 3: Ответственность");
                System.out.println("Нажмите 4: Смелость");
                System.out.println("Нажмите 5: Харизма");
                int headMans = sc.nextInt();
                switch (headMans) {
                    case 1:
                        System.out.println("По вашему голосванию, староста группы " + getGroupName() + " - " + "Даша Полякова");
                        break;
                    case 2:
                        System.out.println("По вашему голосванию, староста группы " + getGroupName() + " - " + "Игорь Бравицкий");
                        break;
                    case 3:
                        System.out.println("По вашему голосванию, староста группы " + getGroupName() + " - " + "Владимир Пресняков");
                        break;
                    case 4:
                        System.out.println("По вашему голосванию, староста группы " + getGroupName() + " - " + "Елена Югоская");
                        break;
                    case 5:
                        System.out.println("По вашему голосванию, староста группы " + getGroupName() + " - " + "Анна Кравецкая");
                        break;
                    default:
                        System.out.println("Сделайте свой выбор");
                        break;
                }
                break;
            } else {
                System.out.println("Введите выбрать старосту");
            }
        }
        System.out.println("Желаем всем студентам хорошего учебного года");
    }

    String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Proffesor getProffesor() {
        return proffesor;
    }

    void setProffesor(Proffesor proffesor) {
        this.proffesor = proffesor;
    }


}
