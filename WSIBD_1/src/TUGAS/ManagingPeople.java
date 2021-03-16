/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

/**
 *
 * @author ACER
 */
class person {
    String Name;
    int Age;
    
    public void set(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }
    public String getName() {
        return Name;
    }
    public int getAge() {
        return Age;
    }
}
public class ManagingPeople {
    public static void main(String[] args) {
        person p1 = new person();
        p1.set("arial", 21);
        person p2 = new person();
        p2.set("jason", 18);
        
        if(p1.getAge()==p2.getAge()) {
            System.out.println(p1.getAge()+" "+"is the same age as"+ p2.getName());
        }
        else {
            System.out.println(p1.getName()+" "+"is Not the same age as"+ p2.getName());
        }
    }
    
}
