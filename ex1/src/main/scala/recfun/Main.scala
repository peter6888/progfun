package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if(c>r)
        0
      else if(c==0 || c==r)
        1
      else
        pascal(c-1, r-1) + pascal(c, r-1)
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      def balance_with_count(cnt: Int, chars: List[Char]): Boolean = {
        if(cnt<0)
          false
        else if(chars.isEmpty && cnt==0)
          true
        else if(chars.head=='(')
          balance_with_count(cnt+1, chars.tail)
        else if(chars.head==')')
          balance_with_count(cnt-1, chars.tail)
        else
          balance_with_count(cnt, chars.tail)
      }
      balance_with_count(0, chars)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
