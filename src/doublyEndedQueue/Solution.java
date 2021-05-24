package doublyEndedQueue;

import java.util.*;

public class Solution {
	public static void main(String args[]) {
		solution Sol = new solution();
		int a[]  = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int ans[] = Sol.maxSlidingWindow(a, k);
		for(int x: ans) {
			System.out.print(x+" ");
		}
		
	}
	static class solution{
	 public int[] maxSlidingWindow(int[] a, int k) {
		 	int n = a.length;
	        Deque<Integer> dq = new LinkedList<>();
	        int ans[] = new int[n-k+1];
	        int i = 0;
	        for(;i<k;i++) {
	        	while(!dq.isEmpty() && a[dq.peekLast()]< a[i]) {
	        		dq.removeLast();
	        	}
	        	dq.addLast(i);
	        }
	        for(;i<n;i++)
	        {
	        	ans[i-k] = a[dq.peekFirst()];
	        while(!dq.isEmpty() && dq.peekFirst() <= i-k) {
	        	dq.removeFirst();
	        }
	        while(!dq.isEmpty() && a[dq.peekLast()]< a[i]) {
        		dq.removeLast();
        	}
        	dq.addLast(i);
	        }
	        ans[i-k] = a[dq.peekFirst()];
	        
	        return ans;
	    }
	}
}
