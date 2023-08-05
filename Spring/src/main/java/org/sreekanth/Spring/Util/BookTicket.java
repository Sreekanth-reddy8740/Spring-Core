package org.sreekanth.Spring.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Scope("prototype") ----> how many times calling that times objects are created.

@Scope("singleton")// how many times calling only one object is created.
@Component
public class BookTicket {

// private PaymentGateWay gateway = new PaymentGateWay(); == Here we facing tight coupling Because of we are using new Keyword.
// Dependency Injunction
	
	@Autowired
	private PaymentGateWay gateway;
	
	public BookTicket() {
		
		System.out.println(this.getClass().getSimpleName()+" class object created");
	}

	@Override
	public String toString() {
		return "BookTicket [gateway=" + gateway + "]";
	}

	

	
}

