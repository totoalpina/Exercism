defmodule NameBadge do
  def print(id, name, department) when id != nil and department != nil do
    "[#{id}] - #{name} - #{String.upcase(department)}"
  end

  def print(id, name, department) when id == nil and department != nil do
    "#{name} - #{String.upcase(department)}"
  end

  def print(id, name, department) when id != nil and department == nil do
    "[#{id}] - #{name} - OWNER"
  end

  def print(id, name, department) when id == nil and department == nil do
    "#{name} - OWNER"
  end
end
