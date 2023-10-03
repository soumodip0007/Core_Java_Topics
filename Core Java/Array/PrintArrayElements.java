class PrintArrayElements {
    public static void main(String args[]){  
        //Printing array elements (1st method)
        int arr[]=new int[5];  //declaration and instantiation  
        arr[0]=10;  //initialization  
        arr[1]=20;  
        arr[2]=70;  
        arr[3]=40;  
        arr[4]=50;  
        //traversing array  
        for(int i=0; i<arr.length ;i++)  //length is the property of array  
        System.out.println(arr[i]); 

        //Printing array elements (2nd method)
        int a[]=new int[3];
        a[0] = 50;
        a[1] = 40;
        a[2] = 30;

        for(int b : a) {
            System.out.println(b+ " ");
        }
    }     
}
