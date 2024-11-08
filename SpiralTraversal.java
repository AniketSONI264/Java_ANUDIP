class array{
    array() {
		
		int [][]arr  =  {
				//       0  1 2  3  4
					   {1,  2,  3,  4,  5},       // 00 01 02 03  04
			           {6,  7,  8,  9,  10},      // 10 11 12 13  14
			           {11, 12, 13, 14, 15},  // 20 21 22 23  24
			           {16, 17, 18, 19, 20},  // 30 31 32 33  34
			           {21, 22, 23, 24, 25}   // 40 41 42 43  44
			} ;
		 
		// 1 6 11 16  21 22 23 24 25 20 15 10 5 4 3 2 
	
	int left=0,right=arr[0].length-1;
	int top=0,bot=arr.length-1;
	int i;
	System.out.println("Spiral Traversal...");
// 	for(i=left+1;i<=right;i++){
// 	    System.out.print(arr[left][i]+" ");
// 	}
while(left<=right && top<=bot){
	for(i=top;i<=bot;i++){
	    System.out.print(arr[i][left]+" ");
	}
	left++;
    System.out.println();
	for(i=left;i<=right;i++){
	    System.out.print(arr[bot][i]+" ");
	}
	bot--;
		System.out.println();

    for(i=bot;i>=top;i--){
        System.out.print(arr[i][right]+" ");
    }
    right--;
    	System.out.println();
    	
    	for(i=right;i>=left;i--){
    	    System.out.print(arr[top][i]+" ");
    	}
    	top++;
    		System.out.println();

    	
}
    }
	public static void  main(String[] args){
	    array a =new array();
	}
    
}