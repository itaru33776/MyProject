IO.puts "お名前を入力してください"
name = IO.read(:line)
IO.puts "Hello, #{name}"

Enum.map([1, 2, 3], fn x -> x * 2 end) # => [2, 4, 6]
Enum.map([a: 1,b: 2,c: 3], fn {k, v} -> {k, -v} end) # => [a: -1, b: -2, c: -3]

# filter是用来过滤列表的函数，返回一个新的列表，包含满足条件（truthy）的元素
# reject是用来过滤列表的函数，返回一个新的列表，包含不满足条件（falsy）的元素
Enum.filter([1, 2, 3], fn x -> rem(x , 2) == 0 end) # => [2]
Enum.reject([1, 2, 3], fn x -> rem(x , 2) == 0 end) # => [1, 3]

Enum.all?([2, 4, 6], fn x -> rem(x , 2) == 0 end) # => true
Enum.all?([1, 2, 3], fn x -> rem(x , 2) == 0 end) # => false
 # => true 「 _ 」表示匿名函數的參數，這裡不需要用到，所以用 _ 來表示，也可用「x」來表示
Enum.all?([], fn _ -> nil end)

Enum.any?([1, 2, 3], fn x -> rem(x , 2) == 0 end) # => true
Enum.any?([1, 3, 5], fn x -> rem(x , 2) == 0 end) # => false

# Enum.any?()在判斷時不是比較列表本身，而是檢查是否有至少一個元素滿足條件。
# 當列表是空的時，它根本沒有任何元素可以檢查，所以結果就是 false
Enum.any?([], fn _ -> nil end) # => false
Enum.any?([]) # => false

Enum.max([1, 2, 3]) # => 3
# >= 會比較兩個日期的大小，返回較大的那個
Enum.max([~D[2023-03-31], ~D[2023-04-01]]) # => ~D[2023-03-31]會比較大
# 如果要返回正確的日期，則需要使用 Date.compare/2 函數來比較兩個日期的大小
# 這裡的比較是使用 Date.compare/2 函數來比較兩個日期的大小，然後返回較大的那個
# Date.compare(d1, d2) 會回傳 :gt（d1 > d2）、:eq（d1 = d2）、或 :lt（d1 < d2
# gt = greater than; lt = less than; eq = equal to
Enum.max([~D[2023-03-31], ~D[2023-04-01]] ,
    fn d1, d2 ->
        Date.compare(d1, d2)
        |> then(fn res -> res in [:gt, :eq] end)
    end)

# >=/2 是 Elixir 內建的比較運算符（內核的函數），
# 它接受兩個參數 (a 和 b)，然後回傳 true 或 false，表示 a 是否大於或等於 b
# &>=/2 則是 「函數捕捉」語法，在此等於 fn a, b -> a >= b end
Enum.max([], &>=/2 , fn -> 0 end) # => 0
Enum.max([], fn  -> 0 end) # => 0

# Enum.reduce/2 累加初始值為開頭第一個元素，然後從第二個元素開始累加
Enum.reduce([1, 2, 3], fn x, acc -> x + acc end) # => 6
# Enum.reduce/3 累加初始值為第二個參數，然後從第一個元素開始累加
Enum.reduce([1, 2, 3], 0, fn x, acc -> x + acc end) # => 6

Enum.reduce([:cat, :dog, :cat, :lion, :tiger, :cat], %{},
fn animal, acc -> Map.update(acc, animal, 1, & &1 + 1) end)
# => %{cat: 3, dog: 1, lion: 1, tiger: 1}

[1, 2, 3, nil, 5, 6, 7, nil, 8, :nine]
|> Enum.filter(fn n -> is_integer(n) end)
|> Enum.map(fn n -> n * n end)
