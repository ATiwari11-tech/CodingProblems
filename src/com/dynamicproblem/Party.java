//Let's Party
//Given N number of people. Figure out how many ways are there for them to party
//Users have 2 choices to party
//1. Either they can party alone
//2. They Can pair with some one and dance
//Example -> For N=1, ways are only 1
//2. For N=2, ways are a. either they can dance alone (1),(2) or they can pair up (1,2) so total ways = 2
//3. For N=3, ways are either they can dance alone i.e. (1),(2),(3)
//they can pair up i.e. (1,2),(3) or (1,3),(2) or (2,3),(1) so total ways  = 4

//Strategy of solving DP Problems
//1. Element of choice you have i.e. no. of choices you have so here choices are
    //a. Either they can dance alone
    //b. Pair Up
//2. How to represent a state(here as an integer) i.e. unique identifier of a state
//2. a. what would your state represent i.e. ways(x) -> the no. of ways of x people to party!
//3. Recurrence Relation(Defines the relationship between a problem and a sub problem, very important)
//so we need to identify ways(x) = ? (+)/(-)/(*) ?
//4. Which state is going to be our final answer here it would be way(N)
//After careful observation recurrence relation would be -> ways(N) = ways(N-1) + (N-1)*ways(N-2)

//TC -> O(N) -> Number of unique states or number of fun calls * Time Required Per State -> N * 1
//SC -> O(N) -> Coz of DP Array and Recursion Stack it is N
package com.dynamicproblem;

public class Party {
    static int[] arr = {-1,-1,-1,-1,-1};
    public static void main(String[] args) {
        int N = 4;
        System.out.println(findNoOfWaysToParty(N));
    }
    public static int findNoOfWaysToParty(int N){
        //Using Normal Recursion but this will have 2^N calls
        //We need to reduce it through Dynamic Programming
//        if(N <= 2)
//            return N;
//        return findNoOfWaysToParty(N-1) + (N-1) * findNoOfWaysToParty(N-2);
        //Using DP Below
        if(N <= 2)
            return N;
        if(arr[N] != -1)
            return arr[N];
        int ans = findNoOfWaysToParty(N-1) + (N-1) * findNoOfWaysToParty(N-2);
        arr[N] = ans;
        return arr[N];
    }
}
