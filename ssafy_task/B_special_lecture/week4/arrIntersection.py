T = int(input())
for t in range(1, T+1):
    a, b = map(int, input().split())
    aset = set()
    bset = set()
    aset.update(list(input().split()))
    bset.update(list(input().split()))
    cset = aset.intersection(bset)
    print(f'#{t} {len(cset)}')