package packageDrop;

import java.util.ArrayList;
import java.util.Arrays;

public class FinalCode {
	
	public static int [][] arr = 
		{
				{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,}, //26 columns
				{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},
				{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},
				{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},
				{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},
				{0,  0,  0,  91, 54, 45, 99, 27, 59, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},//249
				{0,  0,  0,  0,  0,  0,  70, 0,  0,  0,  0,  0,  0,  50, 71, 55, 28, 0,  0,  0,  0,  0,  0,  0,  0,  0,},//175
				{0,  0,  0,  0,  0,  77, 0,  0,  0,  0,  0,  0,  39, 4,  57, 29, 62, 0,  26, 26, 0,  0,  0,  0,  0,  0,},//261
				{0,  0,  0,  0,  94, 38, 57, 65, 0,  0,  0,  34, 71, 26, 81, 22, 0,  0,  95, 58, 0,  0,  0,  0,  0,  0,},//406
				{0,  0,  0,  0,  42, 0,  0,  61, 83, 83, 60, 64, 24, 91, 0,  0,  0,  1,  75, 0,  0,  0,  0,  0,  0,  0,},//416
				{0,  0,  0,  0,  2,  53, 68, 68, 30, 40, 39, 7,  57, 31, 90, 17, 63, 30, 49, 0,  0,  0,  0,  0,  0,  0,},//420
				{0,  0,  0,  0,  2,  58, 19, 0,  0,  0,  0,  0,  0,  0,  0,  20, 0,  0,  70, 0,  0,  0,  0,  0,  0,  0,},//148
				{0,  0,  0,  55, 36, 2,  5,  49, 9,  99, 38, 62, 48, 61, 45, 7,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},//335
				{0,  0,  0,  55, 17, 6,  46, 81, 83, 83, 5,  83, 52, 97, 0,  0,  0,  31, 0,  0,  0,  0,  0,  0,  0,  0,},//436
				{0,  0,  0,  0,  0,  67, 29, 68, 67, 82, 11, 52, 27, 28, 0,  0,  71, 0,  0,  0,  0,  0,  0,  0,  0,  0,},//368
				{0,  0,  0,  0,  0,  81, 79, 89, 11, 68, 86, 1,  47, 30, 2 , 50, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},//353
				{0,  0,  0,  0,  0,  34, 11, 27, 94, 39, 97, 62, 24, 70, 55, 99, 58, 0,  0,  0,  0,  0,  0,  0,  0,  0,},//394
				{0,  0,  0,  0,  0,  53, 20, 2,  89, 11, 61, 91, 39, 66, 37, 42, 35, 0,  0,  0,  0,  0,  0,  0,  0,  0,},//341
				{0,  0,  0,  0,  0,  0,  66, 77, 0,  0,  35, 54, 98, 0,  0,  99, 59, 0,  0,  0,  0,  0,  0,  0,  0,  0,},//309
				{0,  0,  0,  0,  0,  0,  0,  97, 30, 0,  0,  81, 82, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},//179
				{0,  0,  0,  0,  0,  0,  0,  0,  95, 81, 0,  0,  0,  40, 66, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},//161
				{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  40, 20, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},//40
				{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},
				{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},
				{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},
				{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},
				{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},
				{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},
				{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},
				{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},
				{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},
				{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},
				{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,},
		};		//33 Rows    146 186 320 415 429 420 384 245 350 348 374 408 319 313 32  171 58
	
	
	/**			Attempt 6 Functions			**/
	//This function checks if a binary row is in a legal format
	private static boolean checkIfLegal(int[] thisArr){
		
		for(int i=0; i<thisArr.length; i++)
			if(thisArr[i]==1 &&(thisArr[i-1]==1 || thisArr[i+1]==1))return false;
		
		return true;
	}
	
	//This function returns all legal package drop formations of a specific row
	private static ArrayList<int[]> findLegalRows(int row){
		ArrayList<int[]> legalRows = new ArrayList<int[]>();
		int potentialPacks = landInRow(row);
		int firstPack = 0;
		int prevPack = -1;
		int[] tmpArr = new int [26];
		
		legalRows.add(copyArray(tmpArr));
		
		for(int packs=1; packs <= potentialPacks; packs++){	//Brute force all combos, save valid ones
			
			firstPack = 0;
			prevPack = -1;
			tmpArr = new int[26];
			
			for(int j = 0; j<packs; j++)					//For every package in this run
				for(int i=firstPack;i<26;i++){				//Set the starting package location(s)
					if(arr[row][i]!=0 && tmpArr[i]!=1){
						firstPack=i;
						tmpArr[i]=1;
						break;
					}
				}
			
			while(!packsAtEndLegal(tmpArr, row)){
				for(int i=firstPack;i<26;i++){					//Moves the farthest right package across the row
					if(arr[row][i]==0)continue;
					else{
						tmpArr[i]=1;							//Set this index as a package
						if(prevPack != -1 && prevPack!=i) 
							tmpArr[prevPack] = 0;				//Clear the last package, care for prevPack==current last pack
						prevPack = i;							//Set this pos as the last package
						
						if(checkIfLegal(tmpArr))				//Also check if it is a valid drop
							legalRows.add(copyArray(tmpArr));	//If it is then store it
						
					}
				}
				
				//Need to reset the array and increment the rightmost package that can be incremented
				boolean passedEOAPacks = false;
				int packsAtEnd = 0;
				for(int i=25; i>=0; i--){
					
					if(arr[row][i]!=0 && tmpArr[i] == 0)
						passedEOAPacks = true;				//Found land w/o a package, next pack found needs to be incremented by 1
					
					if(!passedEOAPacks && tmpArr[i] == 1) {
						packsAtEnd++;						//Count how many packs are at the end
						tmpArr[i] = 0;						//Reset the tile
					}
					
					if(passedEOAPacks && tmpArr[i]==1){		//Move the next package found to the next available land
						tmpArr[i]=0;							//Reset the package's current pos to 1
						for(int j = packsAtEnd; j >=0; j--){	//For every pack at the end + 1 for the found pack
							while(arr[row][i+1]==0||tmpArr[i+1]==1)
								i++;								//Find the next land not occupied
							tmpArr[i+1] = 1;						//Set that land as a package
							firstPack = i+1;
						}
						break;
					}
				}
				
			}//While loop
		}
		
		return legalRows;
	}
	
	//Takes an array and checks to see if all packs are at the end in legal format
	private static boolean packsAtEndLegal(int[] array, int row){
		boolean packChecker = false;
		
		for(int i = array.length-1; i>=0; i--){							//Start from back of array and go backwards
			if(arr[row][i] != 0 && array[i] != 1) packChecker = true;	//If a land w/o a package is found then no other packages should be found
			if(packChecker && array[i]==1) return false;				//If a package is found after finding the land w/o a package then return false
		}
		
		return true;	//All packs are at the end
		
	}
	
	
	/**			Attempt 7 Functions			**/
	//This will assemble all potential maps based on comparing the potential row combinations and return the best one
	private static int[][] assembleMapDynamically(){
		ArrayList<int[][]> mapStorage = new ArrayList<int[][]>();							//Map storage
		ArrayList<int[][]> tmpComboStorage = new ArrayList<int[][]>();						//Two row combo temporary storage
		ArrayList<ArrayList<int[][]>> comboStorage = new ArrayList<ArrayList<int[][]>>();	//Two row combo permenant storage
		int bestMapIndex = 0;
		int bestMapSum = 0;
		
		tmpComboStorage.add(new int[2][26]);			//Top row, always water
		comboStorage.add(tmpComboStorage);
		mapStorage.add(new int[33][26]);
		
		for(int i=1; i<33; i++){						//Find and store all potential 2 row combos
			tmpComboStorage = find2RowsDynamically(i);
			comboStorage.add(tmpComboStorage);
		}
		
		//Now find the valid "paths" through the combos
		for(int i = 0; i<33; i++){
			mapStorage = findMapPath(mapStorage, comboStorage.get(i), i); 	//Give ALL path up to given row
			mapStorage = reduceMapPaths(mapStorage, i);						//Find the optimal paths up to given row	
		}
		
			
		//Now sum up all paths and save the best one
		for(int i=0; i<mapStorage.size(); i++){
			int sum = sumBinaryMap(mapStorage.get(i));
			
			if(sum > bestMapSum){						//Check if better than prev best map
				bestMapSum = sum;
				bestMapIndex = i;
			}
			
		}
		
		return mapStorage.get(bestMapIndex);
	}
		
	//This will take a row and return all potential combos for this row and the previous row
	private static ArrayList<int[][]> find2RowsDynamically(int row){
		ArrayList<int[][]> rowComboStorage = new ArrayList<int[][]>();	//All potential combos for both rows
		ArrayList<int[]> prevRowStorage = findLegalRows(row-1);			//All possible sols for last row
		ArrayList<int[]> currRowStorage = findLegalRows(row);			//All possible sols for current row
		boolean validCombo = true;
		
		//Brute force all combos and store the valid ones
		for(int prev = 0; prev<prevRowStorage.size(); prev++){			//For all sols for prev row
			for(int curr = 0; curr<currRowStorage.size(); curr++){		//For all sols for curr row
				int [][] tmpCombo = new int[2][26];						//Storage
				tmpCombo[0] = prevRowStorage.get(prev);
				tmpCombo[1] = currRowStorage.get(curr);
				
				for(int i=0; i<26; i++)
					if(tmpCombo[1][i]==1)								//Check if this is a valid combo
					if(	tmpCombo[0][i-1] == 1||
						tmpCombo[0][i] == 1||
						tmpCombo[0][i+1] == 1){
							validCombo = false;
							break;
					}
				
				if(validCombo) rowComboStorage.add(tmpCombo);			//If it is then store it
				validCombo = true;										//Reset validCombo each time
			}
		}
		
		return rowComboStorage;
	}
		
	//Goes through all potential combos of the combos
	private static ArrayList<int[][]> findMapPath(ArrayList<int[][]> mapStorage, ArrayList<int[][]> comboStorage, int row){
		ArrayList<int[][]> tmpMapStorage = new ArrayList<int[][]>();
		
		if(row<1)											//To combat against error cases
			return mapStorage;
		
		
		for(int i=0; i<mapStorage.size(); i++){				//Go thru all maps stored
			for(int j=0; j<comboStorage.size(); j++){		//Go thru all combos
				if(Arrays.equals(mapStorage.get(i)[row-1], comboStorage.get(j)[0])){	//Check if the arrays are the same
					int[][] tmpMap = copy2DArray(mapStorage.get(i));					//The previous row of the map
					tmpMap[row] = comboStorage.get(j)[1];								//And the first row (0th) of the combo
					tmpMapStorage.add(tmpMap);											//If they are then store the map + combo
				}
			}
		}
		
		return tmpMapStorage;
	}
	
	//Goes through a set of maps and returns the best of every variation of a row
	private static ArrayList<int[][]> reduceMapPaths(ArrayList<int[][]> mapStorage, int row){
		ArrayList<int[][]> optimalMaps = new ArrayList<int[][]>();
		int dupeMapIndex=0;
		
		for(int map=0; map<mapStorage.size(); map++){
			if(!optimalMaps.isEmpty()){						//Check if optimal map storage is empty
				boolean duplicateMap = false;
				for(int i = 0; i<optimalMaps.size(); i++){	//For every map and every map in optimal map storage
						
					if(Arrays.equals(mapStorage.get(map)[row], optimalMaps.get(i)[row])){
						duplicateMap=true;					//If the given row is the same then this is a duplicate
						dupeMapIndex=i;
						break;
					}
					
				}
				if(duplicateMap){								//If this map is a duplicate compare it
					if(sumBinaryMap(mapStorage.get(map)) > sumBinaryMap(optimalMaps.get(dupeMapIndex))){
						optimalMaps.remove(dupeMapIndex);		//If this map is better than the best so far replace it
						optimalMaps.add(mapStorage.get(map));
					}
					
					
				}else optimalMaps.add(mapStorage.get(map));		//If not in optimal map storage yet then add it
			}
			else optimalMaps.add(mapStorage.get(map));			//If optimal map storage is empty then add map
		}
		
		return optimalMaps;
	}
	
	
	/**			General Function			**/
	/**Note** Every attempt may use general Functions**/
	//Takes a 2d array and returns a new array with the same stuff
	private static int [][] copy2DArray(int [][] array2d){
		int [][] tmpArr = new int[33][26];
		
		for(int i = 0; i < 33; i++)
			for(int j = 0; j < 26; j++)
				tmpArr[i][j] = array2d[i][j];
		
		return tmpArr;
	}
	
	//Takes an array and returns a new array with the same stuff
	private static int[] copyArray(int[] array){
		int[] tmpArr = new int[array.length];
		
		for(int i = 0; i<tmpArr.length; i++)
			tmpArr[i] = array[i];
		
		return tmpArr;
	}
		
	//Draws the basic map that every thing will need
	private static void drawNonFormattedMap(){
		for(int i=0; i<33; i++){
			for(int j = 0; j<26; j++)
				if(arr[i][j]==0) System.out.print("- ");
				else System.out.print("# ");
			System.out.println();
		}
		System.out.println();
	}

	//Counts how many lands are in a row and returns that num
	private static int landInRow(int row){
		int lands = 0;
		
		for(int i = 0; i< 26; i++){
			if(arr[row][i] != 0)lands++;
		}
		
		return lands;
	}
	
	//Draws a map with the binary format
	private static void printBinary2DArray(int[][] array2d){
		for(int i = 0; i < array2d.length;i++){
			for(int j=0; j<array2d[i].length;j++){
				if(array2d[i][j]==1)System.out.print("* ");
				else if(arr[i][j]==0)System.out.print("- ");
				else System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	//Sums up a map and returns that value
	private static int sumBinaryMap(int[][] map){
		int sum = 0;
		
		for(int i=0; i<33; i++)
			for(int j=0; j<26; j++)
				if(map[i][j] == 1) sum += arr[i][j];
			
		return sum;
	}
	
	
	public static void main(String [] args){
		/**************Attempt 7**************
		 * Goal- to implement the dynamic approach 2 rows at a time then combine row combos
		 */
		
		//Each attempt uses bestArray and the initial map draw function
		int [] [] bestArray = new int [33][26];
		drawNonFormattedMap();
		
		bestArray = assembleMapDynamically();	//Find the best map

		printBinary2DArray(bestArray);			//Print the best map
		
		//Sum map and print the sum of the map
		int mapSum = 0;
		for(int i=0; i<33; i++)
			for(int j=0; j<26; j++)
				if(bestArray[i][j]==1)mapSum += arr[i][j];
		
		System.out.println(mapSum);
		
		/**/
	}
}
