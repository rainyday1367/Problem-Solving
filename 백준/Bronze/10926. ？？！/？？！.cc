#include <bits/stdc++.h>
using namespace std;
int main()
{
    string s = "";
    cin >> s;
    // trigraph converted to '|' character
    s += "\?\?!";
    cout << s << '\n';
}