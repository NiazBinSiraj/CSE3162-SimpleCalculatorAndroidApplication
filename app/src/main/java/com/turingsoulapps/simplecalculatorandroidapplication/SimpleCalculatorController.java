package com.turingsoulapps.simplecalculatorandroidapplication;

public class SimpleCalculatorController {
    private static String operator = "";

    public static String setOperation(String view)
    {
        if(isOperator(view) == true)
        {
            operator = view;
            return SimpleCalculatorModel.GetFirstNumber()+operator+SimpleCalculatorModel.GetSecondNumber();
        }

        else if(view == "clear")
        {
            operator = "";
            SimpleCalculatorModel.ClearAll();
            return "";
        }

        else if(view == "delete")
        {
            if(operator == "") SimpleCalculatorModel.DeleteFirstNumber();
            else
            {
                if(SimpleCalculatorModel.GetSecondNumber() == "") operator = "";
                else SimpleCalculatorModel.DeleteSecondNumber();
            }

            return SimpleCalculatorModel.GetFirstNumber()+operator+SimpleCalculatorModel.GetSecondNumber();
        }

        else if(view == "=")
        {
            if(operator == "+") return SimpleCalculatorModel.Add();
            if(operator == "-") return SimpleCalculatorModel.Subtract();
            if(operator == "*") return SimpleCalculatorModel.Multiply();
            if(operator == "/") return SimpleCalculatorModel.Division();
            if(operator == "^") return SimpleCalculatorModel.Power();
            if(operator == "%") return SimpleCalculatorModel.Mod();
            if(operator == "Sqrt of ") return SimpleCalculatorModel.Sqrt();
            else return "MATH ERROR";
        }

        else
        {
            if(SimpleCalculatorModel.GetFirstNumber().length() >= 10 && operator == "")
            {
                return SimpleCalculatorModel.GetFirstNumber()+operator+SimpleCalculatorModel.GetSecondNumber();

            }
            else if(SimpleCalculatorModel.GetSecondNumber().length() >= 10 && operator != "")
            {
                return SimpleCalculatorModel.GetFirstNumber()+operator+SimpleCalculatorModel.GetSecondNumber();

            }
            else if(operator == "") SimpleCalculatorModel.SetFirstNumber(view);
            else SimpleCalculatorModel.SetSecondNumber(view);
            return SimpleCalculatorModel.GetFirstNumber()+operator+SimpleCalculatorModel.GetSecondNumber();
        }
    }

    private static boolean isOperator(String op)
    {
        if(op == "+" || op == "-" || op == "*" || op == "/" || op == "^" || op == "%" || op == "Sqrt of ") return true;
        return false;
    }
}
