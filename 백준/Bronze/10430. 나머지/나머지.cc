#include <bits/stdc++.h>

using namespace std;

int main() {
	int a, b, c = 0;
	cin >> a >> b >> c;
	cout << (a + b) % c << '\n';
	cout << ((a % c) + (b % c)) % c << '\n';
	cout << (a * b) % c << '\n';
	cout << ((a % c) * (b % c)) % c << '\n';
	return 0;
}