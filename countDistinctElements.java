import java.util.*;
class Main {
 
    static int distinct(int[] arr, int len)
    {
        HashSet<Integer> S = new HashSet<>();
 
        for (int i = 0; i < len; i++) {
            S.add(arr[i]);
        }
        int ans = S.size();
        return ans;
    }
 
    public static void main(String[] args)
    {
        int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45 };
 
        int l = arr.length;
        int dis_elements = distinct(arr, l);
        System.out.print(dis_elements + "\n");
    }
}

//Time Complexity: O(n*log(n))
//Auxiliary Space: O(n)
