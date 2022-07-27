defmodule Bob do
  @spec hey(String.t()) :: String.t()

  def hey(""), do: "Fine. Be that way!"

  def hey(input) do
    cond do
      "" == String.trim(input) ->
        "Fine. Be that way!"

      "?" == String.last(String.trim(input)) and input == String.upcase(String.trim(input)) and
          String.downcase(input) != input ->
        "Calm down, I know what I'm doing!"

      "?" == String.last(String.trim(input)) ->
        "Sure."

      input == String.upcase(input) and String.downcase(input) != input ->
        "Whoa, chill out!"

      true ->
        "Whatever."
    end
  end
end
