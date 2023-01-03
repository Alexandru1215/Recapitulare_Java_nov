package recap.pack;

import singleton.ops.impl.OpId;

public class testClass {
    public static void main(String[] args) {
        SingletonCheck s =  new SingletonCheck();
        System.out.println(s);
        SingletonCheck s1 = new SingletonCheck();
        System.out.println(s1);
    }
}
