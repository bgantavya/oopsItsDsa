#include <iostream>

using namespace std;

void solve() {
    int x;
    cin >> x;
    if(x < 67) cout << x+1 << endl;
    cout << x << endl;
}
int main() {
    int t;
    cin >> t;
    while(t--) solve();
    return 0;
}