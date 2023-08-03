package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return arg -> {
            List<Integer> array = new ArrayList<>();
            for (Integer val :arg) {
                array.add(val/divider);
            }
            return array;
        };
    }
}
