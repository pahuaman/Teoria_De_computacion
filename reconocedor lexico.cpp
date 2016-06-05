/*Alumno:   Gómez Tovar Edgar Iván
  Código:   303526879
  Matería:  Teoría de la computación
  Proyecto: Reconocedor de componentes léxicos*/

#include <cstdlib>
#include <iostream>
#include <cstring>

#define TAMANIO 30
#define CANT_ENTRADAS 17
#define CANT_ESTADOS 23

using namespace std;


/***************************************************************************/
/************************** Clase AnalizadorLexico *************************/
/***************************************************************************/


class AnalizadorLexico
{
    private:
        inline int calculaEstado(const int entrada);
        bool analizaPalabrasReservadas(const char token[]);
        void imprimeEstadoAceptacion();
        void imprimeEstadoRechazo();
        int estado, estadoAnterior;
        static const int matrizEstados[CANT_ESTADOS][CANT_ENTRADAS];
        enum Estados
        {
            q00, q01, q02, q03, q04, q05, q06, q07, q08, q09, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22,
            FIN = 30, //Estado de aceptación
            ERR = 50 //Estado de rechazo
        };

    public:
        AnalizadorLexico();
        void analiza(const char token[]);
};

//===========================================================================

//Da el estado siguiente que le corresponde a la entrada y estado actual
const int AnalizadorLexico::matrizEstados[CANT_ESTADOS][CANT_ENTRADAS] =
{
//(a-f,A-F) (e,E) (g-z,G-Z) (h,H) (_) (0-9) (.)  (+)  (-) (/,*,%) (&)  (|)  (!)  (=) (<,>) (\0) (otro)
//(sin e,E)       (sin h,H)
    {q01,    q01,    q01,    q01, q01, q02, q10, q07, q06,  q08,  q16, q18, q19, q22, q20,  ERR, ERR},  //q00
    {q01,    q01,    q01,    q01, q01, q01, ERR, ERR, ERR,  ERR,  ERR, ERR, ERR, ERR, ERR,  FIN, ERR},  //q01
    {q03,    q04,    ERR,    q05, ERR, q02, q10, ERR, ERR,  ERR,  ERR, ERR, ERR, ERR, ERR,  FIN, ERR},  //q02
    {q03,    q03,    ERR,    q05, ERR, q03, ERR, ERR, ERR,  ERR,  ERR, ERR, ERR, ERR, ERR,  ERR, ERR},  //q03
    {q03,    q03,    ERR,    q05, ERR, q15, ERR, q14, q14,  ERR,  ERR, ERR, ERR, ERR, ERR,  ERR, ERR},  //q04
    {ERR,    ERR,    ERR,    ERR, ERR, ERR, ERR, ERR, ERR,  ERR,  ERR, ERR, ERR, ERR, ERR,  FIN, ERR},  //q05
    {ERR,    ERR,    ERR,    ERR, ERR, q09, q10, ERR, q08,  ERR,  ERR, ERR, ERR, ERR, ERR,  FIN, ERR},  //q06
    {ERR,    ERR,    ERR,    ERR, ERR, q09, q10, q08, ERR,  ERR,  ERR, ERR, ERR, ERR, ERR,  FIN, ERR},  //q07
    {ERR,    ERR,    ERR,    ERR, ERR, ERR, ERR, ERR, ERR,  ERR,  ERR, ERR, ERR, ERR, ERR,  FIN, ERR},  //q08
    {ERR,    q12,    ERR,    ERR, ERR, q09, q10, ERR, ERR,  ERR,  ERR, ERR, ERR, ERR, ERR,  FIN, ERR},  //q09
    {ERR,    ERR,    ERR,    ERR, ERR, q11, ERR, ERR, ERR,  ERR,  ERR, ERR, ERR, ERR, ERR,  ERR, ERR},  //q10
    {ERR,    q12,    ERR,    ERR, ERR, q11, ERR, ERR, ERR,  ERR,  ERR, ERR, ERR, ERR, ERR,  FIN, ERR},  //q11
    {ERR,    ERR,    ERR,    ERR, ERR, q13, ERR, q14, q14,  ERR,  ERR, ERR, ERR, ERR, ERR,  ERR, ERR},  //q12
    {ERR,    ERR,    ERR,    ERR, ERR, q13, ERR, ERR, ERR,  ERR,  ERR, ERR, ERR, ERR, ERR,  FIN, ERR},  //q13
    {ERR,    ERR,    ERR,    ERR, ERR, q13, ERR, ERR, ERR,  ERR,  ERR, ERR, ERR, ERR, ERR,  ERR, ERR},  //q14
    {q03,    q03,    ERR,    q05, ERR, q15, ERR, ERR, ERR,  ERR,  ERR, ERR, ERR, ERR, ERR,  FIN, ERR},  //q15
    {ERR,    ERR,    ERR,    ERR, ERR, ERR, ERR, ERR, ERR,  ERR,  q17, ERR, ERR, ERR, ERR,  ERR, ERR},  //q16
    {ERR,    ERR,    ERR,    ERR, ERR, ERR, ERR, ERR, ERR,  ERR,  ERR, ERR, ERR, ERR, ERR,  FIN, ERR},  //q17
    {ERR,    ERR,    ERR,    ERR, ERR, ERR, ERR, ERR, ERR,  ERR,  ERR, q17, ERR, ERR, ERR,  ERR, ERR},  //q18
    {ERR,    ERR,    ERR,    ERR, ERR, ERR, ERR, ERR, ERR,  ERR,  ERR, ERR, ERR, q21, ERR,  FIN, ERR},  //q19
    {ERR,    ERR,    ERR,    ERR, ERR, ERR, ERR, ERR, ERR,  ERR,  ERR, ERR, ERR, q21, ERR,  FIN, ERR},  //q20
    {ERR,    ERR,    ERR,    ERR, ERR, ERR, ERR, ERR, ERR,  ERR,  ERR, ERR, ERR, ERR, ERR,  FIN, ERR},  //q21
    {ERR,    ERR,    ERR,    ERR, ERR, ERR, ERR, ERR, ERR,  ERR,  ERR, ERR, ERR, q21, ERR,  ERR, ERR}   //q22
};

//===========================================================================

//Constructor
AnalizadorLexico::AnalizadorLexico()
{
    estado = estadoAnterior = q00;
}

//===========================================================================

//Verifica un token de entrada para ver si es un token valido
void AnalizadorLexico::analiza(const char token[])
{
    estado = estadoAnterior = q00;
    if(analizaPalabrasReservadas(token))
    {
        imprimeEstadoAceptacion();
        return;
    }
    int entrada, indice = 0;
    while(true)
    {
        switch(token[indice])
        {
            case 'a': case 'b': case 'c': case 'd': case 'f': case 'A': case 'B': case 'C': case 'D': case 'F': //Separadas de las demás letras para usarlas en los hexadecimales
               entrada = 0;
               break;
            case 'e': case 'E': //La "e" y "E" separadas de las demás letras para usarlas en los exponenciales y hexadecimales
               entrada = 1;
               break;
            case 'g': case 'i': case 'j': case 'k': case 'l': case 'm': case 'n': case 'ñ': case 'o': case 'p': case 'q': case 'r': case 's': case 't': case 'u': case 'v': case 'w': case 'x': case 'y': case 'z': case 'G': case 'I': case 'J': case 'K': case 'L': case 'M': case 'N': case 'Ñ': case 'O': case 'P': case 'Q': case 'R': case 'S': case 'T': case 'U': case 'V': case 'W': case 'X': case 'Y': case 'Z':
               entrada = 2;
               break;
            case 'h': case 'H': //La "h" y "H" separadas de las demás letras para usarlas en los hexadecimales
               entrada = 3;
               break;
            case '_':
               entrada = 4;
               break;
            case '0': case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
               entrada = 5;
               break;
            case '.':
               entrada = 6;
               break;
            case '+':
                entrada = 7;
                break;
            case '-':
               entrada = 8;
               break;
            case '/': case '*': case '%':
               entrada = 9;
               break;
            case '&':
               entrada = 10;
               break;
            case '|':
               entrada = 11;
               break;
            case '!':
               entrada = 12;
               break;
            case '=':
               entrada = 13;
               break;
            case '<': case '>':
               entrada = 14;
               break;
            case '\0': //Fin de cadena
               entrada = 15;
               break;
            default: //Otro
               entrada = 16;
        }
        estadoAnterior = estado;
        estado = calculaEstado(entrada);
        if(estado == FIN)
        {
            imprimeEstadoAceptacion();
            return;
        }
        if(estado == ERR)
        {
            imprimeEstadoRechazo();
            return;
        }
        indice++;
    }
}

//===========================================================================

//Regresa el estado siguiente, de acuerdo al estado y entrada actuales
inline int AnalizadorLexico::calculaEstado(const int entrada)
{
    return matrizEstados[estado][entrada];
}

//===========================================================================

//Verifica las palabras reservadas, si token coincide con alguna regresa true
bool AnalizadorLexico::analizaPalabrasReservadas(const char token[])
{
    if(strcmp(token,"auto")==0 || strcmp(token,"break")==0 || strcmp(token,"case")==0 || strcmp(token,"char")==0 || strcmp(token,"const")==0 || strcmp(token,"continue")==0 || strcmp(token,"default")==0 || strcmp(token,"do")==0 || strcmp(token,"double")==0 || strcmp(token,"else")==0 || strcmp(token,"enum")==0 || strcmp(token,"extern")==0 || strcmp(token,"float")==0 || strcmp(token,"for")==0 || strcmp(token,"goto")==0 || strcmp(token,"if")==0 || strcmp(token,"int")==0 || strcmp(token,"long")==0 || strcmp(token,"register")==0 || strcmp(token,"return")==0 || strcmp(token,"short")==0 || strcmp(token,"signed")==0 || strcmp(token,"sizeof")==0 || strcmp(token,"static")==0 || strcmp(token,"struct")==0 || strcmp(token,"switch")==0 || strcmp(token,"typedef")==0 || strcmp(token,"union")==0 || strcmp(token,"unsigned")==0 || strcmp(token,"void")==0 || strcmp(token,"volatile")==0 || strcmp(token,"while")==0)
        return true;
    return false;
}

//===========================================================================

//Muestra el tipo del token, suponiendo que es un token valido
void AnalizadorLexico::imprimeEstadoAceptacion()
{
    cout << endl << "Token aceptado" << endl;
    switch(estadoAnterior)
    {
        case q00:
            cout << "Palabra reservada de C" << endl;
            break;
        case q01:
            cout << "Identificador valido de C" << endl;
            break;
        case q02: case q09:
            cout << "Numero decimal entero, con o sin signo" << endl;
            break;
        case q05:
            cout << "Numero hexadecimal entero, sin signo en notacion de intel" << endl;
            break;
        case q11:
            cout << "Numero decimal real, con o sin signo" << endl;
            break;
        case q13: case q15:
            cout << "Numero en notacion exponencial, con o sin signo" << endl;
            break;
        case q06: case q07: case q08:
            cout << "Operador aritmetico de C" << endl;
            break;
        case q17: case q19:
            cout << "Operador logico de C" << endl;
            break;
        case q20: case 21:
            cout << "Operador relacional de C" << endl;
            break;
    }
}

//===========================================================================

//Cuando un token no es valido muestra cual es el error y lo que probablemente se quizo escribir
void AnalizadorLexico::imprimeEstadoRechazo()
{
    cout << endl << "Token invalido\a" << endl;
}


/***************************************************************************/
/********************************** Main ***********************************/
/***************************************************************************/


int main()
{
    char token[TAMANIO];
    char continuar = 'n';
    AnalizadorLexico analizador;
    do
    {
        system("CLS");
        cout << "Introduce el token: ";
        cin >> token;
        analizador.analiza(token);
        cout << endl << "Quieres continuar (s/n): ";
        cin >> continuar;
    }while(continuar == 's');
    return EXIT_SUCCESS;
}

