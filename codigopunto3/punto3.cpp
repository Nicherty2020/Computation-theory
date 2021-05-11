#include <bits/stdc++.h>
using namespace std;
int main()
{

    freopen("operaciones.txt", "r", stdin);

    regex patron("^([0-9]+|[0-9]+\\.[0-9]+)([+-])([0-9]+|[0-9]+\\.[0-9]+)$", regex::icase);

    string linea;
    smatch aux;

    int numeroLineas;

    cin >> numeroLineas;
    while (numeroLineas--)
    {
        cin >> linea;
        if (regex_match(linea, aux, patron))
        {
            if(aux[2] == "+"){
                cout<<"La suma es: "<<aux[1]<<"+"<<aux[3]<<"= "<<stof(aux[1])+stof(aux[3])<<endl;
            }else{
                cout<<"La resta es: "<<aux[1]<<"-"<<aux[3]<<"= "<<stof(aux[1])-stof(aux[3])<<endl;
            }
            
        }
        else
        {
            cout<<"Existe algun error en la expresion aritmetica"<<endl;
        }
    }

    return 0;
}