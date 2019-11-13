package TRI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stuff implements Comparable<Stuff> {
    private float value;

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Stuff()
    {
        Random rand = new Random();
        value = rand.nextFloat() * 100;
    }

    @Override
    public int compareTo(Stuff stuff) {
        return (int)Math.signum(this.value - stuff.value);
    }

    public static void triBulle(List<Stuff> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            for(int j = i; j < list.size(); j++)
            {
                if(list.get(j).value < list.get(i).value)
                {
                    swap(list, j, i);
                }
            }
        }
    }

    public static void triInsertion(List<Stuff> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            for(int j = i; j > 0 && list.get(j).getValue() < list.get(j-1).getValue(); j--)
            {
                swap(list, j, j-1);
            }
        }
    }

    public static void triFusion(List<Stuff> list)
    {
        int size = list.size() - 1;
        int middle = size/2;
        triFusionRecursive(list, 0, middle);
        triFusionRecursive(list, middle + 1, size);
        fusion(list, 0, size/2, size);
    }

    public static void triFusionRecursive(List<Stuff> list, int startIndex, int endIndex)
    {
        if(startIndex < endIndex)
        {
            int middle = startIndex + (endIndex - startIndex)/2;
            triFusionRecursive(list, startIndex, middle);
            triFusionRecursive(list, middle + 1, endIndex);
            fusion(list, startIndex, middle, endIndex);
        }
    }

    public static void fusion(List<Stuff> list, int startIndexA, int middle, int endIndexB)
    {
        int n1 = middle - startIndexA + 1;
        int n2 = endIndexB - middle;
        List<Stuff> a = new ArrayList<Stuff>();
        List<Stuff> b = new ArrayList<Stuff>();

        for(int i = 0; i< n1; i++)
            a.add(list.get(startIndexA + i));
        for(int i = 0; i < n2; i++)
            b.add(list.get(middle + 1 + i));

        int i = 0;
        int j = 0;
        int k = startIndexA;

        while(i < n1 && j < n2)
        {
            if(a.get(i).value < b.get(j).value)
            {
                list.set(k, a.get(i));
                i++;
            }
            else
            {
                list.set(k, b.get(j));
                j++;
            }
            k++;
        }

        while(i < n1)
        {
            list.set(k, a.get(i));
            i++;
            k++;
        }

        while(j < n2)
        {
            list.set(k, b.get(j));
            j++;
            k++;
        }
    }

    public static void triRapide(List<Stuff> list)
    {
        int pivot = list.size() - 1;
        int start = 0;
        int end = list.size() - 1;
        int i = start;
        while(i <= pivot)
        {
            if(list.get(i).value > list.get(pivot).value)
            {
                swap(list, i, pivot - 1);
                swap(list, pivot - 1, pivot);
                pivot--;
            }
            else
                i++;
        }

        triRapide(list, start, pivot - 1);
        triRapide(list, pivot + 1, end);
    }

    public static void triRapide(List<Stuff> list, int start, int end)
    {
        if(start < end)
        {
            int pivot = end;
            int i = start;
            while(i <= pivot)
            {
                if(list.get(i).value > list.get(pivot).value)
                {
                    swap(list, i, pivot - 1);
                    swap(list, pivot - 1, pivot);
                    pivot--;
                }
                else
                    i++;
            }

            triRapide(list, start, pivot - 1);
            triRapide(list, pivot + 1, end);
        }
    }

    public static void swap(List<Stuff> list, int indexA, int indexB)
    {
        Stuff buffer = list.get(indexA);
        list.set(indexA, list.get(indexB));
        list.set(indexB, buffer);
    }

    public static List<Stuff> generateListOfStuff(int number)
    {
        List<Stuff> stuffs = new ArrayList<Stuff>();

        for(int i = 0; i < number; i++)
            stuffs.add(new Stuff());

        return stuffs;
    }
}
