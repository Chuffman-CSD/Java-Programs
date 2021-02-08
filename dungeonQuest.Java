/*
 * School Project
 */
import java.util.Scanner;

public class dungeonQuest
{
  public static void main(String[] args)
  {
    // A scanner to get user input.
    Scanner sc = new Scanner(System.in);
    System.out.println("====                   ====");
    System.out.println(" || Welcome Adventurer! ||");
    System.out.println("====                   ====");
   
    //Gets the player character name
    System.out.println("\nState your name for all to see: ");
    String plrName = sc.nextLine();
   
   
    //Gets the player characters age
    System.out.println("Enter your age: ");
    int plrAge = Integer.parseInt(sc.nextLine());
   
   
    //Displays the player character 7name with all classes
    System.out.println("\nNow " + plrName + ", select your class: \n");
    System.out.println("\n1.)\n    Title: Swordsman\n    Starting Health: 50\n    Starting Weapon: Weak Wooden Sword\n    Mana: 0\n    Difficulty: ☆☆");
    System.out.println("\n2.)\n    LOCKED - FOR SHOW\n    Title: Assassin\n    Starting Health: 40\n    Starting Weapon: Dagger\n    Mana: 0\n    Difficulty: ☆☆☆");
    System.out.println("\n3.)\n    LOCKED - FOR SHOW\n    Title: Mage\n    Starting Health: 35\n    Starting Weapon: Broken Wand\n    Mana: 250\n    Difficulty: ☆☆☆☆");
    System.out.println("\n4.)\n    LOCKED - FOR SHOW\n    Title: Demon\n    Starting Health: 150\n    Starting Weapon: Royal Scythe\n    Difficulty: ☆\n");
    
    
    int plrClass = Integer.parseInt(sc.nextLine());
    
    if (plrClass != 1){
      System.out.println("\n\n*This class is only a showcase, please restart the program and choose '1' for 'Swordsman'!*\n\n");
    }

   
   
    //Checks which class the player selected
    if (plrClass == 1){
      System.out.println("\n\n\n***Thunder roars from the heavens above***\n\nThe heavens summon the Hero " + plrName + ", a swordsman!\n\n\n");
     
      //Class One Variables
      int plrHealthClassOne = 150;
     
      //Class One Weaponry
      int swordOne = 1;
      int swordTwo = 0;
      int swordThree = 0;
      int swordFour = 0;
      int swordFive = 0;
      int swordSix = 0;
      int swordSeven = 0;
      int swordEight = 0;
      int swordNine = 0;
      int swordTen = 0;
      int swordEleven = 0;
      int swordTwelve = 0;
      int swordThirteen = 0;
      int swordFourteen = 0;
      int swordFifteen = 0;
     
      //Class One Health Settings
      int maxHealthClassOne = 150;
      int maxStaminaClassOne = 50;
     
      //Class One Starting Supplies
      int classOnePotions = 3;
      int classOneMaxPotions = 15;
      int goldClassOne = 0;
     
      //Class One Starting Stats
      int classOneCurrentLevel = 1;
      int weaponEquippedClassOne = 1;
      boolean classOneInBattle = false;
      int experiencePointsClassOne = 0;
      int untilNextLevelClassOne = 3;
      int experiencePointsNeededUpdater = 1;
      int classOneSkillPoints = 0;
     
      //Class One Stat(s) Upgrades
     
      //Max Health Upgrades
      int classOneMaxHealthUpgrade = 0;
      //int classOneMaxHealthUpgradeUpdater = 0;
      int classOneExperiencePointsNeededUpgradeOne = 1;
     
      //Strength Upgrades
      int classOneStrengthUpgrade = 0;
      //int classOneStrengthUpgradeUpdater = 0;
      int classOneExperiencePointsNeededUpgradeTwo = 1;
      int classOneStrengthPoints = 0;

     
      //Class: 1, Game loop that never ends until the game is beat
      int classOneLoop = 0;
      while (classOneLoop == 0){
        if (experiencePointsClassOne > untilNextLevelClassOne){
         
          experiencePointsNeededUpdater += 1;
          untilNextLevelClassOne = untilNextLevelClassOne * experiencePointsNeededUpdater;
         
          classOneCurrentLevel += 1;
          experiencePointsClassOne -= untilNextLevelClassOne;
         
          System.out.println("\n*Lightning shoots down from the heavens and strikes you*\nThe heavens have promoted you to level: " + classOneCurrentLevel + "!\n\nLevel Up Rewards:\n    Skill Point(s): +2!\n");
         
          classOneSkillPoints += 2;
         
          if (experiencePointsClassOne < 0){
            experiencePointsClassOne = 0;
          }
         
        }else if (experiencePointsClassOne == untilNextLevelClassOne){
         
          classOneCurrentLevel += 1;
          experiencePointsClassOne -= experiencePointsClassOne;
         
          experiencePointsNeededUpdater += 1;
          untilNextLevelClassOne = untilNextLevelClassOne * experiencePointsNeededUpdater;
         
          System.out.println("\n*Lightning shoots down from the heavens and strikes you*\nThe heavens have promoted you to level: " + classOneCurrentLevel + "!\n\nLevel Up Rewards:\n    Skill Point(s): +2!\n");
         
          classOneSkillPoints += 2;
         
          if (experiencePointsClassOne < 0){
            experiencePointsClassOne = 0;
          }
        }
        System.out.println("====                  ====");
        System.out.println(" || PLAYER ACTION MENU ||");
        System.out.println("====                  ====\n");
        System.out.println("Name: " + plrName);
        System.out.println("Health: " + plrHealthClassOne + "/" + maxHealthClassOne);
        System.out.println("Strength: " + classOneStrengthPoints);
        System.out.println("Level: " + classOneCurrentLevel);
        System.out.println("Gold: " + goldClassOne);
        System.out.println("Experience Points: " + experiencePointsClassOne + "/" + untilNextLevelClassOne);
        System.out.println("Skill Points: " + classOneSkillPoints + "\n");
        System.out.println("1.)  Shop");
        System.out.println("2.)  Inventory");
        System.out.println("3.)  Dungeon");
        System.out.println("4.)  Stats Upgrade(s)");
        System.out.println("Select a choice: ");
        int classOneAction = Integer.parseInt(sc.nextLine());
       
 
        //Opens the player's shop menu
        if (classOneAction == 1){
          System.out.println("\n\n*Opening Shop*");
         
          int classOneShopSelectionLoop = 1;
          while (classOneShopSelectionLoop == 1){
            System.out.println("\n\n====                  ====");
            System.out.println(" ||  PLAYER SHOP MENU  ||");
            System.out.println("====                  ====\n");
            System.out.println("0.)  Leave Shop");
            System.out.println("1.)  Instant Heals");
            System.out.println("2.)  Potions");
            System.out.println("3.)  Weaponry");
            System.out.println("Select a choice: ");
           
            int classOneShopSelection = Integer.parseInt(sc.nextLine());
            if (classOneShopSelection == 0){
              classOneShopSelectionLoop = 0;
              System.out.println("\n\n*Leaving Shop*\n\n");
            }else if (classOneShopSelection == 1){
             
              int classOneInstantHealsLoop = 1;
              while (classOneInstantHealsLoop == 1){
                System.out.println("0.)  Leave Instant Heals");
                System.out.println("1.)  +30 Health Points: -1 Gold");
                System.out.println("2.)  +60 Health Points: -6 Gold");
                System.out.println("3.)  +120 Health Points: -12 Gold");
                System.out.println("4.)  +150 Health Points: -15 Gold");
                System.out.println("Select an instant heal: ");
                int classOneInstantHealsSelection = Integer.parseInt(sc.nextLine());
                if (classOneInstantHealsSelection == 0){
                  classOneInstantHealsLoop = 0;
                 
                }else if (classOneInstantHealsSelection == 1){
                  if (plrHealthClassOne == maxHealthClassOne){
                   
                   System.out.println("*The gypsy woman looks at you and laughs*\n" + plrName + ", you're already at max health!\n");
                   
                  }else{
                    if (goldClassOne >= 1){
                   
                      //Removes -1 Gold from the user
                      goldClassOne -= 1;
                     
                      //Gives +30 Health Points to the user
                      plrHealthClassOne += 30;
                     
                      System.out.println("\n\n*You decide to recover (+30) Health Points, a gypsy woman sits you in front of a glass ball.\nThe ball glows and you recover 30 health points.*\n\n");
                    }else if (goldClassOne < 1){
                      System.out.println("\n\n*The gypsy woman looks at you with a glare and shouts, 'You are holding up my business! Get out!*\n" + " You only have " + goldClassOne + " gold. You cannot afford to pay for this item.");
                    }  
                  }
                 
                }else if (classOneInstantHealsSelection == 2){
                 
                  if (plrHealthClassOne == maxHealthClassOne){
                   
                   System.out.println("*The gypsy woman looks at you and laughs*\n" + plrName + ", you're already at max health!\n");
                   
                  }else{
                    if (goldClassOne >= 6){
                   
                      //Removes -1 Gold from the user
                      goldClassOne -= 6;
                     
                      //Gives +30 Health Points to the user
                      plrHealthClassOne += 60;
                     
                      System.out.println("\n\n*You decide to recover (+60) Health Points, a gypsy woman sits you in front of a glass ball.\nThe ball glows and you recover 60 health points.*\n\n");
                    }else if (goldClassOne < 6){
                      System.out.println("\n\n*The gypsy woman looks at you with a glare and shouts, 'You are holding up my business! Get out!*\n" + " You only have " + goldClassOne + " gold. You cannot afford to pay for this item.");
                    }  
                  }
                 
                }else if (classOneInstantHealsSelection == 3){
                 
                  if (plrHealthClassOne == maxHealthClassOne){
                   
                   System.out.println("*The gypsy woman looks at you and laughs*\n" + plrName + ", you're already at max health!\n");
                   
                  }else{
                    if (goldClassOne >= 12){
                   
                      //Removes -1 Gold from the user
                      goldClassOne -= 12;
                     
                      //Gives +30 Health Points to the user
                      plrHealthClassOne += 120;
                     
                      System.out.println("\n\n*You decide to recover (+120) Health Points, a gypsy woman sits you in front of a glass ball.\nThe ball glows and you recover 120 health points.*\n\n");
                    }else if (goldClassOne < 12){
                      System.out.println("\n\n*The gypsy woman looks at you with a glare and shouts, 'You are holding up my business! Get out!*\n" + " You only have " + goldClassOne + " gold. You cannot afford to pay for this item.");
                    }  
                  }
                 
                }else if (classOneInstantHealsSelection == 4){
                 
                  if (plrHealthClassOne == maxHealthClassOne){
                   
                   System.out.println("*The gypsy woman looks at you and laughs*\n" + plrName + ", you're already at max health!\n");
                   
                  }else{
                    if (goldClassOne >= 15){
                   
                      //Removes -1 Gold from the user
                      goldClassOne -= 15;
                     
                      //Gives +30 Health Points to the user
                      plrHealthClassOne += 150;
                     
                      System.out.println("\n\n*You decide to recover (+150) Health Points, a gypsy woman sits you in front of a glass ball.\nThe ball glows and you recover 150 health points.*\n\n");
                    }else if (goldClassOne < 15){
                      System.out.println("\n\n*The gypsy woman looks at you with a glare and shouts, 'You are holding up my business! Get out!*\n" + " You only have " + goldClassOne + " gold. You cannot afford to pay for this item.");
                    }  
                  }
                }
              }
            }else if (classOneShopSelection == 2){
              int classOnePotionsShop = 1;
              while (classOnePotionsShop == 1){
                System.out.println("0.)  Leave Potions");
                System.out.println("1.)  15 Point Health Potion: -3 Gold\n");
                System.out.println("Select a choice: ");
                int classOnePotionSelection = Integer.parseInt(sc.nextLine());
                if (classOnePotionSelection == 0){
                  classOnePotionsShop = 0;
                  
                }else if (classOnePotionSelection == 1){
                  
                  if (classOnePotions == classOneMaxPotions){
                    
                    System.out.println("\n\n*Unable to buy, reason: Max Potions*\n\n");
                    
                  }else if (classOnePotions < classOneMaxPotions && goldClassOne >= 3){
                    
                    System.out.println("\n\nCongratulations, " + plrName + ", you just purchased a health potion!\n\n*");
                    classOnePotions += 1;
                    
                  }else if (classOnePotions < classOneMaxPotions && goldClassOne < 3){
                    System.out.println("\n\n" + plrName + ", you do not have enough gold for this item..\n");
                  }
                }
              }
            }else if (classOneShopSelection == 3){
              System.out.println("0.)   Leave Weaponry");
              
              if (swordOne == 1){
                System.out.println("1.)   Weak Wooden Sword - Owned");
                
              }else if (swordOne == 0){
                
                System.out.println("1.)   Weak Wooden Sword - 0 Gold");
              }
              
              if (swordTwo == 1){
                System.out.println("2.)   Strong Wooden Sword - Owned");
                
              }else if (swordTwo == 0 && swordOne == 1){
                
                System.out.println("2.)   Strong Wooden Sword - 50 Gold");
                
              }else if (swordTwo == 0 && swordOne == 0){
                System.out.println("2.)   Oberon's Blade - LOCKED");
              }
              
              
              
              if (swordThree == 1){
                System.out.println("3.)   Crumbling Stone Sword - Owned");
                
              }else if (swordThree == 0 && swordTwo == 1){
                
                System.out.println("3.)   Crumbling Stone Sword - 150 Gold");
                
              }else if (swordThree == 0 && swordTwo == 0){
                System.out.println("3.)   Oberon's Blade - LOCKED");
              }
              
              if (swordFour == 1){
                System.out.println("4.)   Strong Stone Sword - Owned");
                
              }else if (swordFour == 0 && swordThree == 1){
                
                System.out.println("4.)   Strong Stone Sword - 300 Gold");
                
              }else if (swordFour == 0 && swordThree == 0){
                System.out.println("4.)   Strong Stone Sword - LOCKED");
              }
              
              
              
              if (swordFive == 1){
                System.out.println("5.)   Apprentice Knight's Sword - Owned");
                
              }else if (swordFive == 0 && swordFour == 1){
                
                System.out.println("5.)   Apprentice Knight's Sword - 450 Gold");
                
              }else if (swordFive == 0 && swordFour == 0){
                System.out.println("5.)   Apprentice Knight's Sword - LOCKED");
              }
              
              
              
              if (swordSix == 1){
                System.out.println("6.)   Elven Sword - Owned");
                
              }else if (swordSix == 0 && swordFive == 1){
                
                System.out.println("6.)   Elven Sword - 600 Gold");
                
              }else if (swordSix == 0 && swordFive == 0){
                System.out.println("6.)   Elven Sword - LOCKED");
              }
              
              
              
              if (swordSeven == 1){
                System.out.println("7.)   Apprentice Pirate's Cutlass - Owned");
                
              }else if (swordSeven == 0 && swordSix == 1){
                
                System.out.println("7.)   Apprentice Pirate's Cutlass - 750 Gold");
                
              }else if (swordSeven == 0 && swordSix == 0){
                System.out.println("7.)   Apprentice Pirate's Cutlass - LOCKED");
              }
              
              
              
              if (swordEight == 1){
                System.out.println("8.)   Knight's Blade - Owned");
                
              }else if (swordEight == 0 && swordSeven == 1){
                
                System.out.println("8.)   Knight's Blade - 900 Gold");
                
              }else if (swordEight == 0 && swordSeven == 0){
                System.out.println("8.)   Knight's Blade - LOCKED");
              }
              
              
              
              if (swordNine == 1){
                System.out.println("9.)   Troll Longsword - Owned");
                
              }else if (swordNine == 0 && swordEight == 1){
                
                System.out.println("9.)   Troll Longsword - 1050 Gold");
                
              }else if (swordNine == 0 && swordEight == 0){
                System.out.println("9.)   Troll Longsword - LOCKED");
              }
              
              
              
              if (swordTen == 1){
                System.out.println("10.)  Knight Captain's Blade - Owned");
                
              }else if (swordTen == 0 && swordNine == 1){
                
                System.out.println("10.)  Knight Captain's Blade - 1200 Gold");
                
              }else if (swordTen == 0 && swordNine == 0){
                System.out.println("10.)  Knight Captain's Blade - LOCKED");
              }
              
              
              
              if (swordEleven == 1){
                System.out.println("11.)  Royal Knight's Excalibur - Owned");
                
              }else if (swordEleven == 0 && swordTen == 1){
                
                System.out.println("11.)  Royal Knight's Excalibur - 1350 Gold");
                
              }else if (swordEleven == 0 && swordTen == 0){
                System.out.println("11.)  Royal Knight's Excalibur - LOCKED");
              }
              
              
              
              if (swordTwelve == 1){
                System.out.println("12.)  Black Beard's Cutlass - Owned");
                
              }else if (swordTwelve == 0 && swordEleven == 1){
                
                System.out.println("12.)  Black Beard's Cutlass - 1500 Gold");
                
              }else if (swordTwelve == 0 && swordEleven == 0){
                System.out.println("12.)  Black Beard's Cutlass - LOCKED");
              }
              
              
              
              
              if (swordThirteen == 1){
                System.out.println("13.)  Davy Jone's Sword - Owned");
                
              }else if (swordThirteen == 0 && swordTwelve == 1){
                
                System.out.println("13.)  Davy Jone's Sword - 1650 Gold");
              }else if (swordThirteen == 0 && swordTwelve == 0){
                System.out.println("15.)  Davy Jone's Sword - LOCKED");
              }
              
              
              
              if (swordFourteen == 1){
                System.out.println("14.)  Oberon's Blade - Owned");
                
              }else if (swordFourteen == 0 && swordThirteen == 1){
                
                System.out.println("14.)  Oberon's Blade - 1800 Gold");
                
              }else if (swordFourteen == 0 && swordThirteen == 0){
                System.out.println("14.)  Oberon's Blade - LOCKED");
              }
              
              
              
              if (swordFifteen == 1){
                System.out.println("15.)  World Tree Sword - Owned\n");
                
              }else if (swordFifteen == 0 && swordFourteen == 1){
                
                System.out.println("15.)  World Tree Sword - 2000 Gold\n");
                
              }else if (swordFifteen == 0 && swordFourteen == 0){
                System.out.println("15.)  World Tree Sword - LOCKED\n");
              }
              
              System.out.println("\nSelect a choice: ");
              
              int classOneWeaponryLoop = 1;
              while (classOneWeaponryLoop == 1){
                
                int classOneWeaponryShopAction = Integer.parseInt(sc.nextLine());
                
                if (classOneWeaponryShopAction == 0){
                  classOneWeaponryLoop = 0;
                  
                }else if (classOneWeaponryShopAction == 1){
                  
                  if (swordOne == 1){
                    System.out.println("\n\n" + plrName + ".. You already have this weapon..\n\n *Cannot buy weapon, reason: Owned.\n\n");
                    classOneWeaponryLoop = 0;
                    
                  }else if (swordOne == 0){
                    System.out.println("\n\nCongratulation, " + plrName + " you now own, 'Weak Wooden Sword'!\n\n");
                    swordOne = 1;
                    classOneWeaponryLoop = 0;
                  }
                }else if (classOneWeaponryShopAction == 2){
                  
                  if (swordOne == 0){
                    System.out.println("*You must buy the previous item before you can buy this item!*\n\n");
                    classOneWeaponryLoop = 0;
                    
                  }else if (swordOne == 1){
                    if (goldClassOne >= 50){
                      System.out.println("\n\nCongratulation, " + plrName + " you now own, 'Strong Wooden Sword'!\n\n");
                      swordTwo = 1;
                      goldClassOne -= 50;
                      classOneWeaponryLoop = 0;
                      
                    }else if (goldClassOne < 50){
                      System.out.println("\n\n" + plrName + ", you do not have enough gold for this.\n\n");
                      classOneWeaponryLoop = 0;
                    }
                  }
                }else if (classOneWeaponryShopAction == 3){
                  
                  if (swordTwo == 0){
                    System.out.println("*You must buy the previous item before you can buy this item!*\n\n");
                    
                  }else if (swordTwo == 1){
                    if (goldClassOne >= 150){
                      System.out.println("\n\nCongratulation, " + plrName + " you now own, 'Crumbling Stone Sword'!\n\n");
                      swordThree = 1;
                      goldClassOne -= 150;
                      classOneWeaponryLoop = 0;
                      
                    }else if (goldClassOne < 150){
                      System.out.println("\n\n" + plrName + ", you do not have enough gold for this.\n\n");
                      classOneWeaponryLoop = 0;
                      
                    }    
                  }
                  
                }else if (classOneWeaponryShopAction == 4){
                  
                  if (swordThree == 0){
                    System.out.println("*You must buy the previous item before you can buy this item!*\n\n");
                    classOneWeaponryLoop = 0;
                    
                  }else if (swordThree == 1){
                    if (goldClassOne >= 300){
                      System.out.println("\n\nCongratulation, " + plrName + " you now own, 'Strong Stone Sword'!\n\n");
                      swordFour = 1;
                      goldClassOne -= 300;
                      classOneWeaponryLoop = 0;
                      
                    }else if (goldClassOne < 300){
                      System.out.println("\n\n" + plrName + ", you do not have enough gold for this.\n\n");
                      classOneWeaponryLoop = 0;
                    }    
                  }
                  
                }else if (classOneWeaponryShopAction == 5){
                  
                  if (swordFour == 0){
                    System.out.println("*You must buy the previous item before you can buy this item!*\n\n");
                    classOneWeaponryLoop = 0;
                    
                  }else if (swordFour == 1){
                    if (goldClassOne >= 450){
                      System.out.println("\n\nCongratulation, " + plrName + " you now own, 'Apprentice Knight's Sword'!\n\n");
                      swordFive = 1;
                      goldClassOne -= 450;
                      classOneWeaponryLoop = 0;
                      
                    }else if (goldClassOne < 450){
                      System.out.println("\n\n" + plrName + ", you do not have enough gold for this.\n\n");
                      classOneWeaponryLoop = 0;
                    }    
                  }
                  
                }else if (classOneWeaponryShopAction == 6){
                  
                  if (swordFive == 0){
                    System.out.println("*You must buy the previous item before you can buy this item!*\n\n");
                    classOneWeaponryLoop = 0;
                    
                  }else if (swordFive == 1){
                    if (goldClassOne >= 600){
                      System.out.println("\n\nCongratulation, " + plrName + " you now own, 'Elven Sword'!\n\n");
                      swordSix = 1;
                      goldClassOne -= 600;
                      classOneWeaponryLoop = 0;
                      
                    }else if (goldClassOne < 600){
                      System.out.println("\n\n" + plrName + ", you do not have enough gold for this.\n\n");
                      classOneWeaponryLoop = 0;
                    }    
                  }
                  
                }else if (classOneWeaponryShopAction == 7){
                  
                  if (swordSix == 0){
                    System.out.println("*You must buy the previous item before you can buy this item!*\n\n");
                    
                  }else if (swordSix == 1){
                    if (goldClassOne >= 750){
                      System.out.println("\n\nCongratulation, " + plrName + " you now own, 'Apprentice Pirate's Cutlass'!\n\n");
                      swordSeven = 1;
                      goldClassOne -= 750;
                      classOneWeaponryLoop = 0;
                      
                    }else if (goldClassOne < 750){
                      System.out.println("\n\n" + plrName + ", you do not have enough gold for this.\n\n");
                      classOneWeaponryLoop = 0;
                    }    
                  }
                  
                }else if (classOneWeaponryShopAction == 8){
                  
                  if (swordSeven == 0){
                    System.out.println("*You must buy the previous item before you can buy this item!*\n\n");
                    classOneWeaponryLoop = 0;
                    
                  }else if (swordSeven == 1){
                    if (goldClassOne >= 900){
                      System.out.println("\n\nCongratulation, " + plrName + " you now own, 'Knight's Blade'!\n\n");
                      swordEight = 1;
                      goldClassOne -= 900;
                      classOneWeaponryLoop = 0;
                      
                    }else if (goldClassOne < 900){
                      System.out.println("\n\n" + plrName + ", you do not have enough gold for this.\n\n");
                      classOneWeaponryLoop = 0;
                    }    
                  }
                  
                }else if (classOneWeaponryShopAction == 9){
                  
                  if (swordEight == 0){
                    System.out.println("*You must buy the previous item before you can buy this item!*\n\n");
                    classOneWeaponryLoop = 0;
                    
                  }else if (swordEight == 1){
                    if (goldClassOne >= 1050){
                      System.out.println("\n\nCongratulation, " + plrName + " you now own, 'Troll Longsword'!\n\n");
                      swordNine = 1;
                      goldClassOne -= 1050;
                      classOneWeaponryLoop = 0;
                      
                    }else if (goldClassOne < 1050){
                      System.out.println("\n\n" + plrName + ", you do not have enough gold for this.\n\n");
                      classOneWeaponryLoop = 0;
                    }    
                  }
                  
                }else if (classOneWeaponryShopAction == 10){
                  
                  if (swordNine == 0){
                    System.out.println("*You must buy the previous item before you can buy this item!*\n\n");
                    classOneWeaponryLoop = 0;
                    
                  }else if (swordNine == 1){
                    if (goldClassOne >= 1200){
                      System.out.println("\n\nCongratulation, " + plrName + " you now own, 'Knight Captain's Blade'!\n\n");
                      swordTen = 1;
                      goldClassOne -= 1200;
                      classOneWeaponryLoop = 0;
                      
                    }else if (goldClassOne < 1200){
                      System.out.println("\n\n" + plrName + ", you do not have enough gold for this.\n\n");
                      classOneWeaponryLoop = 0;
                    }    
                  }
                  
                }else if (classOneWeaponryShopAction == 11){
                  
                  if (swordTen == 0){
                    System.out.println("*You must buy the previous item before you can buy this item!*\n\n");
                    classOneWeaponryLoop = 0;
                    
                  }else if (swordTen == 1){
                    if (goldClassOne >= 1350){
                      System.out.println("\n\nCongratulation, " + plrName + " you now own, 'Royal Knight's Excalibur'!\n\n");
                      swordEleven = 1;
                      goldClassOne -= 1350;
                      classOneWeaponryLoop = 0;
                      
                    }else if (goldClassOne < 1350){
                      System.out.println("\n\n" + plrName + ", you do not have enough gold for this.\n\n");
                      classOneWeaponryLoop = 0;
                    }    
                  }
                  
                }else if (classOneWeaponryShopAction == 12){
                  
                  if (swordEleven == 0){
                    System.out.println("*You must buy the previous item before you can buy this item!*\n\n");
                    classOneWeaponryLoop = 0;
                    
                  }else if (swordEleven == 1){
                    if (goldClassOne >= 1500){
                      System.out.println("\n\nCongratulation, " + plrName + " you now own, 'Black Beard's Cutlass'!\n\n");
                      swordTwelve = 1;
                      goldClassOne -= 1500;
                      classOneWeaponryLoop = 0;
                      
                    }else if (goldClassOne < 1500){
                      System.out.println("\n\n" + plrName + ", you do not have enough gold for this.\n\n");
                      classOneWeaponryLoop = 0;
                    }    
                  }
                  
                }else if (classOneWeaponryShopAction == 13){
                  
                  if (swordTwelve == 0){
                    System.out.println("*You must buy the previous item before you can buy this item!*\n\n");
                    classOneWeaponryLoop = 0;
                    
                  }else if (swordTwelve == 1){
                    if (goldClassOne >= 1650){
                      System.out.println("\n\nCongratulation, " + plrName + " you now own, 'Davy Jone's Sword'!\n\n");
                      swordThirteen = 1;
                      goldClassOne -= 1650;
                      classOneWeaponryLoop = 0;
                      
                    }else if (goldClassOne < 1650){
                      System.out.println("\n\n" + plrName + ", you do not have enough gold for this.\n\n");
                      classOneWeaponryLoop = 0;
                    }    
                  }
                  
                }else if (classOneWeaponryShopAction == 14){
                  
                  if (swordThirteen == 0){
                    System.out.println("*You must buy the previous item before you can buy this item!*\n\n");
                    classOneWeaponryLoop = 0;
                    
                  }else if (swordThirteen == 1){
                    if (goldClassOne >= 1800){
                      System.out.println("\n\nCongratulation, " + plrName + " you now own, 'Oberon's Blade!\n\n");
                      swordFourteen = 1;
                      goldClassOne -= 1800;
                      classOneWeaponryLoop = 0;
                      
                    }else if (goldClassOne < 1800){
                      System.out.println("\n\n" + plrName + ", you do not have enough gold for this.\n\n");
                      classOneWeaponryLoop = 0;
                    }    
                  }
                  
                }else if (classOneWeaponryShopAction == 15){
                  
                  if (swordFourteen == 0){
                    System.out.println("*You must buy the previous item before you can buy this item!*\n\n");
                    classOneWeaponryLoop = 0;
                    
                  }else if (swordFourteen == 1){
                    if (goldClassOne >= 2000){
                      System.out.println("\n\nCongratulation, " + plrName + " you now own, 'World Tree Sword'!\n\n");
                      swordFifteen = 1;
                      goldClassOne -= 2000;
                      classOneWeaponryLoop = 0;
                      
                    }else if (goldClassOne < 2000){
                      System.out.println("\n\n" + plrName + ", you do not have enough gold for this.\n\n");
                      classOneWeaponryLoop = 0;
                    }    
                  }
                }else if (classOneWeaponryShopAction >15){
                  System.out.println("\n\n*Invalid Response, reason: Weapon does not exist!*\n\n");
                  classOneWeaponryLoop = 0;
                }
              }
            }
          }
         
         
        //Opens the player's inventory menup
        }else if(classOneAction == 2){
          System.out.println("\n*Opening Inventory*\n");
         
          int classOneInventoryLoop = 1;
          while (classOneInventoryLoop == 1){
            System.out.println("====                     ====");
            System.out.println(" || INVENTORY ACTION MENU ||");
            System.out.println("====                     ====\n\n");
            System.out.println("Your Weapons:\n");
           
            //Sword One Inventory Slot
            if (swordOne == 1){
              System.out.println("1.)  Weak Wooden Sword: x" + swordOne);
            }else if (swordOne == 0){
              System.out.println(" ");
            }
           
            //Sowrd Two Inventory Slot
            if (swordTwo == 1){
              System.out.println("2.)  Strong Wooden Sword: x" + swordTwo);
            }else if (swordTwo == 0){
              System.out.println(" ");
            }
           
            //Sword Three Inventory Slot
            if (swordThree == 1){
              System.out.println("3.)  Crumbling Stone Sword: x" + swordThree);
            }else if (swordThree == 0){
              System.out.println(" ");
            }
           
            //Sword Four Inventory Slot
            if (swordFour == 1){
              System.out.println("4.)  Stong Stone Sword: x" + swordFour);
            }else if (swordFour == 0){
              System.out.println(" ");
            }
           
            //Sword Five Inventory Slot
            if (swordFive == 1){
              System.out.println("5.)  Apprentice Knight's Sword: x" + swordFive);
            }else if (swordFive == 0){
              System.out.println(" ");
            }
           
            //Sword Six Inventory Slot
            if (swordSix == 1){
              System.out.println("6.)  Elven Sword: x" + swordSix);
            }else if (swordSix == 0){
              System.out.println(" ");
            }
           
            //Sword Seven Inventory Slot
            if (swordSeven == 1){
              System.out.println("7.)  Apprentice Pirate's Cutlass: x" + swordSeven);
            }else if (swordSeven == 0){
              System.out.println(" ");
            }
           
            //Sword Eight Inventory Slot
            if (swordEight == 1){
              System.out.println("8.)  Knight's Blade: x" + swordEight);
            }else if (swordEight == 0){
              System.out.println(" ");
            }
           
            //Sword Nine Inventory Slot
            if (swordNine == 1){
              System.out.println("9.)  Troll Longsword: x" + swordNine);
            }else if (swordNine == 0){
              System.out.println(" ");
            }
           
            //Sword Ten Inventory Slot
            if (swordTen == 1){
              System.out.println("10.)  Knight Captain's Blade: x" + swordTen);
            }else if (swordTen == 0){
              System.out.println(" ");
            }
           
            //Sword Elevel Inventory Slot
            if (swordEleven == 1){
              System.out.println("11.)  Royal Knight's Excalibur: x" + swordEleven);
            }else if (swordEleven == 0){
              System.out.println(" ");
            }
           
            //Sword Twelve Inventory Slot
            if (swordTwelve == 1){
              System.out.println("12.)  Black Beard's Cutlass: x" + swordTwelve);
            }else if (swordEleven == 0){
              System.out.println(" ");
            }
           
            //Sword Thirteen Inventory Slot
            if (swordThirteen == 1){
              System.out.println("13.) Davy Jone's Sword: x" + swordThirteen);
            }else if (swordThirteen == 0){
              System.out.println(" ");
            }
           
            //Sword Fourteen Inventory Slot
            if (swordFourteen == 1){
              System.out.println("14.)  Oberon's Blade x" + swordFourteen);
            }else if (swordFourteen == 0){
              System.out.println(" ");
            }
           
            //Sword Fifteen Inventory Slot
            if (swordFifteen == 1){
              System.out.println("15.)  World Tree Sword x" + swordFifteen);
            }else if (swordFifteen == 0){
              System.out.println(" ");
            }
           
            System.out.println("\nOther Items:\n");
            System.out.println("16.) Potions: " + classOnePotions + "/" + classOneMaxPotions + "\n");
           
            System.out.println("\n------- OPTIONS ------\n");
            System.out.println("0.)  Close Inventory");
            System.out.println("1.)  Equip a weapon");
            System.out.println("2.)  Use an item\n");
            System.out.println("Select an option: ");
           
            int classOneInventorySelection = Integer.parseInt(sc.nextLine());
            if (classOneInventorySelection == 0){
              
              classOneInventoryLoop = 0;
              
            }else if (classOneInventorySelection == 1){
              
              int classOneWeaponEquip = 1;
              while (classOneWeaponEquip == 1){
                System.out.println("\n------- WEAPON EQUIP ------\n");
                System.out.println("0.) Leave Weapon Equip.\n");
                System.out.println("Select a weapon to equip: ");
                int equipSword = Integer.parseInt(sc.nextLine());
                System.out.println("Select a choice: ");
               
                if (equipSword == 1 && swordOne == 1){
                  if (equipSword == weaponEquippedClassOne){
                    System.out.println("\n" + plrName + ".. You already have this weapon equipped..\n");
                   
                  }else if (equipSword != weaponEquippedClassOne){
                    weaponEquippedClassOne = equipSword;
                    System.out.println("\nAwesome! " + plrName + ", you just equipped: 'Weak Wooden Sword'!\n");
                  }
                }else if (equipSword == 1 && swordOne == 0){
                  System.out.println("\n" + plrName + ".. You do not own this weapon..\n");
                 
                }else if (equipSword == 2 && swordTwo == 1){
                  if (equipSword == weaponEquippedClassOne){
                    System.out.println("\n" + plrName + ".. You already have this weapon equipped..\n");
                   
                  }else if (equipSword != weaponEquippedClassOne){
                    weaponEquippedClassOne = equipSword;
                    System.out.println("\nAwesome! " + plrName + ", you just equipped: 'Strong Wooden Sword'!\n");
                  }
                 
                }else if (equipSword == 2 && swordTwo == 0){
                  System.out.println("\n" + plrName + ".. You do not own this weapon..\n");
                 
                }else if (equipSword == 3 && swordThree == 1){
                  if (equipSword == weaponEquippedClassOne){
                    System.out.println("\n" + plrName + ".. You already have this weapon equipped..\n");
                   
                  }else if (equipSword != weaponEquippedClassOne){
                    weaponEquippedClassOne = equipSword;
                    System.out.println("\nAwesome! " + plrName + ", you just equipped: 'Crumbling Stone Sword'!\n");
                  }
                 
                }else if (equipSword == 3 && swordThree == 0){
                  System.out.println("\n" + plrName + ".. You do not own this weapon..\n");
                 
                }else if (equipSword == 4 && swordFour == 1){
                  if (equipSword == weaponEquippedClassOne){
                    System.out.println("\n" + plrName + ".. You already have this weapon equipped..\n");
                   
                  }else if (equipSword != weaponEquippedClassOne){
                    weaponEquippedClassOne = equipSword;
                    System.out.println("\nAwesome! " + plrName + ", you just equipped: 'Strong Stone Sword'!\n");
                  }
                 
                }else if (equipSword == 4 && swordFour == 0){
                  System.out.println("\n" + plrName + ".. You do not own this weapon..\n");
                 
                }else if (equipSword == 5 && swordFive == 1){
                  if (equipSword == weaponEquippedClassOne){
                    System.out.println("\n" + plrName + ".. You already have this weapon equipped..\n");
                   
                  }else if (equipSword != weaponEquippedClassOne){
                    weaponEquippedClassOne = equipSword;
                    System.out.println("\nAwesome! " + plrName + ", you just equipped: 'Apprencice Knight's Sword'!\n");
                  }
                 
                }else if (equipSword == 5 && swordFive == 0){
                  System.out.println("\n" + plrName + ".. You do not own this weapon..\n");
                 
                }else if (equipSword == 6 && swordSix == 1){
                  if (equipSword == weaponEquippedClassOne){
                    System.out.println("\n" + plrName + ".. You already have this weapon equipped..\n");
                   
                  }else if (equipSword != weaponEquippedClassOne){
                    weaponEquippedClassOne = equipSword;
                    System.out.println("\nAwesome! " + plrName + ", you just equipped: 'Elven Sword'!\n");
                  }
                 
                }else if (equipSword == 6 && swordSix == 0){
                  System.out.println("\n" + plrName + ".. You do not own this weapon..\n");
                 
                }else if (equipSword == 7 && swordSeven == 1){
                  if (equipSword == weaponEquippedClassOne){
                    System.out.println("\n" + plrName + ".. You already have this weapon equipped..\n");
                   
                  }else if (equipSword != weaponEquippedClassOne){
                    weaponEquippedClassOne = equipSword;
                    System.out.println("\nAwesome! " + plrName + ", you just equipped: 'Apprentice Pirate's Cutlass!\n");
                  }
                 
                }else if (equipSword == 7 && swordSeven == 0){
                  System.out.println("\n" + plrName + ".. You do not own this weapon..\n");
                 
                }else if (equipSword == 8 && swordEight == 1){
                  if (equipSword == weaponEquippedClassOne){
                    System.out.println("\n" + plrName + ".. You already have this weapon equipped..\n");
                   
                  }else if (equipSword != weaponEquippedClassOne){
                    weaponEquippedClassOne = equipSword;
                    System.out.println("\nAwesome! " + plrName + ", you just equipped: 'Knight's Blade'!\n");
                  }
                 
                }else if (equipSword == 8 && swordEight == 0){
                  System.out.println("\n" + plrName + ".. You do not own this weapon..\n");
                 
                }else if (equipSword == 9 && swordNine == 1){
                  if (equipSword == weaponEquippedClassOne){
                    System.out.println("\n" + plrName + ".. You already have this weapon equipped..\n");
                   
                  }else if (equipSword != weaponEquippedClassOne){
                    weaponEquippedClassOne = equipSword;
                    System.out.println("\nAwesome! " + plrName + ", you just equipped: 'Troll Longsword'!\n");
                  }
                 
                }else if (equipSword == 9 && swordNine == 0){
                  System.out.println("\n" + plrName + ".. You do not own this weapon..\n");
                 
                }else if (equipSword == 10 && swordTen == 1){
                  if (equipSword == weaponEquippedClassOne){
                    System.out.println("\n" + plrName + ".. You already have this weapon equipped..\n");
                   
                  }else if (equipSword != weaponEquippedClassOne){
                    weaponEquippedClassOne = equipSword;
                    System.out.println("\nAwesome! " + plrName + ", you just equipped: 'Knight Captain's Blade'!\n");
                  }
                 
                }else if (equipSword == 10 && swordTen == 0){
                  System.out.println("\n" + plrName + ".. You do not own this weapon..\n");
                 
                }else if (equipSword == 11 && swordEleven == 1){
                  if (equipSword == weaponEquippedClassOne){
                    System.out.println("\n" + plrName + ".. You already have this weapon equipped..\n");
                   
                  }else if (equipSword != weaponEquippedClassOne){
                    weaponEquippedClassOne = equipSword;
                    System.out.println("\nAwesome! " + plrName + ", you just equipped: 'Royal Knight's Excalibur!\n");
                  }
                 
                }else if (equipSword == 11 && swordEleven == 0){
                  System.out.println("\n" + plrName + ".. You do not own this weapon..\n");
                 
                }else if (equipSword == 12 && swordTwelve == 1){
                  if (equipSword == weaponEquippedClassOne){
                    System.out.println("\n" + plrName + ".. You already have this weapon equipped..\n");
                   
                  }else if (equipSword != weaponEquippedClassOne){
                    weaponEquippedClassOne = equipSword;
                    System.out.println("\nAwesome! " + plrName + ", you just equipped: 'Black Beard's Cutlass'!\n");
                  }
                 
                }else if (equipSword == 12 && swordTwelve == 0){
                  System.out.println("\n" + plrName + ".. You do not own this weapon..\n");
                 
                }else if (equipSword == 13 && swordThirteen == 1){
                  if (equipSword == weaponEquippedClassOne){
                    System.out.println("\n" + plrName + ".. You already have this weapon equipped..\n");
                   
                  }else if (equipSword != weaponEquippedClassOne){
                    weaponEquippedClassOne = equipSword;
                    System.out.println("\nAwesome! " + plrName + ", you just equipped: 'Davy Jone's Sword'!\n");
                  }
                 
                }else if (equipSword == 13 && swordThirteen == 0){
                  System.out.println("\n" + plrName + ".. You do not own this weapon..\n");
                 
                }else if (equipSword == 14 && swordFourteen == 1){
                  if (equipSword == weaponEquippedClassOne){
                    System.out.println("\n" + plrName + ".. You already have this weapon equipped..\n");
                   
                  }else if (equipSword != weaponEquippedClassOne){
                    weaponEquippedClassOne = equipSword;
                    System.out.println("\nAwesome! " + plrName + ", you just equipped: 'Oberon's Blade'!\n");
                  }
                 
                }else if (equipSword == 14 && swordFourteen == 0){
                  System.out.println("\n" + plrName + ".. You do not own this weapon..\n");
                 
                }else if (equipSword == 15 && swordFifteen == 1){
                  if (equipSword == weaponEquippedClassOne){
                    System.out.println("\n" + plrName + ".. You already have this weapon equipped..\n");
                   
                  }else if (equipSword != weaponEquippedClassOne){
                    weaponEquippedClassOne = equipSword;
                    System.out.println("\nAwesome! " + plrName + ", you just equipped: 'World Tree Sword!\n");
                  }
                 
                }else if (equipSword == 15 && swordFifteen == 0){
                  System.out.println("\n" + plrName + ".. You do not own this weapon..\n");
                 
                }else if (equipSword > 15){
                  System.out.println("\n" + plrName + ".. This weapon does not exist..\n");
                 
                }else if (equipSword == 0){
                  classOneWeaponEquip = 0; 
                }
              }
            }
          }
         
        //Opens the player's dungeon menu
        }else if(classOneAction == 3){
          System.out.println("\nYou have arrived at the dungeon!\n");
          int classOneDungeonCrawl = 1;
          while (classOneDungeonCrawl == 1){
            System.out.println("====                   ====");
            System.out.println(" || DUNGEON ACTION MENU ||");
            System.out.println("====                   ====\n\n");
            System.out.println("\n----------- MOB BATTLES ----------\n");
            System.out.println("0.)  Leave Dungeon");
            System.out.println("1.)  Level 1: Slime");
            System.out.println("2.)  Level 3: Weak Skeleton");
            System.out.println("3.)  Level 5: Ant");
            System.out.println("4.)  Level 10: Spider");
            System.out.println("5.)  Level 15: Centipede");
            System.out.println("6.)  Level 20: Bandit");
            System.out.println("7.)  Level 28: Strong Skeleton");
            System.out.println("8.)  Level 36: Mutant Dog");
            System.out.println("9.)  Level 42: Apprentice Pirate");
            System.out.println("10.) Level 46: Nymph");
            System.out.println("11.) Level 50: Pirate Captain");
            System.out.println("12.) Level 62: Centaur");
            System.out.println("13.) Level 70: Tree Ent\n");
            System.out.println("\n----------- BOSS BATTLES ----------\n");
            System.out.println("14.) Level 70: Cerberus");
            System.out.println("15.) Level 95: Harpy");
            System.out.println("16.) Level 145: Hydra");
            System.out.println("17.) Level 190: Kraken");
            System.out.println("18.) Level 275: Oberon: The Fairy King");
            System.out.println("19.) Level 390: Hades: Lord of The Underworld");
            System.out.println("20.) Level 615: Herculese");
            System.out.println("Select a battle: ");
           
            //Use selection for dungeon
            int classOneDungeonAction = Integer.parseInt(sc.nextLine());
         
            //Variable to leave the dungeon
            if (classOneDungeonAction == 0){
              classOneDungeonCrawl = 0;
              System.out.println("\n\n*Leaving the Dungeon*\n\n");
             
            }else if (classOneDungeonAction == 1){
              System.out.println("*You have chosen to fight*\n\nYour opponent: Slime\n");
             
              //Slime Variables Class One
              int classOneSlimeBattle = 1;
              //Slime Health
              int slimeHealthClassOne = 25;
              int slimeMaxHealthClassOne = 25;
             
              classOneInBattle = true;
              if (classOneSlimeBattle == 1 && classOneInBattle == true){
               
               
                //Slime battle loop
                while (classOneSlimeBattle == 1 && classOneInBattle == true){
                 
                  //Slime Max Attack Damage
                  int slimeDamageClassOne = 8;
                  int plrDamageClassOne = 0;
                 
                  if (weaponEquippedClassOne == 1){
                    plrDamageClassOne = 5 + classOneCurrentLevel;
                  }else if (weaponEquippedClassOne == 2){
                    plrDamageClassOne = 7 + classOneCurrentLevel;
                  }else if (weaponEquippedClassOne == 3){
                    plrDamageClassOne = 10 + classOneCurrentLevel;
                  }else if (weaponEquippedClassOne == 4){
                    plrDamageClassOne = 14 + classOneCurrentLevel;
                  }else if (weaponEquippedClassOne == 5){
                    plrDamageClassOne = 18 + classOneCurrentLevel;
                  }else if (weaponEquippedClassOne == 6){
                    plrDamageClassOne = 23 * classOneCurrentLevel;
                  }else if (weaponEquippedClassOne == 7){
                    plrDamageClassOne = 28 * classOneCurrentLevel;
                  }else if (weaponEquippedClassOne == 8){
                    plrDamageClassOne = 37 * classOneCurrentLevel;
                  }else if (weaponEquippedClassOne == 9){
                    plrDamageClassOne = 50 * classOneCurrentLevel;
                  }else if (weaponEquippedClassOne == 10){
                    plrDamageClassOne = 62 * classOneCurrentLevel;
                  }else if (weaponEquippedClassOne == 11){
                    plrDamageClassOne = 115 * classOneCurrentLevel;
                  }else if (weaponEquippedClassOne == 12){
                    plrDamageClassOne = 135 * classOneCurrentLevel;
                  }else if (weaponEquippedClassOne == 13){
                    plrDamageClassOne = 150 * classOneCurrentLevel;
                  }else if (weaponEquippedClassOne == 14){
                    plrDamageClassOne = 250 * classOneCurrentLevel;
                  }else if (weaponEquippedClassOne == 15){
                    plrDamageClassOne = 350 * classOneCurrentLevel;
                  }
                 
                  System.out.println("\n= = = = =  BATTLE MENU = = = = = \n");
                 
                  System.out.println("Player Health: " + plrHealthClassOne + "/" + maxHealthClassOne);
                  System.out.println("Slime Health: " + slimeHealthClassOne);
                  System.out.println("\n1.) Attack");
                  System.out.println("2.) Use Potion: " + classOnePotions + "/" + classOneMaxPotions);
                  System.out.println("3.) Flee\n");
                  System.out.println("Select an action: ");
                  int classOneBattle1 = Integer.parseInt(sc.nextLine());
                 
                  int plrDamageRangeClassOne = (int)(Math.random()* plrDamageClassOne);
                  int slimeDamageRangeClassOne = (int)(Math.random()* slimeDamageClassOne);
                 
                  if (classOneBattle1 == 1){
                   
                    int classOneTotalDamage = plrDamageClassOne + classOneStrengthPoints;
                   
                    System.out.println("\n" + plrName + " Attacks Slime! " + plrName + " deals " + classOneTotalDamage + " damage!");
                    System.out.println("\nSlime attacks " + plrName + "! Slime deals " + slimeDamageClassOne + " damage!\n\n");
                    slimeHealthClassOne -= classOneTotalDamage;
                    plrHealthClassOne -= slimeDamageClassOne;
                    if (slimeHealthClassOne <= 0 && plrHealthClassOne > 0){
                      goldClassOne += 2;
                      experiencePointsClassOne += 2;
                      System.out.println("\n*The sky roars with thunder*\nCongratulations, " + plrName + ", you beat the level: 1 Slime!\n\nRewards:\n   Gold: +2\n   EXP:  +2\n");
                      classOneSlimeBattle = 0;
                      classOneInBattle = false;
                      classOneAction = 0;
                      classOneDungeonCrawl = 0;
                     
                    }else if (plrHealthClassOne <= 0 && slimeHealthClassOne > 0){
                      System.out.println("*The sky booms with thunder as if the heavens were laughing at you*\n\nThe heavens find it funny that you lost to your opponent. The heavens give you one gold coin and wish you well!\n\n");
                      slimeHealthClassOne = slimeMaxHealthClassOne;
                      classOneInBattle = false;
                      classOneAction = 0;
                      classOneDungeonCrawl = 0;
                      goldClassOne += 1;
                      if (plrHealthClassOne <= 0){
                        plrHealthClassOne = 0;
                      }
                     
                    }else if (plrHealthClassOne <= 0 && slimeHealthClassOne <= 0){
                      System.out.println("*The sky booms with thunder as if the heavens were laughing at you*\n\nThe heavens find it funny that the match was a draw. The heavens give you one gold coin and wish you well!\n\n");
                      classOneInBattle = false;
                      classOneAction = 0;
                      classOneDungeonCrawl = 0;
                      goldClassOne += 1;
                      if (plrHealthClassOne <= 0){
                        plrHealthClassOne = 0;
                      }
                     
                    }
                   
                   
                  }else if (classOneBattle1 == 2){
                    if (classOnePotions > 0){
                      if (plrHealthClassOne >= maxHealthClassOne){
                        System.out.println("\nHealing unavailable, your health is at max!\n");
                       
                      }else if (plrHealthClassOne < maxHealthClassOne){
                        classOnePotions -= 1;
                        plrHealthClassOne += 15;
                        System.out.println("\n*The heavens shine down a warm ray of light which causes 15 points of your health to be recovered!*\n");
                        if (plrHealthClassOne >= maxHealthClassOne){
                          plrHealthClassOne = maxHealthClassOne;
                      }
                    }
                    }else if (classOnePotions <= 0){
                      classOnePotions = 0;
                      System.out.println("\nYou are out of potions!\n");
                    }
                   
                  }else if (classOneBattle1 == 3){
                    System.out.println("\n*The sky grows dark and flashes of lightning light the sky*\nYou have chosen to flee the battle, the heavens frown down apon you. \n\n");
                    classOneInBattle = false;
                    classOneAction = 0;
                    classOneDungeonCrawl = 0;
                  }
                }
              }
            }else if (classOneDungeonAction != 1){
              System.out.println("\n\n*Message from the dev:*\n\nDev: I hope you liked it!\n\nThis was for a school project that I went overboard on.\n\nI would have coded the rest but unfortunately, it was too much for my pc to handle..");
            }
          }
         
        //Opens the player's Upgrade menu
        }else if(classOneAction == 4){
          System.out.println("\n*Opening Stats Upgrade(s)*\n");
          int classOneStatsUpgradesLoop = 1;
          while (classOneStatsUpgradesLoop == 1){
            System.out.println("====                    ====");
            System.out.println(" ||   STAT(S) UPGRADES   ||");
            System.out.println("====                    ====");
            System.out.println("Skill Point(s): " + classOneSkillPoints + "\n\n");
            System.out.println("0.)  Leave Stat(s) Upgrades");
           
            if (classOneMaxHealthUpgrade == 0){
             System.out.println("1.)  Increase Max Health +15: -1 Skill Point(s)");
            }else if (classOneMaxHealthUpgrade == 1){
              System.out.println("1.)  Increase Max Health +25: -3 Skill Point(s)");
            }else if (classOneMaxHealthUpgrade == 2){
              System.out.println("1.)  Increase Max Health +50: -8 Skill Point(s)");
            }else if (classOneMaxHealthUpgrade == 3){
              System.out.println("1.)  Increase Max Health +150: -15 Skill Point(s)");
            }else if (classOneMaxHealthUpgrade == 4){
              System.out.println("1.)  Increase Max Health +175: -30 Skill Point(s)");
            }else if (classOneMaxHealthUpgrade == 5){
              System.out.println("1.)  Increase Max Health +250: -55 Skill Point(s)");
            }else if (classOneMaxHealthUpgrade == 6){
              System.out.println("1.)  Increase Max Health +475: -80 Skill Point(s)");
            }else if (classOneMaxHealthUpgrade == 7){
              System.out.println("1.)  Increase Max Health +715: -160 Skill Point(s)");
            }else if (classOneMaxHealthUpgrade == 8){
              System.out.println("1.)  Increase Max Health +1265: -275 Skill Point(s)");
            }else if (classOneMaxHealthUpgrade == 9){
              System.out.println("1.)  Increase Max Health +1800: -500 Skill Point(s)");
            }else if (classOneMaxHealthUpgrade == 10){
              System.out.println("1.)  Increase Max Health +2000: -980 Skill Point(s)");
            }else if (classOneMaxHealthUpgrade == 11){
              System.out.println("1.)  Increase Max Health: MAX UPGRADES");
            }
           
            if (classOneStrengthUpgrade == 0){
             System.out.println("2.)  Increase Strength +15: -1 Skill Point(s)");
            }else if (classOneStrengthUpgrade == 1){
              System.out.println("2.)  Increase Strength +25: -3 Skill Point(s)");
            }else if (classOneStrengthUpgrade == 2){
              System.out.println("2.)  Increase Strength +50: -8 Skill Point(s)");
            }else if (classOneStrengthUpgrade == 3){
              System.out.println("2.)  Increase Strength +150: -15 Skill Point(s)");
            }else if (classOneStrengthUpgrade == 4){
              System.out.println("2.)  Increase Strength +175: -30 Skill Point(s)");
            }else if (classOneStrengthUpgrade == 5){
              System.out.println("2.)  Increase Strength +250: -55 Skill Point(s)");
            }else if (classOneStrengthUpgrade == 6){
              System.out.println("2.)  Increase Strength +475: -80 Skill Point(s)");
            }else if (classOneStrengthUpgrade == 7){
              System.out.println("2.)  Increase Strength +715: -160 Skill Point(s)");
            }else if (classOneStrengthUpgrade == 8){
              System.out.println("2.)  Increase Strength +1265: -275 Skill Point(s)");
            }else if (classOneStrengthUpgrade == 9){
              System.out.println("2.)  Increase Strength +1800: -500 Skill Point(s)");
            }else if (classOneStrengthUpgrade == 10){
              System.out.println("2.)  Increase Strength +1800: -980 Skill Point(s)");
            }else if (classOneMaxHealthUpgrade == 11){
              System.out.println("2.)  Increase Strength: MAX UPGRADES");
            }
           
            System.out.println("Select a choice: ");
            int classOneStatSelection = Integer.parseInt(sc.nextLine());
           
            if (classOneStatSelection == 1){
              if (classOneMaxHealthUpgrade == 0){
                if (classOneExperiencePointsNeededUpgradeOne == 1){
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("*You meditate and the heavens answer your call. They upgrade you maximum health!\n\n");
                    System.out.println("Previous Max Health: " + maxHealthClassOne);
                    maxHealthClassOne += 15;
                    System.out.println("New Max Health: " + maxHealthClassOne + "\n\n");
                    classOneMaxHealthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeOne = 3;
                   
                    System.out.println("\n\n" + classOneMaxHealthUpgrade);
                   
                    classOneSkillPoints -= 1;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
              }else if (classOneMaxHealthUpgrade == 1){
               
               
                if (classOneExperiencePointsNeededUpgradeOne == 3){
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("*You meditate and the heavens answer your call. The upgrade your maximum health!\n\n");
                    System.out.println("Previous Max Health: " + maxHealthClassOne);
                    maxHealthClassOne += 25;
                    System.out.println("New Max Health: " + maxHealthClassOne + "\n\n");
                    classOneMaxHealthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeOne = 8;
                   
                    classOneSkillPoints -= 3;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
              }else if (classOneMaxHealthUpgrade == 2){
               
                if (classOneExperiencePointsNeededUpgradeOne == 8){
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("*You meditate and the heavens answer your call. The upgrade your maximum health!\n\n");
                    System.out.println("Previous Max Health: " + maxHealthClassOne);
                    maxHealthClassOne += 50;
                    System.out.println("New Max Health: " + maxHealthClassOne + "\n\n");
                    classOneMaxHealthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeOne = 15;
                   
                    classOneSkillPoints -= 8;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
               
              }else if (classOneMaxHealthUpgrade == 3){
               
                if (classOneExperiencePointsNeededUpgradeOne == 15){
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("*You meditate and the heavens answer your call. The upgrade your maximum health!\n\n");
                    System.out.println("Previous Max Health: " + maxHealthClassOne);
                    maxHealthClassOne += 150;
                    System.out.println("New Max Health: " + maxHealthClassOne + "\n\n");
                    classOneMaxHealthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeOne = 30;
                   
                    classOneSkillPoints -= 15;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
               
              }else if (classOneMaxHealthUpgrade == 4){
               
                if (classOneExperiencePointsNeededUpgradeOne == 30){
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("*You meditate and the heavens answer your call. The upgrade your maximum health!\n\n");
                    System.out.println("Previous Max Health: " + maxHealthClassOne);
                    maxHealthClassOne += 175;
                    System.out.println("New Max Health: " + maxHealthClassOne + "\n\n");
                    classOneMaxHealthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeOne = 55;
                   
                    classOneSkillPoints -= 30;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
               
              }else if (classOneMaxHealthUpgrade == 5){
               
                if (classOneExperiencePointsNeededUpgradeOne == 55){
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("*You meditate and the heavens answer your call. The upgrade your maximum health!\n\n");
                    System.out.println("Previous Max Health: " + maxHealthClassOne);
                    maxHealthClassOne += 250;
                    System.out.println("New Max Health: " + maxHealthClassOne + "\n\n");
                    classOneMaxHealthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeOne = 80;
                   
                    classOneSkillPoints -= 55;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
               
              }else if (classOneMaxHealthUpgrade == 6){
               
                if (classOneExperiencePointsNeededUpgradeOne == 80){
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("*You meditate and the heavens answer your call. The upgrade your maximum health!\n\n");
                    System.out.println("Previous Max Health: " + maxHealthClassOne);
                    maxHealthClassOne += 475;
                    System.out.println("New Max Health: " + maxHealthClassOne + "\n\n");
                    classOneMaxHealthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeOne = 160;
                   
                    classOneSkillPoints -= 80;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
               
              }else if (classOneMaxHealthUpgrade == 7){
               
                if (classOneExperiencePointsNeededUpgradeOne == 160){
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("*You meditate and the heavens answer your call. The upgrade your maximum health!\n\n");
                    System.out.println("Previous Max Health: " + maxHealthClassOne);
                    maxHealthClassOne += 715;
                    System.out.println("New Max Health: " + maxHealthClassOne + "\n\n");
                    classOneMaxHealthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeOne = 275;
                   
                    classOneSkillPoints -= 160;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
               
              }else if (classOneMaxHealthUpgrade == 8){
               
                if (classOneExperiencePointsNeededUpgradeOne == 275){
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("*You meditate and the heavens answer your call. The upgrade your maximum health!\n\n");
                    System.out.println("Previous Max Health: " + maxHealthClassOne);
                    maxHealthClassOne += 1265;
                    System.out.println("New Max Health: " + maxHealthClassOne + "\n\n");
                    classOneMaxHealthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeOne = 500;
                   
                    classOneSkillPoints -= 275;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
               
              }else if (classOneMaxHealthUpgrade == 9){
               
                if (classOneExperiencePointsNeededUpgradeOne == 500){
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("*You meditate and the heavens answer your call. The upgrade your maximum health!\n\n");
                    System.out.println("Previous Max Health: " + maxHealthClassOne);
                    maxHealthClassOne += 1800;
                    System.out.println("New Max Health: " + maxHealthClassOne + "\n\n");
                    classOneMaxHealthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeOne = 980;
                   
                    classOneSkillPoints -= 500;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
               
              }else if (classOneMaxHealthUpgrade == 10){
               
                if (classOneExperiencePointsNeededUpgradeOne == 980){
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("*You meditate and the heavens answer your call. The upgrade your maximum health!\n\n");
                    System.out.println("Previous Max Health: " + maxHealthClassOne);
                    maxHealthClassOne += 2000;
                    System.out.println("New Max Health: " + maxHealthClassOne + "\n\n");
                    classOneMaxHealthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeOne = 999;
                   
                    classOneSkillPoints -= 980;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeOne){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }else if (classOneMaxHealthUpgrade == 11){
                  System.out.println("\n\n*Action Disallowed, Reason: Max Upgrades.*\n\n");
                }
               
              }
            }else if (classOneStatSelection == 2){
             
              if (classOneStrengthUpgrade == 0){
               
                if (classOneExperiencePointsNeededUpgradeTwo == 1){
                 
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("*You meditate and the heavens answer your call. They upgrade your strength!\n\n");
                    System.out.println("Previous Strength Point(s): " + classOneStrengthPoints);
                    classOneStrengthPoints += 15;
                    System.out.println("New Strength Point(s): " + classOneStrengthPoints + "\n\n");
                    classOneStrengthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeTwo = 3;
                    classOneSkillPoints -= 1;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
               
              }else if (classOneStrengthUpgrade == 1){
                if (classOneExperiencePointsNeededUpgradeTwo == 3){
                 
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("*You meditate and the heavens answer your call. They upgrade your strength!\n\n");
                    System.out.println("Previous Strength Point(s): " + classOneStrengthPoints);
                    classOneStrengthPoints += 25;
                    System.out.println("New Strength Point(s): " + classOneStrengthPoints + "\n\n");
                    classOneStrengthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeTwo = 8;
                    classOneSkillPoints -= 3;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
               
              }else if (classOneStrengthUpgrade == 2){
                if (classOneExperiencePointsNeededUpgradeTwo == 8){
                 
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("*You meditate and the heavens answer your call. They upgrade your strength!\n\n");
                    System.out.println("Previous Strength Point(s): " + classOneStrengthPoints);
                    classOneStrengthPoints += 50;
                    System.out.println("New Strength Point(s): " + classOneStrengthPoints + "\n\n");
                    classOneStrengthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeTwo = 15;
                    classOneSkillPoints -= 8;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
              }else if (classOneStrengthUpgrade == 3){
                if (classOneExperiencePointsNeededUpgradeTwo == 15){
                 
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("*You meditate and the heavens answer your call. They upgrade your strength!\n\n");
                    System.out.println("Previous Strength Point(s): " + classOneStrengthPoints);
                    classOneStrengthPoints += 150;
                    System.out.println("New Strength Point(s): " + classOneStrengthPoints + "\n\n");
                    classOneStrengthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeTwo = 30;
                    classOneSkillPoints -= 15;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
              }else if (classOneStrengthUpgrade == 4){
                if (classOneExperiencePointsNeededUpgradeTwo == 30){
                 
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("*You meditate and the heavens answer your call. They upgrade your strength!\n\n");
                    System.out.println("Previous Strength Point(s): " + classOneStrengthPoints);
                    classOneStrengthPoints += 175;
                    System.out.println("New Strength Point(s): " + classOneStrengthPoints + "\n\n");
                    classOneStrengthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeTwo = 55;
                    classOneSkillPoints -= 30;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
              }else if (classOneStrengthUpgrade == 5){
                if (classOneExperiencePointsNeededUpgradeTwo == 55){
                 
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("*You meditate and the heavens answer your call. They upgrade your strength!\n\n");
                    System.out.println("Previous Strength Point(s): " + classOneStrengthPoints);
                    classOneStrengthPoints += 250;
                    System.out.println("New Strength Point(s): " + classOneStrengthPoints + "\n\n");
                    classOneStrengthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeTwo = 80;
                    classOneSkillPoints -= 55;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
              }else if (classOneStrengthUpgrade == 6){
                if (classOneExperiencePointsNeededUpgradeTwo == 80){
                 
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("*You meditate and the heavens answer your call. They upgrade your strength!\n\n");
                    System.out.println("Previous Strength Point(s): " + classOneStrengthPoints);
                    classOneStrengthPoints += 475;
                    System.out.println("New Strength Point(s): " + classOneStrengthPoints + "\n\n");
                    classOneStrengthUpgrade += 80;
                    classOneExperiencePointsNeededUpgradeTwo = 160;
                    classOneSkillPoints -= 55;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
              }else if (classOneStrengthUpgrade == 7){
                if (classOneExperiencePointsNeededUpgradeTwo == 160){
                 
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("*You meditate and the heavens answer your call. They upgrade your strength!\n\n");
                    System.out.println("Previous Strength Point(s): " + classOneStrengthPoints);
                    classOneStrengthPoints += 715;
                    System.out.println("New Strength Point(s): " + classOneStrengthPoints + "\n\n");
                    classOneStrengthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeTwo = 275;
                    classOneSkillPoints -= 160;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
              }else if (classOneStrengthUpgrade == 8){
                if (classOneExperiencePointsNeededUpgradeTwo == 275){
                 
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("*You meditate and the heavens answer your call. They upgrade your strength!\n\n");
                    System.out.println("Previous Strength Point(s): " + classOneStrengthPoints);
                    classOneStrengthPoints += 1265;
                    System.out.println("New Strength Point(s): " + classOneStrengthPoints + "\n\n");
                    classOneStrengthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeTwo = 500;
                    classOneSkillPoints -= 275;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
              }else if (classOneStrengthUpgrade == 9){
                if (classOneExperiencePointsNeededUpgradeTwo == 500){
                 
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("*You meditate and the heavens answer your call. They upgrade your strength!\n\n");
                    System.out.println("Previous Strength Point(s): " + classOneStrengthPoints);
                    classOneStrengthPoints += 1800;
                    System.out.println("New Strength Point(s): " + classOneStrengthPoints + "\n\n");
                    classOneStrengthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeTwo = 980;
                    classOneSkillPoints -= 500;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
              }else if (classOneStrengthUpgrade == 10){
                if (classOneExperiencePointsNeededUpgradeTwo == 980){
                 
                  if (classOneSkillPoints >= classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("*You meditate and the heavens answer your call. They upgrade your strength!\n\n");
                    System.out.println("Previous Strength Point(s): " + classOneStrengthPoints);
                    classOneStrengthPoints += 2500;
                    System.out.println("New Strength Point(s): " + classOneStrengthPoints + "\n\n");
                    classOneStrengthUpgrade += 1;
                    classOneExperiencePointsNeededUpgradeTwo = 999;
                    classOneSkillPoints -= 980;
                  }else if (classOneSkillPoints < classOneExperiencePointsNeededUpgradeTwo){
                    System.out.println("\n\n*You meditate but the heavens do not answer your call.*\n\n" + plrName + ", you do not have enough skill points for this.\n\n");
                  }
                }
              }else if (classOneStrengthUpgrade == 11){
                  System.out.println("\n\n*Action Disallowed, Reason: Max Upgrades.*\n\n");
              }
            }else if (classOneStatSelection == 0){
              classOneStatsUpgradesLoop = 0;
            }
          }
        }else{
          System.out.println("\nThe heavens look down on you in fury and the sky crackles with thunder!\n" +classOneAction+ " is an invalid response!\n");
        }
      }
    }else if (plrClass == 2){
      System.out.println("This class is unavailable.");
    }else if (plrClass == 3){
      System.out.println("This class is unavailable.");
    }else if (plrClass == 4){
      System.out.println("This class is unavailable.");
    }else{
      System.out.println("\nThe heavens look down on you in fury and the sky crackles with thunder!\n" +plrClass+ " is an invalid response!\n");
    }
  }
}
