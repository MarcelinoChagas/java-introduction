package application;

import java.util.Scanner;

import entities.Room;

public class ProgramRoom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int qtdRooms;
		Room room = new Room();
		Room[] vect = new Room[10];
		System.out.print("How many rooms will be rented? ");
		qtdRooms = input.nextInt();
		
		for(int i = 1; i <= qtdRooms; i++) {
			System.out.printf("\nRent #%d: ", i);
			System.out.print("\nName: ");
			input.nextLine();
			room.setName(input.nextLine());
			System.out.print("Email: ");
			room.setEmail(input.nextLine());
			System.out.print("Room: ");
			room.setRoom(input.nextInt());
			
			vect[room.getRoom()] = new Room(room.getName(),room.getEmail(), room.getRoom());
		}
		System.out.print("\nBusy rooms: ");
		for(int i = 0; i < 10;i++) {
			if(vect[i] != null) {
				System.out.printf("\n%d: %s, %s",vect[i].getRoom(), vect[i].getName(), vect[i].getEmail());
			}
		}
		
		input.close();
	}

}
