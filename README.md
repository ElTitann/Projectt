# Projectt
Titan Inc
Import java.util.* so i can use scanners and an array list and to reduce the amount of memory usage even if it’s only by one line
Access modifiers and variables being equal to something double used to deal with decimals variables will be accessed by inheritance and getters/setters
private double deck =  40.00;
		private double trucks =  10.00;
        private double wheels = 30.00;
		private double bearings = 20.00;
		private double wedges =  5.00;
		private double hardware = 6.00;
		private double griptape = 10.00;
		
		private double soccerball = 20.00;
		private double basketball =  20.00;
		private double tennisball = 20.00;
		private double baseball =  20.00;
		private double football = 20.00;
		private double helmets = 80.00;
		private double cleats = 120.00;
		private double shinguards = 70.00;
		private double elbowguards = 70.00;


Main class will start off with constructor for variables so i can do tx.getdeck() for example to get the variables which like said made available to the class due to inheritance and getter/setters and to have for scanner use later
Variables tx = new Variables();
ArrayList to create two columns 
ArrayList<String> Columns = new ArrayList<String>(); // so I can add columns that go horizontally
		  Columns.add("Skating and Sporting Equipment"); //column names
          System.out.println(Columns); //print out columns
		

Two dimensional array of strings aka so I can list the item to not use the variables i created and just use strings
String[][] Items = {
				{ "Deck",  "Trucks",   " Wheels",  "Bearings" },
				{ "Wedges", "Hardware", "Griptape", "Soccerball" },
				{ "Basketball", "Tennisball", "Baseball", "Football"},
				{ "Helmets",    "Cleats",      "Shinguards", "Elbow Guards"}

Prints out 2d array of strings like a table
int i;
		   for(i=0; i < Items.length; i++) {
			   System.out.println(Items[i][0] + "\t " + Items[i][1] + "\t " + Items[i][2] + "\t " + Items[i][3]);
		   }

Make scanner 
 Scanner titan = new Scanner(System.in);
First prompt “state your item from the table you see” aka print this out
Scanner will read the input if String item = titan.next(); since the user is going to be inputting a string 
Print out lines saying “this item is …” using switch statements
For example:switch(item) { //switch statement as I'm dealing with a lot of elements/items also an alternative to else if statements
		       case "Deck":
		    	   System.out.println("Decks after taxes cost " + tx.getDeck());
		    	   break;
Close scanner titan.close();
End of program it’s finished :)
Name Oscar
A convience for the customer but for the employess as well in terms of a business standpoint version number 1 7/30/2020 this project was to create a simpler way for customers to fet a list of the items in store enter what they want from the list and see the total cost after taxes 
to use this program write an item from the list you see exactly the way it is and you will get the total cost of that item unfortanutely you need to rerun it in order to write down another item 


























In this program it will be a Sporting Goods Retailer that is meant for people who are into sports and skating since skating is a sport as well in my opinion. Now, while anyone can come in and get some sporting equipment as imagined this is mostly meant for teeangers and adults as they will have a higher understanding of how to work a program, and they would be more into sports than a six year old child. Now, you may be asking well what is this program? Well this program actually isn’t that complicated or an original idea, but it will be a damn successful one. So the purpose of this program is based on the idea that people just want to walk in the store know the price of something even after taxes have been included so they go in get the item, and then  head out making their trip nice, short, and efficient. Now, this is the purpose for the customers, this program can also help employees working by having quick service meaning their sales will go up due to quick service, and when they see that people are ordering one item more than others, then they can make quick adjustments based on supply and demand. Now, what I just stated in that previous statement would be the business function as well, since if they’re able to make quick adjustments according to demands, they can save money to spend more on supply for one item which can help out sales, so having this program in their hands will be quite handy in making sure their sales are looking nice and pretty. Now, the quick service would also be a business function since this quick service will cause people to make reviews commending the company on fast service due to the program that they are using, which will cause more customers to use the program see that people were right, and then it would continue that cycle like a domino effect. Now, as for the technical function of the program like I said the program is actually quite simple, and most likely not original at all, but again it is a damn helpful one. Getting started from the view of a customer who won’t see the code and just see the output they will first see a list of every single item the sporting goods store has in their inventory. This list is made possible by using a two dimensional array of strings in which that array of strings prints out each word according to how I wanted it in this case I made it four across and four down. As for a side note, there will be four words above that list which act as columns just giving the user info that the items they see in the list are skating and sporting equipment. Now they will first see analyze the list, then they will see a prompt saying to state their item from the list. After that it is the users job to type in the item they want, in which that is possible due to a scanner as the scanner will provide a text box for them to write in and to read that input then move on to the next step of the program. That next step of the program is to do calculations in which it will take the original price and then times it by a percentage to give out the final. This is now the final step of the program, in which after they input what they want correctly it will give out the price of that item and now they officially know what they want and how much money they need to afford that item for a quick buy all due to a simple program that is this beneficial. Now as a side note if the user inputs something that is not on that list then the switch statements that I implemented since every item on that list needed a case or an else if statement, then it will use the default case for the switch statement and tell the user that the item is not on the list. Now, if you wanted to improve the technical function you can make it where there is a restart button to restart the program from square one making it more efficient or take it even a step further, and say if you’re out of an item then a worker can be trained to make a simple change to the program to say that the item is out of stock and give an estimate when it should be in stock again.
