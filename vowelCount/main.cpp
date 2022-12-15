#include <string>
#include <iostream>

using namespace std;

int getCount(const string& inputStr){
  int num_vowels = 0;

  char vowels[] = {'a', 'e', 'i', 'o', 'u'};
  
  for (int i = 0; i < inputStr.length(); i++)
  {
    for (int j = 0; j < sizeof(vowels); j++)
    {
        if (inputStr[i] == vowels[j]) 
        {
            num_vowels++;
        }
    }
  }
  
  return num_vowels;
}

int main() {

    cout << getCount("abracadabra") << endl;

    return 0;
}
