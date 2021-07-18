object Q1 extends App{

  def GCD (i:Int,j:Int): Int=j match {
    case 0=> i
    case x if x>i => GCD (x,i)
    case _ => GCD(j,i%j)
  }

  def prime(pr:Int, n:Int=2):Boolean = n match{
    case x if(pr==x) => true
    case x if (GCD(pr,x)>1) => false
    case x => prime(pr,x+1)
  }
  println(prime(2))
  println(prime(4))
}