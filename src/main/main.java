package main;

import service.Ui;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ui ui = new Ui();


        ui.menu(scanner);
    }
}
