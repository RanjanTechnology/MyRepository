package com.ocjp.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadAndSort {
	
	public static int[] sort(int[] arr){
		
		int len = arr.length;
		int k;
		for(int m = len; m >= 0; m--){
			for(int i = 0; i < len-1; i++){
				k = i+1;
				if(arr[i] > arr[k]){
					int temp;
					temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) throws IOException {
		
		File f1 = new File("c:\\Ranjan\\abc.txt");
		File f2 = new File("c:\\Ranjan\\xyz.txt");
		
		String[] strArr1 = fileReadValue(f1);
		String[] strArr2 = fileReadValue(f2);
		int[] intArr = new int[strArr1.length+strArr2.length];
		
		int len1 = strArr1.length;
		int len2 = strArr2.length;
		int len = len1+len2;
		for(int i = 0; i < len1; i++){
			intArr[i] = Integer.parseInt(strArr1[i]);
		}
		
		for(int i = 0, j = len1; j< len && i < len2; i++,j++){
			intArr[j] = Integer.parseInt(strArr2[i]);
		}
		
		int[] arr = sort(intArr);
		
		System.out.println("Sorted array: \n");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]);
		}
	}

	private static String[] fileReadValue(File file) throws FileNotFoundException, IOException {
		byte[] byts = new byte[(int)file.length()];
		FileInputStream fis = new FileInputStream(file);
		fis.read(byts);
		fis.close();
		
		String[] valueArr = new String(byts).trim().split("\\s+");
		//String[] valueArr = value.split("\\s+");
		
		return valueArr;
	}

}
