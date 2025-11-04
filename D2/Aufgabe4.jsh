/reset

/* int basis = 2;
int exponent = 10;
int result = 1;

for (int i = 0; i <= exponent; i++){
    System.out.print(basis + "^" + i + " = ");
    for (int j = 0; j <= i ;j++){
        result *= basis;
    }
    System.out.print(result);
    System.out.println("");
}
 */

/* int basis = 2;
int exponent = 10;
int result = 1;

for (int i = 0; i <= exponent; i++){
    System.out.print(basis + "^" + i + " = ");
    System.out.print(result);
    result*=basis;
    System.out.println("");
} */

// a)
int b=2;
int e=10;
for (int i = 0; i <= e; i++) {
    System.out.println((int)Math.pow(b,i));
}

// b)
for (int i = 0; i <= exponent; i++){
    System.out.print(basis + "^" + i + " = ");
    for (int j = 0; j <= i ;j++){
        result *= basis;
    }
    System.out.print(result);
    System.out.println("");
}

