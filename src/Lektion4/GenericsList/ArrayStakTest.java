package Lektion4.GenericsList;

public class ArrayStakTest {
    public static void main(String[] args) {
        IStak arrayStak = new ArrayStak<String>();
        arrayStak.push("Jeg");
        arrayStak.push("går");
        arrayStak.push("og");
        arrayStak.push("hedder");
        arrayStak.push("Frede");
        arrayStak.show();

        System.out.println("Stakken er fuld: " + arrayStak.isFull());
        System.out.println("Stakken er tom: " + arrayStak.isEmpty());

        arrayStak.pop();
        arrayStak.pop();
        arrayStak.pop();
        arrayStak.pop();
        arrayStak.pop();
        arrayStak.show();

        System.out.println("Stakken er fuld: " + arrayStak.isFull());
        System.out.println("Stakken er tom: " + arrayStak.isEmpty());

    }



}
