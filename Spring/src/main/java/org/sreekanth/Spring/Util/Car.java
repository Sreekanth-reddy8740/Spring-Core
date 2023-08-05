package org.sreekanth.Spring.Util;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "car")
public class Car implements Vechile{

	@Override
	public void travel() {
		
		
	}

}
