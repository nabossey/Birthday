import javax.swing.JOptionPane;
import java.util.Random;
import java.text.DecimalFormat;


public class Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toy child = new Toy();
	String name;
	String input;
	int age;
	String rightChoice;
	String addCard;
	String addBalloon;
	double totalCost = 0;
	String anotherToy;
	final String programmer = "Abossey Nana Koranteng";
	Random randomNumber = new Random();
	int number = randomNumber.nextInt(9000)+1000;
	DecimalFormat dollar = new DecimalFormat("#,##0.00");
	
	System.out.println("Birthday Gifts\n");
	JOptionPane.showMessageDialog(null, "Welcome to the Toy company to choose\n gifts for young children");
	
	do
	{
		do
		{
			rightChoice = "";
			name = JOptionPane.showInputDialog("Please enter the name of the child:  ");
			input = JOptionPane.showInputDialog("How old is the child:   ");
			
			age = Integer.parseInt(input);
			child.setAge(age);
			input = JOptionPane.showInputDialog("Please choose a toy:plushie, book or blocks");
			child.setToy(input);
			child.setCost(input);
			while(child.getToy()=="")
			{
				input = JOptionPane.showInputDialog("Please select a valid choice: plushie,book or blocks");
				child.setToy(input);
				child.setCost(input);
				}
				if (child.ageOK()== false)
				{
					rightChoice = JOptionPane.showInputDialog("The toy selected is not age appropriate" +
				"for your child.\n Would you like to cancel your toy request (Yes or No)?");
				}
		}
		while(rightChoice.toLowerCase().equals("Yes"));
		addCard = JOptionPane.showInputDialog("Would like a card with the gift(Yes or No)?");
		if (addCard.toLowerCase().contentEquals("Yes"))
		{
			child.addCard(addCard);
			}
	addBalloon = JOptionPane.showInputDialog("Would you like a balloon with the gift(Yes or No)?");
if (addBalloon.toLowerCase().contentEquals("Yes"))
{
	child.addBalloon(addBalloon);
}
	
totalCost += child.getCost();
System.out.println("The gift for " + name + child.toString());

{
	rightChoice = JOptionPane.showInputDialog("The toy selected is not age appropriate for your child."+
"\n Would you like to cancel your toy request (Yes or No)?");
}
	}while(rightChoice.toLowerCase().equals("Yes"));
	addCard = JOptionPane.showInputDialog("Would like a card with the gift(Yes or No)?");
	if (addCard.toLowerCase().contentEquals("Yes"))
	{
		child.addCard(addCard);
		}
	addBalloon = JOptionPane.showInputDialog("Would you like a balloon with the gift(Yes or No)?");
	if (addBalloon.toLowerCase().contentEquals("Yes"))
	{
		child.addBalloon(addBalloon);
	}
		
	totalCost += child.getCost();
	System.out.println("The gift for " + name + child.toString());
 anotherToy = JOptionPane.showInputDialog("Would you like another Toy.(Yes or No)?");
 
	while (anotherToy.toLowerCase().equals("Yes"));
	
System.out.println("The total cost of your order is $" + dollar.format(totalCost));
System.out.println("Your order number is:   "+ number);
System.out.print("Programmer name:" + programmer);
	
	

}

}
