#include <bits/stdc++.h>
using namespace std;

int n, m;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n >> m;
    vector<int> v(n, 0);
    for (int i = 0; i < m; i++) {
        int a, b, c;
        cin >> a >> b >> c;
        for (int j = a - 1; j <= b - 1; j++) {
            v[j] = c;
        }
    }

    for (int i = 0; i < v.size(); i++) {
        cout << v[i] << ' ';
    }
    return 0;
}