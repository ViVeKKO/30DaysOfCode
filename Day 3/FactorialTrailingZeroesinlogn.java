class TrailingZeroes {
        int trailingZeroes(int n) {
            int result = 0;
            while(n>=5){
                result = result + n/5;
                n/=5;
            }
        return result;
        }
    }

// Since I may forget this so basically to get trailing zeroess we have to get 2 * 5 count and 
//  therefore only 5's count is enough as 2 will appear many times. 