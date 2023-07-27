N = int(input())
max_bid = 0
winner = ""
for i in range(N):
    name = input()
    bid = int(input())
    if bid > max_bid:
        max_bid = bid
        winner = name
print(winner)
