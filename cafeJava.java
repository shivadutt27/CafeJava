public class CafeJava
{

	public static void main(String[] args)
	{
		String generalGreeting = "Welcome to Cafe Java, ";
		String pendingMessage = ", your order will be ready shortly";
		String readyMessage = ", your order is ready";
		String displayTotalMessage = "Your Total is $";

		//Menu Variables (add yours below)
		double mochaPrice = 3.5;
		double dripCoffee = 1.0;
		double latte      = 4.0;
		double cappuccino = 5.5;
		
		// Customer name variable
		String customer1 = "Cindhuri";
		String customer2 = "Sam";
		String customer3 = "Jimmy";
		String customer4 = "Noah";
		
		// Order completion
		boolean isReadyOrder1 = false;
		boolean isReadyOrder2 = true;
		boolean isReadyOrder3 = false;
		boolean isReadyOrder4 = true;

		//System.out.println(generalGreeting+customer1);
		//if(isReadyOrder1)
		//{
		//	System.out.println(customer1+readyMessage);
		//}
		//else
		//{
		//	System.out.println(customer1+pendingMessage);
		//}
		
		/*
		CUSTOMER == NOAH
		if(isReadyOrder4)
		{
			System.out.println(customer4+readyMessage+displayTotalMessage+cappuccino);
		}
		else
		{
			System.out.println(customer4+pendingMessage);
		}
		*/
		
		double totalOrder = latte*2;
		
		/*if(isReadyOrder2)
		{
			System.out.println(customer2+readyMessage+totalOrder);
		}
		else
		{
			System.out.println(customer4+pendingMessage);
		}*/
	
		double orderDifference = latte - dripCoffee;

		System.out.println(customer3+displayTotalMessage+orderDifference);
		
		
		
	}


}
