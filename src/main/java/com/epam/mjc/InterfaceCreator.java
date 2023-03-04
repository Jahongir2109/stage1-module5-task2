package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        Operation<Integer>operation=new Operation<Integer>() {
            @Override
            public List<Integer> apply(List<Integer> arg) {
                List<Integer>integers=new ArrayList<>();
                for (Integer integer : arg) {
                    integers.add(integer/3);
                }
                return integers;
            }
        };
        return operation;
    }
}
