class Main {
    public static void main(String[] args) {
        //1
        var firstName = "Ivan";
        var middleName = "Ivanovich";
        var lastName = "Ivanov";
        var fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);


        //2
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //3
        fullName = "Иванов Семён Семенович";
        fullName = fullName.replace("ё", "е" );
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);
        }


}
