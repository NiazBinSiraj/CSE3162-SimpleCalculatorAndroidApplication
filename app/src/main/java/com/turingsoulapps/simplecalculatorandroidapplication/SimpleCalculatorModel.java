package com.turingsoulapps.simplecalculatorandroidapplication;

public class SimpleCalculatorModel {

    private static String firstNumber = "";
    private static String secondNumber = "";

    public static void SetFirstNumber(String _firstNumber)
    {
        firstNumber += _firstNumber;
    }

    public static String GetFirstNumber()
    {
        return firstNumber;
    }

    public static void SetSecondNumber(String _secondNumber)
    {
        secondNumber += _secondNumber;
    }

    public static String GetSecondNumber()
    {
        return secondNumber;
    }

    public static String Add()
    {
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);

        double ans = num1+num2;

        String result;
        if(ans - (int)ans == 0) result = String.format("%.1f",ans);

        else result = String.format("%.3f",ans);

        return result;
    }

    public static String Subtract()
    {
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);

        double ans = num1-num2;

        String result;
        if(ans - (int)ans == 0) result = String.format("%.1f",ans);

        else result = String.format("%.3f",ans);

        return result;
    }

    public static String Multiply()
    {
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);

        double ans = num1*num2;

        String result;
        if(ans - (int)ans == 0) result = String.format("%.1f",ans);

        else result = String.format("%.3f",ans);

        return result;
    }

    public static String Division()
    {
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);

        if(num2 == 0.0) return "MATH ERROR";

        double ans = num1/num2;

        String result;
        if(ans - (int)ans == 0) result = String.format("%.1f",ans);

        else result = String.format("%.3f",ans);

        return result;
    }


    public static String Mod()
    {
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);

        double ans = num1%num2;

        String result;
        if(ans - (int)ans == 0) result = String.format("%.1f",ans);

        else result = String.format("%.3f",ans);

        return result;
    }

    public static String Power()
    {
        double num1 = Double.parseDouble(firstNumber);
        double num2 = Double.parseDouble(secondNumber);

        double ans = Math.pow(num1,num2);

        String result;
        if(ans - (int)ans == 0) result = String.format("%.1f",ans);

        else result = String.format("%.3f",ans);

        return result;
    }

    public static String Sqrt()
    {
        double num1 = Double.parseDouble(secondNumber);

        if(num1 < 0) return "MATH ERROR";

        double ans = Math.sqrt(num1);

        String result;
        if(ans - (int)ans == 0) result = String.format("%.1f",ans);

        else result = String.format("%.3f",ans);

        return result;
    }

    public static void ClearAll()
    {
        firstNumber = "";
        secondNumber = "";
    }

    public static void DeleteFirstNumber()
    {
        StringBuilder build = new StringBuilder(firstNumber);
        build.deleteCharAt(firstNumber.length()-1);
        firstNumber = "";
        firstNumber += build;
    }

    public static void DeleteSecondNumber()
    {
        StringBuilder build = new StringBuilder(secondNumber);
        build.deleteCharAt(secondNumber.length()-1);
        secondNumber = "";
        secondNumber += build;
    }

}