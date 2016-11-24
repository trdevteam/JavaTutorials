package DesignPatterns.Creational.Builder;

public class ComputerBuilder{

	// required parameters
	public String HDD;
	public String RAM;

	// optional parameters
	public boolean isGraphicsCardEnabled;
	public boolean isBluetoothEnabled;
	
	public ComputerBuilder(String hdd, String ram){
		this.HDD=hdd;
		this.RAM=ram;
	}

	public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
		return this;
	}

	public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
		return this;
	}
	
	public Computer build(){
		return new Computer(this);
	}

}