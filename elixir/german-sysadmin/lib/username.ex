defmodule Username do
  def sanitize([]), do: []

  def sanitize([head | tail]) do
    head
    |> case do
      head when head in ?a..?z -> [head]
      ?ä -> 'ae'
      ?ö -> 'oe'
      ?ü -> 'ue'
      ?ß -> 'ss'
      ?_ -> '_'
      _c -> ''
    end
    |> Kernel.++(sanitize(tail))
  end
end
