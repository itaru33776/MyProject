a = [1,2,3]
a ++ [4]
a = a ++ [4]

list = [1,2,3]

status_code = 404
case status_code do
  200 -> :success
  400 -> :bad_request
  404 -> :not_found
end

IO.puts(a)
IO.puts(list)
IO.puts(status_code)
