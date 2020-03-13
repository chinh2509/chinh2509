/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClassesInterfaces;

/**
 *
 * @author Dell
 */
public class testanimal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.greeting();
        Dog Dog = new Dog();
        Dog.greeting();
        BigDog BigDog = new BigDog();
        BigDog.greeting();
        
        animal animal1 = new Cat();
        animal1.greeting();
        animal animal2 = new Cat();
        animal2.greeting();
        animal animal3 = new Cat();
        animal3.greeting();
        animal animal4 = new Cat();
        animal4.greeting();
        
        Dog dog2 = (Dog)animal2;
        Dog dog3 = (Dog)animal3;
        BigDog bigdog2 = (BigDog)animal2;
        Cat cat2= (Cat)animal2;
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        bigdog2.greeting(dog2);
        bigdog2.greeting(dog2);
        
    }
}
