package recursion;

public class tower_of_hanoi {
	static void towerOfHanoi(int n, char a,
			char c, char b)
{
if (n == 0) {
return;
}
towerOfHanoi(n - 1, a, b, c);
System.out.println("Move disk " + n + " from rod "
		+ a + " to rod "
		+ c);
towerOfHanoi(n - 1, b, c, a);
}
	public static void main(String[] args) {
		char a = 'a',b='b',c='c';
// TODO Auto-generated method stub
towerOfHanoi(3, a, c, b);
	}

}



