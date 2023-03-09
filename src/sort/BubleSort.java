package sort;

public class BubleSort
{

    public void bubbleSort(int arr[]) throws  ArrayIndexOutOfBoundsException
    {

        for(int Iterator = 0 ; Iterator< arr.length ; Iterator++)

        {

            for(int InnerIterator = 0; InnerIterator < arr.length-1; InnerIterator++)
            {

                if(arr[InnerIterator] > arr[InnerIterator+1])
                {
                    int TempValue = arr[InnerIterator];

                    arr[InnerIterator] = arr[InnerIterator + 1];

                    arr[InnerIterator+1] = TempValue;
                }

            }
        }

    }
    public static void main(String[] args)

    {

        BubleSort obj = new BubleSort();

        int arr[] = new int[]{1 , 35 , -234 , 99999 ,673,-672 , 78 ,2 , 3};

        try
        {

            obj.bubbleSort(arr);

        }

        catch (ArrayIndexOutOfBoundsException e)
        {

            System.out.println("array index out of bound");

        }

        for (int x : arr)
        {

            System.out.println(x);

        }

    }
}

