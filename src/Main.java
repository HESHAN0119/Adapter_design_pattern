public class Main {
    public static void main(String[] args) {
        Pen p=new Adapter();
        Assignment asi = new Assignment(p);

        asi.writeAssignment("Write Exam");
    }
}