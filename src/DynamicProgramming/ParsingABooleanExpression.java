package DynamicProgramming;

public class ParsingABooleanExpression {
    public boolean parse(char[] str , int i){
        if(str[i]=='t') return true;
        else if(str[i]=='f') return false;
        if(str[i]=='&') return parseAnd(str,i+2);
        else if(str[i]=='|') return parseOr(str,i+2);
        else return !parse(str,i+2);
    }
    public boolean parseAnd(char[] str , int i){
        boolean result = true;
        for(int k = i ,openCount = 0; k < str.length && openCount>=0 && result ; k++){
            if (str[k]=='(') openCount++;
            if(str[k]==')') openCount--;
            if (openCount==0){
            if (str[k]=='f') result = false;
            else if (str[k]=='&') result &= parseAnd(str,k+2);
            else if (str[k]=='|') result &= parseOr(str,k+2);
            else if (str[k]=='!') result &= parse(str,k);
        }}
        return result;
    }
    public boolean parseOr(char[] str , int i){
        boolean result = false;
        for(int k = i ,openCount = 0; k < str.length && openCount>=0 && !result ; k++){
            if (str[k]=='(') openCount++;
            if(str[k]==')') openCount--;
            if (openCount==0){
                if (str[k]=='t') result = true;
                else if (str[k]=='&') result &= parseAnd(str,k+2);
                else if (str[k]=='|') result &= parseOr(str,k+2);
                else if (str[k]=='!') result &= parse(str,k);
            }}
        return result;
    }

    public boolean parseBoolExpr(String expression) {
        return parse(expression.toCharArray(),0);
    }

    public void main(String[] args) {
        String expression = "|(&(t,f,t),!(t))";
        System.out.println(parseBoolExpr(expression));
    }
}
