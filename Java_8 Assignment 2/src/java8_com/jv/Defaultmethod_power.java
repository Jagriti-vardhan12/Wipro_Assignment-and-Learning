package java8_com.jv;

 interface Defaultmethod_power {
	 interface Power {
	     void showPower();
	     default void defaultPower() {
	         System.out.println("This is the default power method in the interface.");
	     }
	 }
	 public class DefaultPowerDemo implements Power {

	     @Override
	     public void showPower() {
	         System.out.println("Showing the implemented power method.");
	     }

	     public static void main(String[] args) {
	         DefaultPowerDemo demo = new DefaultPowerDemo();
	         demo.showPower();
	         demo.defaultPower();
	     }
	 }
 }
