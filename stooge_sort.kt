fun main(a:Array<String>){val d=a.map{b->b.toInt()}.toIntArray()
s(d,0,d.size-1)
println(d.toList())}fun s(a:IntArray,s:Int,e:Int){val f=a[s]
if(a[e]<f){a[s]=a[e]
a[e]=f}
val t = Math.ceil((e-s)/3.0).toInt()
if(t>0){s(a,s,e-t)
s(a,s+t,e)
s(a,s,e-t)}}
