defmodule BirdCount do
  def today([]) do
    nil
  end

  def today([today_count | _tail] = _list) do
    today_count
  end

  def increment_day_count([]) do
    [1]
  end

  def increment_day_count([head | tail] = _list) do
    [head + 1 | tail]
  end

  def has_day_without_birds?([]), do: false

  def has_day_without_birds?([head | _tail] = _list) when is_integer(head) and head == 0 do
    true
  end

  def has_day_without_birds?([_head | tail] = _list) do
    has_day_without_birds?(tail)
  end

  def total([]), do: 0

  def total([head | tail] = _list) do
    head + total(tail)
  end

  def busy_days([]), do: 0

  def busy_days([head | tail] = _list) when is_integer(head) and head < 5 do
    0 + busy_days(tail)
  end

  def busy_days([head | tail] = _list) when is_integer(head) and head >= 5 do
    1 + busy_days(tail)
  end
end
