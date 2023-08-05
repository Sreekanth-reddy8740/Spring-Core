package org.sreekanth.Spring.Util;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "bike")
public class Bike implements Vechile{

	@Override
	public void travel() {
		
		
	}

}
