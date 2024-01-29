package practiceStream;


public class Size {
    public static void main(String[] args) {
        String Line = "My name is OPTIMUS PRIME 123456789@#$";
//        int count = 0;

//        for (int i = 0; i < Line.length(); i++) {
//            char alphabet = Line.charAt(i);
//
////            if ((alphabet >= 'A' && alphabet <= 'Z') || (alphabet >= 'a' && alphabet <= 'z')) {
////                count++;
////            }
//            if 
//        }
               String lowercase = Line.toLowerCase();
        System.out.println(lowercase);
        
        
        	int[] array= {1,2,3,4,5,6};
        	
//        	if (array.length>=3) {
//        		System.out.println("3rd element " + array[2]);
//        	}
//        	else {
//        		System.out.println("length of array is too small");
//        	}
//        		
//        	
//        	System.out.println("last element " + array[array.length-1]);
//        	
        	double sum=0;
        	for(int i=0; i<array.length;i++) {
        		sum+=array[i];
        		
        	}
        	double average=sum/array.length;
        	System.out.println("Average " + average);
        	
        	
    }
}
