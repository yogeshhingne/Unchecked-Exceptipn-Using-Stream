package UnchechedException;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class UncheckedEx {
	
		 Integer divide(Integer value, Integer factor) {
		    try {
		        return value / factor;
		    } catch (ArithmeticException e) {
		        e.printStackTrace();
		    }
			return factor;
		}

		public void scale(List<Integer> values, Integer factor) {
		   System.out.println(values.stream().map(n -> divide(n, factor)).collect(Collectors.toList()));
		}
	

public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the factor for dividing the list");
	int f=sc.nextInt();
	UncheckedEx obj=new UncheckedEx();
	List<Integer> list=Arrays.asList(10,20,30,40);
	obj.scale(list,f);
}
}

