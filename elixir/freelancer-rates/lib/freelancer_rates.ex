defmodule FreelancerRates do
  def daily_rate(hourly_rate) do
    hourly_rate * 8 / 1
  end

  def apply_discount(before_discount, discount) do
    before_discount - before_discount * discount / 100
  end

  def monthly_rate(hourly_rate, discount) do
    month_rate = apply_discount(hourly_rate, discount) * 8 * 22
    Float.ceil(month_rate, 0) |> Kernel.trunc()
  end

  def days_in_budget(budget, hourly_rate, discount) do
    daily_rate = apply_discount(hourly_rate, discount) * 8
    days_in_budget = budget / daily_rate
    Float.floor(days_in_budget, 1)
  end
end
