package org.sreekanth.Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.sreekanth.Spring.Util.BookTicket;
import org.sreekanth.Spring.Util.PaymentGateWay;
import org.sreekanth.Spring.config.AppConfiguration;

/**
 * Hello world!fd
 *
 */
public class App 
{
	public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    	ctx.register(AppConfiguration.class);
    	ctx.refresh();
    	PaymentGateWay gateWay = ctx.getBean(PaymentGateWay.class);// Its give the Objects of the particular class.
//    	ctx.getBean(PaymentGateWay.class);
//    	ctx.getBean(PaymentGateWay.class);
//    	ctx.getBean(PaymentGateWay.class);
    	
    	BookTicket bean = ctx.getBean(BookTicket.class);
    	System.out.println(bean);
//    	ctx.getBean(BookTicket.class);
//    	ctx.getBean(BookTicket.class);
    	
    	
    	
    	
    	//gateWay.makePayment();
    	//System.out.println(gateWay);
    	
    
    }
}




















