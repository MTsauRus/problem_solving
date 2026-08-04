"""
    2a - S, 2a -> 2a mod S
    a_n = (2^(n-1) *a) mod S
"""



T = int(input())
for t in range(1, T+1):
    A, B, K = map(int, input().split())
    res = A * pow(2, K, A+B) % (A+B)
    print(f"#{t} {min(res, (A+B)-res)}") 
    
    