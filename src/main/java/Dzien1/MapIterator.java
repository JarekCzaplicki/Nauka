package Dzien1;

import java.util.Iterator;
import java.util.TreeSet;

class MapIterator extends Thread
{
  public static void main(String [] args)
  {
    TreeSet map = new TreeSet();
    map.add("one");
    map.add("two");
    map.add("three");
    map.add("four");
    map.add("one");

    Iterator it = map.iterator();
    while (it.hasNext() )
    {
      System.out.print( it.next() + " " );
    }
  }
  public void run()
  {
    for(int i=1; i < 3; ++i)
    {
      System.out.print(i + "..");
    }
  }
}