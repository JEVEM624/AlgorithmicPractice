package leetcode;

/**
 * @Author JEVEM624
 * @Date 2019/3/24
 * @Version 1.0
 */
public class PartitionArrayintoThreePartswithEqualSum {

    public boolean canThreePartsEqualSum(int[] A) {
        if (A.length<3){
            return false;
        }
        int sum=0;
        for (int i = 0; i < A.length; i++) {
            sum=sum+A[i];
        }
        if (sum%3!=0){
            return false;
        }else{
            sum=sum/3;
        }
        int flag=0;
        int temp=0;
        for (int i = 0; i < A.length; i++) {
            temp=temp+A[i];
            if (temp==sum){
                flag++;
                temp=0;
            }
        }
        if (flag==3){
            return true;
        }else {
            return false;
        }
    }
}
