package org.manish;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConsumerT {

    @Test
    public void consumerTest1() {
        Consumer consumer1 = new Consumer(2,3,7,5);
        Consumer consumer2 = new Consumer(3,2,1,5);
        Consumer consumer3 = new Consumer(2,1,2,0);
        assertEquals(5215, consumer1.getAmount());
        assertEquals(2400, consumer1.getLitre());
        assertEquals(5750, consumer2.getAmount());
        assertEquals(3000, consumer2.getLitre());
        assertEquals(1200, consumer3.getAmount());
        assertEquals(900, consumer3.getLitre());
    }
}