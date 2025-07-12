package lineardatastructure.string;

import java.util.ArrayList;
import java.util.List;

public class KMP {
    public void LPS(String pattern,int[]lps){
        lps[0]=0;
        int len = 0;
        int i=1;
        while(i<lps.length){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len = lps[len-1];
                }else{
                    i++;
                }
            }
        }
    }

    public List<Integer> Kmp(String txt, String pattern){
        int []lps = new int[pattern.length()];
        List<Integer> result = new ArrayList<>();
        LPS(pattern,lps);
        int i=0;
        int j=0;
        while(i<txt.length() && j<pattern.length()){
            if(txt.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
            }
            if(j==pattern.length()){
                result.add(i-j);
                j = lps[j-1];
            }else if(i<txt.length() && txt.charAt(i)!=pattern.charAt(j)){
                if(j!=0) {
                    j = lps[j - 1];
                }else{
                    i++;
                }
            }
        }
        return result;

    }


}
