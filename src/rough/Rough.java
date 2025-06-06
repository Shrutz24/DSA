package rough;

import java.util.Arrays;

public class Rough {
    public static void main(String[] args) {
        int n=5;
        String s="1";
        for(int i=2; i<=n;++i){
            int occurance = 1 , num = 1;
            String[] sArr = s.split("");
            for(int j=0;j<sArr.length;++j){
                if((j<sArr.length-1)&&(sArr[j].equals(sArr[j+1]))){
                    ++occurance;
                    num = Integer.parseInt(sArr[j]);
                    ++j;
                }else{
                    s=String.valueOf(occurance)+String.valueOf(num);
                    occurance = 1;
                    num = Integer.parseInt(sArr[j]);
                }
            }

        }
        System.out.println(s);
    }
}
