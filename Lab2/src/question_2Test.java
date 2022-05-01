import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class question_2Test {
    @Nested
    class EdgEdgeCoverageoverage{

        question_2 x;

        @BeforeEach
        public void setup(){
            x = new  question_2();
        }

        @Test
        public void EdgeCoveragetest1(){
            String[] res = x.clock('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("DATE", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }

        @Test
        public void EdgeCoveragetest2(){
            x.clock('a');
            String[] res = x.clock('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }

        @Test
        public void EdgeCoveragetest3(){
            x.clock('a');
            x.clock('a');
            String[] res = x.clock('c');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }

        @Test
        public void EdgeCoveragetest4(){
            x.clock('a');
            x.clock('a');
            x.clock('c');
            String[] res = x.clock('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:1", res[3]);
        }

        @Test
        public void EdgeCoveragetest5(){
            x.clock('a');
            x.clock('a');
            x.clock('c');
            x.clock('b');
            String[] res = x.clock('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:1", res[3]);
        }

        @Test
        public void EdgeCoveragetest6(){
            x.clock('a');
            x.clock('a');
            x.clock('c');
            x.clock('b');
            x.clock('a');
            String[] res = x.clock('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void EdgeCoveragetest7(){
            x.clock('a');
            x.clock('a');
            x.clock('c');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            String[] res = x.clock('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void EdgeCoveragetest8(){
            x.clock('a');
            x.clock('a');
            x.clock('c');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            String[] res = x.clock('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void EdgeCoveragetest9(){
            x.clock('a');
            x.clock('a');
            x.clock('c');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            String[] res = x.clock('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-1-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void EdgeCoveragetest10(){
            x.clock('a');
            x.clock('a');
            x.clock('c');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            String[] res = x.clock('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void EdgeCoveragetest11(){
            x.clock('a');
            x.clock('a');
            x.clock('c');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            String[] res = x.clock('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2000-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void EdgeCoveragetest12(){
            x.clock('a');
            x.clock('a');
            x.clock('c');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            String[] res = x.clock('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void EdgeCoveragetest13(){
            x.clock('a');
            x.clock('a');
            x.clock('c');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            String[] res = x.clock('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void EdgeCoveragetest14(){
            x.clock('a');
            x.clock('a');
            x.clock('c');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            String[] res = x.clock('c');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void EdgeCoveragetest15(){
            x.clock('a');
            x.clock('a');
            x.clock('c');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('c');
            String[] res = x.clock('d');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void EdgeCoveragetest16(){
            x.clock('a');
            x.clock('a');
            x.clock('c');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('c');
            x.clock('d');
            String[] res = x.clock('b');
            assertEquals("ALARM", res[0]);
            assertEquals("Alarm", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void EdgeCoveragetest17(){
            x.clock('a');
            x.clock('a');
            x.clock('c');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('c');
            x.clock('d');
            x.clock('b');
            String[] res = x.clock('a');
            assertEquals("ALARM", res[0]);
            assertEquals("Chime", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void EdgeCoveragetest18(){
            x.clock('a');
            x.clock('a');
            x.clock('c');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('a');
            x.clock('c');
            x.clock('d');
            x.clock('b');
            x.clock('a');
            String[] res = x.clock('d');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }

    }


    @Nested
    class ADUP{

        question_2 x;

        @BeforeEach
        public void setup(){
            x = new  question_2();
        }

        @Test
        public void ADUPtest1(){
            String[] res = x.clock('c');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }

        @Test
        public void ADUPtest2(){
            x.clock('c');
            String[] res = x.clock('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:1", res[3]);
        }

        @Test
        public void ADUPtest3(){
            x.clock('c');
            x.clock('b');
            String[] res = x.clock('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:2", res[3]);
        }

        @Test
        public void ADUPtest4(){
            x.clock('c');
            x.clock('b');
            x.clock('b');
            String[] res = x.clock('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:2", res[3]);
        }

        @Test
        public void ADUPtest5(){
            x.clock('c');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            String[] res = x.clock('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("1:2", res[3]);
        }

        @Test
        public void ADUPtest6(){
            x.clock('c');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            String[] res = x.clock('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("2:2", res[3]);
        }

        @Test
        public void ADUPtest7(){
            x.clock('c');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            String[] res = x.clock('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("2:2", res[3]);
        }

        @Test
        public void ADUPtest8(){
            x.clock('c');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            String[] res = x.clock('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-2", res[2]);
            assertEquals("2:2", res[3]);
        }

        @Test
        public void ADUPtest9(){
            x.clock('c');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            String[] res = x.clock('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-3", res[2]);
            assertEquals("2:2", res[3]);
        }

        @Test
        public void ADUPtest10(){
            x.clock('c');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            String[] res = x.clock('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-1-3", res[2]);
            assertEquals("2:2", res[3]);
        }

        @Test
        public void ADUPtest11(){
            x.clock('c');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            String[] res = x.clock('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-2-3", res[2]);
            assertEquals("2:2", res[3]);
        }

        @Test
        public void ADUPtest12(){
            x.clock('c');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            String[] res = x.clock('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-3-3", res[2]);
            assertEquals("2:2", res[3]);
        }

        @Test
        public void ADUPtest13(){
            x.clock('c');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            String[] res = x.clock('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2000-3-3", res[2]);
            assertEquals("2:2", res[3]);
        }

        @Test
        public void ADUPtest14(){
            x.clock('c');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            String[] res = x.clock('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2001-3-3", res[2]);
            assertEquals("2:2", res[3]);
        }

        @Test
        public void ADUPtest15(){
            x.clock('c');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            x.clock('b');
            x.clock('a');
            x.clock('b');
            String[] res = x.clock('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2002-3-3", res[2]);
            assertEquals("2:2", res[3]);
        }


    }
}