#include <bits/stdc++.h>
using namespace std;
int n, n2, n3;

int cal(int n ,int n2, int n3) {
    int m = 0;

    // 이미 2개가 같으면 같은거, 3개로 할 필요 없음
    if (n == n2 && n2 == n3) {
        m = 10000 + n * 1000;
    }
    else if (n == n2 || n == n3) {
        m = 1000 + n * 100;
    }
    else if (n2 == n3) {
        m = 1000 + n2 * 100;
    }
    else {
        // 개선
        // int mx = max(n, n2);
        // mx = max(mx, n3);
        int mx = max(max(n, n2), n3);
        m = mx * 100;
    }
    return m;
}
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n >> n2 >> n3;
    int m = cal(n, n2, n3);
    cout << m << '\n';
    return 0;
}
