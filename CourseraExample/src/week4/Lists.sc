val nums = 1 :: 2 :: 3 :: 4 :: Nil
nums.head
nums.tail
nums.isEmpty

val empty = Nil
//empty.head
//empty.tail

Nil.::(4).::(3).::(2).::(1)

1 :: 2 :: List(3, 4) :: 0 :: Nil