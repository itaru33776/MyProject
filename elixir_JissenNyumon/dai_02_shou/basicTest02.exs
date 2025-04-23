# 1. 条件分岐
n = 5
cond do
  rem(n, 3) == 0 and rem(n, 5) == 0 -> IO.puts("FizzBuzz")
  rem(n, 3) == 0 -> IO.puts("Fizz")
  rem(n, 5) == 0 -> IO.puts("Buzz")
  true -> n
end

# 2. case式
status_code = 404
case status_code do
  200 -> IO.puts("success")
  400 -> IO.puts("Bad Request")
  404 -> IO.puts("Not Found")
  x -> IO.puts("#{x} is unknown code")
end
