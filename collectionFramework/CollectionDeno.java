package collectionFramework;

import java.util.ArrayList;

public class CollectionDeno {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(120);
        al.add("Anuj");
        al.add("c");

        System.out.println(al);

        ArrayList al2 = new ArrayList();
        al2.add("aaa");
        al2.add("bbb");
        al2.add("ccc");

        System.out.println(al2);

        al.addAll(al2);
        System.out.println(al);
        System.out.println(al2);
        System.out.println(al.contains(200));
        System.out.println(al2.isEmpty());
        al.removeAll(al2);
        System.out.println(al);
        System.out.println(al2);

    }
}
