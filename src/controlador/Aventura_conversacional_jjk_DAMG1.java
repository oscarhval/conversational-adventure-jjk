package controlador;

import java.util.Scanner;

public class Aventura_conversacional_jjk_DAMG1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
// Inicio de la aventura y un boolean para acabar la aventura
		boolean gameOver = false;

		System.out.println("   ___           ___         _                       _   __        _                   \r\n"
				+ "  |_  |         |_  |       | |                     | | / /       (_)                  \r\n"
				+ "    | | _   _     | | _   _ | |_  ___  _   _        | |/ /   __ _  _  ___   ___  _ __  \r\n"
				+ "    | || | | |    | || | | || __|/ __|| | | |       |    \\  / _` || |/ __| / _ \\| '_ \\ \r\n"
				+ "/\\__/ /| |_| |/\\__/ /| |_| || |_ \\__ \\| |_| |       | |\\  \\| (_| || |\\__ \\|  __/| | | |\r\n"
				+ "\\____/  \\__,_|\\____/  \\__,_| \\__||___/ \\__,_|       \\_| \\_/ \\__,_||_||___/ \\___||_| |_|\r\n"
				+ "                                                                                       \r\n"
				+ "                                                                                       ");
//Contextualización y dibujo de los personajes para que se sepa quiénes son de una forma más visual
		System.out.println(
				"Yuji Itadori es un genio en el atletismo. Pero no siente interés alguno por correr en círculos, prefiere entrar en el Club de Investigación Oculta del instituto. \nAunque solo lo hace por diversión, ¡las cosas se ponen serias cuando aparece un verdadero espíritu en la escuela!\r\n"
						+ "Cuando su abuelo está en su lecho de muerte, Yuji le hace una promesa; que hará actos amables para que muera rodeado de sus seres queridos, a diferencia de su abuelo.\r\n"
						+ "Sin embargo, la vida de Yuji da un giro repentino cuando conoce a Megumi Fushiguro, un hechicero que intenta recuperar un objeto maldito en una misión. \nCuando los amigos de Yuji del club de investigación abren el envoltorio con el objeto maldito que encontraron,  es cuando las criaturas que este engendró comienzan a vagar en la escuela."
						+ "\nFushiguro y Yuji son casi derrotados por uno de los espíritus, Yuji se traga el objeto maldito y obtiene su poder.\nComo resultado, Yuji es maldecido por el objeto y es arrastrado al emocionante mundo de hechicería y espíritus malditos de Fushiguro.\n"
						+ "===============================================================================================================================================================================================\r\n"
						+ " ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣦⡀⠀⠸⡏⠲⢤⠀⠀⠀⢀⠀⠑⢀⠂⡄⠀⡀⢳⡀⡰⢳⡈⢧⢀⡠⠀⢀⡞⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⣄⠀⠀⢻⠙⠦⣀⣻⣄⠀⠑⢄⡀⠀⠙⠀⢀⡀⠈⠀⢣⠈⠳⢧⣘⡳⣀⠀⠀⢠⡿⠀⠀⠀⡰⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣦⣀⣘⣇⠀⣢⡈⠙⢅⠈⠑⢦⡄⠀⠐⠀⠈⠉⢀⡀⠳⢄⠀⠀⠉⢹⠃⠈⠁⠀⠀⣤⠞⠁⠀⠀⠉⠀⢤\r\n"
						+ "⠀⠀⠀⠀⠀⠀⢠⡄⡀⠀⠘⣷⣄⠈⠉⠣⣇⠑⠤⠀⢠⢄⡔⢉⣭⢖⡶⠀⣠⠎⢀⠎⠀⢠⠀⠀⠀⠁⠀⢀⠀⠴⠁⠀⠀⢠⠄⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠙⣷⢤⡤⠚⠉⠑⠂⠐⢼⡦⢦⢶⠋⠊⢀⠞⢡⣊⠴⠊⡏⢀⠎⠀⠀⡸⢀⣆⠀⠠⡀⠀⢆⠀⠀⡀⠀⠀⠀⠁⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠰⢤⣄⡀⠈⢦⣀⠀⠀⢀⣀⢠⠎⢀⢇⠞⠀⢠⠎⡜⠉⡄⠀⢰⠁⡏⠀⠀⠀⡿⠁⠈⠢⡀⠻⢄⡈⠢⣀⠈⠙⠢⠄⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠈⠳⣝⣥⣉⡉⢉⣲⡊⢀⡾⠀⡸⢸⢀⢤⠃⣴⢀⢴⠁⠂⣾⢁⡇⢰⣆⠀⢱⠀⠀⠀⢸⠁⠀⠀⠀⠀⠤⠤⢤⣴⣀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⢀⣤⠟⠛⢉⣿⡟⡰⢋⠃⣆⡇⣸⣾⢏⡞⣏⡌⢸⢃⠜⣏⡜⣷⡀⣼⣦⣀⠓⠀⢦⠃⢀⡜⠀⢠⠀⠶⠂⠤⠤⣆⠀⠀\r\n"
						+ "⠀⠀⠀⠈⠐⠛⠻⠤⠤⣤⣟⣰⣟⡇⣼⣴⣿⠖⣻⣿⠟⠀⠹⠁⠸⠋⠀⠟⢀⣿⣿⣿⣿⣧⡀⠀⢸⠖⡋⠀⡄⢸⣧⠀⢸⣒⣂⣠⣤⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⢀⣤⣪⣼⣿⢿⠟⣇⡿⠟⠏⠀⠟⠃⠀⢀⣠⠤⠒⠂⠀⠀⠚⠋⠀⣿⡏⡿⣧⡀⢸⡀⢡⣾⢣⣾⣧⣷⣄⣿⣿⠟⠋⠀\r\n"
						+ "⠀⠀⠀⠐⠒⠚⠛⣋⣨⣿⢋⡞⠀⠀⠀⠀⠀⠀⠀⢠⡾⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈⢑⣷⣿⣟⣻⣧⠈⣿⠟⠛⢿⣿⣿⡿⠁⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠚⠋⢹⣯⡾⠀⠰⣤⣀⠀⠀⠀⠀⠀⠀⢠⡴⠚⠋⠉⠉⠉⠀⠀⠀⠀⠚⢋⡾⠋⢿⣿⣿⠇⢀⣀⢨⡙⢿⡁⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠸⠁⠹⡀⠀⠀⠛⠧⠀⠀⠀⠀⠀⣿⠀⠀⣠⣤⣄⣰⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⠁⢰⣋⠙⠛⢻⠀⠙⡄⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠉⢳⡴⠛⠛⠒⠀⠀⠀⠀⠀⠉⠀⠸⡟⠛⣩⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠛⠉⢉⣼⠇⡰⠃⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⢃⠠⣾⣱⣦⠀⠀⠀⠀⠀⠀⠀⠚⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡶⠿⠗⢸⢋⠞⠁⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⢷⡖⣼⣈⡷⠿⠿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡞⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⡯⣾⡽⢿⠚⢣⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⣄⡤⣾⠟⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⢸⡗⢻⣧⢸⠀⠀⠙⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡟⢫⢰⡏⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠈⢧⠘⣽⣞⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⠁⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
						+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⠹⣿⢷⠀⠀⢀⣀⡤⠐⠒⠉⠉⠁⣀⠤⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⣠⡿⠀⢸⠁⠀⠀⣠⡎⠀⠀⠀⢀⣼\r\n"
						+ "⣆⠀⠀⠀⣀⢀⠀⠀⠀⠀⢿⠂⠀⠀⢣⡀⠀⠈⢷⠤⠤⣐⠒⠉⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣟⡟⠀⢀⡏⠀⠀⠀⠉⠀⠀⡠⢀⣾⣿\r\n"
						+ "⢸⣉⣿⣠⣿⣿⣶⣦⣾⣲⡈⣇⠀⠀⠀⢳⡀⠀⠈⠑⠣⠄⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣿⢿⢙⡜⠀⢀⡼⠀⠀⠀⠀⠀⢀⠞⠁⣼⣿⣿\r\n"
						+ "⠈⣿⣿⡿⣿⣿⣿⣯⣟⣿⣷⣫⣆⠀⠀⠀⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣴⣿⣿⠏⢹⢸⡟⢀⡴⠋⠁⠀⠀⠀⢀⠔⠁⠀⣼⣿⣿⣿\r\n"
						+ "⢀⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⢳⠀⠀⠀⠀⠀⣀⡠⢴⣾⣿⣏⠉⢻⣶⢿⣼⠗⢁⠔⠁⠀⠀⢀⠔⠋⠀⠀⣸⣿⣿⣿⣿\r\n"
						+ "⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠻⡆⠀⠀⠈⠳⠤⡤⠴⢎⣉⣡⠞⠁⠈⠛⡥⣬⡿⠋⡀⠂⠁⠀⢀⠐⠈⡁⠀⠀⠀⣰⣿⣿⣿⣿⣿" + "\r\n" + "\r\n"
						+ "\r\n ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡛⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠻⣿⣿⡇⠨⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⢻⣿⣿⠀⠙⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠉⣀⣈⠻⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⡇⠀⢿⣿⣀⡠⠤⠻⣿⡟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡁⡠⣿⠑⠒⠷⠼⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢻⣿⣿⣿⢸⣿⠁⣀⠼⣿⠁⠀⠀⠀⠘⣿⠈⢿⡌⢿⣿⣿⣿⣿⣿⣿⡇⠳⣀⠑⢄⠀⠀⠸⣿⣿⣿\r\n"
						+ "⣿⠟⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⢸⣿⣿⣿⣼⣿⠉⣤⡴⢿⠂⠀⠀⠀⣀⠘⡇⠈⢳⠈⢻⣿⣿⢿⣿⣿⡗⢶⡚⠀⠀⡷⠀⠀⣿⣿⣿\r\n"
						+ "⣿⣠⣿⣿⣿⣿⣿⣿⣿⣿⡏⣿⡇⠀⣿⣿⡏⠺⣷⡊⠁⢀⣨⣤⠖⠾⠙⢸⠃⠈⠀⠀⢣⠀⢹⣿⡀⢻⣿⡇⠀⢹⠀⡰⠃⠀⣼⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⢿⣿⣿⣿⢿⣿⠷⣿⡀⠀⣿⣿⠃⢰⣿⣿⡟⢻⣿⣿⣆⣀⠔⠁⠀⠀⠀⠀⠀⠁⠀⢿⡇⠈⡟⠇⢠⣧⠜⠁⠀⣼⣿⣿⣿⣿\r\n"
						+ "⣿⣿⠟⠁⢸⣿⣿⣿⢼⣿⠀⣿⣹⣄⣿⡟⡀⠈⠁⠀⠁⠘⠛⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣇⠀⠙⠀⠘⠀⠀⠀⣸⠈⢿⣿⣿⣿\r\n"
						+ "⣿⠁⠀⠀⣾⣿⣿⣿⠀⣿⣟⢿⣿⣦⣿⢱⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠀⠀⠀⢀⣀⣀⡴⡿⠀⠈⣏⢻⣿\r\n"
						+ "⣿⠀⠀⢠⣿⠟⠛⣿⣿⠿⠿⡿⢟⠟⡏⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⣰⠇⠀⠀⠘⠀⢻\r\n"
						+ "⣿⠀⢀⡾⠁⠀⠀⠘⣧⡄⠀⣧⢸⠿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⢰⠃⠀⠀⠀⠀⠀⠀\r\n"
						+ "⣿⡆⠈⠀⠀⠀⠀⠀⠀⠀⠀⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠀⣾⡇⠀⠀⠀⠀⠀⠀\r\n"
						+ "⣿⠃⠀⠀⠀⣠⣿⡆⠀⠀⠀⣇⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡜⠁⢀⣿⡇⠀⠀⠀⠀⠀⢀\r\n"
						+ "⣿⠀⠀⣰⣿⣿⣿⣿⡀⠀⠀⣈⠉⠛⢦⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠀⠀⢸⢿⣇⠀⠀⠀⡠⠀⠁\r\n"
						+ "⣿⣶⣾⣿⣿⣿⣿⣿⣿⣶⣾⣿⣶⣶⣾⣷⡄⠀⢀⣀⣀⡠⠤⠤⠐⠒⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠎⠀⠀⠀⠀⢸⠀⣿⣠⠖⠋⢀⣠⣴\r\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣦⡀⠹⣤⣤⣶⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠁⠀⠀⠀⠀⣀⣼⠖⢋⣠⣴⣾⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠉⠙⣿⣿⣿⣿⣿⣆⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠔⠁⠀⠀⢀⣀⡴⢞⣩⣤⣶⣿⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠛⠀⠀⢠⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀⢀⣴⣁⠀⠀⣠⣴⣿⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⢸⣷⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⣀⣴⣿⣿⣿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⡀⣸⡟⢻⣿⣿⣿⡙⠛⠿⠿⢿⣿⣿⣷⣶⣾⣿⣿⠿⠿⠿⠟⣛⣋⣭⣥⣶⣶⡀⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⣿⣿⠋⢸⣿⣿⣿⣿⣿⣿⣇⣼⣿⣿⣿⣿⣶⣤⡀⠠⣄⣀⣀⠀⠀⠀⠀⠚⢛⣛⣿⣿⣿⠟⣿⡿⣟⣧⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿\r\n"
						+ "⣿⡿⠁⠀⠘⣿⣿⡿⠉⢻⣿⣿⣿⣿⣿⣿⡿⠟⠛⠛⢦⡈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢠⣿⣯⣤⣼⡇⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿\r\n");

//Empieza la primera decisión
		while (!gameOver) {
			System.out.println(
					"===============================================================================================================================================================================================");
			System.out.println(
					"Yuji se encuentra en el club de ocultismo con sus compañeros, están investigando sobre el objeto maldito que han encontrado");
			System.out.println("\n 1. Yuji no quiere saber nada acerca del tema y se marcha. ");
			System.out.println("\n 2. Yuji abre el envoltorio del objeto maldito.");
			System.out.println(
					"===============================================================================================================================================================================================");

			int choice = sc.nextInt();
//Si el choice 1 es seleccionado, salen 2 opciones para seguir la historia
			if (choice == 1) {
				System.out.println(
						"===============================================================================================================================================================================================");
				System.out.println(
						"Yuji decide volver a entrenar en la pista de atletismo del club al que pertenecía y no vuelve a saber nada de sus compañeros del club.¿Qué crees que pasará? FIN.");
				System.out.println(
						"===============================================================================================================================================================================================");
				gameOver = true;
			} else if (choice == 2) {
				System.out.println(
						"===============================================================================================================================================================================================");
				System.out.println(
						"El objeto maldito que se encuentra en la sala del club, ha provocado la aparición de maldiciones por toda la zona del colegio, \n nuestro protagonista se cruza con Megumi un hechicero que llega porque ha detectado altos niveles de de energía maldita");
				System.out.println(
						"\n 1. Yuji espera con sus compañeros fuera del colegio cómo les ha indicado un extraño que habla de la gravedad del asunto y lo peligroso que puede ser entrar al colegio.");
				System.out.println("\n 2. Yuji decide seguir al extraño para saber mejor lo que está pasando.");
				System.out.println(
						"===============================================================================================================================================================================================");
				choice = sc.nextInt();
//Más contextualiación y opciones a elegir dependiendo de lo elegido anteriormente
				if (choice == 1) {
					System.out.println("Se ve al hechicero derrotar sin problema a las maldiciones, volver con el objeto e irse sin decir nada.¿Qué hubiera pasado si le seguíamos? ");
					gameOver=true;
				} else if (choice == 2) {
					System.out.println(
							"===============================================================================================================================================================================================");
					System.out.println(
							"\"Entran por la puerta del colegio en busca del objeto y se encuentran con multitud de maldiciones que quieren consumirlo para obtener más poder\"");
					System.out.println(
							"\n 1. Yuji y Megumi se enfrentan a las maldiciones, las consiguen vencer sin problema y recuperan el objeto.");
					System.out.println("\n 2. Megumi se enfrenta a las maldiciones mientras Yuji va a por el objeto.");
					System.out.println(
							"===============================================================================================================================================================================================");
					choice = sc.nextInt();

					if (choice == 1) {
						System.out.println(
								"===============================================================================================================================================================================================");
						System.out.println(
								"Las maldiciones son derrotadas por los dos y Megumi profundiza en la historia de Sukuna y explica los peligros que conlleva.");

						System.out.println(
								"\nYuji se sorprende por la importancia del caso y quiere ser un hechicero más para salvar al mundo.");
						System.out.println(
								"Al ver esto, Megumi decide llevarlo a visitar la escuela de hechicería, \ndonde él obtuvo todos los conocimientos y técnicas que utiliza para exorcizar a las maldiciones.Continuará....");
						System.out.println(
								"===============================================================================================================================================================================================");
						gameOver = true;
					} else if (choice == 2) {
						System.out.println(
								"===============================================================================================================================================================================================");
						System.out.println(
								"\"Megumi se enfrenta solo a las maldiciones para que puedas recoger el objeto, pero debido a la gran cantidad de ellas, queda herido dejándo a Yuji sin muchas opciones\"");
						System.out.println(
								"\n 1. Sin pensárselo, Yuji consume el objeto maldito que parece ser un dedo extraño, y empieza a experimentar un cambio en su cuerpo, como si hubiese alguien dentro de su cabeza.");
						System.out.println(
								"\n 2. Yuji asustado, huye de la zona dejando a Megumi herido dentro del establecimiento.");
						System.out.println(
								"===============================================================================================================================================================================================");

						choice = sc.nextInt();

//Opción donde empieza el combate y aparece un nuevo personaje y el prota se transforma
						if (choice == 1) {
							System.out.println(
									"===============================================================================================================================================================================================");
							System.out.println(
									"\"Yuji se ha tragado el objeto entero y su cuerpo ahora sufre una transformación que le dotará de una fuerza y habilidad increíble pero su mente será invadida por Sukuna, "
											+ "\nuna maldición ancestral que utilizará su cuerpo y someterá a la ciudad de Tokyo en un auténtico infierno.");
							System.out.println("⡀⠈⢿⣷⡄⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠙⠄⠀⠻⣿⣄⠀⠀⠀⠀⠈⠣⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠀⢤⣤⣄⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠙⣿⣦⠠⣄⣀⣠⠔⠊⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠗⢌⢧⡻⣾⣄⣿⡇⠀⢠⢞⡅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠈⢟⡂⠈⢙⣢⠄⠀⠀⠀⠠⠤⣤⣔⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠉⠙⢻⠠⣿⠿⠾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠘⠳⣾⡉⠀⡺⢁⣀⠤⠒⣀⣥⠴⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠁⡤⠀⢢⠀⠀⠀⠀⠉⢁⠄⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⣀⣠⡭⠷⠚⠛⠒⠒⢽⡿⠋⠀⠠⠤⣀⣀⠀⠀⠀⠀⠀⠈⢳⡄⠰⠁⠀⣸⡆⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠊⠀⠀⠀⢚⣡⠄⠀⠀⠀⠀⠀⠈⠉⠓⠶⣤⡀⠀⠀⠇⠀⢰⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⠉⣀⠔⢂⣠⣴⠟⠁⠀⠀⠀⠀⠈⠉⠒⠦⣄⠀⠀⠉⡆⠀⠀⠀⠀⠀⠀⠀⠠⣄⣀⡀⠀⠀⠀⠀⢄⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠈⠭⢿⣿⣿⣿⠋⠀⠀⠀⠈⡏⠐⠒⠲⠤⢤⣘⠆⠀⠀⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠐⠂⠀⣿⡅⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠙⢿⡇⡀⢦⠀⠲⡀⠱⢄⣀⠊⠀⠀⠘⠿⠀⠀⠀⠀⠀⠀⠀⠀⢠⠞⠋⠉⠂⠀⠀⠀⠀⠀⠸⡿⡷⡄⠑⠄\r\n"
									+ "⠀⠀⠀⠀⠀⠀⢰⡏⡞⣿⣄⢸⡁⢹⣾⡷⣄⠉⠢⣀⠈⠉⠒⠒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠺⠋⠉⣙⠒⠢⠤⣀⠀⠀⠀⢠⣱⡙⠪⣄⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠣⣻⠹⢼⠈⠻⣿⠛⠳⢄⡉⠀⠀⠀⠀⠀⠠⣄⣤⡴⠶⠿⣷⡄⠀⠀⠀⠤⣜⣀⠀⡇⢀⡼⠉⠀⠀⢬⣿⣧⠀⠀⣀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⠹⡀⠸⠀⡄⠹⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠂⠀⠀⠈⠻⣦⣀⠀⠀⠀⠀⣉⡉⠁⠠⠄⠀⠀⣸⣿⣿⣿⠿⠛\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣄⢰⡇⠀⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢁⣀⣀⣤⠖⡁⣰⣿⣿⡟⠛⠃⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⣰⣦⣀⠀⠙⣾⡇⠀⠘⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠤⢼⣭⡏⡠⠛⢉⡠⠿⡆⠀⠠\r\n"
									+ "⠀⢀⣴⣿⣿⣾⣿⣿⣿⣿⣾⣿⡇⠀⠀⢳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠿⠛⠀⢰⣏⣠⠃⡇⠀⠀\r\n"
									+ "⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠉⢻⡀⠀⠸⡆⠀⠀⠀⠀⠤⠤⣤⣤⡤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠁⠀⢀⣴⠣⠞⣡⠞⠁⠀⠀\r\n"
									+ "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⢳⡀⠀⠻⣆⠀⠀⠀⠀⠒⠠⠤⢉⣁⠛⠢⡄⠀⠀⠀⠀⠀⡠⠊⠁⢀⡜⠀⠘⡠⢴⡯⠀⠀⠀⡟⢰\r\n"
									+ "⣿⣿⡏⠻⣿⣿⣿⣿⣿⣿⣿⣦⠀⠈⣿⡀⠀⠈⢳⣄⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠀⣠⠞⠀⠀⢀⡾⠛⣿⠏⢠⣾⠁⠀⠀⣸⣧⠋\r\n"
									+ "⣿⣿⣇⠀⠙⢿⣿⣿⣿⣿⣿⣿⣷⣄⢹⠙⣆⠀⠀⠈⢻⡆⣄⠀⣀⠀⢀⣀⣀⣀⡤⠶⠚⠁⠀⢀⣠⠎⢠⠖⠋⢠⣿⡟⠀⠀⣰⣿⠇⠀\r\n"
									+ "⣿⣿⣿⣷⣄⠈⢻⣿⣿⣿⣟⢿⣿⣿⣾⡆⠘⢦⠀⠀⠀⠃⠇⢀⢏⡴⠋⠉⠉⠀⠀⠀⣀⣤⡶⠛⡁⠀⠀⠀⢠⣿⣿⡇⠀⢀⣿⡟⠀⠀\r\n"
									+ "⢿⣿⣿⣿⣿⣷⣄⠙⣿⣿⣿⣮⠻⣿⣿⣷⣄⢘⠳⣤⣀⠀⠀⠀⠀⠀⠀⢀⣠⡤⢶⡿⢋⣼⡡⠊⠀⠀⠀⠀⠀⠟⢿⠄⢀⣾⣿⣅⡀⠀\r\n"
									+ "⠀⠙⢿⣿⣿⣿⣿⣷⡌⢻⣿⣿⣷⡈⠻⣿⣿⣿⣄⣀⣉⣙⣛⡒⣶⣶⠛⢉⣤⣾⣵⣶⡿⣫⠀⠀⠀⠀⠀⢀⣀⣀⣀⡀⢨⣿⣿⣿⡇⠀\r\n"
									+ "⠀⠀⠀⠻⣿⣿⣿⣿⣿⣦⣻⣿⣿⣿⡄⠙⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⢣⠀⢀⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀\r\n"
									+ "⣿⣶⣄⡀⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣀⣤⣤⣤⣤⣤⣴⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⡻⢇⣰⣿⣿⡿⠛⠉⠁⠀⣁⡙⠻⣿⣿⣷⠦\r\n");
							System.out.println(
									"Llega Gojo Satoru, el hechicero más poderoso con una habilidad especial de nacimiento dispuesto a sellarle para siempre.");
							System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⠀⡀⠀⠀⠀⣠⡖⠐⣶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠀⡸⠁⢠⠃⠀⢀⣴⠟⠀⢀⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⢠⠃⠀⣏⣀⡤⠚⠁⠤⠤⠾⠤⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣧⢸⠀⠼⠋⠁⢀⣀⣀⣀⠀⠀⠀⠀⠀⢉⡓⠶⣤⣄⣀⣀⣀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⢀⠔⠋⠁⣠⠁⠀⠛⠋⠁⠀⠀⠀⠀⠀⠤⠤⣉⡒⠖⠤⢄⣈⠛⠛⠳⠤⢤⣤⣤⠄⠀⠀\r\n"
									+ "⠀⠀⠀⠀⡜⠁⢀⡤⠊⠀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⢷⠄⠀⠀⠉⠑⠒⠶⣈⡉⠁⠀⠀⠀\r\n"
									+ "⣀⣀⣀⠤⠖⠊⠁⠀⠀⢸⠁⠀⢀⠀⠀⠀⠀⡄⠀⠀⢶⠀⠘⣆⠀⠳⡀⠀⡄⠀⠰⢤⣤⠬⡭⣶⡶⠶\r\n"
									+ "⠀⠀⠀⠀⠀⣠⠏⠀⠀⠈⠀⠀⢸⡄⢠⠀⠀⣧⣷⠀⢸⡀⢠⠘⣆⠀⠱⡀⢻⠾⣆⢢⡹⣆⠀⠀⠀⠀\r\n"
									+ "⠀⠀⢀⣤⡾⡟⠀⡄⠀⡆⠀⠀⠀⢧⠸⡄⠀⢻⢹⡇⢼⢷⠈⡆⢹⢣⡀⠱⣼⡳⡙⢆⠱⠙⡆⠀⠀⠀\r\n"
									+ "⠰⠶⠟⠋⢰⠃⠀⡇⠀⢹⠀⢹⡘⡜⡆⢳⡀⠸⠈⣷⢸⣾⡆⠸⠸⡄⠑⡄⢻⡇⠱⡘⣷⣧⢹⡀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⡎⡸⠀⢱⠀⠈⢧⠀⢇⢷⣽⡌⢧⠀⡷⢾⡀⡇⠱⡀⠃⡷⠒⠛⣺⣷⢄⠙⣽⣏⢧⣧⠀⠀\r\n"
									+ "⠀⠀⠀⢰⣿⡷⣧⠀⢣⡀⠈⡆⠸⢸⠙⣿⣄⣱⣷⣴⣧⣇⠀⠹⣿⣇⣴⣶⣿⣿⣈⢦⠘⣞⠘⠉⠀⠀\r\n"
									+ "⠀⠀⣤⠟⣱⣷⡟⣶⡤⢷⣄⣰⣀⣿⣄⣘⣬⣿⣿⣿⣿⣿⣷⣤⣤⣿⣿⣿⣿⣿⣿⡀⠳⣌⡇⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠘⠋⣸⡷⡿⣇⡿⣶⡽⠏⠛⠉⠉⠙⢿⣿⣿⣿⣿⠏⠀⠀⠻⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⢠⡟⠁⢳⣿⡦⠋⣧⡀⠀⠀⠀⠀⠀⠉⠉⠉⠁⠀⠀⠀⠀⠀⠉⠉⠀⡿⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠈⣿⣿⣆⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⡇⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⠛⢻⠀⠑⠤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⡇⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⣀⣸⡆⠀⠀⠈⠓⠀⠀⠀⠀⠀⠀⠀⠺⣍⢉⡟⠀⢀⣼⠟⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣇⡀⠀⠀⠀⠐⢦⣀⠀⠀⠀⠀⠀⠈⠉⢀⣴⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣶⣤⣀⠀⠀⠹⢿⣶⣤⣄⣀⣀⣀⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⣀⠉⠻⣿⣷⡋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣬⣿⣿⣷⣤⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⣾⣿⣻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⣴⡿⠛⠻⢿⣿⣿⣿⣿⣿⡿⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⢀⠞⠛⠁⠀⠀⠈⠉⠉⠀⠉⠉⠛⣿⣿⣿⣿⣿⣿⣿⠿⣿⣿⣿⣷⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
							// comienzo combate en el código principal llamando a las funciones
							System.out.println(
									"===============================================================================================================================================================================================");
							combate();
							gameOver = true;

						} else if (choice == 2) {
							System.out.println(
									"===============================================================================================================================================================================================");
							System.out.println(
									"Yuji, temeroso, huye dejando a Megumi luchando solo contra las maldiciones. F por Megumi.");
							System.out.println(
									"===============================================================================================================================================================================================");
							gameOver = true;
						} else {
							System.out.println();
						}

					} else {
						System.out.println("Opción no válida. Elige 1 para continuar.");

					}
				} else {
					System.out.println("Opción no válida. Elige 1 o 2.");
				}
			} else {
				System.out.println("Opción no válida. Elige 1 o 2.");
			}

		}

	}

//Empiezan las funciones dedicadas al ataque defensa y a la huida
	public static int atacar(String protagonista, String hechicero, int ataqueSukuna, int defensaSatoru,
			int vidaSatoru) {

		System.out.println(protagonista + " " + "ataca a" + " " + hechicero + " " + "con su hechizo");
		int fuerzaAtaque = ataqueSukuna - defensaSatoru;
		int resultado = vidaSatoru - fuerzaAtaque;
		return resultado;
	}

	public static int defender(String protagonista, String hechicero, int ataqueSatoru, int defensaSukuna,
			int vidaSukuna) {
		System.out.println(hechicero + " " + "ataca a" + " " + protagonista + " " + "con su dominio");
		int fuerzaAtaque = ataqueSatoru - defensaSukuna;
		int resultado = vidaSukuna - fuerzaAtaque;
		return resultado;
	}

	public static boolean huir(String protagonista, String hechicero) {
		System.out.println(protagonista + " " + "intenta huir de" + " " + hechicero);

		int resultado = (int) (Math.random() * 10 + 1);
		System.out.println("resultado: " + resultado);
		boolean exito = false;
		if (resultado < 6) {
			System.out.println("No consigue huir de" + " " + hechicero);
			return exito;
		} else {
			exito = true;
			System.out.println(protagonista + " " + "Consigue huir");
			return exito;
		}
	}

// Aquí empieza la función combate
	public static void combate() {
		boolean exito = false;

		String protagonista = "Sukuna";
		int vidaSukuna = 100;
		int defensaSukuna = 4;
		int ataqueSukuna = 18;
		// int estadisticasSukuna [] = {vidaSukuna,defensaSukuna,ataqueSukuna};
		String hechicero = "Gojo Satoru";
		int vidaSatoru = 100;
		int defensaSatoru = 3;
		int ataqueSatoru = 20;
		// int estadisticasSatoru [] = {vidaSatoru,defensaSatoru,ataqueSatoru};
		while (vidaSukuna > 0 && vidaSatoru > 0 && exito == false) {
			System.out.println("===================================================");
			System.out.println("Opción 1 - Atacar");
			System.out.println("Opción 2 - Defender");
			System.out.println("Opción 3 - Huir");
			System.out.println("===================================================");
			System.out.println("Elige el número de una opción");
			int opción = sc.nextInt();

			switch (opción) {

			case 1:
				// LLamamos a la función atacar
				vidaSatoru = atacar(protagonista, hechicero, ataqueSukuna, defensaSatoru, vidaSatoru);
				System.out.println("La vida de" + " " + hechicero + " " + "es de" + " " + vidaSatoru + "hp");
				break;
			case 2:
				// LLamamos a la función defender
				vidaSukuna = defender(protagonista, hechicero, ataqueSatoru, defensaSukuna, vidaSukuna);
				System.out.println("La vida de" + " " + protagonista + " " + "es de" + " " + vidaSukuna + "hp");
				break;
			case 3:
				// LLamamos a la función huir
				exito = huir(protagonista, hechicero);
			
				break;

			default:
				System.out.println("Esa opción no es válida por favor elige otra");
				break;
			}
		}

		if (vidaSukuna <= 0) {

			System.out.println("Mala suerte, " + " " + hechicero + " " + "ha sellado a" + " " + protagonista);
			System.out.println("          _____                    _____                    _____          \r\n"
					+ "         /\\    \\                  /\\    \\                  /\\    \\         \r\n"
					+ "        /::\\    \\                /::\\    \\                /::\\____\\        \r\n"
					+ "       /::::\\    \\               \\:::\\    \\              /::::|   |        \r\n"
					+ "      /::::::\\    \\               \\:::\\    \\            /:::::|   |        \r\n"
					+ "     /:::/\\:::\\    \\               \\:::\\    \\          /::::::|   |        \r\n"
					+ "    /:::/__\\:::\\    \\               \\:::\\    \\        /:::/|::|   |        \r\n"
					+ "   /::::\\   \\:::\\    \\              /::::\\    \\      /:::/ |::|   |        \r\n"
					+ "  /::::::\\   \\:::\\    \\    ____    /::::::\\    \\    /:::/  |::|   | _____  \r\n"
					+ " /:::/\\:::\\   \\:::\\    \\  /\\   \\  /:::/\\:::\\    \\  /:::/   |::|   |/\\    \\ \r\n"
					+ "/:::/  \\:::\\   \\:::\\____\\/::\\   \\/:::/  \\:::\\____\\/:: /    |::|   /::\\____\\\r\n"
					+ "\\::/    \\:::\\   \\::/    /\\:::\\  /:::/    \\::/    /\\::/    /|::|  /:::/    /\r\n"
					+ " \\/____/ \\:::\\   \\/____/  \\:::\\/:::/    / \\/____/  \\/____/ |::| /:::/    / \r\n"
					+ "          \\:::\\    \\       \\::::::/    /                   |::|/:::/    /  \r\n"
					+ "           \\:::\\____\\       \\::::/____/                    |::::::/    /   \r\n"
					+ "            \\::/    /        \\:::\\    \\                    |:::::/    /    \r\n"
					+ "             \\/____/          \\:::\\    \\                   |::::/    /     \r\n"
					+ "                               \\:::\\    \\                  /:::/    /      \r\n"
					+ "                                \\:::\\____\\                /:::/    /       \r\n"
					+ "                                 \\::/    /                \\::/    /        \r\n"
					+ "                                  \\/____/                  \\/____/");

		} else if (exito == true) {
			System.out.println(protagonista + " "
					+ "va en busca de las maldiciones selladas en la hechicería para liberarlas y formar el caos en Tokyo.");
			System.out.println("          )                            )            (                (         )      ____    ____ \r\n"
					+ "       ( /(     (                   ( /(    *   )   )\\ )     (       )\\ )   ( /(     |   /   |   / \r\n"
					+ " (     )\\())    )\\       (    (     )\\()) ` )  /(  (()/(     )\\     (()/(   )\\())    |  /    |  /  \r\n"
					+ " )\\   ((_)\\   (((_)      )\\   )\\   ((_)\\   ( )(_))  /(_)) ((((_)(    /(_)) ((_)\\     | /     | /   \r\n"
					+ "((_)   _((_)  )\\___   _ ((_) ((_)   _((_) (_(_())  (_))    )\\ _ )\\  (_))     ((_)    |/      |/    \r\n"
					+ "| __| | \\| | ((/ __| | | | | | __| | \\| | |_   _|  | _ \\   (_)_\\(_) | |     / _ \\   (       (      \r\n"
					+ "| _|  | .` |  | (__  | |_| | | _|  | .` |   | |    |   /    / _ \\   | |__  | (_) |  )\\      )\\     \r\n"
					+ "|___| |_|\\_|   \\___|  \\___/  |___| |_|\\_|   |_|    |_|_\\   /_/ \\_\\  |____|  \\___/  ((_)    ((_)");

		} else {
			System.out.println(protagonista + " " + "derrota a" + " " + hechicero );
			System.out.println(" _   _   _____    ______   _        _____    _____   _____     ____    _   _ \r\n"
					+ " (_) (_) |  __ \\  |  ____| | |      |_   _|  / ____| |  __ \\   / __ \\  | | | |\r\n"
					+ " | | | | | |__) | | |__    | |        | |   | |  __  | |__) | | |  | | | | | |\r\n"
					+ " | | | | |  ___/  |  __|   | |        | |   | | |_ | |  _  /  | |  | | | | | |\r\n"
					+ " | | | | | |      | |____  | |____   _| |_  | |__| | | | \\ \\  | |__| | |_| |_|\r\n"
					+ " |_| |_| |_|      |______| |______| |_____|  \\_____| |_|  \\_\\  \\____/  (_) (_)\r\n"
					+ "                                                                              ");

		}

	}

}
