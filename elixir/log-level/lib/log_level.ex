defmodule LogLevel do
  def to_label(level, legacy?) do
    cond do
      legacy? == true and (level <= 0 or level >= 5) ->
        :unknown

      legacy? == true ->
        case level do
          1 -> :debug
          2 -> :info
          3 -> :warning
          4 -> :error
        end

      legacy? == false ->
        case level do
          0 -> :trace
          1 -> :debug
          2 -> :info
          3 -> :warning
          4 -> :error
          5 -> :fatal
          _ -> :unknown
        end

      true ->
        :unknown
    end
  end

  def alert_recipient(level, legacy?) do
    label = to_label(level, legacy?)

    cond do
      label == :error ->
        :ops

      label == :fatal ->
        :ops

      label == :unknown ->
        case legacy? do
          true -> :dev1
          false -> :dev2
        end

      true ->
        false
    end
  end
end
