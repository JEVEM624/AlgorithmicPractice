package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author JEVEM624
 * @Date 2019/3/13
 * @Version 1.0
 */
public class LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String>result =new ArrayList<>();
        if (digits.length()<=0){
            return result;
        }
        helper(result, digits, "", 0);
        return result;
    }
    public void helper(List<String>result,String digits,String num,int index){
        if (index>=digits.length()){
            result.add(num);
            return;
        }
        switch (digits.charAt(index)){
            case '2':
                helper(result, digits, num+"a", index+1);
                helper(result, digits, num+"b", index+1);
                helper(result, digits, num+"c", index+1);
                break;
            case '3':
                helper(result, digits, num+"d", index+1);
                helper(result, digits, num+"e", index+1);
                helper(result, digits, num+"f", index+1);
                break;
            case '4':
                helper(result, digits, num+"g", index+1);
                helper(result, digits, num+"h", index+1);
                helper(result, digits, num+"i", index+1);
                break;
            case '5':

                helper(result, digits, num+"j", index+1);
                helper(result, digits, num+"k", index+1);
                helper(result, digits, num+"l", index+1);
                break;
            case '6':
                helper(result, digits, num+"m", index+1);
                helper(result, digits, num+"n", index+1);
                helper(result, digits, num+"o", index+1);
                break;
            case '7':
                helper(result, digits, num+"p", index+1);
                helper(result, digits, num+"q", index+1);
                helper(result, digits, num+"r", index+1);
                helper(result, digits, num+"s", index+1);
                break;
            case '8':
                helper(result, digits, num+"t", index+1);
                helper(result, digits, num+"u", index+1);
                helper(result, digits, num+"v", index+1);
                break;
            case '9':
                helper(result, digits, num+"w", index+1);
                helper(result, digits, num+"x", index+1);
                helper(result, digits, num+"y", index+1);
                helper(result, digits, num+"z", index+1);
                break;
        }
    }
}
