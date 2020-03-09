package Lektion6;

public class TennisTest {
    public static void main(String[] args) {
        TennisSpiller t1 = new TennisSpiller("Caroline W",true);
        TennisSpiller t2 = new TennisSpiller("Bjørn Borg", false);
        t1.setModstander(t2);
        t2.setModstander(t1);
        t1.run();

    }
}
