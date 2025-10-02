#include <bits/stdc++.h>
using namespace std;
int n;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> n;
    int mx = -1000001;
    int mn = 100001;

    for (int i = 0; i < n; i++) {
        int num;
        cin >> num;
        if (mx < num) mx = num;
        if (mn > num) mn = num;
    }

    cout << mn << ' ' << mx;
    return 0;
}