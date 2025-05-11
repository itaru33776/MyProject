
Map.new([{:b , 1}, {:a , 2}])
Map.new([{:a , 1}, {:a , 2}, {:a , 3}]) # => %{a: 3} 以最後出現的值為主
Map.new([:a, :b], fn x -> {x, x} end) # => %{a: :a, b: :b}

Map.has_key?(%{a: 1, b: 2}, :a) # => true
Map.has_key?(%{a: 1, b: 2}, :c) # => false

# Map.get/2 會回傳指定鍵的值，如果鍵不存在，則回傳 nil
# Map.get/3 會回傳指定鍵的值，如果鍵不存在，則回傳預設值
Map.get(%{a: 1, b: 2}, :a) # => 1
Map.get(%{a: 1, b: 2}, :c) # => nil
Map.get(%{a: 1, b: 2}, :c, 0) # => 0

# Map.put/3 會將指定鍵的值更新為新的值，並回傳更新後的地圖
map = %{a: 1, b: 2}
Map.put(map, :a, 3) # => %{a: 3, b: 2} 但是 map 變數的值不會改變

map2 = %{a: 1, b: 2}
# Map.update/4 第一引數是指定的map，第二引數是要更新的鍵，
# 第三引數是預設值，第四引數是更新函數。
Map.update(map2, :a, 13, fn existing_value -> existing_value*2 end)
Map.update(map2, :b, 10,  &(&1 + 1))

# Map.merge/2 會將第一個map和第二個map合併，同樣key值的話第二個map的值會覆蓋第一個map的值
Map.merge(%{a: 1, b: 2}, %{b: 3, c: 4}) # => %{a: 1, b: 3, c: 4}

# Map.merge/3 會將第一個map和第二個map合併，
# 第三個參數 fn _k, v1, v2 -> v1 + v2 end 是 自訂合併函數，用來處理 鍵重疊 的情況。
# _k 代表 重疊的鍵（在這個例子中，它是 :a）
# v1 代表 第一個map的值（在這個例子中，它是 1）
# v2 代表 第二個map的值（在這個例子中，它是 3）
# 變數名稱前加 _（如 _k），代表這個變數未被使用，只是為了符合函數簽名的格式。
Map.merge(%{a: 1, b: 2}, %{a: 3, d: 4}, fn _k, v1, v2 -> v1 + v2 end)

# 刪除指定鍵的值，就算只有一個要移除的鍵，也要用[]打包成列表
Map.drop(%{a: 1, b: 2}, [:a]) # => %{b: 2}

# Map.keys/1 會取出map的所有鍵
Map.keys(%{a: 1, b: 2}) # => [:a, :b]
# Map.values/1 會取出map的所有值
Map.values(%{a: 1, b: 2}) # => [1, 2]
# Map.to_list/1 會將map轉換成列表，列表的每個元素都是一個二元組（tuple）
Map.to_list(%{a: 1, b: 2}) # => [a: 1, b: 2]
