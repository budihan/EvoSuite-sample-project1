/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 15 16:51:52 GMT 2022
 */

package nl.tudelft.evo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import nl.tudelft.evo.Exam;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Exam_ESTest extends Exam_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Exam exam0 = new Exam();
      int int0 = exam0.grade(false, 50);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Exam exam0 = new Exam();
      int int0 = exam0.grade(false, 60);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Exam exam0 = new Exam();
      int int0 = exam0.grade(false, 83);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Exam exam0 = new Exam();
      int int0 = exam0.grade(false, 90);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Exam exam0 = new Exam();
      int int0 = exam0.grade(false, 100);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Exam exam0 = new Exam();
      int int0 = exam0.grade(false, 3);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Exam exam0 = new Exam();
      int int0 = exam0.grade(false, 67);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Exam exam0 = new Exam();
      int int0 = exam0.grade(false, 75);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Exam exam0 = new Exam();
      int int0 = exam0.grade(false, 54);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Exam exam0 = new Exam();
      // Undeclared exception!
      try { 
        exam0.grade(false, 1363);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid points
         //
         verifyException("nl.tudelft.evo.Exam", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Exam exam0 = new Exam();
      int int0 = exam0.grade(true, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Exam exam0 = new Exam();
      // Undeclared exception!
      try { 
        exam0.grade(true, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // invalid points
         //
         verifyException("nl.tudelft.evo.Exam", e);
      }
  }
}
