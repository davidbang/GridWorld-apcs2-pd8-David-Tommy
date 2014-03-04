import java.util.*;

//Partners: David Bang, Tommy Chan

public class MergeSort{
    
    public static int[] merge(int[]data1,int[]data2){

	int[]ans = new int[data1.length + data2.length];
	
	for(int i = 0; i < data1.length; i ++){
	    ans[i] = data1[i];
	}
	for(int j = 0; j < data2.length; j ++){
	    ans[data1.length + j] = data2[j];
	}

	return ans;
    }
    
    public static int [] sort (int [] data) {
	if (data.length == 1){
	    return data;
	}else{

	    if (data.length % 2 == 0) {
		int data1 = new int [data.length/2];
		int data2 = new int [data.length/2];
		for (int i = 0; i < data.length/2; i ++) {
		    data1 [i] = data [i];
		    data2 [i] = data [data.length/2 + i];

		}
	    }
	    else {
		int data1 = new int [data.length/2 + 1];
		int data2 = new int [data.length/2 ];
		for (int i = 0; i < data.length/2 + 1; i ++) {
		    data1 [i] = data [i];
		    data2 [i] = data [data.length/2 - 1 + i];
		}
	    }
	    
	    sort (data1);
	    sort (data2);
	}


	}

    public static String toString(int[]data){
	String a = "[";
	for(int i = 0; i < data.length - 1; i ++){
	    a += data[i] + ", ";
	}
	return a + data[data.length - 1] + "]";
    }

    public static void main(String[]args){ 
	Random r = new Random();
	int[]data1 = new int[10];
	int[]data2 = new int[10];
	
	for(int i = 0; i < data1.length; i ++){
	    data1[i] = r.nextInt(100);
	    data2[i] = r.nextInt(100);
	}

	int[]data3 = merge(data1,data2);

	System.out.println(toString (data1));
	System.out.println(toString (data2));
	System.out.println(toString (data3));
    }
}