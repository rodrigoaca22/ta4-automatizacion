package com.rdg.ta4_automatizacion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DemoMathTest {

  @Test void suma_ok() {
    assertEquals(5, Ta4AutomatizacionApplication.suma(2, 3));
  }

  @Test void resta_ok() {
    assertEquals(1, Ta4AutomatizacionApplication.resta(3, 2));
  }
}