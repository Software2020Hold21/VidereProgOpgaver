package Lektion4.Collections;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class VectorTest {
    public static void main(String[] args) {
        LinkedList<Vector1> vectors = new LinkedList<Vector1>();
        vectors.add(new Vector1(1,2));
        vectors.add(new Vector1(2,2));
        vectors.add(new Vector1(3,2));
        vectors.add(new Vector1(4,2));
        vectors.add(new Vector1(0,2));
        vectors.add(new Vector1(3,2));
        vectors.add(new Vector1(4,2));

        Collections.shuffle(vectors);
        Collections.sort(vectors);

        System.out.println(vectors);







    }




}
