package krisnarajah;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import hsa_new.Console;

public class helloConsole {

	public static void main(String[] args) {
		Console Interact = new Console();
		//Interact.println("Once you get to paris you decide on going to the top of the Eiffel tower to see how the view is like. You have to choose between taking the stairs or the elevator");
		
		//if elevator
		//Interact.println(" You have chosen to take the elevator as you think it’s more quicker and since you had just landed after a 9h flight you’re exhausted.");
		
		//elevator crashes
		//Interact.println("you enter an elevator with a loose cable, and the cable tears and crashes to the bottom of the Eiffel tower and you die :( ");
		
		//get pushed off
		//Interact.println("You finally get to the top of the Eiffel tower and are excited to see the view, you decide to take a peak of how the surroundings look like and you realize the bully that was after you in high school is behind you and pushes you off!!");
		
		//if elevator 
		//Interact.println("You decide to take the stairs because the tickets for walking up the stairs are much cheaper than taking the elevator"); 
		//Interact.println("YAY! You got to the top of the Eiffel tower and got to see the lovely view that you were dying to see.");
		
		// South America
		interact.println("You have decided to go to South America since that is where your family lives and you wanted to visit them.");
		interact.println("You take a cruise ship to South America because you easily get flight sick. The cruise ship is sailing and you are enjoying the view when you suddenly hit a random island that you were unaware of.");
		interact.println("You get off the boat and look around this island and notice that there are camps and people actually living on this land. Do you decide to adapt to the native lifestyle on the island and hopefully find riches, or do you take the rescue helicopter that had arrived on the island?");
		
		//if native lifestyle
		interact.println("you decide to adapt to the lifestyle on the island as you think you don’t have a proper job and think you can make a living off of this island.");
		interact.println("You are looking around the island and see an open tent and you enter it. Once you enter it you find a weird looking box and you open it. Inside it you find a map to a part of the land that contains riches.");
		interact.println("From there you take the map and go on your adventure to find this land and obtain any riches you may find.");
		
		//if rescue helicopter
		interact.println("You decide to take the rescue helicopter because you are unsure whether you will prosper in life from staying on this island.");
		interact.println("You get on the rescue helicopter and encounter a shooting that is occurring on another island your flying over. They shoot your helicopter and you die!");
		
		//if Australia
		interact.println("you choose to visit the wonderful city of Sydney because You have always dreamed of visiting the Blue Mountains National Park as you heard it was one of the most popular tourist attractions there.");
		interact.println("WHAT...You ended up in space and realized you just got scammed by those traders who offered you the free trip");
		interact.println("You then look around a magical portal up ahead and dont know where it'll take you, but might bring you back to earth");
		interact.println("Just before you were about to enter the magical portal you get a call by an anonymous and they ask you if you would like to gert back to earth and enter their university with free tuition..But keep in mind this may be another scam!");
		interact.println("Do you chose to enter the magical portal infront of you or accept the offer to the university with free tuition");
		//insert random
		//if entered magic portal and survive
		interact.println("You have tooken the 50/50 chance of survival and have made it back to earth safely!");
		//if died
		interact.println("You decided to regretfully enter this portal and vanish into another universe");
		//if university
		interact.println("I warned you not to take the offer, and you accepted it and as I said you got scammed and are in debt :( ");
		
		//if Antartica
		interact.println("You decide to go to Antartica because you are very fond to know how the Artic mammals live their life and are willing to do some research on them");
		interact.println("Once you get their your completley lost and when you look around all you see are ice bergs and a land full of ice");
		interact.println("You start walking around in hope of finding a place to stay at temporary or to find any resources around. You come across an igloo and debate on whether staying there or keep walkign around to try any other form of safety");
		//stay in igloo (lose)
		interact.println("You decide to stay in the igloo because your hopeless that you would find any other sources on land.");
		interact.println("Since you decided to stay in the igloo you stay in there for too long that you get hypothermia and pass out");
		//decide to keep on searching
		interact.println("You keep on walking past the igloo and come across a submarine. You approach the man next to his submarine and request him to take you back home, and you get away from that horrible land! ");
		
		BufferedImage cover = null;
		try{
			cover= ImageIO.read(new File("pics/game cover.jpg"));
		}
		catch(IOException e){
			System.out.println("Image not found");
		}
		BufferedImage amazon = null;
		try{
			amazon= ImageIO.read(new File("pics/amazon jungle.jpg"));
			catch(IOException e){
				System.out.println("Image not found");
			}
		BufferedImage ancientcity = null;
		try{
			ancientcity =ImageIO.read(new File("pics/ancient city africa"));
			catch(IOException e){
				System.out.println("Image not found");
			}
		BufferedImage antartica = null;
		try{
			antartica = ImageIO.read(new File("pics/antartica.jpg"));
			catch(IOException e){
				System.out.println("Image not found");
			}
		BufferedImage bluemountain = null;
		try{
			bluemountain = ImageIO.read(new File("pics/blue mountain national park.jpg"));
			catch(IOException e){
				System.out.println("Image not found");
			}
		BufferedImage cruise = null;
		try{
			cruise = ImageIO.read(new File("pics/cruise.jpg"));
			catch(IOException e){
				System.out.println("Image not found");
			}
		BufferedImage elephants = null;
		try{
			elephants = ImageIO.read(new File("pics/elephants.jpg"));
			catch(IOException e){
				System.out.println("Image not found");	
			}
		BufferedImage jungle =null;
		try{
			jungle = ImageIO.read(new File("pics/jungle.jpg"));
			catch(IOException e){
				System.out.println("Image not found");
			}
			BufferedImage pneumonia = null;
			try{
				pneumonia = ImageIO.read(new File("pics/pneumonia.jpg"));
				catch(IOException e){
					System.out.println("Image not found");
				}
				BufferedImage southamerica = null;
				try{
					southamerica= ImageIO.read(new File("pics/south america.jpg"));
					catch(IOException e){
						System.out.println("Image not found");
					}
					BufferedImage stars = null;
					try{
						stars= ImageIO.read(new File("pics/stars.jpg"));
						catch(IOException e){
						System.out.println("Image not found");
						}
						BufferedImage University = null;
						try{
							university= ImageIO.read(new File("pics/University_of_Otago"));
							catch()
						}
						}
					}
					}
				}
			}
			}
					
					
		}
		}
		
		catch(IOException e){
			System.out.println("Image not found");
			
		}
	

		

		
		

	}

}
