package sort;

public class MergeSort {


    private  void  merge( int arr[] , int l , int m , int r){

        int n1  = m - l + 1;
        int n2  = r -m;


        int leftArr[] = new int[n1];
        int rightArr[] = new int[n2];

        for(int i = 0; i< n1 ; i++){
            leftArr[i] = arr[l+i];
        }
        for(int  i = 0 ; i<n2; i++){
            rightArr[i] = arr[m+i+1];
        }
        int i = 0;
        int j = 0;

        int  k = l;
        while(i < n1 && j < n2){

            if(leftArr[i] < rightArr[j]){

                arr[k] = leftArr[i];
               // System.out.println(arr[k]);
                i++;
            }
            else{
                arr[k]  = rightArr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = leftArr[i];
            i++;k++;
        }
        while (j<n2){
            arr[k] = rightArr[j];
            j++;k++;
        }
    }

   public void  sort(int arr[] , int l , int r){

       if(l <  r){
            int m = l + (r - l)/2;

           sort(arr , l , m );
           sort(arr , m+1 , r);

           merge(arr , l , m , r);

       }
    }



    public static void main(String[] args) {

        MergeSort obj = new MergeSort();

        int arr[] = new int[]{56 , 78,-167,7689,9999,-23,-678};

        System.out.println(arr.length);
        obj.sort(arr , 0 , arr.length-1);

        for(int  i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }


}
