package sealdp;

import java.util.Arrays;
import java.util.List;

public class MianForEach {

	public static void main(String[] args) {
		int data[]=new int[] {12,34,5,66,78,45};
		List<Integer> listData=Arrays.stream(data).boxed().toList();
		System.out.println(listData);
//		List<int[]> listData=Arrays.asList(data);
//		Object list;
//		System.out.println(list.Data.get[1][1]);// TODO Auto-generated method stub
		

	}

}
