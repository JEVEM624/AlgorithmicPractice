package leetcode;

import java.util.Stack;

/**
 * @Author JEVEM624
 * @Date 2019/3/25
 * @Version 1.0
 */
public class SimplifyPath {
    public static void main(String[] args) {
        new SimplifyPath().simplifyPath("/a/./b/../../c/");
    }
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        int begin = 0;
        int end = 0;
        String pa = new String();
        while (begin < path.length()) {
            if (path.charAt(begin)=='/'){
                if (pa.equals("")){

                }else if (pa.equals("..")){
                    if (!stack.isEmpty()){
                        stack.pop();

                    }
                    pa="";
                }else if(pa.equals(".")){
                    pa="";
                }else{
                    stack.push(pa);
                    pa="";
                }
                begin++;
                continue;
            }else {
                pa=pa+path.charAt(begin);
                begin++;
            }
        }
        if (!pa.equals("")){
            if (pa.equals("..")){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            }else if(pa.equals(".")){
            }else{
                stack.push(pa);
            }
        }
        String result=new String("");
        while (!stack.isEmpty()){
            result='/'+stack.pop()+result;
        }

        return result.equals("")?"/":result;
    }
}
