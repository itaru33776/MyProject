defmodule AwsomeMoudle do
  def greet(name) do
    "Hello, #{name}!"
  end

  def msg(name \\ "World") do
    "Hello, #{name}!"
  end

  defp hello do
    "Hello, World!"
  end
end
