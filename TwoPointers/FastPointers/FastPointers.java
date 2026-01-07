****************************************************
FAST TWO POINTERS PROBLEMS
****************************************************

        =========================================================================
        1. Palindrome:
example: radar, racecar

public boolean isPalindrome(String givenString) {
    int left = 0;
    int right = givenString.length() - 1;

    while(left < right) {
        if(givenString.charAt(left) != givenString.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

Reference for Palindrome:

public static void main(String[] args) {
    int i = 1;
    while(i <= 10){
        System.out.println("DSA");
        i++;
    }
}

==========================================================================================