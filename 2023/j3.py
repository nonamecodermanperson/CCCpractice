N = int(input())
for _ in range(N):
    word = input()
    if word[0] in "aeiou":
        print(word + "cow")
    else:
        print(word[1:] + word[0] + "ow")
