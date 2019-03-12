package StringProblems.Easy;
import java.util.Stack;
// 关键是最后要判断栈是否为空，如果有右括号，栈为空，说明右括号多余左括号，则返回false，在最后循环结束后，如果栈不为空，说明左括号多余右括号，则返回false
public class ValidParenteses {
    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for(int i = 0;i < s.length();i++){
//             System.out.println("i = " + s.charAt(i));
//            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
//                stack.push(s.charAt(i));
//                 System.out.println("push的是 " + s.charAt(i));
//            }
//            else{
//                char left;
//                if(stack.empty())
//                    return false;
//                else
//                    left = stack.pop();
//                 System.out.println("弹出的是 " + left);
//                if(s.charAt(i) == '}'){
//                    if(left == '{');
//                    else
//                        return false;
//                }
//                else if(s.charAt(i) == ']'){
//                    if(left == '[');
//                    else
//                        return false;
//                }
//                else{
//                    if(left == '(');
//                    else
//                        return false;
//                }
//            }
//        }
//        if(stack.empty())
//            return true;
//        else
//            return false;

        Stack<Character> stack =new Stack<>();
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '[')
                stack.push(']');
            else if(s.charAt(i) == '{')
                stack.push('}');
            else if(s.charAt(i) == '(')
                stack.push(')');
            else if(stack.empty() || stack.pop() != s.charAt(i)) // 这里的判断是否为空是为了防止右括号多余左括号
                return false;
        }
        return stack.empty(); // 这里的判断是否为空是为了防止左括号多余右括号

    }
    public static void main(String[] args)
    {
        ValidParenteses t = new ValidParenteses();
         String s = "()[]{}";
        // String s = "";
        // System.out.println(nums.length);
        System.out.println(t.isValid(s));
    }
}
