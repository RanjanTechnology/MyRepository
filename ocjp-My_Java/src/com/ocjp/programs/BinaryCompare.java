package com.ocjp.programs;

public class BinaryCompare {
	
	public boolean isBinaryNumber(int binary){
		boolean flag = true;
		
		while(true){
			if(binary == 0){
				break;
			}else{
				int temp = binary%10;
				if(temp>1){
					flag = false;
					break;
				}
				binary = binary/10;
			}
				
		}
		return flag;
	}
}
