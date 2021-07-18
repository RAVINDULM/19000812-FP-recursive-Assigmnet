object Q4 extends App {
  def evenodd(n :Int): Unit = {
    if(n==0) println("even")
    else if (n==1) println("odd")
    else evenodd(n-2)
  }
  evenodd(6)
}

