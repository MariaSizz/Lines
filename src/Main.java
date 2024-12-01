class Main {
    public static void main(String[] args) {
        //1
        var firstName = "Ivan";
        var middleName = "Petrov";
        var lastName = "Petrovich";
        var fullName = middleName + " " + firstName + " " + lastName;
        System.out.println(fullName);


        //2
        System.out.println(fullName.toUpperCase());

        //3
        fullName = "Петров Семён Петрович";
        fullName = fullName.replace("ё", "е" );
        System.out.println(fullName);
        }


}
