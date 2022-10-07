
class Solution
{
	int  select(int arr[], int i)
	{
        int small=arr[i];
        int index=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<small){
                small=arr[j];
                index=j;
            }
        }
        int temp=arr[i];
        arr[i]=small;
        arr[index]=temp;
        return small;
        
	}
	
	void selectionSort(int arr[], int n)
	{
	   for(int i=0;i<n;i++){
	       arr[i]=select(arr,i);
	   }
	}
}
