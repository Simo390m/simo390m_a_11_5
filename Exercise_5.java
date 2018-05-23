import java.util.*;

public class Exercise_5
{

    public List sortAndRemoveDublicates(List<Integer> list)
    {
        Set<Integer> hashSet = new HashSet<>();

        System.out.println(list);
        System.out.println("Removing dublicates by adding to Set, and back to ArrayList");

       hashSet.addAll(list);
       list.clear();
       list.addAll(hashSet);

        System.out.println("Before sorting: ");
        System.out.println(list);

        Collections.sort(list);

        System.out.println("After sorting: ");
        System.out.println(list);



        return list;
    }

    public static void main(String[] args)
    {
        Exercise_5 exercise_5 = new Exercise_5();
        ArrayList<Integer> arrayListist = new ArrayList<>();

        arrayListist.add(10);
        arrayListist.add(5);
        arrayListist.add(7);
        arrayListist.add(2);
        arrayListist.add(1);
        arrayListist.add(-1);
        arrayListist.add(6);
        arrayListist.add(10);
        arrayListist.add(5);
        arrayListist.add(20);
        arrayListist.add(11);

        exercise_5.sortAndRemoveDublicates(arrayListist);
    }
}

