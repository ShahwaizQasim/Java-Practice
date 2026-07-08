// 1) Arithmetic Operator
// +	Addition		
// -	Subtraction	
// *	Multiplication	
// /	Division	
// %	Modulus
// ++	Increment
// .) Pre Incremnent --x      .)Post Increment x-- 	
// --	Decrement	
// .) Pre Decrement --x      .)Post Decrement x-- 

// 2) Assignment Operator
// =	x = 5	x = 5	
// +=	x += 3	x = x + 3	
// -=	x -= 3	x = x - 3	
// *=	x *= 3	x = x * 3	
// /=	x /= 3	x = x / 3	
// %=	x %= 3	x = x % 3	
// &=	x &= 3	x = x & 3	
// |=	x |= 3	x = x | 3	
// ^=	x ^= 3	x = x ^ 3 --> XOR = similar values me return karega (0)false and different values me 1(true) return karega.
// ~=   x ~=3   x = x ~ 3 --> Negative to Positive, Positive to Negative  
// >>=	x >>= 3	x = x >> 3--> Binary Right Shift
// <<=	x <<= 3	x = x << 3--> Binary Left Sift



// Comparison Operator
// ==	Equal to	                x == y	
// !=	Not equal	                x != y	
// >	Greater than	            x > y	
// <	Less than	                x < y	
// >=	Greater than or equal to	x >= y	
// <=	Less than or equal to	    x <= y


// Logical Operator
// && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10	
// || 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4	
// !	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)	



// Right Shift and Left Shift Operator	Meaning	Shortcut
// << 1 	Left shift by 1 	× 2
// << 2	    Left shift by 2 	× 4
// << 3	    Left shift by 3     × 8
// >> 1	    Right shift by 1	÷ 2
// >> 2	    Right shift by 2	÷ 4
// >> 3	    Right shift by 3	÷ 8

public class Main {
    public static void main() {
        int x = 10;
        int y = 3;

        // System.out.println(x + y); // 13
        // System.out.println(x - y); // 7
        // System.out.println(x * y); // 30
        // System.out.println(x / y); // 3
        // System.out.println(x % y); // 1

        int z = 5;
        ++z;
        // System.out.println(z); // 6
        --z;
        // System.out.println(z); // 5

        int savings = 100;
        savings += 50;
        System.out.println("savings+++ " + savings);
    }
}
