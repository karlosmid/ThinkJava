/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thinkjava;

/**
 *
 * @author karlo
 */
public class Rational {
    int numerator;
    int denominator;
    public Rational(){
        this.numerator = 0;
        this.denominator = 0;
    }
    public Rational(int n, int d){
        this.numerator = n;
        this.denominator = d;
    }
    public void negate(Rational r){
        r.numerator = - r.numerator;
    }
    public void invert(Rational r){
        int tmp = r.numerator;
        r.numerator = r.denominator;
        r.denominator = tmp;
    }
    public double toDouble(Rational r){
        return (double)(r.numerator)/(double)(r.denominator);
    }
    public int gdc(int a, int b){
        if (b == 0)
            return a;
        else
            return gdc(b,a%b);
    }
    public void reduce(Rational r){
        int gdc = this.gdc(r.numerator,r.denominator);
        r.numerator = r.numerator/gdc;
        r.denominator = r.denominator/gdc;
    }
    public Rational add(Rational r1, Rational r2){
        Rational rez = new Rational();
        rez.denominator = r1.denominator * r2.denominator;
        rez.numerator = (rez.denominator/r1.denominator)*r1.numerator +
        (rez.denominator/r2.denominator)*r2.numerator;
        rez.reduce(rez);
        return rez;
    }
    public void printRational(Rational r){
        System.out.println(r.numerator+"/"+r.denominator);
    }
    public static void main(String[] args){
        Rational r = new Rational();
        r.printRational(r);
        Rational r2 = new Rational(3,4);
        r.printRational(r2);
        r.negate(r2);
        r.printRational(r2);
        r.invert(r2);
        r.printRational(r2);
        System.out.println(r.toDouble(r2));
        Rational r3 = new Rational(5,10);
        r.printRational(r3);
        r.reduce(r3);
        r.printRational(r3);
        r.reduce(r2);
        r.printRational(r2);
        Rational a1 = new Rational(3,2);
        Rational a2 = new Rational(1,6);
        Rational rez = a1.add(a1, a2);
        rez.printRational(rez);
    }
}
