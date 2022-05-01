import java.util.ArrayList;

public class question_1 {
  static String checkEvenOrOdd(int n){
       if(n%2==0)
return "Even";
       else return "Odd";
    }
    static ArrayList<Integer> getMinAndMax(ArrayList<Integer> x){
        ArrayList<Integer>y=new ArrayList<>();
        int min=x.get(0),max=x.get(0);
        for(int i=1;i<x.size();i++){
            if(min>x.get(i))min=x.get(i);
            if(max<x.get(i))max=x.get(i);
        }
        y.add(min);
        y.add(max);
        return y;
    }
    public static void main(String[] args) {
      ArrayList<Integer>x=new ArrayList<>();
      for (int i=0;i<100;i++){
          x.add(i);
      }
    System.out.println(checkEvenOrOdd(5));
      System.out.println(getMinAndMax(x));
}
    }