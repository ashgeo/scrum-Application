package scrum.Application;

import java.util.Scanner;

public class Main {

	private static int optint;
	Story story = new Story();
	private static Scanner keyin;

	public static void main(String args[]) {
		MainList();

	}

	public String readStoryID() {

		System.out.println("Enter the Story ID \n");
		String id = readInput();
		return id;
	}

	public String readStoryDescription() {
		System.out.println("Enter the Story  Description \n");
		String description = readInput();
		return description;
	}

	private static String readInput() {
		keyin = new Scanner(System.in);
		String value = keyin.nextLine();
		return value;
	}

	public static int nextInt() {

		keyin = new Scanner(System.in);
		optint = keyin.nextInt();
		return optint;
	}

	public static void MainList() {

		Manager manger = new Manager();
		int count = 0;

		System.out.println("[1]Create New Story");
		System.out.println("[2]List Stories");
		System.out.println("[3]Update  story");
		System.out.println("[4]Delete  story");
		System.out.println("[5]Task Actions(Create/update/delete)");
		System.out.println("[6]Check Story Status");
		System.out.println("[7]Complete story");
		try {
			System.out.println("Insert selection :\n");
			count = nextInt();
			if (count > 7) {
				System.out.println("Invalid Selection");
				MainList();
			}
			switch (count) {

			case 1:
				manger.createStory();
				break;

			default:
				System.out.println("selection invalid");
				break;

			}
		} catch (Exception ex) {
			System.out.println("Invalid input format");
		}
	}

}
