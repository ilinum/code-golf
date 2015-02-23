--selection sort implementation
import Data.List(delete)
s[]=[]
s x=minimum x:(s$delete(minimum x) x)