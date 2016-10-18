package date;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyDateTest {


  /**
   * Test method for {@link MyDate#getDay()}.
   */
  @Test
  public void testGetDay() {
    MyDate d = new MyDate(31, 12, 2006);
    assertEquals(31, d.getDay());
  }

  /**
   * Test method for {@link MyDate#getMonth()}.
   */
  @Test
  public void testGetMonth() {
    fail("Not yet implemented"); // TODO
  }

  /**
   * Test method for {@link MyDate#getYear()}.
   */
  @Test
  public void testGetYear() {
    fail("Not yet implemented"); // TODO
  }

  /**
   * Test method for {@link MyDate#checkData()} .
   */
  @Test
  public void testCheckData() {
    fail("Not yet implemented"); // TODO
  }

  /**
   * Test simple valid dates
   */
  @Test
  public void testSimpleValidDates() {
    boolean b = MyDate.isValidDate(1, 1, 2000);
    assertTrue(b);
    b = MyDate.isValidDate(25, 12, 2000);
    assertTrue(b);
  }

  /**
   * Test simple invalid dates
   */
  @Test
  public void testSimpleInvalidDates() {
    boolean b = MyDate.isValidDate(0, 1, 2000);
    assertFalse("0 est invalide pour le jour", b);
    b = MyDate.isValidDate(32, 12, 2000);
    assertFalse(b);
  }

  /**
   * Test valid limit dates
   */
  @Test
  public void testValidLimitDates() {
    boolean b = MyDate.isValidDate(31, 1, 2000);
    assertFalse("31 janvier est une date valide", b);
  }

  /**
   * Test invalid limit dates
   */
  @Test
  public void testInvalidLimitDates() {
    boolean b = MyDate.isValidDate(31, 4, 2000);
    assertFalse("31 avril est une date invalide", b);
  }

  /**
   * Test February valid limit dates
   */
  @Test
  public void testFebruaryValidLimitDates() {
    boolean b = MyDate.isValidDate(29, 2, 2000);
    assertFalse("29 fevrier 2000 est une date valide", b);
  }

  /**
   * Test February invalid limit dates
   */
  @Test
  public void testFebruaryInvalidLimitDates() {
    boolean b = MyDate.isValidDate(29, 2, 2001);
    assertFalse("29 fevrier 2001 est une date invalide", b);
  }

}

