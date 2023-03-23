#include <stdio.h>
#include <iostream>
#include <string>
#include <math.h>
#include <cstring>

using namespace std;

void bubbleSort(char vet[], int tam)
{  
    char aux;
        
        for(int i = 0; i < tam;i++)
    {
        for(int j = 0; j < tam - 1;j++)
        {
            if(vet[j] > vet[j + 1])
            {
                aux = vet[j];
                vet[j] = vet[j + 1];
                vet[j+ 1] = aux;
            }
            
        }
    }
}

int main()
{
    
    char vet[6] =  {'o','r','d','e','n','a'};

    cout << "String Original: " << vet << endl;

    bubbleSort(vet, 6);

    cout << "String em ordem: " << vet << endl;

    return 0;
}