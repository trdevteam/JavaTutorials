package Test;

import java.util.*;

public class ParkingLotSystem {
	
	/*
	 * 1. at the entrance get ticket
	 * 2. find an available parking lot
	 * 3. if parking lot is full monitor it outside of the parking lot
	 * 4. pay at the exit , or at the payment machine
	 * */
	
	public enum SpotType{
		
		SMALL(1), MEDIUM(2), LARGE(3);

		int value;
		private SpotType(int i) {
			this.value = i;
		}
		
		public int getValue() {
			return value;
		}
		
	}
	
	public class Spot{
		
		public SpotType spotType;
		public int available =1;	// available at the initial state if it reserved turns -1
		public Floor floor;
		
		public Spot(SpotType st,Floor floor) {
			this.spotType = st;
			this.floor = floor;
		}
		
		public void updateState() {
			available*=-1;
		}
		
		public Floor getFloor() {
			return floor;
		}		
		
		public SpotType getSpot() {
			return spotType;
		}
		
	}

	public class Floor {// if the place is open spaced then the floor can not be greater than 0
		
		int floor;
		
		List<Spot> spots;
		
		int totalCapacity;
		int availableSpotNumber;		
		
		public void addSpot(Spot spot) {
			spots.add(spot);
		}
		
		List<Observer> observers = new ArrayList<Observer>();
		
		public void attach(Observer o) {
			observers.add(o);
		}		
		
		public void updateState(Spot spot) {
			spot.updateState();
			notifyObservers();
		}
		
		private void notifyObservers() {
			for(Observer o : observers) {
				o.update(this);
			}
		}	
		
		public int getFloor() {
			return floor;
		}
		
	}
	
	public class Building{
		
		Adress adress;
		List<Floor> floors = new ArrayList<Floor>();
		
		public Building(Floor f) {
			floors.add(f);
		}
		
	}
	
	public class Adress{
		String city;
		String street;
		String avaenue;
	}
	
	public class Reservation{
		
		public List<Spot> availableSpots(SearchSpot search){
			return search.getSpots();
		}	
		
		public ParkingTicket bookSpot(SpotType type) throws ParkingFullException {
			
			SearchSpot s = new NearestSpotsToTheEntrance();// to initialization we can use factory pattern			
		    List<Spot> spots = availableSpots(s);
		    for(Spot spot : spots) {
		    	synchronized(spot){
			    	if(spot.spotType.getValue() >= type.getValue()) {
			    		return new ParkingTicket(spot,new Date());
			    	}
		    	}
		    }
		    
			throw new ParkingFullException();
			
		}
		
	}
	
	public class ParkingFullException extends Exception{
		private static final long serialVersionUID = 1L;
	}
	
	public class ParkingTicket{
		Floor floor;
		Spot spot;
		Date startDate;
		public ParkingTicket(Spot spot, Date startDate) {
			this.spot = spot;
			this.startDate = startDate;
		}
		
	}
	
	public interface SearchSpot{
		List<Spot> getSpots();
	}
	
	public class NearestSpotsToTheEntrance implements SearchSpot{//Strategy Patern for various searching methods

		@Override
		public List<Spot> getSpots() {
			return new ArrayList<Spot>();
		}
		
	}
	
	public abstract class Observer{
		protected Spot spotActivity;
		public abstract void update(Floor floor);
	}
	
	public class ParkingDisplayBoard extends Observer{	
		
		public ParkingDisplayBoard(Spot spot) {
			spotActivity = spot;
			
		}

		@Override
		public void update(Floor floor) {
			System.out.println("Floor = "+floor.getFloor()+" Spot:"+ spotActivity.spotType);			
		}
		
	}
	
	
}
