defmodule ResistorColorDuo do
  @doc """
  Calculate a resistance value from two colors
  """

  @value_map %{
    :black => 0,
    :brown => 1,
    :red => 2,
    :orange => 3,
    :yellow => 4,
    :green => 5,
    :blue => 6,
    :violet => 7,
    :grey => 8,
    :white => 9
  }
  @spec value(colors :: [atom]) :: integer
  def value([head | tail] = _colors) do
    [head1 | _tail] = Map.take(@value_map, [head]) |> Map.values()
    [head2 | _tail] = Map.take(@value_map, [List.first(tail)]) |> Map.values()
    (Integer.to_string(head1) <> Integer.to_string(head2)) |> String.to_integer()
  end
end
