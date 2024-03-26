package Unit07;

import java.util.ArrayList;

public class Topic7_7EthicalIssuesAroundDataCollection {
    public static void selectionSort(int[] elements)

{

for (int j = 0; j < elements.length - 1; j++)

{

int minIndex = j;

for (int k = j + 1; k < elements.length; k++)

{

if (elements[k] < elements[minIndex])

{

minIndex = k;

}

}

if (j != minIndex)

{

int temp = elements[j];

elements[j] = elements[minIndex];

elements[minIndex] = temp;   // line 19
System.err.println("a");

}

}

}

    public static void main(String[] args) {
        
        int[] arr = {30, 40, 10, 50, 20};

selectionSort(arr);
    }
}
