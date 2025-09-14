#include <bits/stdc++.h>
using namespace std;
int h, m;

pair<int, int> cal(int h, int m) {
    pair<int, int> t;

    m -= 45;
    if (m < 0) {
        h--;
        m += 60;
    }

    if (h < 0) {
        h = 23;
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

    cin >> h >> m;
    pair<int, int> t = cal(h, m);

    cout << t.first << " " << t.second << "\n";
    return 0;
}