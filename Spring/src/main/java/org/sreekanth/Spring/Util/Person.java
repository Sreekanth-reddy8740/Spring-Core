package org.sreekanth.Spring.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Autowired @Qualifier("car")
	private Car car;
	
	public void goingToWord() {
		
	}
}
