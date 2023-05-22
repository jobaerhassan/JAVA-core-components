import java.util.Scanner;

public class BookStore {
	static Scanner myScanner = new Scanner(System.in);
	static String[] books= {"Java" , "C" ,"Python"};
	static final double studentDiscount  = 0.3;
	static final double teacherDiscount  = 0.4;
	static final  double alienDiscount  = 0.0;
	
	public static void main(String[] args) {
		prln("-----WELCOME TO OUR BOOKSTORE--------");
		prln("Which book do you want?\nAns:  ");
		String userChoice = myScanner.nextLine();
		if(books[0].toLowerCase().equals(userChoice.toLowerCase()))
		{
			prln("You opted for "+books[0]+" book.");
			calculatePrice(books[0]);
		}
		else if(books[1].toLowerCase().equals(userChoice.toLowerCase()))
		{
			prln("You opted for "+books[1]+" book.");
			calculatePrice(books[1]);
		}
		else if(books[2].toLowerCase().equals(userChoice.toLowerCase()))
		{
			prln("You opted for "+books[2]+" book.");
			calculatePrice(books[2]);
		}
		else {
			prln("there is no book in this name.");
		}
//		calculatePrice(userChoice);
		
	}
	static void calculatePrice(String bookname)
	{
		prln("Are you a student,Teacher or alien??");
		String answer=myScanner.nextLine();
		double price=200;
		if(answer.toLowerCase() .equals("teacher"))
		{
			price = price-(price*teacherDiscount);
			showPrice(price);
		}
		else if(answer.toLowerCase().equals("student"))
		{
			price = price-(price*studentDiscount);
			showPrice(price);
		}
		else if(answer.toLowerCase().equals("alien"))
		{
			price = price-(price*alienDiscount);
			showPrice(price);
		}
	}
	static void showPrice(double price)
	{
		prln("Your total payable amount is: " + price);
		prln("----------THANK YOU FOR SHOPPING FROM OUR BOOKSTORE-----");
	}
	static void prln(Object newObject)
	{
			System.out.println(newObject);
	}
	static void pr(Object newObject)
	{
			System.out.print(newObject);
	}
}
