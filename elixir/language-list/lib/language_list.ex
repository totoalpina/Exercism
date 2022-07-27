defmodule LanguageList do
  def new() do
    []
  end

  def add(list, language) do
    [language | list]
  end

  def remove(list) do
    [_head | tail] = list
    tail
  end

  def first(list) do
    [head | _tail] = list
    head
  end

  def count(list) do
    length(list)
  end

  def functional_list?(list) do
    if "Elixir" in list do
      true
    else
      false
    end
  end
end
