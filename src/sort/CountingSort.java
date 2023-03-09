package sort;

public class CountingSort
{

    public void countingSort(int arr[]){

        int CountArray[]  = new int[9999];

        int Output[] = new int[arr.length];


        for(int Iterator = 0; Iterator < arr.length ; Iterator++)

        {

            ++CountArray[arr[Iterator]];

        }

        for(int Iterator = 1; Iterator<9999 ; Iterator++)
        {

            CountArray[Iterator] += CountArray[Iterator-1];

        }

        for(int Iterator = 0; Iterator<arr.length ; Iterator++)
        {

            Output[CountArray[arr[Iterator]] -1] = arr[Iterator];

            --CountArray[arr[Iterator]];

        }

        for(int Iterator = 0 ; Iterator < arr.length ; Iterator++)
        {

            arr[Iterator] = Output[Iterator];

        }



    }

    public void Print(int arr[])
    {

        for(int x: arr)
        {

            System.out.println(x);

        }

    }

    public static void main(String[] args) {


        int arr[] = new int[]{ 23 , 467 , 78 , 67 , 123 ,1 , 78};

        CountingSort obj = new CountingSort();

        try
        {

            obj.countingSort(arr);

        }
        catch (ArrayIndexOutOfBoundsException e)
        {

            System.out.println("array index out of bound");

        }

        obj.Print(arr);

    }

}
