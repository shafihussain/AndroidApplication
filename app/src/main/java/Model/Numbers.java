package Model;

/**
 * Created by Shafi on 2018-04-11.
 */

public class Numbers {

    private int operand1;
    private int operand2;
    private int operator;

    public Numbers(int operand1, int operand2, int operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public int getResult(){

        int result=0;
        switch (operator){

            case 0 : result= operand1+operand2;break;
            case 1 : result= operand1-operand2;break;
            case 2 : result= operand1*operand2;break;
        }
        return result;
    }
}
