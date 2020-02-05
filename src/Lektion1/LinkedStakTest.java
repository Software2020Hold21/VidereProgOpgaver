package Lektion1;

public class LinkedStakTest {
    public static void main(String[] args) {
        Stak linkedStak = new LinkedStak();
        linkedStak.push("Hej");
        linkedStak.push("med");
        linkedStak.push("dig");
        linkedStak.push("jeg");
        linkedStak.push("hedder");
        linkedStak.push("Kaj");
        linkedStak.show();

        while(! linkedStak.isEmpty()){
            System.out.println("Nu fjernes " + linkedStak.pop());
            linkedStak.show();
        }



    }



}
