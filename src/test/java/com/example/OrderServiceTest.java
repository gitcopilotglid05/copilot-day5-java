
package com.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Test
    public void testCalculateTotal() {
        assertEquals(40, OrderService.calculateTotal(Arrays.asList(10, 20, 10)));
    }
}
