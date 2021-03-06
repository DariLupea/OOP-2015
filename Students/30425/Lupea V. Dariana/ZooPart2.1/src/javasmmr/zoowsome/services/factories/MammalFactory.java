package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.Constants;
import javasmmr.zoowsome.models.animals.*;

public class MammalFactory extends SpeciesFactory {

	@Override
		 public Animal getAnimal(String type) throws Exception {
		 if (Constants.Animals.Mammals.Lion.equals(type)) {
		 return new Lion(6.4, 0.999); // leave empty constructor, for now!
		 } else if (Constants.Animals.Mammals.Monkey.equals(type)) {
		 return new Monkey(6.1, 0.43);
		 } else if (Constants.Animals.Mammals.Zebra.equals(type)) {
			 return new Zebra(7, 0.5);}
		  else {
		 throw new Exception("Invalid animal exception!");
		 }
		 }
}
