object Q3 extends App{
  def add(x:Int):Int=x match {
    case 0 => 0
    case _ => x+add(x-1)
  }
  println(add(6))
}
