package questions.random;

public class L387 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        String[] sArr = s.split("");
        int unique = -1;
        boolean duplicate = false;
        for(int i=0;i<sArr.length; ++i){
            for(int j=0;j<sArr.length; ++j){
                if(j != i){
                    if(sArr[i].equals(sArr[j])){
                        duplicate = true;
                        break;
                    }
                }
            }
            if(!duplicate){
                unique = i;
                break;
            }
        }
        System.out.println(unique);
    }
}
