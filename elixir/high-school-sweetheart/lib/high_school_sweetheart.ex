defmodule HighSchoolSweetheart do
  def first_letter(name) do
    name |> String.trim() |> String.at(0)
  end

  def initial(name) do
    initial = name |> first_letter |> String.upcase()
    initial <> "."
  end

  def initials(full_name) do
    [initial1, initial2] = full_name |> String.split(" ")
    initial(initial1) <> " " <> initial(initial2)
  end

  def pair(full_name1, full_name2) do
    """
         ******       ******
       **      **   **      **
     **         ** **         **
    **            *            **
    **                         **
    **     #{initials(full_name1)}  +  #{initials(full_name2)}     **
     **                       **
       **                   **
         **               **
           **           **
             **       **
               **   **
                 ***
                  *
    """
  end
end
