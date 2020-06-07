/* TDD:
 * 5
 * [1,2,5]
 * 0
 * []
 * 1
 * []
 * 5
 * [2]
 */

class Solution {
    public int change(int amount, int[] coins) {
        
        if(amount == 0)
        {
            return 1;
        }
        
        /// Validating input
        if(! isInputValid(amount, coins))
        {
            return 0;
        }
            
        int numberOfCoins = coins.length;
        int numberOfWays[][] = new int[numberOfCoins+1][amount+1];
        int indexOfCoins = 0;
        int indexForAmount = 0;
        
        /// The following is making up for the fact that the number of ways 
        /// to make the amount "0" is 1, i.e. {0}
        for(indexOfCoins = 0 ; indexOfCoins <= numberOfCoins; indexOfCoins++)
        {
            numberOfWays[indexOfCoins][indexForAmount] = 1;        
        }   
        /// For better visualisation, uncomment the following
        /// print(numberOfWays,numberOfCoins+1, amount+1);
        
        /// solving for the subproblems. 
        for(indexOfCoins = 1; indexOfCoins <= numberOfCoins; indexOfCoins++)
        {
            for(indexForAmount = 1; indexForAmount <= amount; indexForAmount++)
            {
                /// If we don't choose the coin,
                numberOfWays[indexOfCoins][indexForAmount] = numberOfWays[indexOfCoins - 1][indexForAmount];
                
                /// If we choose the coin, we add the ways of dealing with residue amount if, 
                /// the amount >= the value of the coin
                if(indexForAmount >= coins[indexOfCoins -1])
                {
                    int indexOfResidueAmount = indexForAmount - coins[indexOfCoins - 1];
                    numberOfWays[indexOfCoins][indexForAmount] 
                        += numberOfWays[indexOfCoins][indexOfResidueAmount];
                }
            }
            /// For better visualisation, uncomment the following
            /// print(numberOfWays,numberOfCoins+1, amount+1);
        }
        /// For better visualisation, uncomment the following
        /// print(numberOfWays,numberOfCoins+1, amount+1);
        return numberOfWays[numberOfCoins][amount];
    }
    
    private boolean isInputValid(int amount, int[] coins)
    {
        if (coins.length <= 0)
            return false;
        return true; 
    }
    
    private void print(int numberOfWays[][], int n, int m)
    {
        for(int i = 0; i < n ; i++)
        {
            for(int j = 0 ; j < m; j++){
                System.out.print(numberOfWays[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
