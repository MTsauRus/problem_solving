from itertools import combinations
from copy import deepcopy
from collections import deque

N, K = map(int, input().split())
G = [list(map(int, input().split())) for _ in range(N)]
sr, sc = map(lambda x : int(x) - 1, input().split())
er, ec = map(lambda x : int(x) - 1, input().split())

# 벽 저장
blocks = []

for i in range(N):
    for j in range(N):
        if G[i][j] == 1:
            blocks.append((i, j))

block_size = len(blocks)

ans = 100000

def bfs(G, sr, sc, er, ec):
    visited = [[False] * N for _ in range(N)]
    dr = [1, -1, 0, 0]
    dc = [0, 0, 1, -1]
    
    visited[sr][sc] = True
    dq = deque([(sr, sc, 0)])
    while dq:
        r, c, d = dq.popleft()
        if r == er and c == ec:
            return d
        
        for i in range(4):
            nr = r + dr[i]
            nc = c + dc[i]
            if 0 <= nr < N and 0 <= nc < N and not visited[nr][nc] and G[nr][nc] == 0:
                visited[nr][nc] = True
                dq.append((nr, nc, d+1))
    
    return 100000
                        

def calc():
    global ans
    for elimated in combinations(range(block_size), K):
        new_G = deepcopy(G)
        
        for num in elimated:
            i, j = blocks[num]
            new_G[i][j] = 0
        
        ans = min(ans, bfs(new_G, sr, sc, er, ec))
        
calc()

print(-1 if ans == 100000 else ans)