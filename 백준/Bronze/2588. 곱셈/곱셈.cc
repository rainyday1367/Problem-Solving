#include <bits/stdc++.h>

using namespace std;

int main() {
	int a, b = 0;
	cin >> a >> b;
	cout << a * (b % 10) << '\n';
	cout << a * ((b / 10) % 10) << '\n';
	cout << a * (b / 100) << '\n';
	cout << a * b << '\n';
	return 0;
}