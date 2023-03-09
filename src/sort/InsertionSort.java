package sort;

public class InsertionSort
{

    //insertion sort method
    public void insertionSort(int arr[]) throws  ArrayIndexOutOfBoundsException
    {

        for(int Iterator = 1; Iterator < arr.length ; Iterator++)
        {

            int TempIterator = Iterator;
            while(TempIterator > 0 && arr[TempIterator -1] > arr[TempIterator])
            {
                int temp = arr[TempIterator];
                arr[TempIterator] = arr[TempIterator -1];
                arr[TempIterator -1] = temp;
                TempIterator--;
            }

        }

    }

    //printing all the array element
    public void Print(int arr[])
    {
        for (int x : arr)
    {
        System.out.println(x);
    }

    }

    public static void main(String[] args)
    {

        int arr[] = new int[]{1,35,-789,672,9999,-268 , -1};

        InsertionSort obj = new InsertionSort();
        try
        {

            obj.insertionSort(arr);

        }

        catch (ArrayIndexOutOfBoundsException e)
        {

            System.out.println("array index out of bound");

        }


        obj.Print(arr);

    }
}
