package com.itheima_01;
/*
    Object是类层次结构的根，每个类都可以将Object作为超类。所有的类都直接或者间接的继承自该类

    看方法的源码，选中方法，选中方法按Ctrl+B
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("ErdunE");
        s.setAge(26);
        System.out.println(s); // com.itheima_01.Student@77459877
        System.out.println(s.toString()); // com.itheima_01.Student@77459877

        /*
        public void println(Object x) {
            String s = String.valueOf(x);
            if (getClass() == PrintStream.class) {
                // need to apply String.valueOf again since first invocation
                // might return null
                writeln(String.valueOf(s));
            } else {
                synchronized (this) {
                    print(s);
                    newLine();
                }
            }
        }
         */
    }
}
