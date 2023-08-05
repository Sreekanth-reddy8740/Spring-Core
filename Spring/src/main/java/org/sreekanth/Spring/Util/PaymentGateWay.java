package org.sreekanth.Spring.Util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Scope("prototype")===how many times calling that times objects are created.

@Scope("singleton")// how many times calling only one object is created.
@Component
public class PaymentGateWay {
	
	@Value("HDFC123456")
	private String cardNumber;
	
	@Value("user@hdfc.com")
	private String userName;

	public PaymentGateWay() {
		
		System.out.println(this.getClass().getSimpleName()+" class object created");
	}
	
	public void makePayment() {
		System.out.println("Payment method Success");
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "PaymentGateWay [cardNumber=" + cardNumber + ", userName=" + userName + "]";
	}
}
