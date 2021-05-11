#include <bits/stdc++.h>
using namespace std;
int main()
{

    freopen("operaciones.txt", "r", stdin);

    regex patron("\\+|\\-|\\*|\\/", regex::icase);
    regex patron2("^[0-9]+|[0-9]+\\.[0-9]+$", regex::icase);

    string linea;
    string aux3;
    string operacion, opt;
    smatch aux;
    smatch aux2;
    float total = 0;

    int numeroLineas, i = 1;

    cin >> numeroLineas;
    while (numeroLineas--)
    {
        cin >> linea;
        if (regex_search(linea, aux, patron))
        {
            cout << "Operacion linea " << i << ": " << endl<< linea << endl;
            total = stof(aux.prefix());
            aux3 = aux.suffix();
            operacion = aux[0];
            while (regex_search(aux3, aux, patron))
            {
                opt = aux.prefix();
                if (regex_match(opt, patron2))
                {
                    if (operacion == "+")
                    {
                        total += stof(aux.prefix());
                        cout << total << aux[0] << aux.suffix() << endl;
                        operacion = aux[0];
                    }
                    else
                    {
                        if (operacion == "-")
                        {
                            total = total - stof(aux.prefix());
                            operacion = aux[0];
                            cout << total << aux[0] << aux.suffix() << endl;
                        }
                        else
                        {
                            if (operacion == "*")
                            {
                                total = total * stof(aux.prefix());
                                cout << total << aux[0] << aux.suffix() << endl;
                                operacion = aux[0];
                            }
                            else
                            {
                                if (operacion == "/")
                                {
                                    total = total / stof(aux.prefix());
                                    operacion = aux[0];
                                    cout << total << aux[0] << aux.suffix() << endl;
                                }
                            }
                        }
                    }
                    aux3 = aux.suffix();
                }
                else
                {
                    cout << "Hay algun numero que no es decimal ni entero" << endl;
                }
            }
            total+=stof(aux3);
            cout<<total<<endl;
        }
        else
        {
            cout << "Existe algun error en la expresion aritmetica" << endl;
        }
        i++;
    }

    return 0;
}