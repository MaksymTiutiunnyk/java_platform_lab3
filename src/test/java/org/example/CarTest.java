package org.example;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void testCarEquals(){
        EqualsVerifier.simple().forClass(Car.class).usingGetClass().verify();
    }
}
