#include <bits/stdc++.h>
using namespace std;
int n, m;
vector<int> v;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> n >> m;

    for (int i = 1; i <= n; i++) {
        v.push_back(i);
    }

    for (int i = 0; i < m; i++){
        int j, k;
        cin >> j >> k;
        int temp = v[j - 1];
        v[j - 1] = v[k - 1];
        v[k - 1] = temp;
    }

    for (int i = 0; i < v.size(); i++) {
        cout << v[i] << ' ';
    }
    return 0;
}