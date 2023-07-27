while True:
    line = input()
    if line == "99999":
        break
    direction = int(line[0]) + int(line[1])
    if direction == 0:
        print(last_direction, line[2:])
    elif direction % 2 == 0:
        last_direction = "right"
        print("right", line[2:])
    else:
        last_direction = "left"
        print("left", line[2:])
