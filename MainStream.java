import java.io.IOException;
import java.util.*;

class Solution {

    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();


        list.add(12);
        list.add(45);
        list.add(75);
        list.add(4245);
        list.add(42);
        System.out.println("1 Technique");
        Integer num=0;
        int i=0;
        while (i<list.size())
        {
            num= list.get(i);
            System.out.println(num);
            i++;
        }


        System.out.println("2 Technique");

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
        {
            num= iterator.next();
            System.out.println(num);
        }

        System.out.println("3 Technique");

        list.forEach((n)->{
            System.out.println(n);
        });

        System.out.println("4 Technique");

        for(Integer nm : list)
        {
            System.out.println(nm);
        }
        System.out.println("Implementation LinkedList");
      List<Integer> linkList = new LinkedList<>();
        linkList.add(120);
        linkList.add(450);
        linkList.add(780);
        linkList.add(460);
        linkList.add(100);

        System.out.println("1 Technique");
        int h=0;
        Integer n=0;
        while(h<linkList.size())
        {
            n= linkList.get(h);
            System.out.println(n);
            h++;
        }
        System.out.println("2 Technique");
        Iterator<Integer> linkeIterartor = linkList.iterator();
        while(linkeIterartor.hasNext())
        {
            Integer next = linkeIterartor.next();
            System.out.println(next);
        }

        System.out.println("3 Technique");
        linkList.forEach((s)->{
            System.out.println(s);
        });

        System.out.println("4 Technique");

        for(Integer ns: linkList)
        {
            System.out.println(ns);
        }
        System.out.println("1 vector Technique");
        List<Integer> vectorList = new Vector<>();
        vectorList.add(753);
        vectorList.add(951);
        vectorList.add(456);
        vectorList.add(654);
        vectorList.add(852);

        int y=0;
        Integer tempVector=0;
        while (y<vectorList.size())
        {
            tempVector= vectorList.get(y);
            System.out.println(tempVector);
            y++;
        }
        System.out.println("2 vector Technique");
        Iterator<Integer> ii = vectorList.iterator();
        while(ii.hasNext())
        {
            System.out.println(ii.next());
        }

        System.out.println("3 vector Technique");

        vectorList.forEach((t)->{
            System.out.println(t);
        });

        System.out.println("4 vector Technique");

        for(Integer v: vectorList)
        {
            System.out.println(v);
        }









    }
}