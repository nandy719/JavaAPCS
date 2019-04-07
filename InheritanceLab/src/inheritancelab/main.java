/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancelab;

/**
 *
 * @author nandy
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person ophir = new Person("Ophir Siman-Tov", 69, "F");
        System.out.println(ophir);

        Student nandy = new Student("Nandy", 16, "Alpha Male", "92331", 4.5);
        System.out.println(nandy);

        Teacher sos = new Teacher("Shannon Sos", 30, "M", "Computer Science", 1000000);
        System.out.println(sos);

        CollegeStudent dumbo = new CollegeStudent("Dumb Moron", 18, "F", "UCB123",
                                         1.9, 7, "Gender Studies");
        System.out.println(dumbo);
    }
    
}
