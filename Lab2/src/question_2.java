import java.util.Scanner;

public class question_2 {
    public String state= "NORMAL";
    public String state1="TIME";
    public int m=0,h=0, D=1,M=1, Y=2000;
    public String[] clock(char input){
        if (state=="NORMAL") {
                    if (input =='c'){ state="UPDATE"; state1 = "min";}
                    if (input =='b') {state="ALARM";  state1 = "Alarm";}
                    if (input =='a')
                    {  if (state1=="TIME")
                            state1="DATE";
                        else
                            state1="TIME";
                    }
                }
        if (state=="UPDATE"){
            if (input =='d') {state="NORMAL";state1 = "TIME";}
            if (input =='a'){
                if (state1.equals("year")) {
                    state = "NORMAL";
                    state1 = "TIME";
                }
                if (state1.equals("month")) {
                    state1 = "year";
                }
                if (state1.equals("day")) {
                    state1 = "month";
                }
                if (state1.equals("hour")) {
                    state1 = "day";
                }
                if (state1.equals("min") ) {
                    state1 = "hour";
                }
            }
            if (input == 'b') {
                if (state1.equals("min")) {
                    m++;
                    if (m >= 60) {
                        m = 0;
                    }
                }
                if (state1.equals("hour")) {
                    h++;
                    if (h >= 24) {
                        h = 0;
                    }
                }
                if (state1.equals("day")) {
                    D++;
                    if (D > 31) {
                        D = 1;
                    }
                }
                if (state1.equals("month")) {
                    M++;
                    if (M > 12) {
                        M = 1;
                    }
                }
                if (state1.equals("year")) {
                    Y++;
                    if (Y > 2100) {
                        Y = 2000;
                    }
                }
            }}

                if (state=="ALARM"){
                    if (input =='d') {state="NORMAL";state1="TIME";}
                    if (input =='a') state1="Chime";
                }

        return new String[]{state, state1, String.valueOf(Y) + "-" + String.valueOf(M) + "-" + String.valueOf(D), String.valueOf(h) + ":" + String.valueOf(m) };
    }

    public static void main(String[] args) {
        String x[]=new question_2().clock('a');
        for (int i=0;i<x.length;i++)
        System.out.println(x[i]);
    }
}
