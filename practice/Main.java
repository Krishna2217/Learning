package practice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String s1 = "abb";
        String s2 = new StringBuilder(s1).reverse().toString();
        int length = findLongestPallindromeSubsequence(s1, s2);
        System.out.println("Length of Longest Palindrome Subsequence: " + length);
    }

    private static int findLongestPallindromeSubsequence(String s1, String s2) {
        int n1 = s1.length();
        int [][] dp = new int[n1][n1];
        for(int[] temp : dp){
            Arrays.fill(temp,-1);
        }
        return solve(0,0,s1,s2,dp);
    }

    private static int solve(int idx1, int idx2, String s1, String s2,int[][]dp) {
        //base case
        if(idx1>=s1.length() || idx2 >= s2.length()){
            return 0;
        }
        //pre calculated result
        if(dp[idx1][idx2] != -1) {
            return dp[idx1][idx2];
        }
        //match case
        if(s1.charAt(idx1) == s2.charAt(idx2)){
            return dp[idx1][idx2] = 1 + solve(idx1+1,idx2+1,s1,s2,dp);
        }
        return dp[idx1][idx2] = Math.max(solve(idx1,idx2+1,s1,s2,dp),solve(idx1+1,idx2,s1,s2,dp));
    }

}
