
IO.inspect([1, 2, 3] ++ [4, 5, 6]) # リストの結合
IO.inspect([1, 2, 3] -- [2, 3, 4]) # リストの差分

if 2 in [2, 3, 4] do
  IO.puts("2 is in the list")
end

if 5 in [2, 3, 4] do
  IO.puts("5 is in the list")
else
  IO.puts("5 is not in the list")
end

IO.inspect(hd [1, 2, 3]) # リストの先頭要素を取得
IO.inspect(tl [1, 2, 3]) # リストの先頭要素を除いたリストを取得

[head | tail] = [1, 2, 3, 4] # リストの先頭要素と残りの要素を分ける
IO.inspect(head) # 先頭要素を表示
IO.inspect(tail) # 残りの要素を表示

IO.inspect({:ok , 1, 2, "hello"}) # タプルを表示
IO.inspect(Date.new(2023, 10, 1)) # 日付を表示
IO.inspect(Date.new(2023, 2, 29)) # 不正な日付を表示
IO.inspect(Date.utc_today()) # 現在の日付を表示
