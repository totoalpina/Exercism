defmodule GuessingGame do
  def compare(secret_number, guess \\ :no_guess)
  def compare(secret_number, secret_number), do: "Correct"
  def compare(_secret_number, guess) when not is_integer(guess), do: "Make a guess"
  def compare(secret_number, guess) when abs(secret_number - guess) == 1, do: "So close"
  def compare(secret_number, guess) when secret_number < guess + 1, do: "Too high"
  def compare(secret_number, guess) when secret_number > guess + 1, do: "Too low"
end
