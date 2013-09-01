package day01;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
			Scanner console = new Scanner(System.in);
			System.out.print("Who are you: ");
			String name = console.nextLine();	// 从控制台读取下一行
			System.out.println("Welcome to Java World, " + name);
	}

}
