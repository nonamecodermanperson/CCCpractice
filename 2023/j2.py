peppers = {
    "Poblano": 1500,
    "Mirasol": 6000,
    "Serrano": 15500,
    "Cayenne": 40000,
    "Thai": 75000,
    "Habanero": 125000
}

N = int(input())
total_spiciness = 0
for _ in range(N):
    pepper = input()
    total_spiciness += peppers[pepper]
print(total_spiciness)
