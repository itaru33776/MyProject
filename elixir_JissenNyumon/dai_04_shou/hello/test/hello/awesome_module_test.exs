defmodule AwesomeModuleTest do
  @doc """

  ## Examples

      iex> Hello.AwesomeModule.plus(1, 2)
      3

  """

  use ExUnit.Case
  doctest Hello.AwesomeModule

  test "plus" do
    assert Hello.AwesomeModule.plus(1, 2) == 3
  end
end
