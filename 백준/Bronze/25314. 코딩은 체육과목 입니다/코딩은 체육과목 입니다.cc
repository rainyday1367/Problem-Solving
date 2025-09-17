#include <bits/stdc++.h>
using namespace std;
int n;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n;
    string s = "";
    for (int i = 0; i < n / 4; i++){
        s += "long ";
    }

    cout << s << "int" << '\n';
    return 0;
}