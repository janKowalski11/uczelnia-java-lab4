/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.plywacz.scicalc.calcmethods;

import com.plywacz.scicalc.enums.CalcOperation;
import java.text.MessageFormat;
import java.util.Date;
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
    public Double calculate(String formula) {

        Expression exp = new Expression(formula);
        if (exp.checkSyntax()) {
            return exp.calculate();
        }
        throw new IllegalArgumentException("wrong formula given :  " + formula);

    }

    public static void main(String[] args) {

        int res = 7;
        String formula = "sin(x)";

        String result = MessageFormat.format(
                " {0}\t{1} = {2} \n",
                new Date(), formula, res);

        System.err.println(result);
    }

}
