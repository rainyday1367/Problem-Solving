#include <bits/stdc++.h>
using namespace std;
int n;
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        int a, b = 0;
        cin >> a >> b;
        cout << "Case #" << i << ": " << a << " + " << b << " = "<< a + b << '\n';
    }
    return 0;
}