defmodule RemoteControlCar do
  @enforce_keys [:nickname]
  defstruct [:nickname, battery_percentage: 100, distance_driven_in_meters: 0]

  def new(nickname \\ "none") do
    %RemoteControlCar{nickname: nickname}
  end

  def display_distance(remote_car) when is_struct(remote_car, RemoteControlCar) do
    metters = remote_car.distance_driven_in_meters
    "#{metters} meters"
  end

  def display_battery(remote_car) when is_struct(remote_car, RemoteControlCar) do
    battery = remote_car.battery_percentage

    cond do
      battery == 0 ->
        "Battery empty"

      true ->
        "Battery at #{battery}%"
    end
  end

  def drive(remote_car) when is_struct(remote_car, RemoteControlCar) do
    cond do
      remote_car.battery_percentage <= 0 ->
        remote_car

      true ->
        new_percentage = remote_car.battery_percentage - 1
        new_distance = remote_car.distance_driven_in_meters + 20

        %RemoteControlCar{
          remote_car
          | battery_percentage: new_percentage,
            distance_driven_in_meters: new_distance
        }
    end
  end
end
