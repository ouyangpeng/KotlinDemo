package javaTest;

import kotlinTest.FuncTestKt;
import kotlinTest.SetTestKt;

import java.util.ArrayList;
import java.util.List;

public class JavaTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1 ; i <= 10 ; i ++){
            list.add(i);
        }
        System.out.println(SetTestKt.joinToString(list, "_", "(", ")"));
        System.out.println(SetTestKt.joinToString(list, "_", "(", ")"));
        System.out.println(SetTestKt.joinToString(list, ",", "[", "]"));
        System.out.println(SetTestKt.joinToString(list));
        System.out.println(SetTestKt.joinToString(list, ";"));

        char c = FuncTestKt.lastChar("OuyangPeng");
        System.out.println(c);
    }
}
