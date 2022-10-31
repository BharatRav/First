public class MergeShort_interview {
    static void merge(int []arr, int l, int mid,int r){
        int n1=mid-l+1;   //length of half 8,4,3,7
        int n2= r-mid;
        int a1[] = new int[n1];
        int a2[]= new int [n2];
        for(int i=0;i<n1;i++){
            a1[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            a2[j]=arr[mid+j+1];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(a1[i]<a2[j]){
                arr[k]=a1[i];
                i++;
            }else{
                arr[k]=a2[j];
                j++;
            }
            k++;
        }
         while(i<n1){
             arr[k]=a1[i];
             i++;
             k++;
         }
        while(j<n2){
            arr[k]=a2[j];
            j++;
            k++;
        }
    }
    static void mergeSort(int []arr,int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    public static void main(String[] args) {
        int arr[]={8,7,5,4,9,3,6};
        //for first printing
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //now calling merge short function
        mergeSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("***************************");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
