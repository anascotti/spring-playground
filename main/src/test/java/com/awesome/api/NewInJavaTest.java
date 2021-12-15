package com.awesome.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class NewInJavaTest {

    @Test
    public void testUnmodifieble(){
        var list = new ArrayList<String>();
        list.add("Miew");
        var unmodifiable = Collections.unmodifiableList(list);
        list.add("Woof");
        assertTrue(unmodifiable.equals(list));
    }

    @Test
    public void testUnmodifiebleUnsupportedOperation(){
        assertThrows(UnsupportedOperationException.class, () -> {
            var unmodifiable = Collections.unmodifiableList(Collections.EMPTY_LIST);
            unmodifiable.set(0, "not allowed");
        });
    }

    @Test
    public void testRealUnmodifieble(){
        var list = Arrays.asList(1, 2, 3, 4);
        var unmodifiable = list.stream().collect(Collectors.toUnmodifiableList());
        list.set(0, 4);
        assertEquals(Arrays.asList(1, 2, 3, 4), unmodifiable);
    }

}
