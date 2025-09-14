#include <bits/stdc++.h>
using namespace std;
int h, m, n;

pair<int, int> cal(int h, int m, int n)
{
    pair<int, int> t;

    m += n;
    if (m > 59) {
        h += m / 60;
        m %= 60;
    }

    if (h > 23) {
        h %= 24;
    }
    t.first = h;
    t.second = m;
    return t;
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> h >> m >> n;
    pair<int, int> t = cal(h, m, n);

    cout << t.first << " " << t.second << "\n";
    return 0;
}