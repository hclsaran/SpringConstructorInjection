package com.saran;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saran.model.Customer;
 
 
class A{
	public Number sum(int a,int b) {
		return a+b;
	}
}
class B extends A{
	public Integer sum(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		A a1=new B();
		System.out.println(a1.sum(12, 12));
		
	}
}

//Integer is  A Wrapper class -> 

public class App 
{
    public static void main( String[] args )
    {
    	//Scope
    	ApplicationContext factory=new  ClassPathXmlApplicationContext("spring.xml");
    	Customer c=(Customer)factory.getBean("cust");
    	System.out.println(c);
    	
        
    }
}
