package test_01;


public class TestDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.sumResult(1,2,3,4,5));
        Test t = new Test();
        System.out.println(t.sumResult(1,2,3,4,5));
        t.max();
    }
}
