object Q6 extends App {

  def fibonacci(n:Int): Int= n match {
    case 0 => 0
    case 1 => 1
    case _ => fibonacci(n-1)+fibonacci(n-2)
  }

  def fibseq(x:Int): Unit = {
    if(x>0) fibseq(x-1)
    println(fibonacci(x))
  }

  {
    fibseq(1)
  }
}