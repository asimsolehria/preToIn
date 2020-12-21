
package pretoin;

import java.util.Stack;

/**
 *
 * @author asim
 */
public class PreToIn 
{
    public static String preToIn(String exp)
    {
        Stack<String> stack=new Stack<>();
        
        for (int i = exp.length()-1; i >= 0; i--)
        {
            char c=exp.charAt(i);
            
            if(Character.isLetterOrDigit(c))
                stack.push(c+"");
            else
            {
                String opnd1=stack.pop();
                String opnd2=stack.pop();
                String infix="("+opnd1+c+opnd2+")";
                stack.push(infix);
            }
        }
        
        return stack.pop();
    }
    
}
