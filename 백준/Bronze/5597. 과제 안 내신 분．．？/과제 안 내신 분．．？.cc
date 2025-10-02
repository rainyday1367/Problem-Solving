#include <bits/stdc++.h>
using namespace std;

bool student[31];
vector<int> v;
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    for (int i = 0; i < 28; i++) {
        int n;
        cin >> n;
        student[n] = 1;
    }

    for (int i = 1; i <= 30; i++) {
        if (student[i] == 0) v.push_back(i);
    }

    for (int i = 0; i < v.size(); i++) {
        cout << v[i] << '\n';
    }
    return 0;
}