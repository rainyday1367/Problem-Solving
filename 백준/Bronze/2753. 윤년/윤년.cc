#include <bits/stdc++.h>
using namespace std;
int n;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);

    int ret = 0;
    cin >> n;

    if (n % 4 == 0 && n % 100 != 0) {
        ret = 1;
    }

    if (n % 400 == 0) {
        ret = 1;
    }

    cout << ret << '\n';
    return 0;
}