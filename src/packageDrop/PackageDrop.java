package packageDrop;

import java.util.ArrayList;
import java.util.Arrays;

public class PackageDrop {

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
	
	/**			Attempt 1 Functions			**/
	//This function will optimize a row of the array
	private static int[] optimizeRow(int row){
		int potentialPacks = landInRow(row);
		int [] bestArr = new int [26];
		int [] thisArr = new int [26];
		
		
		for(int packs = 1; packs <= potentialPacks; packs++){							//Only need to check packages for each land
			thisArr = checkRow(row, packs);
			
			if(sumRow(thisArr, row) >= sumRow(bestArr, row) && checkIfArrValid(thisArr))	//Check to see if this drop is better than the best
				bestArr = copyArray(thisArr);											//If it is then this is the new best	
		}
		
		return bestArr;
	}
		
	//This function will optimize a coloumn of the array
	private static int[] optimizeCol(int col){
		int potentialPacks = landInCol(col);
		int [] bestArr = new int [33];
		int [] thisArr = new int [33];
		
		
		for(int packs = 1; packs <= potentialPacks; packs++){//Only need to check packages for each land
			thisArr = checkCol(col, packs);
			
			if(sumCol(thisArr, col) >= sumCol(bestArr, col) && checkIfArrValid(thisArr))	//Check to see if this drop is better than the best
				bestArr = copyArray(thisArr);												//If it is then this is the new best	
		}
		
		return bestArr;
	}
	  
	//Checks a row with a given number of packages
	private static int[] checkRow(int row, int packs){
		int [] tmpArr = formatRow(row);		//This is where every single possible combo of packs will be stored
		int [] bestArr = copyArray(tmpArr);	//This is where the current best combo of packs will be stored
		int prevPack = -1;
		int firstPack = 0;
		
		for(int j = 0; j<packs; j++)				//For every package in this run
			for(int i=firstPack;i<26;i++){			//Set the starting package location(s)
				if(tmpArr[i]==1){
					firstPack=i;
					tmpArr[i]=2;
					break;
				}
			}
		
		while(!allPacksAtEnd(tmpArr)){
			for(int i=firstPack;i<26;i++){		//Moves the farthest right package across the row
				if(tmpArr[i]==0)continue;
				else{
					tmpArr[i]=2;												//Set this index as a package
					if(prevPack != -1 && prevPack!=i) tmpArr[prevPack] = 1;		//Clear the last package, care for prevPack==current last pack
					prevPack = i;												//Set this pos as the last package
					
					if(sumRow(tmpArr, row) >= sumRow(bestArr, row))	//Check to see if this drop is better than the best
					if(checkIfArrValid(tmpArr))						//Also check if it is a valid drop
						bestArr = copyArray(tmpArr);					//If it is then this is the new best
				}
			}
			//Need to reset the array and increment the rightmost package that can be incremented
			boolean passedEOAPacks = false;
			int packsAtEnd = 0;
			for(int i=25; i>=0; i--){
				
				if(tmpArr[i]==1)passedEOAPacks = true;	//Found land w/o a package, next pack found needs to be incremented by 1
				
				if(!passedEOAPacks && tmpArr[i] == 2) {
					packsAtEnd++;						//Count how many packs are at the end
					tmpArr[i] = 1;						//Reset the tile
				}
				
				if(passedEOAPacks && tmpArr[i]==2){		//Move the next package found to the next available land
					tmpArr[i]=1;							//Reset the package's current pos to 1
					for(int j = packsAtEnd; j >=0; j--){	//For every pack at the end + 1 for the found pack
						while(tmpArr[i+1]!=1) i++;				//Find the next land
						tmpArr[i+1] = 2;						//Set that land as a package
						firstPack = i+1;
					}
					break;
				}
			}
		}
		
		return bestArr;
		
	}
	
	//Checks a row with a given number of packages
	private static int[] checkCol(int col, int packs){
		int [] tmpArr = formatCol(col);		//This is where every single possible combo of packs will be stored
		int [] bestArr = copyArray(tmpArr);	//This is where the current best combo of packs will be stored
		int prevPack = -1;
		int firstPack = 0;
		
		for(int j = 0; j<packs; j++)				//For every package in this run
			for(int i=firstPack;i<33;i++){			//Set the starting package location(s)
				if(tmpArr[i]==1){
					firstPack=i;
					tmpArr[i]=2;
					break;
				}
			}
		
		while(!allPacksAtEnd(tmpArr)){
			for(int i=firstPack;i<33;i++){		//Moves the farthest right package across the row
				if(tmpArr[i]==0)continue;
				else{
					tmpArr[i]=2;												//Set this index as a package
					if(prevPack != -1 && prevPack!=i) tmpArr[prevPack] = 1;		//Clear the last package, care for prevPack==current last pack
					prevPack = i;												//Set this pos as the last package
					
					if(sumCol(tmpArr, col) >= sumCol(bestArr, col))	//Check to see if this drop is better than the best
					if(checkIfArrValid(tmpArr))							//Also check if it is a valid drop
						bestArr = copyArray(tmpArr);					//If it is then this is the new best
				}
			}
			//Need to reset the array and increment the rightmost package that can be incremented
			boolean passedEOAPacks = false;
			int packsAtEnd = 0;
			for(int i=32; i>=0; i--){
				
				if(tmpArr[i]==1)passedEOAPacks = true;	//Found land w/o a package, next pack found needs to be incremented by 1
				
				if(!passedEOAPacks && tmpArr[i] == 2) {
					packsAtEnd++;						//Count how many packs are at the end
					tmpArr[i] = 1;						//Reset the tile
				}
				
				if(passedEOAPacks && tmpArr[i]==2){		//Move the next package found to the next available land
					tmpArr[i]=1;							//Reset the package's current pos to 1
					for(int j = packsAtEnd; j >=0; j--){	//For every pack at the end + 1 for the found pack
						while(tmpArr[i+1]!=1) i++;				//Find the next land
						tmpArr[i+1] = 2;						//Set that land as a package
						firstPack = i+1;
					}
					break;
				}
			}
		}
		
		return bestArr;
		
	}
	
	//Checks to see if a 1D array is in a valid format
	private static boolean checkIfArrValid(int [] array){
		
		for(int i=0; i<array.length; i++)
			if(array[i]==2 &&(array[i-1]==2 || array[i+1]==2))return false;
		
		return true;
	}

	
	/**			Attempt 2 Functions			**/
	//This function will optimize a single row based on the last
	//Give this the previous array and the current row
	private static int[] optimizeNextRow(int[] prevArr, int row){
		int potentialPacks = landInRow(row);
		int [] bestArr = new int [26];
		int [] thisArr = new int [26];
		
		for(int packs = 1; packs <= potentialPacks; packs++){	//Only need to check packages for each land
			thisArr = checkNextRow(prevArr, row, packs);
		
			if(sumRow(thisArr, row)+sumRow(prevArr, row-1) >= sumRow(bestArr, row)+sumRow(prevArr, row-1)
				&& checkIfNextArrValid(prevArr, thisArr))		//Check to see if this drop is better than the best
				bestArr = copyArray(thisArr);					//If it is then this is the new best
		}
			
		return bestArr;
	}
	
	//Similar to checkRow but this also checks the previous row
	private static int[] checkNextRow(int[] prevArr, int row, int packs){
		int [] tmpArr = formatRow(row);		//This is where every single possible combo of packs will be stored
		int [] bestArr = copyArray(tmpArr);	//This is where the current best combo of packs will be stored
		int prevPack = -1;
		int firstPack = 0;
		
		for(int j = 0; j<packs; j++)				//For every package in this run
			for(int i=firstPack;i<26;i++){			//Set the starting package location(s)
				if(tmpArr[i]==1){
					firstPack=i;
					tmpArr[i]=2;
					break;
				}
			}
		
		while(!allPacksAtEnd(tmpArr)){
			for(int i=firstPack;i<26;i++){		//Moves the farthest right package across the row
				if(tmpArr[i]==0)continue;
				else{
					tmpArr[i]=2;												//Set this index as a package
					if(prevPack != -1 && prevPack!=i) tmpArr[prevPack] = 1;		//Clear the last package, care for prevPack==current last pack
					prevPack = i;												//Set this pos as the last package
					
					if(sumRow(tmpArr, row)+sumRow(prevArr, row-1) 
					>= sumRow(bestArr, row)+sumRow(prevArr, row-1))	//Check to see if this drop is better than the best
					if(checkIfNextArrValid(prevArr, tmpArr))		//Also check if it is a valid drop
						bestArr = copyArray(tmpArr);					//If it is then this is the new best
				}
			}
			//Need to reset the array and increment the rightmost package that can be incremented
			boolean passedEOAPacks = false;
			int packsAtEnd = 0;
			for(int i=25; i>=0; i--){
				
				if(tmpArr[i]==1)passedEOAPacks = true;	//Found land w/o a package, next pack found needs to be incremented by 1
				
				if(!passedEOAPacks && tmpArr[i] == 2) {
					packsAtEnd++;						//Count how many packs are at the end
					tmpArr[i] = 1;						//Reset the tile
				}
				
				if(passedEOAPacks && tmpArr[i]==2){		//Move the next package found to the next available land
					tmpArr[i]=1;							//Reset the package's current pos to 1
					for(int j = packsAtEnd; j >=0; j--){	//For every pack at the end + 1 for the found pack
						while(tmpArr[i+1]!=1) i++;				//Find the next land
						tmpArr[i+1] = 2;						//Set that land as a package
						firstPack = i+1;
					}
					break;
				}
			}
		}
		
		return bestArr;
		
	}

	//Checks to make sure this array and previous array are both in valid positions
	private static boolean checkIfNextArrValid(int[] prevArr, int [] thisArr){
		for(int i=0; i<thisArr.length; i++)
			if(thisArr[i]==2)
				if(thisArr[i-1]==2 || thisArr[i+1]==2 ||							//Same row check
				prevArr[i-1]==2 || prevArr[i] == 2 || prevArr[i+1]==2)return false;	//Previous row check
			
		
		return true;
	}


	/**			Attempt 3 Functions			**/
	//This function will optimize a single row based on the next
	//Give this the next array and the current row
	private static int[] optimizePrevRow(int[] nextArr, int row){
		int potentialPacks = landInRow(row);
		int [] bestArr = new int [26];
		int [] thisArr = new int [26];
		
		for(int packs = 1; packs <= potentialPacks; packs++){	//Only need to check packages for each land
			thisArr = checkPrevRow(nextArr, row, packs);
		
			if(sumRow(thisArr, row)+sumRow(nextArr, row+1) >= sumRow(bestArr, row)+sumRow(nextArr, row+1)
				&& checkIfPrevArrValid(nextArr, thisArr))		//Check to see if this drop is better than the best
				bestArr = copyArray(thisArr);					//If it is then this is the new best
		}
			
		return bestArr;
	}
	
	//Similar to checkRow but this also checks the next one
	private static int[] checkPrevRow(int[] nextArr, int row, int packs){
		int [] tmpArr = formatRow(row);		//This is where every single possible combo of packs will be stored
		int [] bestArr = copyArray(tmpArr);	//This is where the current best combo of packs will be stored
		int prevPack = -1;
		int firstPack = 0;
		
		for(int j = 0; j<packs; j++)				//For every package in this run
			for(int i=firstPack;i<26;i++){			//Set the starting package location(s)
				if(tmpArr[i]==1){
					firstPack=i;
					tmpArr[i]=2;
					break;
				}
			}
		
		while(!allPacksAtEnd(tmpArr)){
			for(int i=firstPack;i<26;i++){		//Moves the farthest right package across the row
				if(tmpArr[i]==0)continue;
				else{
					tmpArr[i]=2;												//Set this index as a package
					if(prevPack != -1 && prevPack!=i) tmpArr[prevPack] = 1;		//Clear the last package, care for prevPack==current last pack
					prevPack = i;												//Set this pos as the last package
					
					if(sumRow(tmpArr, row)+sumRow(nextArr, row-1) 
					>= sumRow(bestArr, row)+sumRow(nextArr, row-1))	//Check to see if this drop is better than the best
					if(checkIfPrevArrValid(nextArr, tmpArr))		//Also check if it is a valid drop
						bestArr = copyArray(tmpArr);					//If it is then this is the new best
				}
			}
			//Need to reset the array and increment the rightmost package that can be incremented
			boolean passedEOAPacks = false;
			int packsAtEnd = 0;
			for(int i=25; i>=0; i--){
				
				if(tmpArr[i]==1)passedEOAPacks = true;	//Found land w/o a package, next pack found needs to be incremented by 1
				
				if(!passedEOAPacks && tmpArr[i] == 2) {
					packsAtEnd++;						//Count how many packs are at the end
					tmpArr[i] = 1;						//Reset the tile
				}
				
				if(passedEOAPacks && tmpArr[i]==2){		//Move the next package found to the next available land
					tmpArr[i]=1;							//Reset the package's current pos to 1
					for(int j = packsAtEnd; j >=0; j--){	//For every pack at the end + 1 for the found pack
						while(tmpArr[i+1]!=1) i++;				//Find the next land
						tmpArr[i+1] = 2;						//Set that land as a package
						firstPack = i+1;
					}
					break;
				}
			}
		}
		
		return bestArr;
		
	}
	
	//Checks to make sure this array and next array are both in valid positions
	private static boolean checkIfPrevArrValid(int[] nextArr, int [] thisArr){
		for(int i=0; i<thisArr.length; i++)
			if(thisArr[i]==2)
				if(thisArr[i-1]==2 || thisArr[i+1]==2 ||							//Same row check
				nextArr[i-1]==2 || nextArr[i] == 2 || nextArr[i+1]==2)return false;	//Previous row check
			
		
		return true;
	}
	
	
	/**			Attempt 4 Functions			**/
	//This function will optimize 2 rows for backward checking
	//Give this the previous 2 key arrays and 
	private static int[][] optimize2Rows(int[] prevArr, int [] prevPrevArr, int row){
		int potentialPrevPacks = landInRow(row-1);
		int potentialPacks = landInRow(row);
		int [] bestArr = formatRow(row);
		int [] bestPrevArr = copyArray(prevArr);
		int [] thisArr = new int [26];
		int [][] thisChunk = new int [2][26];
		int [][] bestChunk = new int [2][26];
		
		for(int packs = 1; packs <= potentialPacks; packs++)	//Only need to check packages for each land
			for(int prevPacks = 1; prevPacks <= potentialPrevPacks; prevPacks++){
				thisChunk = checkPrev2Rows(prevArr, prevPrevArr, row, packs, prevPacks);
		
				thisArr = get2DArrRow(thisChunk, 1);
				prevArr = get2DArrRow(thisChunk, 0);
				
				if(sumRow(thisArr, row)+sumRow(prevArr, row-1) >= 
					sumRow(bestArr, row)+sumRow(bestPrevArr, row-1)
					&& checkIfPrev2ArrValid(prevArr, prevPrevArr, thisArr)){	//Check to see if this drop is better than the best
					bestArr = copyArray(thisArr);								//If it is then this is the new best
					bestPrevArr = copyArray(prevArr);							//Dont forget the prev array
					bestChunk = copyChunk(thisChunk);
				}
			}
		
		prevArr = bestPrevArr;	//Reset the best prev array
		return bestChunk;
	}
	
	//Checks brute forces 2 rows, edits the prevArr and checks to make sure that this is a valid 3 row chunk
	private static int[][] checkPrev2Rows(int[] prevArr, int[] prevPrevArr, int row, int packs, int prevPacks){
		int[] tmpPrevArr = formatRow(row-1);//This is where every possible combo of packs in prev row will be stored
		int[] tmpArr = formatRow(row);		//This is where every single possible combo of packs will be stored
		int[] bestArr = copyArray(tmpArr);	//This is where the current best combo of packs will be stored
		int[][] bestComboArr = new int [2][26];
		int prevPack = -1;
		int prevArrPrevPack = -1;
		int firstPack = 0;
		int firstPrevPack = 0;
		
		
		for(int j = 0; j<prevPacks; j++)			//For every package in prev array this run
			for(int i=firstPrevPack;i<26;i++){		//Set the starting package location(s) for prev array
				if(tmpPrevArr[i]==1){
					firstPrevPack=i;
					tmpPrevArr[i]=2;
					break;
				}
			}
		
		while(!allPacksAtEnd(tmpPrevArr)){
			
			for(int k=firstPrevPack; k<26 ;k++){	//Moves the farthest right package across the row
				if(tmpPrevArr[k]==0)continue;		//Skip water tiles
				else{
					tmpPrevArr[k]=2;								//Set this index as the package				
					if(prevArrPrevPack != -1 && prevArrPrevPack!=k) 
						tmpPrevArr[prevArrPrevPack] = 1;			//Clear the last package
					prevArrPrevPack = k;							//Set this pos as the last package
				}
				
				prevPack = -1;
				firstPack = 0;
				tmpArr = formatRow(row);
				
				for(int j = 0; j<packs; j++)				//For every package in this run
					for(int i=firstPack;i<26;i++){			//Set the starting package location(s)
						if(tmpArr[i]==1){
							firstPack=i;
							tmpArr[i]=2;
							break;
						}
					}
				
				while(!allPacksAtEnd(tmpArr)){
					
					for(int i=firstPack;i<26;i++){		//Moves the farthest right package across the row
						if(tmpArr[i]==0)continue;
						else{
							tmpArr[i]=2;												//Set this index as a package
							if(prevPack != -1 && prevPack!=i) tmpArr[prevPack] = 1;		//Clear the last package, care for prevPack==current last pack
							prevPack = i;												//Set this pos as the last package
							
							if(sumRow(tmpArr, row)+sumRow(tmpPrevArr, row-1)
							>= sumRow(bestArr, row)+sumRow(prevArr, row-1))					//Check to see if this drop is better than the best
							if(checkIfPrev2ArrValid(tmpPrevArr, prevPrevArr, tmpArr)){			//Also check if it is a valid drop
								bestArr = copyArray(tmpArr);								//If it is then this is the new best
								prevArr = copyArray(tmpPrevArr);
							}
						}
					}
					
					//Need to reset the array and increment the rightmost package that can be incremented
					boolean passedEOAPacks = false;
					int packsAtEnd = 0;
					for(int i=25; i>=0; i--){
						
						if(tmpArr[i]==1)passedEOAPacks = true;	//Found land w/o a package, next pack found needs to be incremented by 1
						
						if(!passedEOAPacks && tmpArr[i] == 2) {
							packsAtEnd++;						//Count how many packs are at the end
							tmpArr[i] = 1;						//Reset the tile
						}
						
						if(passedEOAPacks && tmpArr[i]==2){		//Move the next package found to the next available land
							tmpArr[i]=1;							//Reset the package's current pos to 1
							for(int j = packsAtEnd; j >=0; j--){	//For every pack at the end + 1 for the found pack
								while(tmpArr[i+1]!=1) i++;				//Find the next land
								tmpArr[i+1] = 2;						//Set that land as a package
								firstPack = i+1;
							}
							break;
						}
					}
				}
			}
			//Need to reset the array and increment the rightmost package that can be incremented
			boolean passedEOAPacks = false;
			int packsAtEnd = 0;
			for(int i=25; i>=0; i--){
				
				if(tmpPrevArr[i]==1)passedEOAPacks = true;	//Found land w/o a package, next pack found needs to be incremented by 1
				
				if(!passedEOAPacks && tmpPrevArr[i] == 2) {
					packsAtEnd++;							//Count how many packs are at the end
					tmpPrevArr[i] = 1;						//Reset the tile
				}
				
				if(passedEOAPacks && tmpPrevArr[i]==2){		//Move the next package found to the next available land
					tmpPrevArr[i]=1;						//Reset the package's current pos to 1
					for(int j = packsAtEnd; j >=0; j--){	//For every pack at the end + 1 for the found pack
						while(tmpPrevArr[i+1]!=1) i++;			//Find the next land
						tmpPrevArr[i+1] = 2;					//Set that land as a package
						firstPrevPack = i+1;
					}
					break;
				}
			}
		}
		
		set2DArrRow(bestComboArr, prevArr, 0);
		set2DArrRow(bestComboArr, bestArr, 1);
		
		return bestComboArr;
	}

	//Checks to make sure the previous 2 arrays are in valid configurations
	private static boolean checkIfPrev2ArrValid(int[] prevArr, int[] prevPrevArr, int[] thisArr){
		for(int i=0; i<prevArr.length; i++){
			if(prevArr[i]==2)
				if(prevArr[i-1]==2 || prevArr[i+1]==2 ||										//Same row check
				prevPrevArr[i-1]==2 || prevPrevArr[i] == 2 || prevPrevArr[i+1]==2 ||			//Previous row check
				thisArr[i-1]==2 || thisArr[i]==2 || thisArr[i+1]==2) return false;
			if(thisArr[i]==2)
				if(thisArr[i-1]==2 || thisArr[i+1]==2) return false;
		}
		return true;
	}
	
	//Coppies a chunk and returns it
	private static int[][] copyChunk(int[][] chunk){
		int[][] tmp = new int [2][26];
		for(int i=0; i<2; i++)
			for(int j=0; j<26; j++){
				tmp[i][j]=chunk[i][j];
			}
		return tmp;
	}
	
	
	/**			Attempt 5 Functions			**/
	//Sets the weighted array
	private static int[][] setWeightedArr(){
		int[][] weightedArr = new int[33][26];	//Each land will have a weighted value of itseld - all the tiles around it
		
		for(int i=0; i<33; i++)
			for(int j=0; j<26; j++){
				if(arr[i][j]!=0){				//Land case
					
					weightedArr[i][j] = arr[i][j] - 
										(arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] +
										 arr[i][j-1] 				 + arr[i][j+1]   +
										 arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1]);
					
				}else weightedArr[i][j]=100;	//Water case
			}
		
		return weightedArr;
	}
	
	//Searches a weighted array for a given value and sets a key array
	private static int[][] searchWeightedArr(int[][] weightedArr, int[][] keyArr, int searchValue){
		
		for(int i=0; i<33; i++)
			for(int j=0; j<26; j++)
				if(weightedArr[i][j]==searchValue)
					if(keyArr[i-1][j-1] !=2 && keyArr[i-1][j] !=2 && keyArr[i-1][j+1] !=2 &&
					   keyArr[i][j-1] !=2 &&   						 keyArr[i][j+1] !=2 &&
					   keyArr[i+1][j-1] !=2 && keyArr[i+1][j] !=2 && keyArr[i+1][j+1] !=2
					   )keyArr[i][j] = 2;
				
		
		return keyArr;
	}
	
	
	/**			Attempt 6 Functions			**/
	//Finds the best map using dynamic programming
	public static int[][] findMapDynamically(){
		/* Dynamic Approach */
		/*	The idea is to keep track of past rows so i dont have to compute them again
		 * 	Array lists will probbaly be very good here since idk how many I will need to store
		 * 	Once I have a a row solved for all possible valid combos I can compare with all valid combos of the next row.
		 * 		this will give me a new set of valid combos wich I will check against the valid rows of the next row and so on
		 */
		
		ArrayList<int[]> rowStorage = new ArrayList<int[]>();
		ArrayList<int[][]> mapStorage = new ArrayList<int[][]>();
		int bestMapIndex = 0;
		int bestMapSum = 0;
		
		mapStorage.add(new int[33][26]);				//Initializing the map
		
		for(int j=0;j<9; j++){						//For every row in the map
			rowStorage = findLegalRows(j);				//Find the given row's potential array formations
			if(rowStorage.size()==0) 					//Check if this row has any land
				rowStorage.add(new int[26]);				//If not then add in an empty row
			
			/*for(int i=0; i<rowStorage.size(); i++){
				 printBinaryArray(rowStorage.get(i), j);
			}
			System.out.println();*/
			
			rowStorage = reduceLegalRows(rowStorage);	//Reduce the rows in the row storage to essential rows
			
			/*for(int i=0; i<rowStorage.size(); i++){
				 printBinaryArray(rowStorage.get(i), j);
			}
			System.out.println();*/
			
			//Find every possible combination of the past maps and new rows
			mapStorage = findLegalMaps(mapStorage, rowStorage, j);
		}
		
		//Compare every map
		for(int i=0; i<mapStorage.size(); i++){
			int currSum = sumBinaryMap(mapStorage.get(i));
			
			if(currSum > bestMapSum){			//Check if this sum is better than the best so far
				bestMapIndex = i;
				bestMapSum = currSum;
			}
			
		}
		
		return mapStorage.get(bestMapIndex);
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
	
	//This function takes all legal row formations and reduces them to essential rows
	private static ArrayList<int[]> reduceLegalRows(ArrayList<int[]> checkList){
		ArrayList<int[]> tmpList = new ArrayList<int[]>();
		boolean inList = false;
		boolean tmpExtra1 = false;
		boolean checkExtra1 = false;
		
		for(int i = checkList.size()-1; i>=0; i--){		//For every row in storage
			for(int z = 0; z<tmpList.size(); z++){		//And for every row in the tmp storage
				inList = true;
				for(int j = 0; j<26; j++){				//Check each index
					if(tmpList.get(z)[j] == 1 && checkList.get(i)[j] == 0) tmpExtra1 = true;
					if(tmpList.get(z)[j] == 0 && checkList.get(i)[j] == 1) checkExtra1 = true;
					if(tmpExtra1 && checkExtra1) {		//Found that these two arrays differ
						inList = false;
						break;
					}
				}
				tmpExtra1 = checkExtra1 = false;		//Reset the checks
				if(inList) break;						//If found a match then move on
			}
			if(!inList) tmpList.add(checkList.get(i));
			inList = true;
		}
		
		return tmpList;
	}
	
	//This function returns all legal maps from a specific row up when given the past maps
	private static ArrayList<int[][]> findLegalMaps(ArrayList<int[][]> mapStorage, ArrayList<int[]> rowStorage, int row){
		ArrayList<int[][]> legalMaps = new ArrayList<int[][]>();
		int[][] tmpMap = new int[33][26];
		
		for(int i=0; i<mapStorage.size(); i++){			//Iterate over every map stored
			tmpMap = copy2DArray(mapStorage.get(i));	//Get a copy of the map
			for(int j=0; j<rowStorage.size(); j++){		//Iterate over every row too
				
				//Check if this map, row combo is valid
				tmpMap[row] = copyArray(rowStorage.get(j));	//Set the row as the row being tested
				
				if(checkIfLegal(tmpMap, row)){				//If this is a legal map store it
					legalMaps.add(copy2DArray(tmpMap));
					//print2DArray(tmpMap);
					//System.out.println();
				}
				else{										//Else make it a legal row
					for(int z=0; z<26; z++)
						if(tmpMap[row][z] == 1)
						if(
							tmpMap[row-1][z-1] == 1 || 
							tmpMap[row-1][z] == 1 || 
							tmpMap[row-1][z+1] == 1) 
								tmpMap[row][z] = 0;
							
					legalMaps.add(copy2DArray(tmpMap));
				}
			}
		}
		
		return legalMaps;
	}
	
	//This function checks if a binary row is in a legal format
	private static boolean checkIfLegal(int[] thisArr){
		
		for(int i=0; i<thisArr.length; i++)
			if(thisArr[i]==1 &&(thisArr[i-1]==1 || thisArr[i+1]==1))return false;
		
		return true;
	}
	
	//This function checks if a binary row is legal in a specific row of a map
	private static boolean checkIfLegal(int[][] thisArr, int row){
		
		for(int i=0; i<thisArr[row].length; i++)
			if(thisArr[row][i] == 1)
			if(thisArr[row-1][i-1] == 1 || thisArr[row-1][i] == 1 || thisArr[row-1][i+1]==1)
				return false;
		return true;
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

	//Sums up a map and returns that value
	private static int sumBinaryMap(int[][] map){
		int sum = 0;
		
		for(int i=0; i<33; i++)
			for(int j=0; j<26; j++)
				if(map[i][j] == 1) sum += arr[i][j];
			
		return sum;
	}
	
	
	/**			Attempt 7 Functions			**/
	//This will assemble all potential maps based on comparing the potential row combinations and return the best one
	private static int[][] assembleMapDynamically(){
		ArrayList<int[][]> mapStorage = new ArrayList<int[][]>();
		ArrayList<int[][]> tmpComboStorage = new ArrayList<int[][]>();
		ArrayList<ArrayList<int[][]>> comboStorage = new ArrayList<ArrayList<int[][]>>();
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
		for(int i = 0; i<32; i++){
			mapStorage = findMapPath(mapStorage, comboStorage.get(i), i); 	//Give ALL patch up to given row
			mapStorage = reduceMapPaths(mapStorage, i);						//Find the optimal paths up to each given row	
		}
		
			
		//Now sum up all paths and save the best one
		for(int i=0; i<mapStorage.size(); i++){
			int sum = sumBinaryMap(mapStorage.get(i));
			
			if(sum > bestMapSum){						//Check if better than prev bet map
				bestMapSum = sum;
				bestMapIndex = i;
			}
			
		}
		
		mapStorage.add(new int[33][26]);				//Placeholder until finished so doesn't error
		
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
					if(tmpCombo[1][i]==1)
					if(	tmpCombo[0][i-1] == 1||
						tmpCombo[0][i] == 1||
						tmpCombo[0][i+1] == 1){
							validCombo = false;
							break;
					}
				
				if(validCombo) rowComboStorage.add(tmpCombo);
				validCombo = true;
			}
		}
		
		return rowComboStorage;
	}
	
	//Goes through all potential combos of the combos
	private static ArrayList<int[][]> findMapPath(ArrayList<int[][]> mapStorage, ArrayList<int[][]> comboStorage, int row){
		ArrayList<int[][]> tmpMapStorage = new ArrayList<int[][]>();
		
		if(row<1)
			return mapStorage;
		
		
		for(int i=0; i<mapStorage.size(); i++){				//Go thru all maps stored
			for(int j=0; j<comboStorage.size(); j++){		//Go thru all combos
				if(//Arrays.equals(mapStorage.get(i)[row-2], tripleStorage.get(j)[0]) &&
				   Arrays.equals(mapStorage.get(i)[row-1], comboStorage.get(j)[0])){	//Check if the arrays are the same
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
			if(!optimalMaps.isEmpty()){
				boolean duplicateMap = false;
				for(int i = 0; i<optimalMaps.size(); i++){	//For every map and every map in optimal map storage
						
					if(Arrays.equals(mapStorage.get(map)[row], optimalMaps.get(i)[row])){
						duplicateMap=true;					//If the given row is the same then this is a duplicate
						dupeMapIndex=i;
						break;
					}
					
				}
				if(duplicateMap){							//If this map is a duplicate compare it
					if(sumBinaryMap(mapStorage.get(map)) > sumBinaryMap(optimalMaps.get(dupeMapIndex))){
						optimalMaps.remove(dupeMapIndex);		//If this map is better than the best so far replace it
						optimalMaps.add(mapStorage.get(map));
					}
					
					
				}else optimalMaps.add(mapStorage.get(map));		//If not in map yet then add
			}
			else optimalMaps.add(mapStorage.get(map));			//If empty then add map
		}
		
		return optimalMaps;
	}
	
	//Combines combos of around a specific row and returns an array list of reduced combos
	private static ArrayList<int[][]> findAndReduceTriple(ArrayList<int[][]> prevCombo, ArrayList<int[][]> nextCombo, int row){
		ArrayList<int[][]> tripleStorage = new ArrayList<int[][]>();
		//ArrayList<int[][]> potentialValidTriples = new ArrayList<int[][]>();
		
		for(int prev=0; prev<prevCombo.size(); prev++){				//For every triple between each combo
			for(int next=0; next<nextCombo.size(); next++){			//Brute force every combo
				if(Arrays.equals(prevCombo.get(prev)[1], nextCombo.get(next)[0]))	//Check if combos can go together
				if(validTriple(prevCombo.get(prev), nextCombo.get(next), row-1)){		//Check if this is a potentially optimal triple
					
					int[][] tmpTriple = new int[3][26];					//Make a triple and store it
					tmpTriple[0]= copyArray(prevCombo.get(prev)[0]);
					tmpTriple[1]= copyArray(prevCombo.get(prev)[1]);
					tmpTriple[2]= copyArray(nextCombo.get(next)[1]);
					
					tripleStorage.add(tmpTriple);
				}
			}
		}
		
		return tripleStorage;
	}
	
	//Checks if two combos make a potentially optimal triple
	private static boolean validTriple(int[][] prevCombo, int[][] nextCombo, int row){
		
		for(int i=0; i<26; i++){
			if(arr[row][i]!=0 && prevCombo[1][i]==0)		
			if(prevCombo[0][i-1] == 0 && prevCombo[0][i] == 0 && prevCombo[0][i+1] == 0)	//If every single land around
			if(prevCombo[1][i-1] == 0 && 						 prevCombo[1][i+1] == 0)	//is not selected then this
			if(nextCombo[1][i-1] == 0 && nextCombo[1][i] == 0 && nextCombo[1][i+1] == 0)	//Cannot be optimal
				return false;
		}
		
		return true;
	}
	
	
	/**			General Function			**/
	/**Note** Every attempt may use general Functions**/
	//Takes an array and returns a new array with the same stuff
	private static int[] copyArray(int[] array){
		int[] tmpArr = new int[array.length];
		
		for(int i = 0; i<tmpArr.length; i++)
			tmpArr[i] = array[i];
		
		return tmpArr;
	}
	
	//Takes a 2d array and returns a new array with the same stuff
	private static int [][] copy2DArray(int [][] array2d){
		int [][] tmpArr = new int[33][26];
		
		for(int i = 0; i < 33; i++)
			for(int j = 0; j < 26; j++)
				tmpArr[i][j] = array2d[i][j];
		
		return tmpArr;
	}
	
	//Sums up a given row with package dropped
	public static int sumRow(int [] keyArr, int row){
		int sum = 0;
		
		for(int i = 0; i <keyArr.length; i++)
			if(keyArr[i] == 2) sum += arr[row][i];
		
		return sum;
	}
	
	//Sums up a given column with package dropped
	public static int sumCol(int [] keyArr, int col){
		int sum = 0;
		
		for(int i = 0; i <keyArr.length; i++)
			if(keyArr[i] == 2) sum += arr[i][col];
		
		return sum;
	}
		
	//Sums up the whole map
	public static int sumMap(int[][] keyArr){
		int sum = 0;
		
		for(int i = 0; i<33; i++)
			for(int j = 0; j<26; j++){
				if(keyArr[i][j]==2) sum += arr[i][j];
			}
		
		return sum;
	}
	
	//Counts how many lands are in a row and returns that num
	private static int landInRow(int row){
		int lands = 0;
		
		for(int i = 0; i< 26; i++){
			if(arr[row][i] != 0)lands++;
		}
		
		return lands;
	}
	
	//Counts how many lands are in a column and returns that num
	private static int landInCol(int col){
		int lands = 0;
		
		for(int i = 0; i< 33; i++){
			if(arr[i][col] != 0)lands++;
		}
		
		return lands;
	}
	
	//Formats the array into 0-water, 1-land
	private static int[] formatRow(int row){
		int [] formattedRow = new int [26];
		
		for(int i=0; i<26; i++)
			if(arr[row][i] == 0) formattedRow[i] = 0;		//Water
			else formattedRow[i]=1;							//Land
			
		return formattedRow;
	}
	
	//Formats the array into 0-water, 1-land
	private static int[] formatCol(int col){
		int [] formattedCol = new int [33];
		
		for(int i=0; i<33; i++)
			if(arr[i][col] == 0) formattedCol[i] = 0;		//Water
			else formattedCol[i]=1;							//Land
			
		return formattedCol;
	}
	
	//Checks if all of the packages are at the end of a 1d array
	private static boolean allPacksAtEnd(int[] array){
		boolean packChecker = false;
		
		for(int i = array.length-1; i>=0; i--){						//Start from back of array and go backwards
			if(array[i] == 1) packChecker = true;		//If a land w/o a package is found then no other packages should be found
			if(packChecker && array[i]==2) return false;//If a package is found after finding the land w/o a package then return false
		}
		
		return true;	//All packs are at the end
	}
	
	//Prints a formated array
	public static void printArray(int [] array){
		for(int i=0; i<array.length; i++)
			if(array[i]==0)System.out.print("- ");
			else if(array[i]==1)System.out.print("# ");
			else if(array[i]==2)System.out.print("* ");
		System.out.println();
	}
	
	public static void printBinaryArray(int[] array, int row){
		for(int j=0; j<26;j++){
			if(arr[row][j]==0)System.out.print("- ");
			else if(array[j]==1)System.out.print("* ");
			else System.out.print("# ");
		}
		System.out.println();
	}
	
	//Prints a formated 33x26 2D array
	private static void print2DArray(int [] [] array2d){
		for(int i = 0; i < array2d.length;i++){
			for(int j=0; j<array2d[i].length;j++){
				if(array2d[i][j]==0)System.out.print("- ");
				if(array2d[i][j]==1)System.out.print("# ");
				if(array2d[i][j]==2)System.out.print("* ");
			}
			System.out.println();
		}
	}
	
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
	
	private static void printBinary2DArray(int[][] array2d, int startRow){
		for(int i = 0; i < array2d.length;i++){
			for(int j=0; j<array2d[i].length;j++){
				if(array2d[i][j]==1)System.out.print("* ");
				else if(arr[i+startRow][j]==0)System.out.print("- ");
				else System.out.print("# ");
			}
			System.out.println();
		}
	}
	
	//Sets a given 2D array's row to an array
	private static void set2DArrRow(int[][]array2d,int [] array, int row){
		for(int i = 0; i<26; i++){
			array2d[row][i] = array[i];
		}
	}
	
	//Gives a row of an 2D array
	private static int[] get2DArrRow(int[][]array2d, int row){
		int[] tmpArr = new int[26];
		
		for(int i=0; i<26; i++){
			tmpArr[i] = array2d[row][i];
		}
		
		return tmpArr;
	}
	
	//Returns a basic land water map
	private static int[][] formatMap(){
		int[][] tmp = new int [33][26];
		for(int i=0; i<33;i++)
			for(int j=0; j<26; j++)
				if(arr[i][j]==0)tmp[i][j]=0;
				else tmp[i][j]=1;
		return tmp;
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
	
	public static void main(String [] args){
		
		//Each attempt uses bestArray and the initial map draw function
		int [] [] bestArray = new int [33][26];
		drawNonFormattedMap();
		
		/**************Attempt 1****************
		 * The goal of this attempt was to optimize each row individually
		 * 		to start the assignment
		 * 		and to spark inspiration
		 *
		//Row set
		for(int j = 0; j<33; j++){				//Row
			int[] checkArr = optimizeRow(j);
			for(int i=0; i < 26; i++){			//Column
				bestArray[j][i] = checkArr[i];
			}
		}
		
		//Print the map
		print2DArray(bestArray);
		
		System.out.println();
		
		//Column set
		for(int j = 0; j<26; j++){				//Column
			int[] checkArr = optimizeCol(j);
			for(int i=0; i < 33; i++){			//Row
				bestArray[i][j] = checkArr[i];
			}
		}
		
		//Print the map
		print2DArray(bestArray);
		
		bestArray = new int[33][26];
		/**/
		
		/***************Attempt 2****************
		 * The goal for this attempt is to optimize each row at a time depending upon the last
		 *
		
		int[] checkArr = new int[26];
		int rowCounter = 0;
		//Optimize rows until found the first row of the island
		for(int i = 0; i < 33; i++){
			rowCounter++;						//Keeps track of the next row
			checkArr = optimizeRow(i);			//Optimizes a row and returns it
			set2DArrRow(bestArray, checkArr, i);//Adds row to map
			
			//System.out.print(i+" "); 			//For debugging
			//printArray(checkArr);				//For easy debugging
			
			if(sumRow(checkArr, i)!=0)break;	//Breaks once found a row with land
		}
		
		//Construct the rest of the map
		for(int i = rowCounter; i<33; i++){
			checkArr = optimizeNextRow(checkArr, i);//Optimizes the next row and returns it
			set2DArrRow(bestArray, checkArr, i);	//Adds row to map
			
			//System.out.print(i+" "); 				//For debugging
			//printArray(checkArr);					//For easy debugging
		}
		
		System.out.println();					//For debugging
		
		//Print the map
		print2DArray(bestArray);
		
		//Sum map and print the sum of the map
		int mapSum = 0;
		for(int i=0; i<33; i++)
			for(int j=0; j<26; j++)
				if(bestArray[i][j]==2)mapSum += arr[i][j];
		
		System.out.println(mapSum);
		
		/**/
		
		
		/**************Attempt 3******************
		 * The goal for this attempt is to repeat attempt 2 for every row that has land
		 *
		
		int[][] tmpArray = new int[33][26];
		int[] checkArr = new int[26];

		//Optimize rows until found the first row of the island
		for(int i = 0; i < 33; i++){
			checkArr = optimizeRow(i);			//Optimizes a row and returns it
			set2DArrRow(tmpArray, checkArr, i);//Adds row to map
			
			if(sumRow(checkArr, i)!=0){			//Checks for first row w/ land
				for(int j = i; j>0; j--){					//Construct the top part of the map
					checkArr = optimizePrevRow(checkArr, j);//Optimize all previous rows
					set2DArrRow(tmpArray, checkArr, j);		//Set them in the current map
				}
				for(int j = i+1; j<33; j++){				//Construct the bottom part of the map
					checkArr = optimizeNextRow(checkArr, j);//Optimize all the preceeding rows
					set2DArrRow(tmpArray, checkArr, j);		//Set them in current map
				}
				if(sumMap(tmpArray)>=sumMap(bestArray)){	//Checks to see if this map is better than any previous map
					bestArray = copy2DArray(tmpArray);
				}
			}
		}
		
		//Print the map
		print2DArray(bestArray);
		
		//Sum map and print the sum of the map
		int mapSum = 0;
		for(int i=0; i<33; i++)
			for(int j=0; j<26; j++)
				if(bestArray[i][j]==2)mapSum += arr[i][j];
		
		System.out.println(mapSum);
		
		//For debugging
		//System.out.println(rowCounter);
		/**/
		
		
		/****************Attempt 4**********
		 * The goal for this attempt is to implement the same thing as attempt 3 but with also checking the previous 2 rows 
		 * 	and potentially editing the previous row
		 *
		
		int[] prevPrevArr = new int[26];
		int[] prevArr = new int[26];
		int[] checkArr = new int[26];
		int[][] checkChunk = new int [2][26];
		int rowCounter = 0;

		//Optimize rows until found the first row of the island
		for(int i = 0; i < 33; i++){
			rowCounter++;						//Keeps track of the next row
			checkArr = optimizeRow(i);			//Optimizes a row and returns it
			set2DArrRow(bestArray, checkArr, i);//Adds row to map
			
			//System.out.print(i+" "); 			//For debugging
			//printArray(checkArr);				//For easy debugging
			
			if(sumRow(checkArr, i)!=0)break;	//Breaks once found a row with land
		}
		
		//Go through the whole map optimizing 3 rows at a time
		for(int i=rowCounter; i<33; i++){
			prevArr = get2DArrRow(bestArray, i-1);				//Initialize the prev Array
			prevPrevArr = get2DArrRow(bestArray, i-2);			//Initialize the prev prev Array
			
			checkChunk = optimize2Rows(prevArr, prevPrevArr, i);	//Find the best combination of this and prev arrays
			
			checkArr = get2DArrRow(checkChunk, 1);
			prevArr = get2DArrRow(checkChunk, 0);
			
			set2DArrRow(bestArray, checkArr, i);				//Add curr row to map
			set2DArrRow(bestArray, prevArr, i-1);				//Add prev row to map
		}
		
		//Print the map
		print2DArray(bestArray);
		
		//Sum map and print the sum of the map
		int mapSum = 0;
		for(int i=0; i<33; i++)
			for(int j=0; j<26; j++)
				if(bestArray[i][j]==2)mapSum += arr[i][j];
		
		System.out.println(mapSum);
		
		/**/
		
		
		/**************Attempt 5**************
		 * The goal for this one is to try the weighted map method
		 *
		
		int[][] weightedMap = setWeightedArr();
		bestArray = formatMap();
		for(int i=99; i>-791; i--){
			bestArray = searchWeightedArr(weightedMap, bestArray, i);
		}
		
		print2DArray(bestArray);
		
		//Sum map and print the sum of the map
		int mapSum = 0;
		for(int i=0; i<33; i++)
			for(int j=0; j<26; j++)
				if(bestArray[i][j]==2)mapSum += arr[i][j];
		
		System.out.println(mapSum);
		/**/
		
		/**************Attempt 6**************
		 * Goal- to use dynamic programming and implement legal rows. 
		 *
		
		bestArray = findMapDynamically();

		printBinary2DArray(bestArray);
		
		//Sum map and print the sum of the map
		int mapSum = 0;
		for(int i=0; i<33; i++)
			for(int j=0; j<26; j++)
				if(bestArray[i][j]==1)mapSum += arr[i][j];
		
		System.out.println(mapSum);
		
		/**/
		
		/**************Attempt 7**************
		 * Goal- to implement the dynamic approach 2 rows at a time then combine row combos
		 */
		
		bestArray = assembleMapDynamically();

		printBinary2DArray(bestArray);
		
		//Sum map and print the sum of the map
		int mapSum = 0;
		for(int i=0; i<33; i++)
			for(int j=0; j<26; j++)
				if(bestArray[i][j]==1)mapSum += arr[i][j];
		
		System.out.println(mapSum);
		
		/**/
	}
	
}
