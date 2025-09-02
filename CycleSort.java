public class CycleSort {
    public static void main(String[] args) {
        int[]arr={3,-5,0,-3,1};
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            while((arr[i]>=1 && arr[i]<=n) && (arr[i]!=arr[arr[i]-1])){
                int temp=arr[i];
                arr[i]=arr[arr[i]-1];
                arr[temp-1]=temp;
            }
        }
        for(int a:arr){
            System.out.print(a+"    ");
        }
        System.out.print("\nFirst missing positive:");
        for(int i=1;i<n;i++){
            if(i!=arr[i-1]){
                System.out.println(i);
                break;
            }
        }
    }
}
