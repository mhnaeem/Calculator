import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

/**
 * This class provides all the functionality for the calculations required.
 *
 * @author (Muhammad Hammad)
 * @version (v1.0, 19-Aug-2019)
 */
    
public class Calculation{
    private String mainSt = "";
    /**
     * Constructor for the Calculation class
     *
     * @param - String st takes the main equation
     */
    public Calculation(String st){
        mainSt = st;
        while (multiplyAndDivideCheck(mainSt)){
            mainSt = multipleOperatorsReplace(mainSt);
            mainSt = multiplyAndDivideEvaluation(mainSt);
        }
        while (!checkNumber(mainSt)){
            mainSt = multipleOperatorsReplace(mainSt);
            mainSt = additionAndSubtractionEvaluation(mainSt);
        } 
    }
    /**
     * An accessor method for the solved equation
     *
     * @return - String returns the solved answer
     */
    public String returnAnswer(){
        return mainSt;
    }
    /**
     * An accessor method for the cos function
     *
     * @return - String returns the solved cos function
     */
    public String cosAnswer(){
        return Double.toString(Math.cos(Double.parseDouble(mainSt)));
    }
    /**
     * An accessor method for the sin function
     *
     * @return - String returns the solved sin function
     */
    public String sinAnswer(){
        return Double.toString(Math.sin(Double.parseDouble(mainSt)));
    }
    /**
     * An accessor method for the tan function
     *
     * @return - String returns the solved tan function
     */
    public String tanAnswer(){
        return Double.toString(Math.tan(Double.parseDouble(mainSt)));
    }    
    /**
     * Checks whether a string is an integer
     *
     * @param - String st a string that is to be checked
     * @return - boolean true if the string is an integer
     */    
    private boolean checkInteger(String eq){
        try{
            Integer.parseInt(eq);
        }
        catch(NumberFormatException e1){
            return false;
        }        
        return true;
    }
    /**
     * Checks whether a string is a double
     *
     * @param - String st a string that is to be checked
     * @return - boolean true if the string is an double
     */     
    private boolean checkDouble(String eq){
        try{
            Double.parseDouble(eq);
        }
        catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    /**
     * Checks whether a string is a number
     *
     * @param - String st a string that is to be checked
     * @return - boolean true if the string is a number
     */      
    private boolean checkNumber(String eq){
        return (checkDouble(eq) || checkInteger(eq));
    }  
    /**
     * Checks whether a character is an operator
     *
     * @param - char ch character to be checked
     * @return - boolean true if the string is an integer
     */      
    private boolean isOperator(char ch){
        return ( isDivide(ch) || isMultiply(ch) || isAdd(ch) || isMinus(ch));
    }
    /**
     * Checks whether a character represents division
     *
     * @param - char ch character to be checked
     * @return - boolean true if the character represents division
     */  
    private boolean isDivide(char ch){ return (ch == '/'); }
    /**
     * Checks whether a character represents multiply
     *
     * @param - char ch character to be checked
     * @return - boolean true if the character represents multiply
     */      
    private boolean isMultiply(char ch){ return (ch == '*'); }
    /**
     * Checks whether a character represents addition
     *
     * @param - char ch character to be checked
     * @return - boolean true if the character represents addition
     */      
    private boolean isAdd(char ch){ return (ch == '+'); }  
    /**
     * Checks whether a character represents subtraction
     *
     * @param - char ch character to be checked
     * @return - boolean true if the character represents subtraction
     */  
    private boolean isMinus(char ch){ return (ch == '-'); }   
    /**
     * Checks whether a string contains division or multiplication
     *
     * @param - String st string to be checked
     * @return - boolean true if the string has multiple or division
     */      
    private boolean multiplyAndDivideCheck(String st){
        for (int i = 0; i < st.length(); i++){
            char chh = st.charAt(i);
            if (isDivide(chh) || isMultiply(chh)){
                return true;
            }
        }
        return false;
    }    
    /**
     * Evaluates an equation for addition and subtraction from left to right
     *
     * @param - String inpS contains the equation that needs to be solved
     * @return - String the reduced version of the equation
     */      
    private String additionAndSubtractionEvaluation(String inpS){
        String s1 = "", s2 = "", s3 = "";
        int num1 = 0, num2 = 0;
        int num3 = inpS.length();
        
        for (int i = 0; i < inpS.length(); i++){
            char chh = inpS.charAt(i); 
            if( isOperator(chh)){              
                if ((num2 != 0) && (num3 == inpS.length())){
                    num3 = i;
                } 
                if (num2 == 0) { num2 = i; }               
            }
        }
        s3 = inpS.substring(num3, inpS.length());
        for (int j = num2-1; j >= 0; j--){
            char chh = inpS.charAt(j);
            if ( isOperator(chh) ){
                if (num1 == 0){ num1 = j+1; }
            }
        }
        s2 = inpS.substring(num1, num3);
        s1 = inpS.substring(0, num1);
        String newSt = evaluate(s2);
        return s1+newSt+s3;        
    }
    /**
     * Evaluates an equation for multiplication and division from left to right
     *
     * @param - String inpS contains the equation that needs to be solved
     * @return - String the reduced version of the equation
     */          
    private String multiplyAndDivideEvaluation(String inpS){
        String s1 = "", s2 = "", s3 = "";
        int num1 = 0, num2 = 0;
        int num3 = inpS.length();       
        
        for (int i = 0; i < inpS.length(); i++){
            char chh = inpS.charAt(i); 
            if( isOperator(chh)){              
                if ((num2 != 0) && (num3 == inpS.length())){
                    num3 = i;
                } 
            }
            if ( isDivide(chh) || isMultiply(chh) ){
                if (num2 == 0) { num2 = i; }               
            }
        }
        s3 = inpS.substring(num3, inpS.length());
        for (int j = num2-1; j >= 0; j--){
            char chh = inpS.charAt(j);
            if ( isOperator(chh) ){
                if (num1 == 0){ num1 = j+1; }
            }
        }
        s2 = inpS.substring(num1, num3);
        s1 = inpS.substring(0, num1);
        return (s1 + evaluate(s2) + s3);
    }  
    /**
     * Evaluates an equation and performs the various operators
     *
     * @param - String st contains the equation that needs to be solved
     * @return - String the evaluated answer
     */          
    private String evaluate(String st){
        int index = 0;
        for (int i = index; i < st.length(); i++){
            char ch = st.charAt(i);
            if (isOperator(ch)){ index = i; }
        }
        String s1 = st.substring(0, index);
        String s2 = st.substring(index+1,st.length());
        double toReturn = 0;
        char ch = st.charAt(index);
        
        if (checkNumber(s1) && checkNumber(s2)){
            switch(ch){
                case '/':
                    return Double.toString(Double.valueOf(s1) / Double.valueOf(s2));
                case '*':
                    return Double.toString(Double.valueOf(s1) * Double.valueOf(s2));
                case '+':
                    return Double.toString(Double.valueOf(s1) + Double.valueOf(s2));
                case '-':
                    return Double.toString(Double.valueOf(s1) - Double.valueOf(s2));
                }
        }
        return st;
    }
    /**
     * Fixes the problems with consecutive operators
     *
     * @param - String st contains the equation that needs to be fixed
     * @return - String the fixed answer
     */      
    private String multipleOperatorsReplace(String st){
        st = st.replace("--", "+");
        st = st.replace("++", "+");
        st = st.replace("+-", "-");
        st = st.replace("-+", "-");
        st = st.replace("/+", "/");
        st = st.replace("*+", "*");
        return st;
    }
}   
