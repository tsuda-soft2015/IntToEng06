package IntToEng;
import java.util.Scanner;

public class IntToEng {
	
	static String[] numberZeroToNineteen = {
			"zero", "one", "two", "three", "four", "five",
			"six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen",
			"sixteen", "sevelnteen", "eighteen", "nineteen"
	};
	
	static String[] number10times = {
		"twenty", "thirty", "forty", "fifty",
		"sixty", "seventy", "eighty", "ninety"
	};
	
	// メインメソッド
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	if(n<100) {
    		return tentimes(n);
    	}
    	if(n<1000) {
    		if(n%100==0) return hundredtimes(n);
    		return hundredtimes(n) + " " + tentimes(n%100);
    	}
    	if(n<10000) {
    		if(n%1000==0) return thousandtimes(n);
    		if(n%100==0) return thousandhundred(n);
    		if(n%1000>=100) return thousandhundred(n) + " " + tentimes(n%100);
    		return thousandtimes(n) + " " + tentimes(n%100);
    	}
    	if(n==10000) return "ten thousand"; 
    	return "";
    }

	public static String thousandhundred(int n) {
		return thousandtimes(n) + " " + hundredtimes(n%1000);
	}

	public static String thousandtimes(int n) {
		return numberZeroToNineteen[n/1000] + " " + "thousand";
	}

	public static String hundredtimes(int n) {
		return numberZeroToNineteen[n/100] + " " + "hundred";
	}

	public static String tentimes(int n) {
		if(n<numberZeroToNineteen.length) return numberZeroToNineteen[n];
		if(n%10==0) return number10times[n/10-2];
		return	number10times[n/10-2] + " " + numberZeroToNineteen[n%10];
	}
    
}