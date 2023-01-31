// Java program to find the value of
// the given series
import java.util.*;

class HackeerRank3{

// Recursive program to find the
// value of the given series
static float aj(int i, int n, float s)
{
	if (i > n)
		return s;

	else
	{
		if (i % 2 == 0)
			s -= (float)1 / i;
		else
			s += (float)1 / i;
			
		return sumOfSeries(i + 1, n, s);
	}
}

public static void main(String[] args)
{
	float sum = aj(1, 3, 0);
	
	System.out.printf("%f", sum);
}
}
