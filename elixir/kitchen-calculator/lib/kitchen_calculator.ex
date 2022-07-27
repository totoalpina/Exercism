defmodule KitchenCalculator do
  def get_volume(volume_pair) do
    {_key, value} = volume_pair
    value
  end

  def to_milliliter(volume_pair)

  def to_milliliter({unit, value} = _volume_pair) when is_atom(unit) and unit == :milliliter do
    {unit, value}
  end

  def to_milliliter({unit, value} = _volume_pair) when is_atom(unit) and unit == :cup do
    {:milliliter, value * 240}
  end

  def to_milliliter({unit, value} = _volume_pair) when is_atom(unit) and unit == :fluid_ounce do
    {:milliliter, value * 30}
  end

  def to_milliliter({unit, value} = _volume_pair) when is_atom(unit) and unit == :teaspoon do
    {:milliliter, value * 5}
  end

  def to_milliliter({unit, value} = _volume_pair) when is_atom(unit) and unit == :tablespoon do
    {:milliliter, value * 15}
  end

  def from_milliliter(volume_pair, unit)

  def from_milliliter(volume_pair, unit) when is_atom(unit) and unit == :milliliter do
    volume_pair
  end

  def from_milliliter(volume_pair, unit) when is_atom(unit) and unit == :cup do
    {_, value} = volume_pair
    {unit, value / 240}
  end

  def from_milliliter(volume_pair, unit) when is_atom(unit) and unit == :fluid_ounce do
    {_, value} = volume_pair
    {unit, value / 30}
  end

  def from_milliliter(volume_pair, unit) when is_atom(unit) and unit == :teaspoon do
    {_, value} = volume_pair
    {unit, value / 5}
  end

  def from_milliliter(volume_pair, unit) when is_atom(unit) and unit == :tablespoon do
    {_, value} = volume_pair
    {unit, value / 15}
  end

  def convert(volume_pair, unit) do
    to_ml = to_milliliter(volume_pair)
    from_milliliter(to_ml, unit)
  end
end
