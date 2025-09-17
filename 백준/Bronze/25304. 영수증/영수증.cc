#include <bits/stdc++.h>
using namespace std;
int pri, n;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    cin >> pri >> n;
    int sum = 0;
    for (int i = 0; i < n; i++){
        int p, q;
        cin >> p >> q;
        sum += p * q;
    }

    if (pri == sum)
        cout << "Yes" << '\n';
    else
        cout << "No" << '\n';
    return 0;
}