#.exs是作為腳本直接執行
defmodule Hello02 do
  def world() do
    IO.puts("Hello, World!")
  end
end
#和hello.ex的函式名稱做區分，編譯才不會報警告
Hello02.world()
