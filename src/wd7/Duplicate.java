package wd7;

public class Duplicate 
{
	public static void main(String[] args)
	{
        int[] array = {1, 2, 3, 4, 5, 1}; // Initialize the array with elements

        boolean hasDuplicate = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
        }

        if (hasDuplicate)
        {
            System.out.println("Array contains duplicate elements.");
        }
        else
        {
            System.out.println("Array does not contain duplicate elements.");
        }
    }
}


