# x =int(input())
def fact(x):
  if x == 0:
    return 1
  else:
    x =x * fact(x-1)
    return x
print(fact(5))
