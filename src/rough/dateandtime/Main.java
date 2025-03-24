package rough.dateandtime;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String[] strs = {"ab", "a"};
        int count = Integer.MAX_VALUE;
        int index = 0;
        String[] str = strs[0].split("");
        System.out.println(Arrays.toString(str));
        String prefix = str[0];

        String result = "-1";
        boolean flag = true;
        for(int i=0;i<str.length; ++i){

            for(String s: strs){
                if(!s.startsWith(prefix)){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }else{
                result = prefix;
                if(i !=0){
                    prefix += str[i];
                }

            }

        }
        if(result.equals("-1")){
            System.out.println("Notfound");
        }else{
            if(flag){
                System.out.println(prefix);
            }else{
                System.out.println(result);
            }

        }



    }
}