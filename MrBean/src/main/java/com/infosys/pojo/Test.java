package com.infosys.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		Mobile ip = context.getBean("iphone",Mobile.class);
		Mobile mi = context.getBean("mi",Mobile.class);
		Mobile mt = context.getBean("moto",Mobile.class);

		ShoppingList list1 = context.getBean("shoppingList",ShoppingList.class);
		list1.addItem(ip);
		list1.showItems();
		
		ShoppingList list2 = context.getBean("shoppingList",ShoppingList.class);
		list2.addItem(mi);
		list2.showItems();
		
		ShoppingList list3 = context.getBean("shoppingList",ShoppingList.class);
		list3.addItem(mt);
		list3.showItems();
		
	}

}
