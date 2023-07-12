package longest_palindom;
import java.lang.*;
import java.util.*;


public class Longest_palindom {
String longpalindom(String s){
    int n=s.length();
    //vector<vector<int>>dp(n,vector<int>(n,0));
    int dp[][]= new int[n][n];
    //int s[]=new int[n];
    String ans=null;
    int max=0;
    
    char []ch1=s.toCharArray();
    
//    char ch=new char[n];
//    for(int k=0;k<n;k++)
//        ch[k]=s.charAt(k);
    
    for(int diff=0;diff<n;diff++){
        for(int i=0,j=i+diff;j<n;i++,j++){
        if(i==j){
            dp[i][j]=1;
        }
        else if(diff==1){
            dp[i][j]=(ch1[i]==ch1[j])?2:0;
        }
        else{
            if(ch1[i]==ch1[j] && dp[i+1][j-1]>0)
                dp[i][j]=dp[i+1][j-1]+2;
        }
        if(dp[i][j]!=0){
            if(j-i+1>max){
                max=j-i+1;
                ans=s.substring(i,max);
            }
        }
    }
    }
    return ans;
}
   
    public static void main(String[] args) {
        // TODO code application logic here
        Longest_palindom l=new Longest_palindom();
        char[] c={'a','a','b','c','a','a'};
        String b=new String(c);
        String a=l.longpalindom(b);
        System.out.println(a);
    }
    
}
