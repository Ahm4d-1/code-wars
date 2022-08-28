import math

def make_readable(seconds: int):
    hours = math.floor(seconds / 60 / 60)
    mins = math.floor(seconds / 60) % 60
    return '{}:{}:{}'.format(str(hours) if hours >= 10 else "0" + str(hours), str(mins) if mins >= 10 else "0" + str(mins), str(seconds % 60)
                             if (seconds % 60) >= 10 else "0" + str(seconds % 60))


print(make_readable(60))
