/**
 * 
 */
package com.cg.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

/**
 * @author benaim
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj =  (HelloWorld) context.getBean("helloWorld");
		System.out.println(obj);
		//System.out.println("Spring version: "+SpringVersion.getVersion());

	}

}
