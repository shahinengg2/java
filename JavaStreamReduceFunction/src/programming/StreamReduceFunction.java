package programming;

import java.util.List;

public class StreamReduceFunction {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		int sum= 0;
		sum  = addListFunctional_Option1(numbers);
		System.out.println("sum of addListFunctional_Option1: "+sum);
		
		sum  = addListFunctional_Option2(numbers);
		System.out.println("sum of addListFunctional_Option2: "+sum);
		
		sum  = addListFunctional_Option3(numbers);
		System.out.println("sum of addListFunctional_Option3: "+sum);
		
		sum  = addListFunctional_Option4(numbers);
		System.out.println("sum of addListFunctional_Option4: "+sum);
		
		sum  = addListFunctional_Option5(numbers);
		System.out.println("sum of addListFunctional_Option5: "+sum);
		
		sum  = addListFunctional_Option6(numbers);
		System.out.println("Max of addListFunctional_Option6: "+sum);
		
		sum  = addListFunctional_Option7(numbers);
		System.out.println("Integer.MIN_VALUE of addListFunctional_Option7: "+sum);
		
		sum  = addListFunctional_Option8(numbers);
		System.out.println("Integer.MAX_VALUE of addListFunctional_Option6: "+sum);
		
		sum = squareAddListFunctional_Option9(numbers);
		System.out.println("squareAddListFunctional_Option9: "+sum);
		
		sum = evenNumberSquareAddListFunctional_Option10(numbers);
		System.out.println("evenNumberSquareAddListFunctional_Option10: "+sum);
		
		sum = cubeAddListFunctional_Option11(numbers);
		System.out.println("cubeAddListFunctional_Option11: "+sum);
		
		sum = oldNumberCubeAddListFunctional_Option12(numbers);
		System.out.println("oldNumberCubeAddListFunctional_Option12: "+sum);
	}

	private static int sum(int aggregate, int nextNumber)
	{
		System.out.println(aggregate+" "+nextNumber);
		return aggregate + nextNumber;
	}
	
	private static int addListFunctional_Option1(List<Integer> numbers) 
	{
		return numbers.stream().reduce(0,StreamReduceFunction::sum);
		
	}
	
	private static int addListFunctional_Option2(List<Integer> numbers) 
	{
		return numbers.stream().reduce(0,(x,y)->x+y);		
	}
	
	private static int addListFunctional_Option3(List<Integer> numbers) 
	{
		return numbers.stream().reduce(0,Integer::sum);		
	}

	private static int addListFunctional_Option4(List<Integer> numbers) 
	{
		return numbers.stream().reduce(0,(x,y)->x);		
	}
	
	private static int addListFunctional_Option5(List<Integer> numbers) 
	{
		return numbers.stream().reduce(0,(x,y)->y);		
	}

	private static int addListFunctional_Option6(List<Integer> numbers) 
	{
		return numbers.stream().reduce(0,(x,y)-> x>y ? x:y);		
	}
	
	private static int addListFunctional_Option7(List<Integer> numbers) 
	{
		return numbers.stream().reduce(Integer.MIN_VALUE,(x,y)-> x>y ? x:y);		
	}
	
	private static int addListFunctional_Option8(List<Integer> numbers) 
	{
		return numbers.stream().reduce(Integer.MAX_VALUE,(x,y)-> x>y ? x:y);		
	}
	
	private static int squareAddListFunctional_Option9(List<Integer> numbers) 
	{
		return numbers.stream().map(x->x*x).reduce(0,Integer::sum);		
	}
	
	private static int evenNumberSquareAddListFunctional_Option10(List<Integer> numbers) 
	{
		return numbers.stream().filter(x->x%2==0).map(x->x*x).reduce(0,Integer::sum);		
	}	
	
	private static int cubeAddListFunctional_Option11(List<Integer> numbers) 
	{
		return numbers.stream().map(x->x*x*x).reduce(0,Integer::sum);		
	}
	
	private static int oldNumberCubeAddListFunctional_Option12(List<Integer> numbers) 
	{
		return numbers.stream().filter(x->x%2!=0).map(x->x*x*x).reduce(0,Integer::sum);		
	}
	
}
