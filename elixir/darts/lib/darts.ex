defmodule Darts do
  @type position :: {number, number}

  @doc """
  Calculate the score of a single dart hitting a target
  """

  @spec score(position) :: integer
  def score({x, y}) do
    square_point_hit = Float.pow(abs(x) / 1, 2) + Float.pow(abs(y) / 1, 2)
    point_hit = :math.sqrt(square_point_hit)

    cond do
      point_hit > 10 -> 0
      point_hit <= 10 and point_hit > 5 -> 1
      point_hit <= 5 and point_hit > 1 -> 5
      point_hit <= 1 and point_hit >= 0 -> 10
    end
  end
end
