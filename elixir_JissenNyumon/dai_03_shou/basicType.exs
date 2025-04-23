random_number = :rand.uniform(100) # 1から100までのランダムな整数を生成
IO.inspect random_number
if random_number > 50 do
  IO.puts("The number is greater than 50")
else
  IO.puts("The number is less than or equal to 50")
end
if :ok == :ok do
  IO.puts("ok")
else
  IO.puts("not ok")
end
world = "世界"
IO.puts("こんにちは#{world}"<>"hello")
IO.puts(is_binary("あ"))
IO.puts(<<227, 129, 130>>)
IO.puts("あ" <> <<0>>) #古いバージョンなら<<227, 129, 130, 0>>と表示される

IO.inspect(~c'hello', charlists: :as_lists) # ~cはcharlistを表す

IO.puts([119, 111, 114, 108, 100]) # "world"のcharlist
IO.puts(?a) # ?aは"a"のcharlist
IO.puts(?卵) # ?卵は"卵"のcharlist


# 文字列、atom、整数、浮動小数点数を含むリスト
IO.inspect(["hello", :world, 1, 2,3.14])


list = ["hello", :world, 1, 2,3.14]
["hello" | list] # 先頭に"hello"を追加
list ++ ["end"] # 末尾に"end"を追加

IO.inspect(list, charlists: :as_lists) # リストを表示
