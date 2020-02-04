package Squarelotron;

import java.util.Arrays;

public class Squarelotron {
	
	int[][] squarelotron;
	int size;
	
	//fills 2d array with numbers 1 to n squared
	// sets size to n;
	public Squarelotron(int n) {
		size = n;
		int nums = 1;
		squarelotron = new int[n][n];
		for (int i = 0; i < squarelotron.length; i++) {
			for(int j = 0; j < squarelotron.length; j++) {
				squarelotron[i][j] = nums++;
			}
		}
		
	}
	
	public void printSquarelotron (int[][] s) {
		
	
		for(int i = 0; i < squarelotron.length; i++) {
			for(int j = 0; j < squarelotron.length; j++) {
				
				System.out.printf("%-3d", squarelotron[i][j]);
			}
			
			System.out.println();
		}
	}
			
			
	public Squarelotron upsideDownFlip(int ring) {
		
		
		
		Squarelotron x = new Squarelotron(this.size);
		if(x.size == 1) {
			return x;
		}

		// is it an outer ring or inner ring
		int numOuterRings = 0;
		

		if (size % 2 == 0) {
			numOuterRings = size / 2 - 1;
			
			
		}

		else {
			numOuterRings = ((size + 1) / 2 - 1);
		}

		// if size = 6 numOuter = 2

		if (ring <= numOuterRings) {

			return x.flipOuterRing(size, ring, x);

		}

		else {

			return x.flipInnerRing(x, size);
		}

	}
	
	//HELPER upsideDownFlip
	public Squarelotron flipOuterRing(int size, int ring, Squarelotron newOne) {
		Squarelotron oldOne = new Squarelotron(size);
		
		
		int leftIndex = ring - 1; //0
		int rightIndex = size - ring; // 3
		
		//flip top and bottom rows
		for (int i = leftIndex; i <= rightIndex; i++) {
			//0, 0 = 3, 0, 0, 1 = 3, 1
			newOne.squarelotron[leftIndex][i] = oldOne.squarelotron[rightIndex][i];
			
			newOne.squarelotron[rightIndex][i] = oldOne.squarelotron[leftIndex][i];
			//newOne.squarelotron[0][i] = this.squarelotron[3][0];
			// 3,0 = 0,0
		
			
		}
		
		//flip inner elements
		//starting point row = ring
		//endig row (row to flip) = 

			
		int leftRowIndexStart = ring; //increments
		int leftColumnIndex = ring - 1; //does not increment
		
		int rightRowIndexStart = ring; //increments
		int rightColumnIndex = size - ring; //does not increment
		
		// number of times to repeat loop  - size - (ring -1)
		for(int i = size - ring - 1; i > 0; i--) {
		 newOne.squarelotron[leftRowIndexStart][leftColumnIndex] = oldOne.squarelotron[i][leftColumnIndex];
		 newOne.squarelotron[rightRowIndexStart][rightColumnIndex] = oldOne.squarelotron[i][rightColumnIndex];
		 
		 leftRowIndexStart++;
		 rightRowIndexStart++;
		 
		
		}
		
		return newOne;

		
	}
	
	
	//HELPER upsideDownFlip
	public Squarelotron flipInnerRing(Squarelotron newOne, int size) {
		//inner ring will always be 2X2
		Squarelotron oldOne = new Squarelotron(size);
		
		int numOuterRings = 0;
		
		if(size % 2 == 0) {
			numOuterRings = size/2 - 1;
		}
		
		else {
			numOuterRings = ((size + 1)/2 - 1);
		}
		
		
		//these will not be updated
		int colLeft = numOuterRings; //
		int colRight = numOuterRings + 1;

		// count up
		int newSqRow = numOuterRings;

		// count down
		int oldSqRow = numOuterRings + 1;

		for (int i = 0; i < 2; i++) {
			newOne.squarelotron[newSqRow][colLeft] = oldOne.squarelotron[oldSqRow][colLeft];
			newOne.squarelotron[newSqRow][colRight] = oldOne.squarelotron[oldSqRow][colRight];

			newSqRow++;
			oldSqRow--;

		}
		
		return newOne;
	}
						
	
	public Squarelotron mainDiagonalFlip(int ring) {
				
		Squarelotron newOne = new Squarelotron(size);
		int totalRings = 0;
		if (size == 1 || ring <= 0) {

			return newOne;
		}
		
		
		if(size % 2 == 0) {
			totalRings = size / 2;
		}
		
		else if(size % 2 != 0) {
			totalRings = (size  - 1) / 2; 
		}
		
		if(ring > totalRings ) {
			return newOne;
		}
		

		if (size % 2 == 0 && size - ring == size * .5) {
			newOne.mainDiagonalFlip2X2(size, ring, newOne);

		}

		else if (size < 4 && ring > 1) {

			newOne.flipOuterRingMainDiagonal(size, ring, newOne);

		}

		else if (ring == 1) {

			newOne.flipOuterRingMainDiagonal(size, ring, newOne);

		}

		else {

			newOne.flipInnerRingMainDiagonal(size, ring, newOne);

		}

		return newOne;

	}
	
	//HELPER - Main Diagonal Flip
	public Squarelotron flipOuterRingMainDiagonal(int size, int ring, Squarelotron newOne) {
	
		Squarelotron oldOne = new Squarelotron(size);
		
		//Flip top row and left column
		int firstIndex = ring - 1; 
		int secondIndex = ring - 1;
		
		for(int i = 0; i < newOne.size; i++) {
			newOne.squarelotron[firstIndex][secondIndex] = oldOne.squarelotron[secondIndex][firstIndex];
			newOne.squarelotron[secondIndex][firstIndex] = oldOne.squarelotron[firstIndex][secondIndex];
			
			secondIndex++;
		}
		
		
		//Flip bottom row and right column
		int bottomRowFirstIndex = size - 1;
		int bottomRowSecondIndex = ring;
		
		for(int j = 0; j < size - 2; j++) {
			newOne.squarelotron[bottomRowFirstIndex][bottomRowSecondIndex] = oldOne.squarelotron[bottomRowSecondIndex][bottomRowFirstIndex];
			newOne.squarelotron[bottomRowSecondIndex][bottomRowFirstIndex] = oldOne.squarelotron[bottomRowFirstIndex][bottomRowSecondIndex];
			
			bottomRowSecondIndex++;
		}
		
		
		return newOne;
	
	}
	
	//HELPER - Main Diagonal Flip
	public Squarelotron flipInnerRingMainDiagonal(int size, int ring, Squarelotron newOne) {
	
		Squarelotron oldOne = new Squarelotron(size);
		
		if (size == 4) {
		
			newOne.squarelotron[2][1] = oldOne.squarelotron[1][2];
			newOne.squarelotron[1][2] = oldOne.squarelotron[2][1];
			
		}
		
		
		int firstIndex = ring -1; // does not update
		int secondIndex = ring;// increments by one each time loop repeats //was ring -1
		
		for(int i = 0; i < size/2 ; i++) {
			newOne.squarelotron[firstIndex][secondIndex] = oldOne.squarelotron[secondIndex][firstIndex];
			newOne.squarelotron[secondIndex][firstIndex] = oldOne.squarelotron[firstIndex][secondIndex];
			
			secondIndex++;
		}
		
		
		//flip bottom row right column
		
		int bottomRowFirstIndex = size - ring;
		int bottomRowSecondIndex = ring;
		
		for(int j = 0; j < size/2 - 1; j++) {
			newOne.squarelotron[bottomRowFirstIndex][bottomRowSecondIndex] = oldOne.squarelotron[bottomRowSecondIndex][bottomRowFirstIndex];
			newOne.squarelotron[bottomRowSecondIndex][bottomRowFirstIndex] = oldOne.squarelotron[bottomRowFirstIndex][bottomRowSecondIndex];
			
			bottomRowSecondIndex++;
		}
		
		return newOne;
		
	}
	
	//HELPER - Main Diagonal Flip
	public Squarelotron mainDiagonalFlip2X2(int size, int ring, Squarelotron newOne) {
		
		Squarelotron oldOne = new Squarelotron(size);
		int firstIndex = size/2;
		int secondIndex = firstIndex - 1;
		
		newOne.squarelotron[firstIndex][secondIndex] = oldOne.squarelotron[secondIndex][firstIndex];
		newOne.squarelotron[secondIndex][firstIndex] = oldOne.squarelotron[firstIndex][secondIndex];
	
		return newOne;
		
	}
		
	
	
	public void rotateRight (int numberOfTurns) {
	
	Squarelotron temp = this.copyOf();
	
	
	if(numberOfTurns > 4 || numberOfTurns < -4) {
		numberOfTurns = numberOfTurns % 4;
	}
	

	if (numberOfTurns < 0) {
		numberOfTurns = 4 - Math.abs(numberOfTurns);
	}
			
	if (numberOfTurns == 0 || numberOfTurns == 4)
	{
		return;	
	}
	
	else if (numberOfTurns == 1) {

			for (int i = 0; i < size; i++) {
				int countdown = size - 1;
				for (int j = 0; j < size; j++) {
					this.squarelotron[i][j] = temp.squarelotron[countdown][i];
					countdown--;
				}

			}
		}
		
		else if (numberOfTurns == 2) {
			int outerCountdown = size -1;
			for (int i = 0; i < size ; i++) {
				int innerCountdown = size - 1;
				for (int j = 0; j < size ; j++) {
					this.squarelotron[i][j] = temp.squarelotron[outerCountdown][innerCountdown];
					innerCountdown--;
				}
				
				outerCountdown--;
			}
						
		}
		else if (numberOfTurns == 3) {
			int outerCountdown = size -1;
			for (int i = 0; i < size ; i++) {
				//int innerCountdown = size - 1;
				for (int j = 0; j < size ; j++) {
					this.squarelotron[i][j] = temp.squarelotron[j][outerCountdown];
					//innerCountdown--;
				}
				
				outerCountdown--;
			}	
						
		}
			
	}
	
	public int getSize() {
		return this.size;
	}
	
	
	//HELPER for rotateRight
	//returns copy of Squarelotron in current state
	public Squarelotron copyOf() {
		Squarelotron temp = new Squarelotron(size);
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				temp.squarelotron[i][j] = this.squarelotron[i][j];
			}
		}
		
		return temp;
	}
	
	

	public static void main(String args[]) {
	
		Squarelotron x = new Squarelotron(5);
		
		 x = x.upsideDownFlip(1);
		
		
		
	
		//x.mainDiagonalFlip(1);
		
		
		x.printSquarelotron(x.squarelotron);;
		
		
		
			
		}
		
	} 






