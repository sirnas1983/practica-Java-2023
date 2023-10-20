def fibo(n):
    if n <= 1:
        return n
    else:
        return (fibo(n-2) + fibo(n-1))


for i in range(10):
    print(fibo(i))