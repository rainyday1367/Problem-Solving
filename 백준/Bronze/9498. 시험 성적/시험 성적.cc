#include <bits/stdc++.h>

using namespace std;

int main() {
	
	int a = 0;
	cin >> a;
	
	if (a >= 90) cout << "A" << '\n';
	else if (a > 79 && a < 90) cout << "B" << '\n';
	else if (a > 69 && a < 80) cout << "C" << '\n';
	else if (a > 59 && a < 70) cout << "D" << '\n';
	else cout << "F" << '\n';
	return 0;
}