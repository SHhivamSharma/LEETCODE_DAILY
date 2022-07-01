// 493. Reverse Pairs

class Solution {
    public int reversePairs(int[] nums) {
        return mergesort(nums, 0, nums.length - 1);

        
    }
    
    public int mergesort(int[] arr, int l, int r){
        if(l >= r) return 0;
        int m = (l + r) / 2;
        int count = mergesort(arr, l, m);
        count += mergesort(arr, m + 1, r);
        count += merge(arr, l, m, r);
        return count;
    }
    public int merge(int[] arr, int l, int m, int r){
        int count = 0;
        int j = m + 1;
        for(int i = l; i <= m; i++){
            while(j <= r && arr[i] > (2 * (long)arr[j])){      
                j++;                
            }
            count += (j - (m + 1));
        }
        ArrayList<Integer> temp = new ArrayList<>();
        int first = l, second = m + 1;
        while(first <= m && second <= r){
           if(arr[first] < arr[second])
               temp.add(arr[first++]);
            else
                temp.add(arr[second++]);
        }
        while(first <= m){
           temp.add(arr[first++]); 
        }
         while(second <= r){
        temp.add(arr[second++]);
         }
        for(int i = l; i <= r; i++)
            arr[i] = temp.get(i - l);
        return count;
    }
}