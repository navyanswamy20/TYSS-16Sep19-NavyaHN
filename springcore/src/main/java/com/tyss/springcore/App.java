package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.di.Animal;
import com.tyss.springcore.di.Hello;
import com.tyss.springcore.di.Pet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	Hello hello=context.getBean(Hello.class);
    	System.out.println(hello.getMsg());
    	
    	System.out.println(hello.getMap());
    	Hello hello2 = context.getBean(Hello.class);
    	System.out.println(hello);
    	System.out.println(hello2);
    	//both hello and hello2 have same string representation bec both refvar having the same object
    	//Spring, by default create singleton obj for all bean configuration
    	Animal animal = context.getBean(Animal.class);
    	animal.makeSound();
    	Animal animal2 = (Animal) context.getBean("dog");
    	//getBean("dog") returns the object class ref so we have to downcast it to animal
    	animal2.makeSound();
    	
    	Pet pet = context.getBean(Pet.class);
    	System.out.println(pet.getName());
    	pet.getAnimal().makeSound();
    }
}
