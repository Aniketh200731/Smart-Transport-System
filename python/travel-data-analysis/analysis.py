import pandas as pd

# Read travel data
data = pd.read_csv("travel_data.csv")

print("SMART TRANSPORT SYSTEM")
print("----------------------")

print("\nTravel Data:")
print(data)

# Calculate statistics
total_trips = len(data)
total_distance = data["Distance_KM"].sum()
total_fare = data["Fare"].sum()
average_distance = data["Distance_KM"].mean()
average_fare = data["Fare"].mean()

print("\nTravel Analysis:")
print("Total Trips:", total_trips)
print("Total Distance:", total_distance, "KM")
print("Total Fare: ₹", total_fare)
print("Average Distance:", round(average_distance, 2), "KM")
print("Average Fare: ₹", round(average_fare, 2))