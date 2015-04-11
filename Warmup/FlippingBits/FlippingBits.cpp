#include <iostream>

using namespace std;

int main(){
	int numEx;
	unsigned int input;
	cin >> numEx;
	for (int i = 0; i < numEx ; i++){
		cin >> input;
		cout << ~input << endl;
	}
}
