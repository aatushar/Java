package mtqn3;

import generic.TestG;

public class MTQn3 {
    public static void main(String[] args) {
        TestG<Integer, String> obj = new TestG<>(101, "Tushar");
        obj.getMethod();

        TestG<Boolean, Double> obj1 = new TestG<>(true, Math.PI);
        obj1.getMethod();

        TestG<Integer, String> obj3 = new TestG<>(200);
        System.out.println(obj3.getMethod1());
    }
}
