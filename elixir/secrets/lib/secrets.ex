defmodule Secrets do
  def secret_add(secret) do
    fn a -> a + secret end
  end

  def secret_subtract(secret) do
    fn a -> a - secret end
  end

  def secret_multiply(secret) do
    fn a -> a * secret end
  end

  def secret_divide(secret) do
    fn a -> Kernel.div(a, secret) end
  end

  def secret_and(secret) do
    fn a -> Bitwise.&&&(a, secret) end
  end

  def secret_xor(secret) do
    fn a -> Bitwise.^^^(a, secret) end
  end

  def secret_combine(secret_function1, secret_function2) do
    &(&1 |> then(secret_function1) |> then(secret_function2))
  end
end
