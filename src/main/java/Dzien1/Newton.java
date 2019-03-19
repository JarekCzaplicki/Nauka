package Dzien1;

public class Newton {
  public static void main(String[] args) {
    System.out.println(newton(5,3)); // 10
    System.out.println(newton(8,3)); // 56
    System.out.println(newton(10,4));// 210
    System.out.println(newton(5,5)); // 1
    System.out.println(newton(4,0)); // 1
    System.out.println(newton2(5,3)); // 10
    System.out.println(newton2(8,3)); // 56
    System.out.println(newton2(10,4));// 210
    System.out.println(newton2(5,5)); // 1
    System.out.println(newton2(4,0)); // 1
  }

  public static int newton(int n, int k)
  {
    if (k == 0 || k == n)
      return 1;
    else
       return newton(n-1, k-1) + newton(n-1, k);
  }

  public static int newton2(int n, int k)
  {
    return silnia(n)/(silnia(k)*silnia(n-k));
  }

  public static int silnia(int param){
    if (param < 1)
      return 1;
    else
      return param * silnia(param-1);
  }
}
