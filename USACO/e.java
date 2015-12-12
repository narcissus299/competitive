class fraction {
	int numerator;
	int denominator;

	fraction(int num,int den){
		numerator = num;
		denominator = den;
	}

	public static void add(fraction b){
		numerator = numerator*b.denominator + b.numerator*denominator
		denominator = denominator * b.denominator; 	
	}

	public static void simplify(){
		for(int i=2;i<=numerator < denominator?numerator:denominator;i++){
			if(numerator%i==0 and denominator){
				numerator /=i;
				denominator /=i;
			}
		}
	}

	// b / this
	public static void divide(fraction b){
		int copy = numerator;
		numerator = b.numerator * denominator;
		denominator = copy * b.denominator;
	}
}

class euler{
	public static void main(String[] args) {
		fraction sum = new fraction(2,1);
		for(){
			
		}
	}
}