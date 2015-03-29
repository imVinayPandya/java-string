class StringDemo {

	//word count without split() function
	static int wordCount(String s) {
		System.out.println( " This is word count " );
		s = StringDemo.allTrim(s);
		String temp = s+" ";
		char ch[] = temp.toCharArray();
		int count = 0;
		for (int i=0; i<ch.length; i++) {
			if(ch[i] == ' ' && ch[i-1] != ' ') {
				count++;
			}
		}

		return count;
	}

	//space count
	static int spaceCount(String s) {
		System.out.println( " This is Space count " );
		char ch[] = s.toCharArray();
		int count = 0;

		for (int i=0; i < ch.length ; i++) {
			//System.out.println( "  " + ch[i]);	
			if(ch[i] == ' ')
				count++;
		}

		return count;
	}

	//char count without space
	static int charCount(String s) {
		System.out.println( " This is char count without space" );
		char ch[] = s.toCharArray();
		int count = 0;

		for (int i=0; i < ch.length ; i++) {
			//System.out.println( "  " + ch[i]);	
			if(ch[i] != ' ')
				count++;
		}

		return count;
	}

	//string reverse without reverse() function
	static String reverse(String s) {
		System.out.println( " This is reverse string " );
		char ch[] = s.toCharArray();
		char temp[] = new char[s.length()];

		for (int i=0, j=ch.length - 1; j >= 0 && i < ch.length ; i++, j--) {
			temp[i] = ch[j];
		}

		return String.valueOf(temp);
	}

	//palindrome
	static boolean palindrome(String s) {
		System.out.println( " This is palindrome string " );
		String reverse = StringDemo.reverse(s);

		return s.equals(reverse);
	}	

	//lTrim
	static String lTrim(String s) {
		System.out.println( " This is lTrim " );
		System.out.println( " Before LTrim Length: "+s.length() );
		char ch[] = s.toCharArray();
		int count = 0, lSpace = 0;

		for (int i=0; i<ch.length ; i++) {
			
			if (count > 0) {
				break;
			}else{
				if(ch[i] != ' ') {
					count++;	
				}else{
					lSpace++;
				}
			}			
		}
		s = s.substring(lSpace, s.length() );
		System.out.println( " Total Left space found: "+lSpace );
		System.out.println( " after LTrim Length: "+s.length() );

		return s;
	}

	//rTrim
	static String rTrim(String s) {
		System.out.println( " This is rTrim " );
		System.out.println( " Before RTrim length: "+s.length() );
		return StringDemo.reverse(
					StringDemo.lTrim(
						StringDemo.reverse(s)
					)
				);
	}

	//all trim
	static String allTrim(String s) {
		System.out.println( " This is all Trim " );

		return (
			StringDemo.lTrim(
				StringDemo.rTrim(s)
			)
		);

	}

	//squeeze
	static String squeeze(String s) {
		System.out.println( " This is squeeze " );
		s = StringDemo.allTrim(s);
		char ch[] = s.toCharArray();
		char temp[] = new char[ch.length];
		int count =0, spaces =0;

		for (int i=0; i<ch.length ; i++) {
			if(ch[i] == ' '){
				spaces++;
				continue;
			} else {
				temp[count] = ch[i];
				count++;
			}
		}
		System.out.println( " b/w words/char. space found: "+spaces );
		return String.valueOf(temp);
	}

	//vowels count
	static int vowelsCount(String s) {
		System.out.println( " This is vowels count " );
		char ch[] = s.toCharArray();
		int count = 0;
		for (int i=0; i<ch.length ; i++ ) {
			if ( ch[i] == 'A' || ch[i] == 'a' || ch[i] == 'E' || ch[i] == 'e' || ch[i] == 'I' || ch[i] == 'i' || ch[i] == 'O' || ch[i] == 'o' || ch[i] == 'U' || ch[i] == 'u' ) {
				count++;
			}
		}

		return count;
	}

	//string length with out length()
	static int length(String s) {
		System.out.println( " This is length count function for string " );
		char ch[] = s.toCharArray();
		int i=0;
		for (; i<ch.length; i++);
		return i;
	}
	
	//sequence count
	static void sequenceCount(String s) {
		System.out.println( " This is sequence counter " );
		char ch[] = s.toCharArray();

		for(int i=0; i < ch.length;) {
			char c = ch[i];
			int count = 0;
			do {
				++i;
				++count;
			} while (i < ch.length && ch[i] == c);
			System.out.println("character "+ c +":"+"occur num of times " + count);
		}
	}
	
	//frequency count
	static void frequencyCount(String s) {
		System.out.println("This is frequency count");
		char ch[] = s.toCharArray();
		int count;

		/* for(int i=0; i < ch.length; i++) {
			boolean f = false;
			count = 0;
			for(int j=0; j < i; j++) {
				if(ch[i] == ch[j]){
					count++;
					f = true;
					break;
				}
			}
			if(!f)				
				System.out.println("character "+ ch[i] +":"+"occur num of times " + count);
		} */
		
	}
	
	//change case without using uppercase(), lowercase()
	static String changeCase(String s) {
		System.out.println("This is change case count");
		System.out.println("Given string: "+s);
		byte b[] = s.getBytes();
		
		for(int i=0; i<b.length; i++) {
			if(b[i] >= 97 && b[i] <= 122) {
				b[i] = (byte)(b[i] - 32);
			} else if(b[i] >= 65 && b[i] <= 90){
				b[i] = (byte)(b[i] + 32);
			}
		}
		return new String(b);
	}
	
	//single occurrence 
	static String singleCount(String s) {
		System.out.println("This is single occurrence");
		char ch[] = s.toCharArray();
		String s1 = "";

		/* for(int i=0; i < ch.length -1; i++) {
			boolean f = false;
			if( ch[i] != ch[i+1] ){
				f = true;
			}
			if(!f)			
				s1 += String.valueOf(ch[i]);
			if( i+1 == ch.length-1 && ch[i] != ch[i+1] )
				s1 += String.valueOf(ch[i+1]);
		}
		 */
		return s1;
		
	}
	
	//sorted order
	static void sortedOrder(String s) {
	
	}
	
	//sorted word
	static String sortedWord(String s) {
	return "";
	}
	
	//find string withour indexof()
	static boolean find(String s1, String s2) {
		String result = "";
		for (int i=0; i<=s1.length() - s2.length() ;i++ ) {
				result = s1.substring(i, i+s2.length());
				if(result.equals(s2))
					return true;
		}
		return false;	
	}

	//replace string if s2 found in s1 than replace s2 with s3
	static String replace(String s1, String s2, String s3) {
		System.out.println( " if s2 found in s1 than replace s2 with s3 " );
		System.out.println( " original string: "+s1 );
		StringBuffer sb = new StringBuffer(s1);
		String result = "";
		for (int i=0; i<=s1.length() - s2.length() ;i++ ) {
				result = s1.substring(i, i+s2.length());
				if(result.equals(s2)) {
					sb.replace(i, i+s2.length(), s3 );
				}
		}

		return sb.toString();
	}

	//check two strings are equal or not without equals() method
	static boolean equals(String s1, String s2) {
		//return (s1 == s2) ? true: false ;
		//or
		char[] c1=s1.toCharArray(), c2=s2.toCharArray();
		int count = 0;
		if (c1.length == c2.length) {
			for (int i=0; i<c1.length ;i++ ) {
		 		if(c1[i] == c2[i])
		 			count++;
			}	
		}
		if(count == c1.length)
			return true;

		return false;
	}

	//triangle 1
	static void triangleOne(String s) {
		for (int i=0; i<=s.length(); i++ ) {
			for (int j=0; j<i ;j++ ) {
				System.out.print( " "+s.charAt(j) );
			}
			System.out.println( "  " );
		}
	}

	//triangle 2
	static void triangleTwo(String s) {
		for (int i=s.length()-1; i>=0; i-- ) {
			for (int j=0; j<=i ;j++ ) {
				System.out.print( " "+s.charAt(j) );
			}
			System.out.println( "  " );
		}
	}

	//triangle 3
	static void triangleThree(String s) {
		for (int i=s.length()-1; i>=0; i-- ) {

			for (int j=s.length(); j>i;j--) {
				System.out.print( " " );
			}

			for (int j=0; j<=i ;j++) {
				System.out.print( s.charAt(j) );
			}
			
			System.out.println( "  " );
		}
	}

	//triangle 4
	static void triangleFour(String s) {
		for (int i=s.length()-1; i>=0; i-- ) {
			//first triangle
			for (int j=0; j<=i ;j++ ) {
				System.out.print( s.charAt(j) );
			}
			//spaces
			for (int j=s.length(); j>i;j--) {
				System.out.print( "  " );
			}
			//second triangle
			for (int j=0; j<=i ;j++) {
				System.out.print( s.charAt(j) );
			}
			
			System.out.println( "  " );
		}
	}

	//compare ASCII value of two string
	static int compare(String s1, String s2) {
		byte[] b=s1.getBytes(), c=s2.getBytes();
		int pcount = 0, count = 0, ncount = 0, big = 0, small = 0;
		if(b.length > c.length){
			big = b.length;
			small = c.length;
		}else{
			small = b.length;
			big = c.length;
		}
			for (int i=0;i<small ;i++ ) {
				for (int j=0; j<big ; j++ ) {
					if ( (b[i]-c[i])==0 ) {
						count++;
						break;
					}else if( (b[i]-c[i]) > 0 ) {
						pcount++;
						break;
					}else{
						ncount++;
						break;
					}
				}
			}
			System.out.println( " count, pcount, ncount "+count+" "+pcount +" "+ncount);
			if (b.length == count) {
				return 0;
			}else if(pcount > count && pcount > ncount) {
				return 1;
			}else{
				return -1;
			}
	}

	//word frequancy
	static void wordFrequancy(String s) {

	}

	//solve the string
	static int expression(String s) {
		System.out.println( " This is expression: "+s );
		int result = 0;
		char ch[] = s.toCharArray();
		int loperand = 0, roperand = 0, previous_position = 0;
		String operator = "";


		for (int i=0; i<ch.length ;) {
			//System.out.println( " for loop " );

			if (ch[i] == '+' || ch[i] == '-' || ch[i] == '*' || ch[i] == '/') {
				//System.out.println( " found operator " );

				if(loperand == 0)
					loperand = Integer.parseInt( s.substring(previous_position, i) );
				//System.out.println( " loperand "+loperand );

				//System.out.println( " previous_position "+previous_position );
				previous_position = i;
				//System.out.println( " previous_position "+previous_position );

				operator = String.valueOf( ch[i] );
				//System.out.println( " operator "+operator );

				//System.out.println( " i=========== "+i );
				for (int j = i+1; j<ch.length ; j++) {
					i++;
					//System.out.println( " finding right operand " );
					//System.out.println( j+" char j "+ ch[j] +" length "+ (ch.length-1) );
					if ( (ch[j] == '+' || ch[j] == '-' || ch[j] == '*' || ch[j] == '/') ) {
						//System.out.println( " previous_position "+previous_position );
						roperand = Integer.parseInt( s.substring(previous_position+1, j) );
						//System.out.println( "============================== roperand "+roperand );
						break;
					}
					if(j == ch.length-1){
						roperand = Integer.parseInt( s.substring(previous_position+1) );
						break;
					}
				}

				if(loperand > 0 && roperand > 0 && operator != "") {
					// System.out.println( " performing maths " );
					// System.out.println( " result "+result );
					// System.out.println( " loperand "+loperand );
					switch(operator) {
						case "+": 
								result = loperand + roperand;
								loperand = result;
								continue;

						case "-": 
								result = loperand - roperand;
								loperand = result;
								continue;

						case "*": 
								result = loperand * roperand;
								loperand = result;
								continue;

						case "/":
								result = loperand / roperand;
								loperand = result; 
								continue;

						default: System.out.println( " Wrong Operator used in expression " );
								break;
					}
					// System.out.println( " operator "+operator );
					// System.out.println( " loperand "+loperand );
					// System.out.println( " roperand "+roperand );
					// System.out.println( " result "+result );
					
					//return result;

				}
			}else{
				i++;
			}
		}

		return result;
	}

	//binary To Decimal
	static int binaryToDecimal(String s){
        int binary = Integer.parseInt(s);
        int d = 0;
        int power = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int tmp = binary%10;
                    //System.out.println( " temp " + tmp);
                d += tmp*Math.pow(2, power);
                    //System.out.println( " decimal "+ d );
                binary = binary/10;
                power++;
                    //System.out.println( " binary " + binary);
            }
        }
        return d;
    }

    //first non repeating character
    static void firstNonRepeatingChar( String s ) {
    	char ch[] = s.toCharArray();
    	boolean flag = false;

    	for (int i=0; i<ch.length ; i++) {
    		flag = false;
    		for (int j = 0; j<ch.length; j++ ) {
    			
    			if( ch[i] == ' ' ){
    				flag = true;
    				break;
    			}else if( ch[i] == ch[j] && i != j && ch[i] != ' '){
    				flag = true;
    				break;
    			}
    		}
    		if( !flag ){
    			System.out.println( "yahooooooooo! First non Repeating character found, it is: "+ch[i] );
    			break;
    		}
    	}
    	if (flag) {
    		System.out.println( " there is no such non-repeating character in given string" );
    	}

    }

	public static void main(String[] args) {

		//first non repeating character
		//space will be ingnoure 
		//StringDemo.firstNonRepeatingChar("copycopy     past");

		//binary To Decimal
		//System.out.println( StringDemo.binaryToDecimal("11") );

		//solve the string
		//
		//one disadvantages
		//and this expression always solved from right to left, means dones not understand precedence of an operators or other maths rule 
		//System.out.println( " Result "+StringDemo.expression("5*5+5+5") );

		//word frequancy
		//StringDemo.wordFrequancy("vinay pandya");

		//compare ASCII value of two string
		//
		//it return 1 if first string is bigger
		//it return -1 if second string is bigger
		//it return 0 if both string are same
		//System.out.println( StringDemo.compare("abc","abc") );

		//triangle 4
		//StringDemo.triangleFour("Ducat");

		//triangle 3
		//StringDemo.triangleThree("Ducat");

		//triangle 2
		//StringDemo.triangleTwo("Ducat");

		//triangle 
		//StringDemo.triangleOne("Ducat");

		//check two strings are equal or not without equals() method
		//System.out.println( StringDemo.equals("vinay", "vinay") );
		
		//replace string if s2 found in s1 than replace s2 with s3
		//System.out.println( StringDemo.replace("i Love cricket", "cricket", "football") ); 

		//find string withour indexof()
		//System.out.println(StringDemo.find( "Strings is string", "string" ) );
		
		//sorted word
		//StringDemo.sortedWord("vinay pandya");
		
		//sorted order
		//StringDemo.sortedOrder("vinay pandya");
		
		//single occurrence
		//////////////System.out.println( StringDemo.singleCount("nnitinn") );
		
		//change case without using uppercase(), lowercase()
		//System.out.println( StringDemo.changeCase("VinaY") );
		
		//frequency count
		/////////////StringDemo.frequencyCount("vviinnayyaa");
		
		//sequence count
		//StringDemo.sequenceCount("vviinnayyaa");
		
		//string length with out length()
		//System.out.println( "Length of string is: "+StringDemo.length("vinay vinay") );

		//vowels count
		//System.out.println( "Total no of vowels:"+ StringDemo.vowelsCount("vinay IIAA") );

		//squeeze
		//System.out.println( StringDemo.squeeze("  v i n   ay ") );

		//all Trim
		//System.out.println( StringDemo.allTrim("  v i n a  y ") );

		//rTrim
		//System.out.println( StringDemo.rTrim("  vinay") );

		//lTrim
		//System.out.println( StringDemo.lTrim("    Vinay  ") );

		//palindrome
		//System.out.println( StringDemo.palindrome("madam") );

		//string reverse without reverse() function
		//System.out.println( StringDemo.reverse("vinay") );

		//char count without space
		//System.out.println( StringDemo.charCount(" vinay ") );

		//space count
		//System.out.println( StringDemo.spaceCount("count spaces here") );

		//word count without split() function
		//System.out.println( " word count: "+StringDemo.wordCount("      i           am a good boy        ") );

	}
}