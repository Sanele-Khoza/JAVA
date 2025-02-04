public class Variables {
    public static void main(String[] args) {
        //Variables 
        String name = "John"; //Java is case sensetive so 'String' not 'string'
        System.out.println(name);

        int num = 24;
        System.out.println("John is " + num + " years old"); // To display a text along with variables use + sign
        final int myNum = 25; //is like fixing your number to be unchanged
                    //if you try to change it it'll give an error e.g
        /*myNum = 14;//error*/
        System.out.println(myNum);

        String Name = "Sanele ";
        String Surname = "Khoza";
        System.out.println(Name + Surname);
                    //or
        String Fullname = Name + Surname;
        System.out.println(Fullname);

        int x=5, y=6, z=7;
        System.out.println(x + y + z); //for numeric values the plus sighn works as an operator
        
        String studentName = "Sanele";
        int studentnumber = 202056687;
        int studentAge = 24;
        float studentFee = 15000.98f;
    }
}
