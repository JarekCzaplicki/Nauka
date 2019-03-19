package Dzien1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewtonTest {
  @Test
  public void smallNumbersNewtonTest(){
    assertEquals(10, Newton.newton(5,3));
    assertEquals(56, Newton.newton(8,3));
    assertEquals(210, Newton.newton(10,4));
    assertEquals(1, Newton.newton(5,5));
    assertEquals(1, Newton.newton(4,0));
  }

  @Test
  public void bigNumbersNewtonTest(){
    assertEquals(10, Newton.newton(5,3));
    assertEquals(56, Newton.newton(8,3));
    assertEquals(210, Newton.newton(10,4));
    assertEquals(1, Newton.newton(5,5));
    assertEquals(1, Newton.newton(4,0));
  }

}