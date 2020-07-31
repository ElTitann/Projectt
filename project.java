import java.util.*;



public class Project extends Variables {

	public static void main(String[] args) {
		    
		    Variables tx = new Variables(); // input constructor for later scanner use
		 
		  
		  ArrayList<String> Columns = new ArrayList<String>(); // so I can add columns that go horizontally
		  Columns.add("Skating and Sporting Equipment"); //column names
          System.out.println(Columns); //print out columns
		
		String[][] Items = {
				{ "Deck",  "Trucks",   " Wheels",  "Bearings" },
				{ "Wedges", "Hardware", "Griptape", "Soccerball" },
				{ "Basketball", "Tennisball", "Baseball", "Football"},
				{ "Helmets",    "Cleats",      "Shinguards", "Elbowguards"}
		}; // a two dimensional array was made so I can display a list 4 across and 4 down		
		
		   int i;
		   for(i=0; i < Items.length; i++) {
			   System.out.println(Items[i][0] + "\t " + Items[i][1] + "\t " + Items[i][2] + "\t " + Items[i][3]);
		   }
		   Scanner titan = new Scanner(System.in);
		   System.out.println("State your item from the list");
		   String item = titan.next();
		      switch(item) { //switch statement as I'm dealing with a lot of elements/items also an alternative to else if statements
		       case "Deck":
		    	   System.out.println("Decks after taxes cost " + tx.getDeck());
		    	   break;
		       case "Trucks":
		    	   System.out.println("Trucks after taxes cost " + tx.getTrucks());
		    	   break;
		       case "Wheels":
		    	   System.out.println("Wheels after taxes cost " + tx.getWheels());
		    	   break;
		       case "Bearings":
		    	   System.out.println("Bearings after taxes cost " + tx.getBearings());
		    	   break;
		       case "Wedges":
		    	   System.out.println("Wedges after taxes cost " + tx.getWedges());
		    	   break;
		       case "Hardware":
		    	   System.out.println("Hardware after taxes cost " + tx.getHardware());
		    	   break;
		       case "Griptape":
		    	   System.out.println("Griptape after taxes cost " + tx.getGriptape());
		    	   break;
		       case "Soccerball":
		    	   System.out.println("Soccerballs after taxes cost " + tx.getSoccerball());
		    	   break;
		       case "Basketball":
		    	   System.out.println("Basketballs after taxes cost " + tx.getBasketball());
		    	   break;
		       case "Tennisball":
		    	   System.out.println("Tennisballs after taxes cost " + tx.getTennisball());
		    	   break;
		       case "Baseball":
		    	   System.out.println("Baseballs after taxes cost " + tx.getBaseball());
		    	   break;
		       case "Football":
		    	   System.out.println("Footballs after taxes cost " + tx.getFootball());
		    	   break;
		       case "Helmets":
		    	   System.out.println("Helmets after taxes cost " + tx.getHelmets());
		    	   break;
		       case "Cleats":
		    	   System.out.println("Cleats after taxes cost " + tx.getCleats());
		           break;
		       case "Shinguards":
		    	   System.out.println("Shinguards after taxes cost " + tx.getShinguards());
		    	   break;
		       case "Elbowguards":
		    	   System.out.println("Elbow Guards after taxes cost " + tx.getElbowguards());
		    	   break;
		       default:
		    	   System.out.println("Sorry, this item is not on the list");
		      }
			
		   titan.close(); //close scanner
	        
		  
		      

	}

}



class Variables{
	
	//prices for skating equipment
		private double deck =  40.00 *6.00/5.00;
		private double trucks =  10.00 *6.00/5.00;
        private double wheels = 30.00 *6.00/5.00;
		private double bearings = 20.00 *6.00/5.00;
		private double wedges =  5.00 *6.00/5.00;
		private double hardware = 6.00 *6.00/5.00;
		private double griptape = 10.00 *6.00/5.00;
		//prices for sports equipment
		private double soccerball = 20.00 *6.00/5.00;
		private double basketball =  20.00 *6.00/5.00;
		private double tennisball = 20.00 *6.00/5.00;
		private double baseball =  20.00 *6.00/5.00;
		private double football = 20.00 *6.00/5.00;
		private double helmets = 80.00 *5.25/5.00;
		private double cleats = 120.00 *5.00/5.00;
		private double shinguards = 70.00 *6.00/5.00;
		private double elbowguards = 70.00 *6.00/5.00;
		public double getDeck() {
			return deck;
		}
		public void setDeck(double deck) {
			this.deck = deck;
		}
		public double getTrucks() {
			return trucks;
		}
		public void setTrucks(double trucks) {
			this.trucks = trucks;
		}
		/**
		 * @return the wheels
		 */
		public double getWheels() {
			return wheels;
		}
		/**
		 * @param wheels the wheels to set
		 */
		public void setWheels(double wheels) {
			this.wheels = wheels;
		}
		/**
		 * @return the bearings
		 */
		public double getBearings() {
			return bearings;
		}
		/**
		 * @param bearings the bearings to set
		 */
		public void setBearings(double bearings) {
			this.bearings = bearings;
		}
		/**
		 * @return the wedges
		 */
		public double getWedges() {
			return wedges;
		}
		/**
		 * @param wedges the wedges to set
		 */
		public void setWedges(double wedges) {
			this.wedges = wedges;
		}
		/**
		 * @return the griptape
		 */
		public double getGriptape() {
			return griptape;
		}
		/**
		 * @param griptape the griptape to set
		 */
		public void setGriptape(double griptape) {
			this.griptape = griptape;
		}
		/**
		 * @return the hardware
		 */
		public double getHardware() {
			return hardware;
		}
		/**
		 * @param hardware the hardware to set
		 */
		public void setHardware(double hardware) {
			this.hardware = hardware;
		}
		/**
		 * @return the soccerball
		 */
		public double getSoccerball() {
			return soccerball;
		}
		/**
		 * @param soccerball the soccerball to set
		 */
		public void setSoccerball(double soccerball) {
			this.soccerball = soccerball;
		}
		/**
		 * @return the basketball
		 */
		public double getBasketball() {
			return basketball;
		}
		/**
		 * @param basketball the basketball to set
		 */
		public void setBasketball(double basketball) {
			this.basketball = basketball;
		}
		/**
		 * @return the tennisball
		 */
		public double getTennisball() {
			return tennisball;
		}
		/**
		 * @param tennisball the tennisball to set
		 */
		public void setTennisball(double tennisball) {
			this.tennisball = tennisball;
		}
		/**
		 * @return the baseball
		 */
		public double getBaseball() {
			return baseball;
		}
		/**
		 * @param baseball the baseball to set
		 */
		public void setBaseball(double baseball) {
			this.baseball = baseball;
		}
		/**
		 * @return the football
		 */
		public double getFootball() {
			return football;
		}
		/**
		 * @param football the football to set
		 */
		public void setFootball(double football) {
			this.football = football;
		}
		/**
		 * @return the helmets
		 */
		public double getHelmets() {
			return helmets;
		}
		/**
		 * @param helmets the helmets to set
		 */
		public void setHelmets(double helmets) {
			this.helmets = helmets;
		}
		/**
		 * @return the cleats
		 */
		public double getCleats() {
			return cleats;
		}
		/**
		 * @param cleats the cleats to set
		 */
		public void setCleats(double cleats) {
			this.cleats = cleats;
		}
		/**
		 * @return the shinguards
		 */
		public double getShinguards() {
			return shinguards;
		}
		/**
		 * @param shinguards the shinguards to set
		 */
		public void setShinguards(double shinguards) {
			this.shinguards = shinguards;
		}
		/**
		 * @return the elbowguards
		 */
		public double getElbowguards() {
			return elbowguards;
		}
		/**
		 * @param elbowguards the elbowguards to set
		 */
		public void setElbowguards(double elbowguards) {
			this.elbowguards = elbowguards;
		}
	}
