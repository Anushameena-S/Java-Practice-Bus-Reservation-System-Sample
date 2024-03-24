package busReserve;

public class Bus {
	
	private int busNum;
	private boolean acPresence;
	private int capacity;

	// TODO Auto-generated constructor stub
		
		Bus(int bnum,boolean ac, int cap){
		this.busNum=bnum;
		this.acPresence=ac;
		this.capacity=cap;
		}
		
		//get and set methods

		public int getBusNum() {
			return busNum;
		}

		public void setBusNum(int busNum) {
			this.busNum = busNum;
		}

		public boolean isAcPresence() {
			return acPresence;
		}

		public void setAcPresence(boolean acPresence) {
			this.acPresence = acPresence;
		}

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		
		public void displayBusInfo()
		{
			System.out.println("Bus Number is " + busNum + ", AC availability is " + acPresence + ", Capacity is " + capacity);
		}
		
		
	}


