stream = Stream.map([1, 2, 3], fn x -> x * 2 end)
Enum.to_list(stream) # [2, 4, 6]

# Streamを使うと、遅延評価ができる
Stream.filter([1, 2, 3], fn x -> rem(x, 2) == 0 end)
|> Enum.to_list() # [2]

Enum.to_list(Stream.filter([1, 2, 3], fn x -> rem(x, 2) == 0 end)) # [2]

Stream.reject([1, 2, 3], fn x -> rem(x, 2) == 0 end)
|> Enum.to_list() # [1, 3]

# iterate は無限のストリームを作る
Stream.iterate(0, fn x -> x + 1 end) |> Enum.take(5) # [0, 1, 2, 3, 4]
Stream.iterate(2, &(&1 * 2)) |> Enum.take(5) # [2, 4, 8, 16, 32]

steam2 = 1..100_00_00 |> Stream.map(&(&1 * 3)) |> Stream.filter(&(rem(&1, 2) == 1))
Enum.sum(steam2) # 750000000000
