/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasBKPM;

/**
 *
 * @author ACER
 */
class A {
        void callthis() {
            System.out.println("Inside Class A's Method!");
        }
    }
    class B extends A {
        @Override
        void callthis() {
            System.out.println("Inside Class B's Method!");
        }
    }
    class C extends A {
        @Override
        void callthis() {
            System.out.println("Inside Class C's Method!");
        }
    }
public class dinamicDispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;
        
        ref = b;
        ref.callthis();
        
        ref = c;
        ref.callthis();
        
        ref = a;
        ref.callthis();
    }
}
