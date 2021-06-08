package test_01;

public class Test extends Demo implements MaxNumber{
    @Override
    public int sumResult(int a, int b, int c, int d, int e) {
        return a+a+a+a+a;
    }

    @Override
    public void max() {
        System.out.println("我是最大数");
    }
}
