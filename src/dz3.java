public class dz3 {
    public static void main(String[] args) {
        // задача 6
        var weightFighter1 = 78.2;
        var weightFighter2 = 82.7;

        System.out.println("Общий вес бойцов"+(weightFighter1+weightFighter2)+"кг");
        // задача 7
    System.out.println("раница в весе бойцов"+(weightFighter2 - weightFighter1)+"кг");
        System.out.println("раница в весе бойцов"+(weightFighter2 % weightFighter1)+"кг");

        //задача 8
        var allOfficeHours = 640;
        var oneOfficePlanktonWorkingHours = 8;
        System.out.println("Всего работников в компании - "+(allOfficeHours/oneOfficePlanktonWorkingHours)+" человек");
        System.out.println("Если в компании работает "+(allOfficeHours/oneOfficePlanktonWorkingHours+94)+" человек, то всего "+(allOfficeHours/(allOfficeHours/oneOfficePlanktonWorkingHours+94))+" часов работы может быть поделено между сотрудниками");

    }
}
