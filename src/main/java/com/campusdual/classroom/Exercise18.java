package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static void main(String[] args) {
		int[] intArray= createAndInitializeArray(Utils.integer("Tamaño del array: "));
		showInlineArray(intArray);
	}
	public static int[] createAndInitializeArray(int number){
		int[] intArray = new int[number];
		for(int i=0;i<number;i++){
			int num= i+1;
			intArray[i] = num;
		}
		return intArray;
	}


	public static void showInlineArray(int[] intArray){
		for(int i=0;i<intArray.length; i++){
			System.out.print(intArray[i]);
			if(i!= intArray.length-1){
				System.out.print(" ");
			}
		}

	}
}
