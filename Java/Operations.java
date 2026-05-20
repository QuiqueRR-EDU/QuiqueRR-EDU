//Constructor
//Operations(){}
Operations(int valA, int valB){
    this.valA = valA;
    this.valB = valB;
}
public static void main(String[] args) {
    //instancia utilizando el constructos sin parámetros
    Operations operations = new Operations();
    System.out.println("valA: "+ operations.valA + "valB: " + operations.valB);

    //instancia utilizando el constructor con parámetros
    Operations operations2 = new Operations(7,3);
    System.out.println("valA: "+ operations2.valA + "valB: " + operations2.valB);
}