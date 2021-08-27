import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String City[]={"bangalore","agra","delhi","chennai"};
		String temp;
		for(int i=0; i<=City.length-1;i++)
		{
		    for(int j=0;j<=City.length-1;j++)         
		    {
		        if(City[i].compareTo(City[j])<0)
		        {
		            temp=City[j];
		            City[j]=City[i];
		            City[i]=temp;
		        }
		    }
		}
		System.out.println(Arrays.toString(City));
		
	}
}
