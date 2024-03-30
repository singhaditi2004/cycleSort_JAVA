public class Cyclesort {
    public static void main(String[] args) {
        int [] arr = {1,2,8,4,5,3,6,7};
        cycleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
     }
    static void cycleSort(int [] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
            
        }
    }
    static void swap(int [] arr , int firstNum , int secondNum){
        int temp = arr[firstNum];
        arr[firstNum]=arr[secondNum];
        arr[secondNum]=temp;
}
}
