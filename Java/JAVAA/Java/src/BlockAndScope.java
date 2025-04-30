
public class BlockAndScope {
	
	public BlockAndScope(int w, int y){
		System.out.println(w + " " + y);
	}

	public static void main(String[] args) {
		
		BlockAndScope obj = new BlockAndScope(5, 7);
		
		/*within a method you can declare variables with the same name as long as each Variable is having it's Scope respectively and blocks are
		 *nonOverlapping blocks
		 */
		{
			int x = 12;
			System.out.println(x);
		}//x here goes out of scope(it ceases to exist)
		{
			int x = 32;
			System.out.println(x);
		}//x here goes out of scope(it ceases to exist)
		
	}

}
