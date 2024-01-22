public class Assignment {

    private Pen p;

    public Assignment(Pen p) {
        this.p = p;
    }

    public void writeAssignment(String str){
        p.write(str);
    }

}
