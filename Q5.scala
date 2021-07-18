 object Q5 extends App{
   def addeven(x :Int):Int={
     if(x==0) x
     else if(x==1) 0
     else if(x%2!=0) x-1 + addeven(x-2)
     else x-2 + addeven(x-2)

   }

   println(addeven(5))

 }