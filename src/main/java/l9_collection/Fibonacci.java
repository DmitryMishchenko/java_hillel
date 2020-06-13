package l9_collection;

import java.math.BigInteger;

public class Fibonacci {
  private final int MEMO_SIZE = 10000;
  private final BigInteger[] memo = new BigInteger[MEMO_SIZE];

  public BigInteger naiveRecursive(int n) {
    if (n < 3) {
      return BigInteger.valueOf(1);
    }

    return naiveRecursive(n - 2).add(naiveRecursive(n - 1));
  }

  // top -> down
  public BigInteger recursiveWithMemoization(int n) {
    if (n < 3) {
      return BigInteger.valueOf(1);
    }

    if (memo[n] == null) {
      memo[n] = recursiveWithMemoization(n - 2).add(recursiveWithMemoization(n - 1));
    }
    return memo[n];
  }

  // bottom -> up, dynamic programming
  public BigInteger dpArray(int n) {
    BigInteger[] dp = new BigInteger[n + 1];
    dp[1] = BigInteger.valueOf(1);
    dp[2] = BigInteger.valueOf(1);

    for (int i = 3; i <= n; i++) {
      dp[i] = dp[i - 2].add(dp[i - 1]);
    }

    return dp[n];
  }

  // we can optimize space complexity and store only two prev values
  public BigInteger dpOptimized(int n) {
    BigInteger[] dp = new BigInteger[2];
    dp[1] = BigInteger.valueOf(1);
    dp[0] = BigInteger.valueOf(1);

    for (int i = 3; i <= n; i++) {
      BigInteger tmp = dp[1];
      dp[1] = dp[1].add(dp[0]);
      dp[0] = tmp;
    }

    return dp[1];
  }
}
