package com.infosys.pojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("shoppingList")
@Scope("prototype")
public class ShoppingList {

	private List<Mobile> items = new ArrayList<Mobile>();
	
	public void addItem(Mobile mm) {
		items.add(mm);
	}
	
	public void showItems() {
		System.out.println("---------------------------------");
		for(Mobile m:items) {
			System.out.println(m.toString());
		}
	}
}
