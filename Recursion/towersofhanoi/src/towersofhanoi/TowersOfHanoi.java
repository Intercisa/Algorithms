package towersofhanoi;

public class TowersOfHanoi {
	
	public void towerOfHanoi(int plate, char rodFrom, char middleRod, char rodTo) {
		if(plate == 1) { //only one plate left, we have to put to the last rod  
			System.out.printf("Plate 1 from %s to %s \n", rodFrom, rodTo);
			return;
		}
		
		towerOfHanoi(plate-1, rodFrom, rodTo, middleRod);
		System.out.printf("Plate %d from %s to %s \n",plate, rodFrom, rodTo);
		towerOfHanoi(plate-1, middleRod, rodFrom, rodTo);
	}
}


