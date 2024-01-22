import clientPackage.PilotPen;

public class Adapter implements Pen{

    PilotPen pp = new PilotPen();
    @Override
    public void write(String str) {
        pp.makeWrite(str);
    }
}
