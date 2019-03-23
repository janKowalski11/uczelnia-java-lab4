/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plywacz.scicalc.calcmethods;

import com.plywacz.scicalc.enums.CalcOperation;
import javax.swing.JOptionPane;
import org.mariuszgromada.math.mxparser.*;

/**
 *
 * @author BeGieU
 */
public class TrigonometryMethodsService implements TrigonometryMethods, Calculable {

    @Override
    public double evaluateSinus(double x) {
        Expression exp = new Expression("sin(" + x + ")");
        return exp.calculate();
    }

    @Override
    public double evaluateCosinus(double x) {
        Expression exp = new Expression("cos(" + x + ")");
        return exp.calculate();
    }

    @Override
    public double evaluateTangens(double x) {
        Expression exp = new Expression("tan(" + x + ")");
        return exp.calculate();
    }

    @Override
    public double evaluateCotangens(double x) {
        Expression exp = new Expression("ctan(" + x + ")");
        return exp.calculate();
    }

    @Override
    public double evaluateSecant(double x) {
        Expression exp = new Expression("sec(" + x + ")");
        return exp.calculate();
    }

    @Override
    public Double calculate(String formula, CalcOperation operation) {

//        Double val;
//        try {
//            val = Double.valueOf(formula);
//        } catch (NumberFormatException exc) {
//            JOptionPane.showMessageDialog(null, "Wrong formula given\n  "
//                    + "Your operation is: " + operation.toString()
//                    + " so you should write only number i.e 2.5");
//            return null;
//        }
//
//        double result = 0;
//        switch (operation) {
//            case SINUS:
//                result = evaluateSinus(val);
//                break;
//            case COSINUS:
//                result = evaluateCosinus(val);
//                break;
//            case TANGENS:
//                result = evaluateTangens(val);
//                break;
//            case COTANGENS:
//                result = evaluateTangens(val);
//                break;
//            case SECANT:
//                result = evaluateSecant(val);
//                break;
//            default:
//                throw new RuntimeException("undefined operation: " + operation);
//        }
//        return result;
        Expression exp = new Expression(formula);
        Double res = exp.calculate();
        if (res.equals(Double.NaN)) {
            JOptionPane.showMessageDialog(null, "Wrong formula given\n  "
                    + "Your operation is: " + operation.toString()
                    + " so you just replace x with double value i.e sin(2)");
            return null;
        }

        return res;

    }

    public static void main(String[] args) {
//        TrigonometryMethods trigonometryMethods = new TrigonometryMethodsImpl();
//        System.err.println(trigonometryMethods.evaluateCotangens(2));

        String s = "sin(2)";
        Expression exp = new Expression("XDDD");
        System.err.println(exp.calculate());

    }

}
