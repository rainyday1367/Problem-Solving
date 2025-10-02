#include <bits/stdc++.h>
using namespace std;

vector<int> res;
int n;
int x;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> n >> x;

    for (int i = 0; i < n; i++){
        int a;
        cin >> a;
        if (a < x) res.push_back(a);
    }

    for (int i = 0; i < res.size(); i++) {
        cout << res[i] << ' ';
    }
    return 0;
}