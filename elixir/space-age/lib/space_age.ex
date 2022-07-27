defmodule SpaceAge do
  @type planet ::
          :mercury
          | :venus
          | :earth
          | :mars
          | :jupiter
          | :saturn
          | :uranus
          | :neptune

  @doc """
  Return the number of years a person that has lived for 'seconds' seconds is
  aged on 'planet', or an error if 'planet' is not a planet.
  """
  @spec age_on(planet, pos_integer) :: {:ok, float} | {:error, String.t()}
  def age_on(planet, seconds) do
    cond do
      planet == :mercury -> {:ok, seconds / 31_557_600 / 0.2408467}
      planet == :venus -> {:ok, seconds / 31_557_600 / 0.61519726}
      planet == :earth -> {:ok, seconds / 31_557_600}
      planet == :mars -> {:ok, seconds / 31_557_600 / 1.8808158}
      planet == :jupiter -> {:ok, seconds / 31_557_600 / 11.862615}
      planet == :saturn -> {:ok, seconds / 31_557_600 / 29.447498}
      planet == :uranus -> {:ok, seconds / 31_557_600 / 84.016846}
      planet == :neptune -> {:ok, seconds / 31_557_600 / 164.79132}
      true -> {:error, "not a planet"}
    end
  end
end
