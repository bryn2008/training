public class ExceptionsTraining {

	public static void main(String[] args){
		//visitMonkey();
		explore();
	}

	static void visitMonkey(){
		System.out.println("Monkey around!!");
	}

	static void getUp(){
		System.out.println("you get up");
	}
	
	static void fall(){
		throw new RuntimeException("no good");
	}

	static void explore(){
		try {
			fall();
			System.out.print("never get here!");
		} catch (RuntimeException e) {
			getUp();
		}
	}
}