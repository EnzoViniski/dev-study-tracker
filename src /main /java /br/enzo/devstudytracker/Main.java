package br.enzo.devstudytracker;

import br.enzo.devstudytracker.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Enzo", "viniskienzo@gmail.com");
        System.out.println(user.getEmail());
    }
}
