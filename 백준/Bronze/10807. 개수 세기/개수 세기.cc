#include <bits/stdc++.h>
using namespace std;

int n;
vector<int> v;
int f;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n;
    for (int i = 0; i < n; i++) {
        int num;
        cin >> num;
        v.push_back(num);
    }
    cin >> f;
    int res = 0;
    for (int i = 0; i < n; i++)
    {
        if (v[i] == f) {
            res++;
        }
    }
    cout << res << '\n';
    return 0;
}