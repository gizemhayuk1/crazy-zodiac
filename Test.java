import java.util.Scanner;
import java.util.ArrayList;
public class Test {
    public static void displayMenu() {
        System.out.println("MENU OPTIONS [1 through 3]:");
        System.out.println("***      Press 1 if you want to learn your zodiac sign(Western & Chinese) and its interpretation          ***");
        System.out.println("***      Press 2 to get a general information about the Western Zodiac sign                               ***");
        System.out.println("***      Press 3 to get a general information about the Chinese Zodiac sign                               ***");
        System.out.println("***      Press 4 to print the information                                                                 ***");
        System.out.println("***      Press 5 to terminate the program                                                                 ***");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String tempName, tempGender,tempWZ= null, tempCZ = null, tempEN = null, tempPlanet = null;
        int tempDay, tempMonth, tempYear, userResponse=0;
        double c;

        ArrayList<Existence> existenceList = new ArrayList<Existence>();
        ArrayList<Zodiac> zodiacList = new ArrayList<Zodiac>();
        ArrayList<Element> elementList = new ArrayList<Element>();
        ArrayList<Planet> planetList = new ArrayList<Planet>();


        while (true) {
            displayMenu();
            boolean loopCondition = true;
            do {
                try {
                    userResponse = reader.nextInt();
                    reader.nextLine();
                    loopCondition = false;
                } catch (Exception e) { // Catch exception
                    System.err.println("Exception..." + e.getMessage());
                    System.err.println("Enter a number... Press 1 or 2 or 3 or 4 ...");
                }
            }
            while (loopCondition);


            switch (userResponse) {
                case 1:

                    System.out.println();
                    System.out.println("\t\t\t***WELCOME TO ZODIAC SYSTEM***");
                    System.out.println();
                    System.out.println("\t---Please fill the information below---");
                    System.out.println();
                    System.out.print("NAME : ");
                    tempName = reader.next();
                    System.out.print("GENDER : ");
                    tempGender = reader.next();
                    System.out.print("BIRTH YEAR : ");
                    tempYear = reader.nextInt();
                    System.out.print("BIRTH MONTH : ");
                    tempMonth = reader.nextInt();
                    System.out.print("BIRTH DAY : ");
                    tempDay = reader.nextInt();


                    if ((tempMonth == 12 && tempDay >= 22 && tempDay <= 31) || (tempMonth == 1 && tempDay >= 1 && tempDay <= 19)) {
                        tempWZ = "Capricorn";
                        System.out.println("Your zodiac is: " + tempWZ);
                        System.out.println();
                        System.out.println("\t\t\t\t\t*** More About " + tempWZ + " ***");
                        System.out.println("Capricorn is a sign that represents time and responsibility, " );
                        System.out.println("and its representatives are traditional and often very serious by nature. " );
                        System.out.println("These individuals possess an inner state of independence that enables significant progress both in their personal");
                        System.out.println("and professional lives. They are masters of self-control and have the ability to lead the way, ");
                        System.out.println("make solid and realistic plans, and manage many people who work for them at any time. ");
                        System.out.println("They will learn from their mistakes and get to the top based solely on their experience and expertise.");

                    } else if ((tempMonth == 1 && tempDay >= 20 && tempDay <= 31) || (tempMonth == 2 && tempDay >= 1 && tempDay <= 18)) {
                        tempWZ = "Aquarius";
                        System.out.println("Your zodiac is: " + tempWZ);
                        System.out.println();
                        System.out.println("\t\t\t\t\t*** More About " + tempWZ + " ***");
                        System.out.println("Aquarius-born are shy and quiet , but on the other hand they can be eccentric and energetic. However, in both cases, they are deep" );
                        System.out.println("thinkers and highly intellectual people who love helping others. They are able to see without prejudice, on both sides, which makes them people who can easily solve problems.");
                        System.out.println("Although they can easily adapt to the energy that surrounds them, Aquarius-born have a deep need to be some time alone and ");
                        System.out.println("away from everything, in order to restore power. People born under the Aquarius sign, ");
                        System.out.println("look at the world as a place full of possibilities.");
                    } else if ((tempMonth == 2 && tempDay > 18 && tempDay <= 29) || (tempMonth == 3 && tempDay >= 1 && tempDay <=20)) {
                        tempWZ = "Pisces";
                        System.out.println("Your zodiac is: " + tempWZ);
                        System.out.println();
                        System.out.println("\t\t\t\t\t*** More About " + tempWZ + " ***");
                        System.out.println("Pisces are very friendly, so they often find themselves in a company of very different people." );
                        System.out.println("Pisces are selfless, they are always willing to help others, without hoping to get anything back.");
                        System.out.println("Pisces is a Water sign and as such this zodiac sign is characterized ");
                        System.out.println("by empathy and expressed emotional capacity.People born under the Pisces sign have an intuitive understanding of");
                        System.out.println("the life cycle and thus achieve the best emotional relationship with other beings.");
                    } else if ((tempMonth == 3 && tempDay >=21 && tempDay <= 31) || (tempMonth == 4 && tempDay >= 1 && tempDay <= 19)) {
                        tempWZ = "Aries";
                        System.out.println("Your zodiac is: " + tempWZ);
                        System.out.println();
                        System.out.println("\t\t\t\t\t*** More About " + tempWZ + " ***");
                        System.out.println("As the first sign in the zodiac, the presence of Aries always marks the beginning of");
                        System.out.println("something energetic and turbulent. They are continuously looking for dynamic, speed and competition,");
                        System.out.println("always being the first in everything - from work to social gatherings. Thanks to its ruling planet Mars and the fact it belongs to the element of Fire (just like Leo and Sagittarius),");
                        System.out.println("Aries is one of the most active zodiac signs. It is in their nature to take action, sometimes before they think about it well.");
                    } else if ((tempMonth == 4 && tempDay >= 20 && tempDay <= 30) || (tempMonth == 5 && tempDay >= 1 && tempDay <= 20)) {
                        tempWZ = "Taurus";
                        System.out.println("Your zodiac is: " + tempWZ);
                        System.out.println();
                        System.out.println("\t\t\t\t\t*** More About " + tempWZ + " ***");
                        System.out.println("Practical and well-grounded, Taurus is the sign that harvests the fruits of labor. ");
                        System.out.println("They feel the need to always be surrounded by love and beauty, turned to the material world, hedonism, and physical pleasures.");
                        System.out.println("People born with their Sun in Taurus are sensual and tactile, considering touch and taste the most important of all senses.");
                        System.out.println("Stable and conservative, this is one of the most reliable signs of the zodiac, ");
                        System.out.println("ready to endure and stick to their choices until they reach the point of personal satisfaction.");
                    } else if ((tempMonth == 5 && tempDay >= 21 && tempDay <= 31) || (tempMonth == 6 && tempDay >= 1 && tempDay <= 21)) {
                        tempWZ = "Gemini";
                        System.out.println("Your zodiac is: " + tempWZ);
                        System.out.println();
                        System.out.println("\t\t\t\t\t*** More About " + tempWZ + " ***");
                        System.out.println("Expressive and quick-witted, Gemini represents two different personalities in one and you will never be sure");
                        System.out.println("which one you will face. They are sociable, communicative and ready for fun, with a tendency to suddenly get serious,");
                        System.out.println("thoughtful and restless. They are fascinated with the world itself, ");
                        System.out.println("extremely curious, with a constant feeling that there is not enough time to experience everything they want to see.");
                    } else if ((tempMonth == 6 && tempDay >21 && tempDay <= 30) || (tempMonth == 7 && tempDay >= 1 && tempDay <= 22)) {
                        tempWZ = "Cancer";
                        System.out.println("Your zodiac is: " + tempWZ);
                        System.out.println();
                        System.out.println("\t\t\t\t\t*** More About " + tempWZ + " ***");
                        System.out.println("Deeply intuitive and sentimental, Cancer can be one of the most challenging zodiac signs to get to know. ");
                        System.out.println("They are very emotional and sensitive, and care deeply about matters of the family and their home. ");
                        System.out.println("Cancer is sympathetic and attached to people they keep close. Those born with their Sun in Cancer are very loyal");
                        System.out.println("and able to empathize with other people's pain and suffering.");
                    } else if ((tempMonth == 7 && tempDay >= 23 && tempDay <= 31) || (tempMonth == 8 && tempDay >= 1 && tempDay <= 22)) {
                        tempWZ = "Leo";
                        System.out.println("Your zodiac is: " + tempWZ);
                        System.out.println();
                        System.out.println("\t\t\t\t\t*** More About " + tempWZ + " ***");
                        System.out.println("People born under the sign of Leo are natural born leaders.");
                        System.out.println("They are dramatic, creative, self-confident, dominant and extremely difficult to resist,");
                        System.out.println("able to achieve anything they want to in any area of life they commit to. There is a specific strength");
                        System.out.println("to a Leo and their \"king of the jungle\" status. Leo often has many friends for they are generous and loyal.");
                        System.out.println("Self-confident and attractive, this is a Sun sign capable of uniting different groups");
                        System.out.println("of people and leading them as one towards a shared cause, ");
                        System.out.println("and their healthy sense of humor makes collaboration with other people even easier.");
                    } else if ((tempMonth == 8 && tempDay >= 23 && tempDay <= 31) || (tempMonth == 9 && tempDay >= 1 && tempDay <= 22)) {
                        tempWZ = "Virgo";
                        System.out.println("Your zodiac is: " + tempWZ);
                        System.out.println();
                        System.out.println("\t\t\t\t\t*** More About " + tempWZ + " ***");
                        System.out.println("Virgos are always paying attention to the smallest details and their deep sense of humanity ");
                        System.out.println("makes them one of the most careful signs of the zodiac. Their methodical approach to life ensures that");
                        System.out.println("nothing is left to chance, and although they are often tender, their heart might be closed for the outer world.");
                        System.out.println("This is a sign often misunderstood, not because they lack the ability to express, but because ");
                        System.out.println("they won’t accept their feelings as valid, true, or even relevant when opposed to reason.");
                        System.out.println("The symbolism behind the name speaks well of their nature, born with a feeling they are experiencing everything for the first time.");
                    } else if ((tempMonth == 9 && tempDay >= 23 && tempDay <= 30) || (tempMonth == 10 && tempDay >= 1 && tempDay <= 23)) {
                        tempWZ = "Libra";
                        System.out.println("Your zodiac is: " + tempWZ);
                        System.out.println();
                        System.out.println("\t\t\t\t\t*** More About " + tempWZ + " ***");
                        System.out.println("People born under the sign of Libra are peaceful, fair, and they hate being alone.");
                        System.out.println("Partnership is very important for them, as their mirror and someone giving them the ability to ");
                        System.out.println("be the mirror themselves. These individuals are fascinated by balance and symmetry, they are in a ");
                        System.out.println("constant chase for justice and equality, realizing through life that the only thing that should be ");
                        System.out.println("truly important to themselves in their own inner core of personality.");
                        System.out.println("This is someone ready to do nearly anything to avoid conflict, keeping the peace whenever possible");
                    } else if ((tempMonth == 10 && tempDay > 23 && tempDay <= 31) || (tempMonth == 11 && tempDay >= 1 && tempDay <= 22)) {
                        tempWZ = "Scorpio";
                        System.out.println("Your zodiac is: " + tempWZ);
                        System.out.println();
                        System.out.println("\t\t\t\t\t*** More About " + tempWZ + " ***");
                        System.out.println("Scorpio-born are passionate and assertive people. They are determined and decisive, ");
                        System.out.println("and will research until they find out the truth.");
                        System.out.println("Scorpio is a great leader, always aware of the situation and also features prominently in resourcefulness.");
                    } else if ((tempMonth == 11 && tempDay >= 23 && tempDay <= 30) || (tempMonth == 12 && tempDay >= 1 && tempDay <= 21)) {
                        tempWZ = "Sagittarius";
                        System.out.println("Your zodiac is: " + tempWZ);
                        System.out.println();
                        System.out.println("\t\t\t\t\t*** More About " + tempWZ + " ***");
                        System.out.println("Curious and energetic, Sagittarius is one of the biggest travelers among all zodiac signs.");
                        System.out.println("Their open mind and philosophical view motivates them to wander around the world in search of the meaning of life.");
                        System.out.println("Sagittarius is extrovert, optimistic and enthusiastic, and likes changes.");
                        System.out.println("Sagittarius-born are able to transform their thoughts into concrete actions and they will do anything to achieve their goals.");
                    } else {
                        System.out.println("Illegal date");
                    }


                    System.out.println();


                    //Here are the elements of the Western Zodiac
                    if (tempWZ.equalsIgnoreCase("Aries")
                            || tempWZ.equalsIgnoreCase("Sagittarius")
                            || tempWZ.equalsIgnoreCase("Leo")) {
                        tempEN = "FIRE";
                    }
                    if (tempWZ.equalsIgnoreCase("Virgo")
                            || tempWZ.equalsIgnoreCase("Capricorn")
                            || tempWZ.equalsIgnoreCase("Taurus")) {
                        tempEN = "EARTH";
                    }
                    if (tempWZ.equalsIgnoreCase("Gemini")
                            || tempWZ.equalsIgnoreCase("Aquarius")
                            || tempWZ.equalsIgnoreCase("Libra")) {
                        tempEN = "AIR";
                    }
                    if (tempWZ.equalsIgnoreCase("Scorpio")
                            || tempWZ.equalsIgnoreCase("Pisces")
                            || tempWZ.equalsIgnoreCase("Cancer")) {
                        tempEN = "WATER";
                    }

                    System.out.println();

                    // Here are the planets of the Western zodiac signs
                    if (tempWZ.equalsIgnoreCase("Aries")) {
                        tempPlanet = "Mars";
                    } else if (tempWZ.equalsIgnoreCase("Taurus")
                            || tempWZ.equalsIgnoreCase("Libra")) {
                        tempPlanet = "Venus";
                    } else if (tempWZ.equalsIgnoreCase("Gemini")
                            || tempWZ.equalsIgnoreCase("Virgo")) {
                        tempPlanet = "Mercury";
                    } else if (tempWZ.equalsIgnoreCase("Cancer")) {
                        tempPlanet = "Moon";
                    } else if (tempWZ.equalsIgnoreCase("Leo")) {
                        tempPlanet = "Sun";
                    } else if (tempWZ.equalsIgnoreCase("Scorpio")) {
                        tempPlanet = "Pluto";
                    } else if (tempWZ.equalsIgnoreCase("Sagittarius")) {
                        tempPlanet = "Jupiter";
                    } else if (tempWZ.equalsIgnoreCase("Capricorn")) {
                        tempPlanet = "Saturn";
                    } else if (tempWZ.equalsIgnoreCase("Aquarius")) {
                        tempPlanet = "Uranus";
                    } else if (tempWZ.equalsIgnoreCase("Pisces")) {
                        tempPlanet = "Neptune";
                    }

                    System.out.println();
                    //westernZodiacList.add(new WesternZodiac(tempWZ, new Element(true,tempYear,tempEN),new Planet(true,tempYear,tempPlanet)));


                    // For the Chinese Zodiac

                    System.out.println();
                    if (tempYear == 2008 || tempYear == 1996 || tempYear == 1984 || tempYear == 1972 || tempYear == 1960){
                        tempCZ = "RAT";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Rats are quick-witted, resourceful, versatile, kind, smart, and lovely");
                        System.out.println("With strong intuition and quick response, they always easily adapt themselves to a new environment.");
                        System.out.println("With rich imaginations and sharp observation, Rats can take advantage of various opportunities well. ");
                        System.out.println("Rats have strong curiosity, so they tend to try their hands at anything, and they can deal with it skillfully.");
                    }

                   else if (tempYear == 2009 || tempYear == 1997 || tempYear == 1985 || tempYear == 1973 || tempYear == 1961){
                        tempCZ = "OX";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Oxes are known for diligence, dependability, strength and determination. Having an honest nature,");
                        System.out.println("Oxes have a strong patriotism for their country, have ideals and ambitions for life, and attach importance to family ");
                        System.out.println("and work. These things reflect the traditional characteristics of conservatives. Women belonging to the Ox zodiac sign are traditional, ");
                        System.out.println("faithful wives, who attach great importance to their children's education.");
                    }
                    else if (tempYear == 2010 || tempYear == 1998 || tempYear == 1986 || tempYear == 1974 || tempYear == 1962){
                        tempCZ = "TIGER";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("People born in the year of the Tiger are brave, competitive, unpredictable, and self-confident. They are very charming and");
                        System.out.println("well-liked by others. But sometimes they are likely to be impetuous, irritable, and overindulged.");
                        System.out.println("With stubborn personalities and tough judgment, tigers work actively and boldly express themselves, and do things with a high-handed manner. " );
                        System.out.println("They are authoritative and never go back on what they have said.");
                    }

                    else if (tempYear == 2011 || tempYear == 1999 || tempYear == 1987 || tempYear == 1975 || tempYear == 1963){
                        tempCZ = "RABBIT";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Rabbits tend to be gentle, quiet, elegant, and alert; quick, skillful, kind, and patient; ");
                        System.out.println("and particularly responsible. However, they might be superficial, stubborn, melancholy, ");
                        System.out.println("and overly-discreet. Generally speaking, people who belong to the Rabbit zodiac sign have likable characters.");
                    }

                    else if (tempYear == 2012 || tempYear == 2000 || tempYear == 1988 || tempYear == 1976 || tempYear == 1964){
                        tempCZ = "DRAGON";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Among Chinese zodiac animals, the Dragon is the sole imaginary animal. The Dragon is the most vital ");
                        System.out.println("and powerful beast in the Chinese zodiac, although with an infamous reputation for being a hothead and possessing a ");
                        System.out.println("sharp tongue. In ancient times, people thought that Dragons could control everything in the world with their character ");
                        System.out.println("traits of dominance and ambition.");
                    }
                    else if (tempYear == 2013 || tempYear == 2001 || tempYear == 1989 || tempYear == 1977 || tempYear == 1965) {
                        tempCZ = "SNAKE";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Snakes tend to act according to their own judgments, even while remaining the most private and reticent.");
                        System.out.println("They are determined to accomplish their goals and hate to fail.\n");
                        System.out.println("Snakes represent the symbol of wisdom. They are intelligent and wise. They are good at communication but say ");
                        System.out.println("little. Snakes are usually regarded as great thinkers.");
                    }
                    else if (tempYear == 2014 || tempYear == 2002 || tempYear == 1990 || tempYear == 1978 || tempYear == 1966){
                        tempCZ = "HORSE";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("People born in a year of the Horse are extremely animated, active and energetic. Horses love ");
                        System.out.println("to be in a crowd, and they can usually be seen on such occasions as concerts, theater performances, meetings, ");
                        System.out.println("sporting events, and parties.With a deft sense of humor, Horses are masters of repartee.");
                        System.out.println("They love to take center stage and delight audiences everywhere");
                        System.out.println("Sometimes, the Horse is a little self-centered, but it doesn't mean that s/he can not be ");
                        System.out.println("interested in others' problems. Horses are really more cunning than intelligent, and that is probably why most Horse people lack real confidence.");
                    }
                   else if (tempYear == 2015 || tempYear == 2003 || tempYear == 1991 || tempYear == 1979 || tempYear == 1967){
                        tempCZ = "GOAT";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("They have very delicate thoughts, strong creativity, and perseverance, and acquire professional skills ");
                        System.out.println("well. Although they look gentle on the surface, they are tough on the inside, always insisting on their own opinions ");
                        System.out.println("in their minds. They have strong inner resilience and excellent defensive instincts.");
                        System.out.println("Though they prefer to be in groups, they do not want to be the center of attention. They are reserved and ");
                        System.out.println("quiet, most likely because they like spending much time in their thoughts");
                    }
                   else if (tempYear == 2016 || tempYear == 2004 || tempYear == 1992 || tempYear == 1980 || tempYear == 1968) {
                        tempCZ = "MONKEY";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Monkeys are masters of practical jokes, because they like playing most of the time. Though ");
                        System.out.println("they don't have bad intentions, their pranks sometimes hurt the feelings of others.");
                        System.out.println("Monkeys are fast learners and crafty opportunists. They have many interests and need partners who are capable of stimulating them. ");
                        System.out.println("While some like the eccentric nature of Monkeys, others don't trust their sly, restless, and inquisitive nature.");
                        System.out.println("Although they are clever and creative, Monkeys can't always exhibit their talents properly. They like to accept challenges and");
                        System.out.println(" prefer urban life to rural.");
                      }
                    else if (tempYear == 2017 || tempYear == 2005 || tempYear == 1993 || tempYear == 1981 || tempYear == 1969){

                        tempCZ = "ROASTER";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Roosters are always active, amusing, and popular within a crowd. Roosters are talkative, outspoken,");
                        System.out.println("frank, open, honest, and loyal individuals. They like to be the center of attention and always appear attractive and beautiful.");
                        System.out.println("Roosters are happiest when they are surrounded by others, whether at a party or just a social gathering. ");
                        System.out.println("They enjoy the spotlight and will exhibit their charm on any occasion.");
                        }
                      else if (tempYear == 2018 || tempYear == 2006 || tempYear == 1994 || tempYear == 1982 || tempYear == 1970) {
                        tempCZ = "DOG";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Born with a good nature, Dogs do not tend to be criminals or seek dishonest gains. They just need a quiet");
                        System.out.println( "life and a good family and, therefore, forget the ugliness and evil on Earth.");
                        System.out.println("Dogs are always ready to help others and do not care about their own interests, but if they find themselves ");
                        System.out.println("betrayed by cunning people they will feel shocked and hurt.");
                        }

                      else if (tempYear == 2019 || tempYear == 2007 || tempYear == 1995 || tempYear == 1983 || tempYear == 1971){
                        tempCZ = "PIG";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Pigs are diligent, compassionate, and generous. They have great concentration: once they set a goal,");
                        System.out.println("they will devote all their energy to achieving it. Though Pigs rarely seek help from others, they will not refuse to give");
                        System.out.println("others a hand. Pigs never suspect trickery, so they are easily fooled.General speaking, Pigs are relatively calm when ");
                        System.out.println("facing trouble. No matter how difficult the problems are Pigs encounter, they can handle things properly and carefully.");
                        }

                        else
                            System.out.println("Illegal date");

                    System.out.println();


                People peopleRef1 = new People(true, tempYear,tempName, tempGender,tempDay,tempMonth, new WesternZodiac(tempWZ, new Element(true, tempYear, tempEN),
                        new Planet(true, tempYear, tempPlanet)), new ChineseZodiac(tempCZ));
                existenceList.add(peopleRef1);
                Zodiac z1 = new WesternZodiac(tempWZ,new Element(true,tempYear,tempEN),new Planet(true,tempYear,tempPlanet));
                Zodiac z2 = new ChineseZodiac(tempCZ);
                zodiacList.add(z1);
                zodiacList.add(z2);

                Element e1 = new Element(true,tempYear,tempEN);
                elementList.add(e1);
                Planet p1 = new Planet(true,tempYear,tempPlanet);
                planetList.add(p1);


                 break;

                case 2:

                    System.out.print("Please enter the date[1 to 31]:");
                    tempDay=reader.nextInt();
                    System.out.print("Please enter the month[1 to 12]: ");
                    tempMonth=reader.nextInt();
                    System.out.print("Please enter the birth year: ");
                    tempYear=reader.nextInt();
                    if ((tempMonth == 12 && tempDay >= 22 && tempDay <= 31) || (tempMonth == 1 && tempDay >= 1 && tempDay <= 19)) {
                        tempWZ = "Capricorn";}
                    else if ((tempMonth == 1 && tempDay >= 20 && tempDay <= 31) || (tempMonth == 2 && tempDay >= 1 && tempDay <= 17)) {
                        tempWZ = "Aquarius";}
                    else if ((tempMonth == 2 && tempDay >= 18 && tempDay <= 29) || (tempMonth == 3 && tempDay >= 1 && tempDay <= 19)) {
                        tempWZ = "Pisces";}
                    else if ((tempMonth == 3 && tempDay >= 20 && tempDay <= 31) || (tempMonth == 4 && tempDay >= 1 && tempDay <= 19)) {
                        tempWZ = "Aries";}
                    else if ((tempMonth == 4 && tempDay >= 20 && tempDay <= 30) || (tempMonth == 5 && tempDay >= 1 && tempDay <= 20)) {
                        tempWZ = "Taurus";}
                    else if ((tempMonth == 5 && tempDay >= 21 && tempDay <= 31) || (tempMonth == 6 && tempDay >= 1 && tempDay <= 20)) {
                        tempWZ = "Gemini";}
                    else if ((tempMonth == 6 && tempDay >= 21 && tempDay <= 30) || (tempMonth == 7 && tempDay >= 1 && tempDay <= 22)) {
                        tempWZ = "Cancer";}
                    else if ((tempMonth == 7 && tempDay >= 23 && tempDay <= 31) || (tempMonth == 8 && tempDay >= 1 && tempDay <= 22)) {
                        tempWZ = "Leo";}
                    else if ((tempMonth == 8 && tempDay >= 23 && tempDay <= 31) || (tempMonth == 9 && tempDay >= 1 && tempDay <= 22)) {
                        tempWZ = "Virgo";}
                    else if ((tempMonth == 9 && tempDay >= 23 && tempDay <= 30) || (tempMonth == 10 && tempDay >= 1 && tempDay <= 22)) {
                        tempWZ = "Libra";}
                    else if ((tempMonth == 10 && tempDay >= 23 && tempDay <= 31) || (tempMonth == 11 && tempDay >= 1 && tempDay <= 21)) {
                        tempWZ = "Scorpio";}
                    else if ((tempMonth == 11 && tempDay >= 22 && tempDay <= 30) || (tempMonth == 12 && tempDay >= 1 && tempDay <= 21)) {
                        tempWZ = "Sagittarius";}
                    else {
                        System.out.println("Illegal date");
                    }

                    //elements of this zodiac sign
                    if (tempWZ.equalsIgnoreCase("Aries")
                            || tempWZ.equalsIgnoreCase("Sagittarius")
                            || tempWZ.equalsIgnoreCase("Leo")) {
                        tempEN = "FIRE";
                    }
                    if (tempWZ.equalsIgnoreCase("Virgo")
                            || tempWZ.equalsIgnoreCase("Capricorn")
                            || tempWZ.equalsIgnoreCase("Taurus")) {
                        tempEN = "EARTH";
                    }
                    if (tempWZ.equalsIgnoreCase("Gemini")
                            || tempWZ.equalsIgnoreCase("Aquarius")
                            || tempWZ.equalsIgnoreCase("Libra")) {
                        tempEN = "AIR";
                    }
                    if (tempWZ.equalsIgnoreCase("Scorpio")
                            || tempWZ.equalsIgnoreCase("Pisces")
                            || tempWZ.equalsIgnoreCase("Cancer")) {
                        tempEN = "WATER";
                    }

                    // planet of this zodiac sign
                    if (tempWZ.equalsIgnoreCase("Aries")) {
                        tempPlanet = "Mars";
                    } else if (tempWZ.equalsIgnoreCase("Taurus")
                            || tempWZ.equalsIgnoreCase("Libra")) {
                        tempPlanet = "Venus";
                    } else if (tempWZ.equalsIgnoreCase("Gemini")
                            || tempWZ.equalsIgnoreCase("Virgo")) {
                        tempPlanet = "Mercury";
                    } else if (tempWZ.equalsIgnoreCase("Cancer")) {
                        tempPlanet = "Moon";
                    } else if (tempWZ.equalsIgnoreCase("Leo")) {
                        tempPlanet = "Sun";
                    } else if (tempWZ.equalsIgnoreCase("Scorpio")) {
                        tempPlanet = "Pluto";
                    } else if (tempWZ.equalsIgnoreCase("Sagittarius")) {
                        tempPlanet = "Jupiter";
                    } else if (tempWZ.equalsIgnoreCase("Capricorn")) {
                        tempPlanet = "Saturn";
                    } else if (tempWZ.equalsIgnoreCase("Aquarius")) {
                        tempPlanet = "Uranus";
                    } else if (tempWZ.equalsIgnoreCase("Pisces")) {
                        tempPlanet = "Neptune";
                    }

                    Zodiac ref = new WesternZodiac(tempWZ,new Element(true,tempYear,tempEN),new Planet(true,tempYear,tempPlanet));
                    zodiacList.add(ref);
                    Element e = new Element(true,tempYear,tempEN);
                    elementList.add(e);
                    Planet p = new Planet(true,tempYear,tempPlanet);
                    planetList.add(p);

                    break;

                case 3:
                    System.out.print("What is your birth year:");
                    tempYear=reader.nextInt();

                    if (tempYear == 2008 || tempYear == 1996 || tempYear == 1984 || tempYear == 1972 || tempYear == 1960){
                        tempCZ = "RAT";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Rats are quick-witted, resourceful, versatile, kind, smart, and lovely");
                        System.out.println("With strong intuition and quick response, they always easily adapt themselves to a new environment.");
                        System.out.println("With rich imaginations and sharp observation, Rats can take advantage of various opportunities well. ");
                        System.out.println("Rats have strong curiosity, so they tend to try their hands at anything, and they can deal with it skillfully.");
                    }

                    else if (tempYear == 2009 || tempYear == 1997 || tempYear == 1985 || tempYear == 1973 || tempYear == 1961){
                        tempCZ = "OX";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Oxes are known for diligence, dependability, strength and determination. Having an honest nature,");
                        System.out.println("Oxes have a strong patriotism for their country, have ideals and ambitions for life, and attach importance to family ");
                        System.out.println("and work. These things reflect the traditional characteristics of conservatives. Women belonging to the Ox zodiac sign are traditional, ");
                        System.out.println("faithful wives, who attach great importance to their children's education.");
                    }
                    else if (tempYear == 2010 || tempYear == 1998 || tempYear == 1986 || tempYear == 1974 || tempYear == 1962){
                        tempCZ = "TIGER";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("People born in the year of the Tiger are brave, competitive, unpredictable, and self-confident. They are very charming and");
                        System.out.println("well-liked by others. But sometimes they are likely to be impetuous, irritable, and overindulged.");
                        System.out.println("With stubborn personalities and tough judgment, tigers work actively and boldly express themselves, and do things with a high-handed manner. " );
                        System.out.println("They are authoritative and never go back on what they have said.");
                    }

                    else if (tempYear == 2011 || tempYear == 1999 || tempYear == 1987 || tempYear == 1975 || tempYear == 1963){
                        tempCZ = "RABBIT";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Rabbits tend to be gentle, quiet, elegant, and alert; quick, skillful, kind, and patient; ");
                        System.out.println("and particularly responsible. However, they might be superficial, stubborn, melancholy, ");
                        System.out.println("and overly-discreet. Generally speaking, people who belong to the Rabbit zodiac sign have likable characters.");
                    }

                    else if (tempYear == 2012 || tempYear == 2000 || tempYear == 1988 || tempYear == 1976 || tempYear == 1964){
                        tempCZ = "DRAGON";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Among Chinese zodiac animals, the Dragon is the sole imaginary animal. The Dragon is the most vital ");
                        System.out.println("and powerful beast in the Chinese zodiac, although with an infamous reputation for being a hothead and possessing a ");
                        System.out.println("sharp tongue. In ancient times, people thought that Dragons could control everything in the world with their character ");
                        System.out.println("traits of dominance and ambition.");
                    }
                    else if (tempYear == 2013 || tempYear == 2001 || tempYear == 1989 || tempYear == 1977 || tempYear == 1965) {
                        tempCZ = "SNAKE";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Snakes tend to act according to their own judgments, even while remaining the most private and reticent.");
                        System.out.println("They are determined to accomplish their goals and hate to fail.\n");
                        System.out.println("Snakes represent the symbol of wisdom. They are intelligent and wise. They are good at communication but say ");
                        System.out.println("little. Snakes are usually regarded as great thinkers.");
                    }
                    else if (tempYear == 2014 || tempYear == 2002 || tempYear == 1990 || tempYear == 1978 || tempYear == 1966){
                        tempCZ = "HORSE";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("People born in a year of the Horse are extremely animated, active and energetic. Horses love ");
                        System.out.println("to be in a crowd, and they can usually be seen on such occasions as concerts, theater performances, meetings, ");
                        System.out.println("sporting events, and parties.With a deft sense of humor, Horses are masters of repartee.");
                        System.out.println("They love to take center stage and delight audiences everywhere");
                        System.out.println("Sometimes, the Horse is a little self-centered, but it doesn't mean that s/he can not be ");
                        System.out.println("interested in others' problems. Horses are really more cunning than intelligent, and that is probably why most Horse people lack real confidence.");
                    }
                    else if (tempYear == 2015 || tempYear == 2003 || tempYear == 1991 || tempYear == 1979 || tempYear == 1967){
                        tempCZ = "GOAT";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("They have very delicate thoughts, strong creativity, and perseverance, and acquire professional skills ");
                        System.out.println("well. Although they look gentle on the surface, they are tough on the inside, always insisting on their own opinions ");
                        System.out.println("in their minds. They have strong inner resilience and excellent defensive instincts.");
                        System.out.println("Though they prefer to be in groups, they do not want to be the center of attention. They are reserved and ");
                        System.out.println("quiet, most likely because they like spending much time in their thoughts");
                    }
                    else if (tempYear == 2016 || tempYear == 2004 || tempYear == 1992 || tempYear == 1980 || tempYear == 1968) {
                        tempCZ = "MONKEY";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Monkeys are masters of practical jokes, because they like playing most of the time. Though ");
                        System.out.println("they don't have bad intentions, their pranks sometimes hurt the feelings of others.");
                        System.out.println("Monkeys are fast learners and crafty opportunists. They have many interests and need partners who are capable of stimulating them. ");
                        System.out.println("While some like the eccentric nature of Monkeys, others don't trust their sly, restless, and inquisitive nature.");
                        System.out.println("Although they are clever and creative, Monkeys can't always exhibit their talents properly. They like to accept challenges and");
                        System.out.println(" prefer urban life to rural.");
                    }
                    else if (tempYear == 2017 || tempYear == 2005 || tempYear == 1993 || tempYear == 1981 || tempYear == 1969){

                        tempCZ = "ROASTER";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Roosters are always active, amusing, and popular within a crowd. Roosters are talkative, outspoken,");
                        System.out.println("frank, open, honest, and loyal individuals. They like to be the center of attention and always appear attractive and beautiful.");
                        System.out.println("Roosters are happiest when they are surrounded by others, whether at a party or just a social gathering. ");
                        System.out.println("They enjoy the spotlight and will exhibit their charm on any occasion.");
                    }
                    else if (tempYear == 2018 || tempYear == 2006 || tempYear == 1994 || tempYear == 1982 || tempYear == 1970) {
                        tempCZ = "DOG";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Born with a good nature, Dogs do not tend to be criminals or seek dishonest gains. They just need a quiet");
                        System.out.println( "life and a good family and, therefore, forget the ugliness and evil on Earth.");
                        System.out.println("Dogs are always ready to help others and do not care about their own interests, but if they find themselves ");
                        System.out.println("betrayed by cunning people they will feel shocked and hurt.");
                    }

                    else if (tempYear == 2019 || tempYear == 2007 || tempYear == 1995 || tempYear == 1983 || tempYear == 1971){
                        tempCZ = "PIG";
                        System.out.println("\t\t\t\t\t*** More About " + tempCZ + " ***");
                        System.out.println("Pigs are diligent, compassionate, and generous. They have great concentration: once they set a goal,");
                        System.out.println("they will devote all their energy to achieving it. Though Pigs rarely seek help from others, they will not refuse to give");
                        System.out.println("others a hand. Pigs never suspect trickery, so they are easily fooled.General speaking, Pigs are relatively calm when ");
                        System.out.println("facing trouble. No matter how difficult the problems are Pigs encounter, they can handle things properly and carefully.");
                    }
                    else
                        System.out.println("Illegal date");

                    System.out.println();

                    Zodiac ref1 = new ChineseZodiac(tempCZ);
                    zodiacList.add(ref1);

                    break;

                case 4:
                    for (Existence ex : existenceList) {
                        ex.display(); // run-time polymorphism
                        c = ex.calculateDiscoverAge();
                        System.out.println("Age of the person is " + c);
                        System.out.println();
                    }
                    for(Zodiac z: zodiacList) {
                        z.print(); //run-time polymorphism
                        z.zodiacProperties();
                    }
                    for( Element el : elementList) {
                        el.calculateDiscoverAge();
                        System.out.println(tempEN+" exists for  "+el.calculateDiscoverAge()+" billion year");
                    }
                    for(Planet pl : planetList) {
                        pl.calculateDiscoverAge();
                        System.out.println(tempPlanet + " is discovered before " +pl.calculateDiscoverAge()+" billion year");
                        System.out.println();
                    }


                    break;
                case 5:
                    System.exit(0); // System quits...
                    break;

               default:
                  System.out.println("Wrong Entry....");


            }
        }


    }

}