#include <bits/stdc++.h>
using namespace std;

vector<int> v;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    for (int i = 0; i < 9; i++){
        int x;
        cin >> x;
        v.push_back(x);
    }

    int a = *max_element(v.begin(), v.end());
    auto b = max_element(v.begin(), v.end());

    cout << a << '\n' << (int)(b - v.begin() + 1);
    return 0;
}