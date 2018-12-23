package Freshmen;

public class Main {
    public static void main(String[] args) {
        Group gr = new Group();
        Students students = new Students();
        gr.setGroupName("КДС-25");
        students.setGroup(gr);
        students.otbor();
        gr.setProffesor(new Proffesor());
        gr.group();
        gr.schedule();
        gr.studentsOnLessons();
        gr.headMan();

    }
}
