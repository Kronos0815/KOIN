/reset

// n setzen
int n = 12;

// For Schleife
/*
Output:
    For Schleife
    1 2 3 4 5 6 7 8 9 10 11 12 
*/
System.out.println("For Schleife");
for (int i = 1; i<=n; i++){
    System.out.print(i +" ");
}
System.out.println("")


// While Schleife
/*
Output:
    While Schleife
    1 2 3 4 5 6 7 8 9 10 11 12 
*/
System.out.println("While Schleife");
int i=1;
while (i <= n){
    System.out.print(i + " ");
    i++;
}
System.out.println("")

// Do-While Schleife
/*
Output:
    Do-While Schleife
    1 2 3 4 5 6 7 8 9 10 11 12 
*/
System.out.println("Do-While Schleife");
i = 1;
do
{
 System.out.print(i+" ");
 i++;
} 
while (i <= n)