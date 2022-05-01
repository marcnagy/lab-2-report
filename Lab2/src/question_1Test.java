import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class question_1Test {
    question_1 x;
   @BeforeEach
   void init(){
        x=new question_1();
   }
   @Nested
    class EvenOrOdd{
       @Test
       void evenTest1(){
          assertEquals(question_1.checkEvenOrOdd(4),"Even");
       }
       @Test
       void evenTest2(){
          assertEquals(question_1.checkEvenOrOdd(99990),"Even");
       }
       @Test
       void evenTest3(){
          assertEquals(question_1.checkEvenOrOdd(120323238),"Even");
       }
       @Test
       void oddTest1(){
          assertEquals(question_1.checkEvenOrOdd(3),"Odd");
       }
       @Test
       void oddTest2(){
          assertEquals(question_1.checkEvenOrOdd(2131123125),"Odd");
       }
       @Test
       void oddTest3(){
          assertEquals(question_1.checkEvenOrOdd(2327),"Odd");
       }
   }
   @Nested
    class MinOrMax{
      ArrayList<Integer>y;
      @BeforeEach
      void init(){
        y=new ArrayList<>();
      }
       @Test
       void test1(){
          y.add(-1000);
          y.add(7242);
          y.add(1232);
          y.add(232);
          y.add(2);
          ArrayList<Integer>out=new ArrayList<>();
          out.add(-1000);
          out.add(7242);
          assertEquals(question_1.getMinAndMax(y),out);
       }
       @Test
       void test2(){
          y.add(0);
          y.add(724223);
          y.add(12312);
          y.add(3232);
          y.add(4);
          y.add(213);
          y.add(222222);
          ArrayList<Integer>out=new ArrayList<>();
          out.add(0);
          out.add(724223);
          assertEquals(question_1.getMinAndMax(y),out);
       }
       @Test
       void test3(){
         y.add(123320);
          y.add(72423223);
          y.add(123122);
          y.add(32321);
          y.add(4);
          y.add(21332);
          y.add(222222299);
          ArrayList<Integer>out=new ArrayList<>();
          out.add(4);
          out.add(222222299);
          assertEquals(question_1.getMinAndMax(y),out);}
      @AfterEach
      void cleanUp(){
        y=null;
      }
   }

   @AfterEach
    void cleanUp(){
       x=null;
   }
}