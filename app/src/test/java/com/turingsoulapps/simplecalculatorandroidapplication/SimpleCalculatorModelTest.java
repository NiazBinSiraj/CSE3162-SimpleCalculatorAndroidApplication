package com.turingsoulapps.simplecalculatorandroidapplication;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorModelTest {

    @Test
    public void checkAdd() throws Exception
    {
        SimpleCalculatorModel.SetFirstNumber("2.0");
        SimpleCalculatorModel.SetSecondNumber("2.0");
        assertEquals("4.0", SimpleCalculatorModel.Add());

        SimpleCalculatorModel.ClearAll();

        SimpleCalculatorModel.SetFirstNumber("5.3");
        SimpleCalculatorModel.SetSecondNumber("2.3");
        assertEquals("7.600", SimpleCalculatorModel.Add());

        SimpleCalculatorModel.ClearAll();
    }

    @Test
    public void checkDevide() throws Exception
    {
        SimpleCalculatorModel.SetFirstNumber("2.0");
        SimpleCalculatorModel.SetSecondNumber("2.0");
        assertEquals("1.0", SimpleCalculatorModel.Division());

        SimpleCalculatorModel.ClearAll();

        SimpleCalculatorModel.SetFirstNumber("5.0");
        SimpleCalculatorModel.SetSecondNumber("0.0");
        assertEquals("NaN", SimpleCalculatorModel.Division());

        SimpleCalculatorModel.ClearAll();
    }

    @Test
    public void checkSqrt() throws Exception
    {
        SimpleCalculatorModel.SetOperator("-");
        SimpleCalculatorModel.SetSecondNumber("2.0");
        assertEquals("NaN", SimpleCalculatorModel.Sqrt());

        SimpleCalculatorModel.ClearAll();

        SimpleCalculatorModel.SetOperator("+");
        SimpleCalculatorModel.SetSecondNumber("2.0");
        assertEquals("1.414", SimpleCalculatorModel.Sqrt());

        SimpleCalculatorModel.ClearAll();
    }

}
