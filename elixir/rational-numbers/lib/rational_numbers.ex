defmodule RationalNumbers do
  @type rational :: {integer, integer}

  @doc """
  Add two rational numbers
  """
  @spec add(a :: rational, b :: rational) :: rational
  def add(a, b) do
    {a1, b1} = reduce(a)
    {a2, b2} = reduce(b)
    reduce({a1 * b2 + a2 * b1, b1 * b2})
  end

  @doc """
  Subtract two rational numbers
  """
  @spec subtract(a :: rational, b :: rational) :: rational
  def subtract(a, b) do
    {a1, b1} = reduce(a)
    {a2, b2} = reduce(b)
    reduce({a1 * b2 - a2 * b1, b1 * b2})
  end

  @doc """
  Multiply two rational numbers
  """
  @spec multiply(a :: rational, b :: rational) :: rational
  def multiply(a, b) do
    {a1, b1} = reduce(a)
    {a2, b2} = reduce(b)
    reduce({a1 * a2, b1 * b2})
  end

  @doc """
  Divide two rational numbers
  """
  @spec divide_by(num :: rational, den :: rational) :: rational
  def divide_by({a1, b1} = _num, {a2, b2} = _den) when a2 != 0 do
    reduce({a1 * b2, a2 * b1})
  end

  @doc """
  Absolute value of a rational number
  """
  @spec abs(a :: rational) :: rational
  def abs({x, y} = _a) do
    reduce({Kernel.abs(x), Kernel.abs(y)})
  end

  @doc """
  Exponentiation of a rational number by an integer
  """
  @spec pow_rational(a :: rational, n :: integer) :: rational
  def pow_rational({x, y} = _a, n) when n < 0 do
    reduce({Integer.pow(y, Kernel.abs(n)), Integer.pow(x, Kernel.abs(n))})
  end

  def pow_rational({x, y} = _a, n) do
    reduce({Integer.pow(x, n), Integer.pow(y, n)})
  end

  @doc """
  Exponentiation of a real number by a rational number
  """
  @spec pow_real(x :: integer, n :: rational) :: float
  def pow_real(x, {a, b} = _n) do
    :math.pow(:math.pow(x, a), 1 / b)
  end

  @doc """
  Reduce a rational number to its lowest terms
  """
  @spec reduce(a :: rational) :: rational
  def reduce({x, y} = _a) do
    if y < 0 do
      z = Integer.gcd(x * -1, y * -1)
      {div(x, z) * -1, div(y, z) * -1}
    else
      z = Integer.gcd(x, y)
      {div(x, z), div(y, z)}
    end
  end
end
