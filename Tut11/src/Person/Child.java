/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author Win 8.1 Version 2
 */
public class Child extends Person {

    public Child(String name, int age) {
        super(name,age);
    }

    public void setAge(int age) throws IllegalArgumentException{
        super.setAge(age);
    }
}
