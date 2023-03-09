package sort;

public class SelectionSort
{

    public void selectionSort(int arr[]) throws  ArrayIndexOutOfBoundsException
    {

        for(int Iterator = 0; Iterator < arr.length ; Iterator++)
        {

            int SmallestElementIndex = Iterator;

            for(int InnerItarotr = Iterator ; InnerItarotr < arr.length ; InnerItarotr++)
            {

                if(arr[SmallestElementIndex] > arr[InnerItarotr])
                {

                    SmallestElementIndex = InnerItarotr;

                }

            }

            int Temp = arr[Iterator];

            arr[Iterator] = arr[SmallestElementIndex];

            arr[SmallestElementIndex] = Temp;

        }

    }

    public static void main(String[] args)
    {

        int arr[] = new int[]{1 ,-2 , -99 , 245 , 782, -999 , 567};

        SelectionSort obj = new SelectionSort();

        try
        {

            obj.selectionSort(arr);

        }
        catch (ArrayIndexOutOfBoundsException boundsException)
        {

            System.out.println("array index out of bound");

        }

        for(int x: arr)
        {

            System.out.println(x);

        }

    }

}
